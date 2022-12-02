package cn.creekmoon.operationLog.hutoolCore589.core.thread;

import cn.creekmoon.operationLog.hutoolCore589.core.thread.DelegatedExecutorService;

import java.util.concurrent.ExecutorService;

/**
 * 保证ExecutorService在对象回收时正常结束
 *
 * @author loolly
 */
public class FinalizableDelegatedExecutorService extends DelegatedExecutorService {

    /**
     * 构造
     *
     * @param executor {@link ExecutorService}
     */
    FinalizableDelegatedExecutorService(ExecutorService executor) {
        super(executor);
    }

    @Override
    protected void finalize() {
        super.shutdown();
    }
}