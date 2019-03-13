package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import static java.lang.System.currentTimeMillis;

@Aspect
@Component
public class OrderWatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderWatcher.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public void logEvent() {
        LOGGER.info("Order is in progress...");
    }

    @Around("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public Object measureOrderTime(final ProceedingJoinPoint procedingJoinPoint) throws Throwable {
        Object result;
        try {
            long begin = currentTimeMillis();
            result = procedingJoinPoint.proceed();
            long end = currentTimeMillis();
            LOGGER.info("Time: " + (end - begin) + "(ms)");
        } catch (Throwable throwable) {
            LOGGER.error("Time is not possible to check - the order procesing has been intrrupted.");
            throw throwable;
        }
        return result;
    }
}
