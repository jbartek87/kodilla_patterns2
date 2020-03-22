package com.kodilla.kodillapatterns2.facade.api;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Watcher {

    private static  Logger LOGGER = LoggerFactory.getLogger(com.kodilla.kodillapatterns2.aop.calculator.Watcher2.class);

    @Before("execution(* com.kodilla.kodillapatterns2.facade.api.OrderFascade.processOrder(..))")
    public void logEvent() {
        LOGGER.info("Method has been used");
    }
}
