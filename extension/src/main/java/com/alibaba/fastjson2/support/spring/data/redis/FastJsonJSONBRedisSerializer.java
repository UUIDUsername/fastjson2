package com.alibaba.fastjson2.support.spring.data.redis;

import com.alibaba.fastjson2.support.config.FastJsonConfig;

/**
 * Fastjson(JSONB) for Spring Data Redis Serializer.
 *
 * @author Victor.Zxy
 * @see FastJsonRedisSerializer
 * @since 2.0.3
 */
@Deprecated
public class FastJsonJSONBRedisSerializer<T>
        extends FastJsonRedisSerializer<T> {
    public FastJsonJSONBRedisSerializer(Class<T> type) {
        super(type);
        super.getFastJsonConfig().setJsonb(true);
    }

    @Override
    public void setFastJsonConfig(FastJsonConfig fastJsonConfig) {
        fastJsonConfig.setJsonb(true);
        super.setFastJsonConfig(fastJsonConfig);
    }
}
