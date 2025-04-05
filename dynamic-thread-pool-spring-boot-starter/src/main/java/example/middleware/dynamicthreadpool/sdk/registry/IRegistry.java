package example.middleware.dynamicthreadpool.sdk.registry;

import example.middleware.dynamicthreadpool.sdk.entity.ThreadPoolConfigEntity;

import java.util.List;

/**
 * @description 注册中心接口
 */
public interface IRegistry {

    void reportThreadPool(List<ThreadPoolConfigEntity> threadPoolEntities);

    void reportThreadPoolConfigParameter(ThreadPoolConfigEntity threadPoolConfigEntity);

}
