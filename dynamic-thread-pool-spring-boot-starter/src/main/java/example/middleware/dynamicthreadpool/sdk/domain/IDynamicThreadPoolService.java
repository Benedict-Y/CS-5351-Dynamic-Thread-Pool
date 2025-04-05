package example.middleware.dynamicthreadpool.sdk.domain;

import example.middleware.dynamicthreadpool.sdk.entity.ThreadPoolConfigEntity;

import java.util.List;

/**
 * @description 动态线程池服务
 */
public interface IDynamicThreadPoolService {

    List<ThreadPoolConfigEntity> queryThreadPoolList();

    ThreadPoolConfigEntity queryThreadPoolConfigByName(String threadPoolName);

    void updateThreadPoolConfig(ThreadPoolConfigEntity threadPoolConfigEntity);

}
