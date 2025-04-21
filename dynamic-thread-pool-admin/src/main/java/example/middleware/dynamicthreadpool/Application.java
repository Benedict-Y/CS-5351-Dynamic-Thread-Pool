package example.middleware.dynamicthreadpool;

import lombok.Data;
import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.codec.JsonJacksonCodec;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configurable
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Configuration
    @EnableConfigurationProperties(RedisClientConfigProperties.class)
    public static class RedisClientConfig {

        @Bean("redissonClient")
        public RedissonClient redissonClient(ConfigurableApplicationContext applicationContext, RedisClientConfigProperties properties) {
            Config config = new Config();
            // Codec can be set as needed :https://github.com/redisson/redisson/wiki/4.-%E6%95%B0%E6%8D%AE%E5%BA%8F%E5%88%97%E5%8C%96
            config.setCodec(JsonJacksonCodec.INSTANCE);

            config.useSingleServer()
                    .setAddress("redis://" + properties.getHost() + ":" + properties.getPort())
                    .setConnectionPoolSize(properties.getPoolSize())
                    .setConnectionMinimumIdleSize(properties.getMinIdleSize())
                    .setIdleConnectionTimeout(properties.getIdleTimeout())
                    .setConnectTimeout(properties.getConnectTimeout())
                    .setRetryAttempts(properties.getRetryAttempts())
                    .setRetryInterval(properties.getRetryInterval())
                    .setPingConnectionInterval(properties.getPingInterval())
                    .setKeepAlive(properties.isKeepAlive())
            ;

            return Redisson.create(config);
        }

    }


    @Data
    @ConfigurationProperties(prefix = "redis.sdk.config", ignoreInvalidFields = true)
    public static class RedisClientConfigProperties {
        /**
         * host:ip
         */
        private String host;

        /**
         * Port number
         */
        private int port;

        /**
         * Account password
         */
        private String password;

        /**
         * Size of the connection pool, default is 64
         */
        private int poolSize = 64;

        /**
         * Minimum number of idle connections in the pool, default is 10
         */
        private int minIdleSize = 10;

        /**
         * Maximum idle time for connections in milliseconds;
         * idle connections exceeding this time will be closed. Default is 10000
         */
        private int idleTimeout = 10000;

        /**
         * Connection timeout in milliseconds, default is 10000
         */
        private int connectTimeout = 10000;

        /**
         * Number of retry attempts, default is 3
         */
        private int retryAttempts = 3;

        /**
         * Interval between retries in milliseconds, default is 1000
         */
        private int retryInterval = 1000;

        /**
         * Interval for periodically checking connection availability (in milliseconds);
         * default is 0, meaning no periodic check
         */
        private int pingInterval = 0;

        /**
         * Whether to keep connections alive; default is true
         */
        private boolean keepAlive = true;

    }

}
