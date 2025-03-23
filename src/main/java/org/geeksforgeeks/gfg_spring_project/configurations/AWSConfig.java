package org.geeksforgeeks.gfg_spring_project.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AWSConfig {

    @Bean
    public AWSClient getAWSClient() {
        return new AWSClient("secret-key", "access-key");
    }

}

class AWSClient {

    private final String secretKey;
    private final String accessKey;

    public AWSClient(String secretKey, String accessKey) {
        this.secretKey = secretKey;
        this.accessKey = accessKey;
    }
}