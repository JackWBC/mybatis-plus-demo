package com.baicheng.mybatisplusdemo.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

/**
 * @author baicheng
 * @description
 * @create 2019-03-23 20:23
 */
@Aspect
@Component
@Slf4j
public class PerformanceAspect {

    @Around("repositoryOps()")
    public Object logPerformance(ProceedingJoinPoint pjp) throws Throwable{
        StopWatch sw = new StopWatch();
        sw.start();
        String name = "-";
        String result = "Y";
        try {
            name = pjp.getSignature().toShortString();
            return pjp.proceed();
        } catch (Throwable throwable){
            result = "N";
            throw throwable;
        } finally {
            sw.stop();
            log.info("{} | {} | {}ms", name, result, sw.getTotalTimeMillis());
        }
    }

    @Pointcut("execution(* com.baicheng.mybatisplusdemo.repository..*(..))")
    private void repositoryOps(){

    }
}
