package com.brx.test.service.conf;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.annotation.PreDestroy;
import java.io.IOException;

/**
 * Created by ruxing.bao on 2017/2/22.
 */
@Configuration
@EnableConfigurationProperties(Properties.class)
@MapperScan("com.brx.test.service.dao")
public class MybatisDataSource {
    @Autowired
    private Properties properties;

    private final static String MAPPER_LOCATIONS="classpath:com/brx/test/service/dao/*.xml";

    private DataSource dataSource;

    @Bean(destroyMethod = "close")
    public DataSource dataSource() {
        this.dataSource = new DataSource();
        this.dataSource.setDriverClassName(properties.getDriverClassName());
        this.dataSource.setUrl(properties.getUrl());
        if (properties.getUsername() != null) {
            this.dataSource.setUsername(properties.getUsername());
        }
        if (properties.getPassword() != null) {
            this.dataSource.setPassword(properties.getPassword());
        }
        this.dataSource.setInitialSize(properties.getInitialSize());
        this.dataSource.setMaxActive(properties.getMaxActive());
        this.dataSource.setMaxIdle(properties.getMaxIdle());
        this.dataSource.setMinIdle(properties.getMinIdle());
        this.dataSource.setTestOnBorrow(properties.isTestOnBorrow());
        this.dataSource.setTestOnReturn(properties.isTestOnReturn());
        this.dataSource.setValidationQuery(properties.getValidationQuery());
        return dataSource;
    }

    @PreDestroy
    public void close() {
        if (this.dataSource != null) {
            this.dataSource.close();
        }
    }

    @Bean
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources(MAPPER_LOCATIONS));
        return sqlSessionFactoryBean.getObject();
    }

    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }
}
