package com.imooc.demo.config.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.PropertyVetoException;

@Configuration

//配置mybatis mapper的扫描路径
@MapperScan("com.imooc.demo.dao")
public class DataSourceConfiguration {
    @Value("${spring.datasource.driverClassName}")
    private String driverClassName;
    @Value("${spring.datasource.driverClassName}")
    private String url;
    @Value("${spring.datasource.driverClassName}")
    private String password;
    @Value("${spring.datasource.driverClassName}")
    private String username;

    @Bean(name="dataSource")
    public ComboPooledDataSource createDataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(driverClassName);
        dataSource.setJdbcUrl(url);
        dataSource.setUser(username);
        dataSource.setPassword(password);

        //关闭链接后不自动commit
        dataSource.setAutoCommitOnClose(false);

        return dataSource;
    }
}
