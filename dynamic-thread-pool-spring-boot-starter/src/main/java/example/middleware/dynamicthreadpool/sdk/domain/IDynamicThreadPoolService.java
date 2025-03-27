package example.middleware.dynamicthreadpool.sdk.domain;

import example.middleware.dynamicthreadpool.sdk.entity.ThreadPoolConfigEntity;

import java.util.List;

/**
 * @author Fuzhengwei bugstack.cn @小傅哥
 * @description 动态线程池服务
 * @create 2024-05-12 16:04
 */
public interface IDynamicThreadPoolService {

    List<ThreadPoolConfigEntity> queryThreadPoolList();

    ThreadPoolConfigEntity queryThreadPoolConfigByName(String threadPoolName);

    void updateThreadPoolConfig(ThreadPoolConfigEntity threadPoolConfigEntity);

}
