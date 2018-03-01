package com.example.allan.unittest;

import android.widget.TextView;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static junit.framework.Assert.assertEquals;

/**
 * Created by yunfei.chen on 3/1/18.
 */
@RunWith(RobolectricTestRunner.class)
public class RoboMainActivityTest {

    @Test
    public void showText() {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);

        String tmp = ((TextView)activity.findViewById(R.id.hello)).getText().toString();
        assertEquals(tmp, "Hello World!");
    }
}
