package cn.creekmoon.operationLog.hutoolCore589.core.lang.intern;

import cn.hutool.core.lang.intern.Interner;
import cn.hutool.core.lang.intern.JdkStringInterner;
import cn.hutool.core.lang.intern.WeakInterner;

/**
 * 规范化对象生成工具
 *
 * @author looly
 * @since 5.4.3
 */
public class InternUtil {

    /**
     * 创建WeakHshMap实现的字符串规范化器
     *
     * @param <T> 规范对象的类型
     * @return {@link cn.hutool.core.lang.intern.Interner}
     */
    public static <T> cn.hutool.core.lang.intern.Interner<T> createWeakInterner() {
        return new WeakInterner<>();
    }

    /**
     * 创建JDK默认实现的字符串规范化器
     *
     * @return {@link cn.hutool.core.lang.intern.Interner}
     * @see String#intern()
     */
    public static cn.hutool.core.lang.intern.Interner<String> createJdkInterner() {
        return new JdkStringInterner();
    }

    /**
     * 创建字符串规范化器
     *
     * @param isWeak 是否创建使用WeakHashMap实现的Interner
     * @return {@link cn.hutool.core.lang.intern.Interner}
     */
    public static Interner<String> createStringInterner(boolean isWeak) {
        return isWeak ? createWeakInterner() : createJdkInterner();
    }
}
