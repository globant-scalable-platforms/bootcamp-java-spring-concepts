package springbootcamp.context.live.business;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceBeansConfiguration {

    private static final String driverClassName = "org.h2.Driver";
    private static final String url = "jdbc:h2:mem:test";
    private static final String dbUsername = "SA";

    @Bean
    public static DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(driverClassName);
        dataSourceBuilder.url(url);
        dataSourceBuilder.username(dbUsername);
        dataSourceBuilder.password("");
        return dataSourceBuilder.build();
    }

}
