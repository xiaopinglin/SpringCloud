package com.cznx.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

/**
 * @author ：linxiaoping
 * @description：TODO
 * @date ：2020/3/15 22:49
 */
public class UserDetegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {

        System.out.println("===>执行用户服务。。。");
    }
}
