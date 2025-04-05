package example.middleware.dynamicthreadpool.sdk.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @description 动态线程池配置
 */
@ConfigurationProperties(prefix = "dynamic.thread.pool.config", ignoreInvalidFields = true)
public class DynamicThreadPoolAutoProperties {

    /** Status; open = enabled, close = disabled */
    private boolean enable;

    /** Redis host */
    private String host;

    /** Redis port */
    private int port;

    /** Account password */
    private String password;

    /** Size of the connection pool, default is 64 */
    private int poolSize = 64;

    /** Minimum number of idle connections in the pool, default is 10 */
    private int minIdleSize = 10;

    /** Maximum idle time for connections (in milliseconds);
     *  idle connections exceeding this time will be closed. Default is 10000
     */
    private int idleTimeout = 10000;

    /** Connection timeout (in milliseconds), default is 10000 */
    private int connectTimeout = 10000;

    /** Number of retry attempts, default is 3 */
    private int retryAttempts = 3;

    /** Interval between retries (in milliseconds), default is 1000 */
    private int retryInterval = 1000;

    /** Interval to periodically check if the connection is alive (in milliseconds);
     *  default is 0, meaning no periodic check
     */
    private int pingInterval = 0;

    /** Whether to keep the connection alive, default is true */
    private boolean keepAlive = true;


    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPoolSize() {
        return poolSize;
    }

    public void setPoolSize(int poolSize) {
        this.poolSize = poolSize;
    }

    public int getMinIdleSize() {
        return minIdleSize;
    }

    public void setMinIdleSize(int minIdleSize) {
        this.minIdleSize = minIdleSize;
    }

    public int getIdleTimeout() {
        return idleTimeout;
    }

    public void setIdleTimeout(int idleTimeout) {
        this.idleTimeout = idleTimeout;
    }

    public int getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public int getRetryAttempts() {
        return retryAttempts;
    }

    public void setRetryAttempts(int retryAttempts) {
        this.retryAttempts = retryAttempts;
    }

    public int getRetryInterval() {
        return retryInterval;
    }

    public void setRetryInterval(int retryInterval) {
        this.retryInterval = retryInterval;
    }

    public int getPingInterval() {
        return pingInterval;
    }

    public void setPingInterval(int pingInterval) {
        this.pingInterval = pingInterval;
    }

    public boolean isKeepAlive() {
        return keepAlive;
    }

    public void setKeepAlive(boolean keepAlive) {
        this.keepAlive = keepAlive;
    }

}
