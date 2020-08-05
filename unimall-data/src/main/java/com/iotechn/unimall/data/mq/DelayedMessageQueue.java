package com.iotechn.unimall.data.mq;

import java.util.concurrent.Callable;

public interface DelayedMessageQueue {


    /**
     * 添加延迟秒数,RingDelayedMessageQueueImpl专用，单机实现
     * * @param delay seconds
     * @return
     */
    default public Boolean publishTask(Callable task,Integer delay){return null;}

    /**
     * RedisNotifyDelayedMessageQueueImpl专用，集群实现
     * 这两个都会被拼接为 TASK:(随机码):CODE:VALUE 当成key存入redis中，因为回调时只会返回key，而不会返回key对应的值
     * @param code 回调时用来选择的Handler的CODE
     * @param value 回调时使用的值
     * @return
     */
    default public Boolean publishTask(Integer code,String value,Integer delay){return null;};

}
