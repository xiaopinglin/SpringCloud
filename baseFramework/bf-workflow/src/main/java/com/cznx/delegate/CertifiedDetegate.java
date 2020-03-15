package com.cznx.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

/**
 * @author ：linxiaoping
 * @description：TODO
 * @date ：2020/3/15 22:52
 */
public class CertifiedDetegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("===>执行验证服务。。。");

        String pwd = delegateExecution.getVariable("payPassword").toString();
        if("123456".equals(pwd)){
            delegateExecution.setVariable("isPass",true);
            System.out.println("===>验证结果：密码验证通过" );
        }else{
            delegateExecution.setVariable("isPass",false);
            System.out.println("===>验证结果：密码验证不通过" );
        }

    }
}
