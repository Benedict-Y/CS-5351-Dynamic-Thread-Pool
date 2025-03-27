package example.middleware.dynamicthreadpool.sdk.registry;

import example.middleware.dynamicthreadpool.sdk.entity.ThreadPoolConfigEntity;

import java.util.List;

/**
 * @author Fuzhengwei bugstack.cn @小傅哥
 * @description 注册中心接口
 * @create 2024-05-12 16:21
 */
public interface IRegistry {

    void reportThreadPool(List<ThreadPoolConfigEntity> threadPoolEntities);

    void reportThreadPoolConfigParameter(ThreadPoolConfigEntity threadPoolConfigEntity);

}
