package com.portfolio.ViewTransaction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import com.portfolio.ViewTransaction.entity.Transaction;

@Configuration
public class RedisConfig {
    // @Value("${spring.redis.host}")
    // private String redisHost;

    // @Value("${spring.redis.port}")
    // private int redisPort;

    // @Bean
    // public RedisConnectionFactory redisConnectionFactory() {
    //     return new LettuceConnectionFactory(redisHost, redisPort);
    // }
    @Bean
    public RedisTemplate<String, Transaction> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<String, Transaction> template = new RedisTemplate<>();
        template.setConnectionFactory(redisConnectionFactory);
        template.setKeySerializer(new StringRedisSerializer());
        // Add more configuration as needed
        return template;
    }
}