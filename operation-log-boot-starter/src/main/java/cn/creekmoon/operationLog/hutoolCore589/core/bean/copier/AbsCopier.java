package cn.creekmoon.operationLog.hutoolCore589.core.bean.copier;

import cn.creekmoon.operationLog.hutoolCore589.core.bean.copier.CopyOptions;
import cn.creekmoon.operationLog.hutoolCore589.core.lang.copier.Copier;
import cn.creekmoon.operationLog.hutoolCore589.core.util.ObjectUtil;

/**
 * 抽象的对象拷贝封装，提供来源对象、目标对象持有
 *
 * @param <S> 来源对象类型
 * @param <T> 目标对象类型
 * @author looly
 * @since 5.8.0
 */
public abstract class AbsCopier<S, T> implements Copier<T> {

    protected final S source;
    protected final T target;
    /**
     * 拷贝选项
     */
    protected final CopyOptions copyOptions;

    public AbsCopier(S source, T target, CopyOptions copyOptions) {
        this.source = source;
        this.target = target;
        this.copyOptions = ObjectUtil.defaultIfNull(copyOptions, CopyOptions::create);
    }
}
