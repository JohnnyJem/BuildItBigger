package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.v4.util.Pair;
import android.test.AndroidTestCase;

import java.util.concurrent.ExecutionException;

/**
 * Tests to see if the EndpointsAsynchTask retrieves non-null string.
 * Run via androidTest task after making sure server is running.
 */
public class EndpointsAsynchTaskAndroidTest extends AndroidTestCase{

    public void testEndpointsAsynchTask(){
        String testResult = null;

        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        endpointsAsyncTask.execute(new Pair<Context, String>(getContext(), null));
        try {
            testResult = endpointsAsyncTask.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        assertNotNull(testResult); // test if our string is not null.
    }
}
