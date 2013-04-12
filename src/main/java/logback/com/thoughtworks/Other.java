package logback.com.thoughtworks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 4/12/13
 * Time: 12:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class Other
{
    private static Logger log = LoggerFactory.getLogger(Other.class);

    public static void main(String[] args)
    {
        log.debug("debug=================");
        log.info("info===================");
        log.warn("warn===================");
        log.error("error==================");
    }
}
