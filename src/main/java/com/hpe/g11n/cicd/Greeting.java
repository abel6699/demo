package com.hpe.g11n.cicd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <div>
 * Created with IntelliJ IDEA.
 * User: Jian-Min Gao <br>
 * Date: 2016/5/10 <br>
 * Time: 17:39 <br>
 * </div>
 */

public class Greeting {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    public String sayHi() {
        String msg = String.format("Hello, %s", System.getProperty("user.name"));
        System.out.println(msg);
        logger.info("Greeting.sayHi: [{}]", msg );
        return msg;
    }
}
