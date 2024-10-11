package com.github.yuyenews.data.processing;

import com.github.yuyenews.data.processing.concurrent.collection.ConcurrentCollectionAsync;
import com.github.yuyenews.data.processing.concurrent.collection.ConcurrentCollectionSync;
import com.github.yuyenews.data.processing.concurrent.map.ConcurrentMapAsync;
import com.github.yuyenews.data.processing.concurrent.map.ConcurrentMapSync;
import com.github.yuyenews.data.processing.concurrent.task.ConcurrentTaskSync;
import com.github.yuyenews.data.processing.pac.MagicianProducerAndConsumerManager;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/**
 * 项目入口
 * 从这里，你可以创建本项目的任意对象
 */
public class MagicianDataProcessing {

    /**
     * 创建Collection并发执行对象（同步）
     * @return
     */
    public static ConcurrentCollectionSync getConcurrentCollectionSync() {
        return new ConcurrentCollectionSync();
    }

    /**
     * 创建Collection并发执行对象（异步）
     * @return
     */
    public static ConcurrentCollectionAsync getConcurrentCollectionAsync() {
        return new ConcurrentCollectionAsync();
    }

    /**
     * 创建Map并发执行对象（同步）
     * @return
     */
    public static ConcurrentMapSync getConcurrentMapSync(){
        return new ConcurrentMapSync();
    }

    /**
     * 创建Map并发执行对象（异步）
     * @return
     */
    public static ConcurrentMapAsync getConcurrentMapAsync() {
        return new ConcurrentMapAsync();
    }

    /**
     * 创建任务并发执行对象（同步）
     * @return
     */
    public static ConcurrentTaskSync getConcurrentTaskSync(){
        return new ConcurrentTaskSync();
    }

    /**
     * 创建任务生产者、消费者模型对象
     * @return
     */
    public static MagicianProducerAndConsumerManager getProducerAndConsumerManager(){
        return new MagicianProducerAndConsumerManager();
    }

}
