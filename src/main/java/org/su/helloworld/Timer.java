package org.su.helloworld;

import org.aspectj.lang.ProceedingJoinPoint;

public class Timer {
    public Object measure(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long startTime = System.nanoTime();
        Object result = proceedingJoinPoint.proceed();
        System.out.println("Execution time: " + (System.nanoTime() - startTime + "ns"));
        return result;
    }
}
