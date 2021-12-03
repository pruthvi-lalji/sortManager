package com.spartaglobal.sort.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class LogGenerator {
    public static Logger log = null;

    String className;

    public LogGenerator(Class name) {

        this.className = name.getSimpleName() + "";
    }


    public void userLogger(String error){
        log = LogManager.getLogger(className);
        log.info(error);
    }

    public void errorLogger(String error,Exception eError){
        log = LogManager.getLogger(className);
        log.error(error, eError);
    }


}
