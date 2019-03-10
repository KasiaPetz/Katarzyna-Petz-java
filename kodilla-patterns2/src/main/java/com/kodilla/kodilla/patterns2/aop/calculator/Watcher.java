package com.kodilla.kodilla.patterns2.aop.calculator;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Aspect
@Component
public class Watcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(Watcher.class);

    @Before("execution(* com.kodilla.kodilla.patterns2.aop.calculator.Calculator.factorial(..))" +
        "&& args(theNumber) && target(object)")
    public void logEvent(BigDecimal theNumber, Object object) {
        LOGGER.info("Logging the event");
    }
    @Around("execution(* com.kodilla.kodilla.patterns2.aop.calculator.Calculator.factorial(..))")
    public Object measureTime(final ProceedingJoinPoint procedingJoinPoint) throws Throwable {
        Object result;
        try {
        long begin = System.currentTimeMillis();
        result = procedingJoinPoint.proceed();
        long end = System.currentTimeMillis();
        LOGGER.info("Time consumed: " + (end - begin) + "(ms)");
    } catch (Throwable throwable) {
        LOGGER.error(throwable.getMessage());
        throw throwable;
    }
        return result;
}
}
