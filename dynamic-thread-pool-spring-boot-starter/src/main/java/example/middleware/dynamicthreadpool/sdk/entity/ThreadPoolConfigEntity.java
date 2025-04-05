package example.middleware.dynamicthreadpool.sdk.entity;

/**
 * @description 线程池配置实体对象
 */
public class ThreadPoolConfigEntity {

    /**
     * Application name
     */
    private String appName;

    /**
     * Thread pool name
     */
    private String threadPoolName;

    /**
     * Core number of threads
     */
    private int corePoolSize;

    /**
     * Maximum number of threads
     */
    private int maximumPoolSize;

    /**
     * Current number of active threads
     */
    private int activeCount;

    /**
     * Current number of threads in the pool
     */
    private int poolSize;

    /**
     * Type of the task queue
     */
    private String queueType;

    /**
     * Current number of tasks in the queue
     */
    private int queueSize;

    /**
     * Remaining capacity of the task queue
     */

    private int remainingCapacity;

    public ThreadPoolConfigEntity() {
    }

    public ThreadPoolConfigEntity(String appName, String threadPoolName) {
        this.appName = appName;
        this.threadPoolName = threadPoolName;
    }

    public String getAppName() {
        return appName;
    }

    public String getThreadPoolName() {
        return threadPoolName;
    }

    public int getCorePoolSize() {
        return corePoolSize;
    }

    public void setCorePoolSize(int corePoolSize) {
        this.corePoolSize = corePoolSize;
    }

    public int getMaximumPoolSize() {
        return maximumPoolSize;
    }

    public void setMaximumPoolSize(int maximumPoolSize) {
        this.maximumPoolSize = maximumPoolSize;
    }

    public int getActiveCount() {
        return activeCount;
    }

    public void setActiveCount(int activeCount) {
        this.activeCount = activeCount;
    }

    public int getPoolSize() {
        return poolSize;
    }

    public void setPoolSize(int poolSize) {
        this.poolSize = poolSize;
    }

    public String getQueueType() {
        return queueType;
    }

    public void setQueueType(String queueType) {
        this.queueType = queueType;
    }

    public int getQueueSize() {
        return queueSize;
    }

    public void setQueueSize(int queueSize) {
        this.queueSize = queueSize;
    }

    public int getRemainingCapacity() {
        return remainingCapacity;
    }

    public void setRemainingCapacity(int remainingCapacity) {
        this.remainingCapacity = remainingCapacity;
    }

}
