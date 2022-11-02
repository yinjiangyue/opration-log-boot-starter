package cn.creekmoon.operationLog.hutoolCore589.core.lang.generator;

import cn.hutool.core.lang.generator.Generator;
import cn.hutool.core.util.IdUtil;

/**
 * UUID生成器
 *
 * @author looly
 * @since 5.4.3
 */
public class UUIDGenerator implements Generator<String> {
    @Override
    public String next() {
        return IdUtil.fastUUID();
    }
}
