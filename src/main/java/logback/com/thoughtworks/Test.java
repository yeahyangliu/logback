package logback.com.thoughtworks;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test
{
    private static Logger log = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args)
    {

        log.debug("debug=================");
        log.info("info===================");
        log.warn("warn===================");
        log.error("error==================");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Other other = new Other();
       // other.logother();

    }
}
