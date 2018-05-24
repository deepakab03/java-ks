package com.unittesting.awaitlity;

import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static java.util.concurrent.TimeUnit.MINUTES;
import static java.util.concurrent.TimeUnit.SECONDS;

import java.util.concurrent.TimeUnit;

import com.jayway.awaitility.Awaitility;
import com.jayway.awaitility.core.ConditionFactory;

public class AwaitilityWrapper {

    public static final int DEFAULT_WAIT_TIME_IN_MIN = 5;
    public static final int DEFAULT_POLL_INTERVAL_IN_SECONDS = 15;
    public static final int DEFAULT_POLL_DELAY_IN_MILLIS = 500;

    public static ConditionFactory defaultAwait() {
        return Awaitility.await()
                .atMost(DEFAULT_WAIT_TIME_IN_MIN, MINUTES)
                .pollInterval(DEFAULT_POLL_INTERVAL_IN_SECONDS, SECONDS)
                .pollDelay(DEFAULT_POLL_DELAY_IN_MILLIS, MILLISECONDS);
    }

    public static ConditionFactory defaultAwait(final int waitTimeAtMostInMin, final int pollUnitSeconds) {
        return Awaitility.await()
                .atMost(waitTimeAtMostInMin, TimeUnit.MINUTES)
                .pollInterval(pollUnitSeconds, TimeUnit.SECONDS)
                .pollDelay(DEFAULT_POLL_DELAY_IN_MILLIS, MILLISECONDS);
    }

}
