package com.mypackage.test.aop;

import com.mypackage.test.annotation.Logable;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by jlguo on 18/06/2017.
 */
@Aspect
@Order //for many aspects order.
@Component
public class LogAspect {

    @Around(value="@annotation(log)")
    public Object processTx(ProceedingJoinPoint joinPoint, Logable log)
            throws java.lang.Throwable {
        System.out.println("环绕通知之开始"+log.operate());
        Object result = null;
        try {
            result = joinPoint.proceed();
            System.out.println("============"+result.toString());
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("环绕通知之结束"+log.operator());

        return result;
    }
}
