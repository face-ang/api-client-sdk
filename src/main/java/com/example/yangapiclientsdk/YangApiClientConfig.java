package com.example.yangapiclientsdk;

import com.example.yangapiclientsdk.client.YangApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "newapi.client")
@Data
@ComponentScan
public class YangApiClientConfig {

    private String accessKey;
    private String secretKey;

    @Bean
    public YangApiClient yangApiClient() {
        return new YangApiClient(accessKey, secretKey);
    }
}
