package com.cznx.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

/**
 * @author ：linxiaoping
 * @description：TODO
 * @date ：2020/3/15 22:54
 */
public class MessageDetegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("===>执行消息服务。。。");
    }
}
