package com.cznx.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.Random;

/**
 * @author ：linxiaoping
 * @description：TODO
 * @date ：2020/3/15 22:50
 */
public class AccountDetegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {

        System.out.println("===>执行账户服务。。。");

        Random random = new Random();
        boolean flag = random.nextBoolean();
        execution.setVariable("sufficient",flag);

        System.out.println("===>余额是否充足：" + flag);
    }
}
