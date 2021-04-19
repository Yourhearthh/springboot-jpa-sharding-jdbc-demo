package com.demo.database;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * @ClassName:
 * @Description: 接收数据库信息，并且创建数据源
 * @author: baoguangyu
 * @date: 2020-09-01 09:33
 * @version: 1.0
 */
@Data
@ConfigurationProperties(prefix = "sharding")
@Component
public class DatabaseConfig {
    private String url;
    private String username;
    private String password;
    private String driverClassName;
    private String databaseName;

    public DataSource createDataSource() {
        DruidDataSource result = new DruidDataSource();
        result.setDriverClassName(getDriverClassName());
        result.setUrl(getUrl());
        result.setUsername(getUsername());
        result.setPassword(getPassword());
        return result;
    }
}
