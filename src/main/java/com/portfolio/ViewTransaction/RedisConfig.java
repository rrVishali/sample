// package com.portfolio.ViewTransaction;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
// import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
// import org.springframework.data.redis.core.RedisTemplate;

// @Configuration
// public class RedisConfig {

//     @Bean
//     JedisConnectionFactory jedisConnectionFactory() {
//         RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration();
//         redisStandaloneConfiguration.setHostName("redis-15370.c283.us-east-1-4.ec2.cloud.redislabs.com");
//         redisStandaloneConfiguration.setPort(15370);
//         redisStandaloneConfiguration.setPassword("ESbiRUrdtRMRRFd8uaYk2J2JFkpngb0k");
//         return new JedisConnectionFactory(redisStandaloneConfiguration);
//     }

//     @Bean
//     public RedisTemplate<String, Object> redisTemplate() {
//         RedisTemplate<String, Object> template = new RedisTemplate<>();
//         template.setConnectionFactory(jedisConnectionFactory());
//         return template;
//     }
// }