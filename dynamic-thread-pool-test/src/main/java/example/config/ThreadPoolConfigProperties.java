package example.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "thread.pool.executor.config", ignoreInvalidFields = true)
public class ThreadPoolConfigProperties {

    /** Core number of threads */
    private Integer corePoolSize = 20;

    /** Maximum number of threads */
    private Integer maxPoolSize = 200;

    /** Maximum keep-alive time */
    private Long keepAliveTime = 10L;

    /** Maximum queue capacity */
    private Integer blockQueueSize = 5000;

    /*
     * Rejection policy options:
     * AbortPolicy: Discards the task and throws a RejectedExecutionException.
     * DiscardPolicy: Silently discards the task without throwing an exception.
     * DiscardOldestPolicy: Discards the oldest task in the queue and retries executing the current task.
     * CallerRunsPolicy: If task submission fails, the task is executed in the caller's thread.
     */
    private String policy = "AbortPolicy";


}
