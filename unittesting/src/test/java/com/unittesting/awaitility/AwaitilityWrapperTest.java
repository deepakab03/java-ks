package com.unittesting.awaitility;

import static org.apache.commons.lang3.StringUtils.countMatches;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.unittesting.awaitlity.AwaitilityWrapper;

public class AwaitilityWrapperTest {
    private static final Logger logger = LoggerFactory.getLogger(AwaitilityWrapperTest.class);
    
    @Rule public StandardOutputStreamLog outLog = new StandardOutputStreamLog();
    private int counter;
    
    @Before public void beforeEveryTest() {
        outLog.clear();
    }
    
    @Test public void
    givenDefaultWait_whenWeOverrideWaitMinutesToSecondsAndLogSomeMsg_shouldOutputToConsoleCorrectNumTimes() {
        counter = 3;
        AwaitilityWrapper.defaultAwait().atMost(47, TimeUnit.SECONDS).until(new Callable<Boolean>() {
            
            public Boolean call() throws Exception {
                logger.info("Some msg: {}", counter);
                return counter-- == 1;
            }
        });
        
        int numTimesMsgLogged = countMatches(outLog.getLog(), "Some msg");
        assertThat(numTimesMsgLogged, is(equalTo(3)));
    }
    
    @Test public void
    givenDefaultWait_whenWeOverrideWaitAndPollIntervalndLogSomeMsg_shouldOutputToConsoleCorrectNumTimes() {
        counter = 10;
        AwaitilityWrapper.defaultAwait(1, 2).until(new Callable<Boolean>() {
            
            public Boolean call() throws Exception {
                logger.info("Some msg2: {}", counter);
                return counter-- == 1;
            }
        });
        
        int numTimesMsgLogged = countMatches(outLog.getLog(), "Some msg2");
        assertThat(numTimesMsgLogged, is(equalTo(10)));
    }
}
