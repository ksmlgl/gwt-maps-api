package com.google.gwt.maps.client.streetview;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.maps.client.LoadApi;
import com.google.gwt.maps.client.controls.ControlPosition;
import com.google.gwt.maps.client.streetview.StreetViewAddressControlOptions;

public class StreetViewAddressControlOptionsTest extends GWTTestCase {

  public static final int ASYNC_DELAY_MS = 5000;
  
  public String getModuleName() {
    return "com.google.gwt.maps.Apis_Google_Maps_ForTests";
  }

  public void testWorks() {
    assertEquals(true, true);
  }
  
  public void testUse() {
    LoadApi.go(new Runnable() {
      public void run() {
        StreetViewAddressControlOptions options = StreetViewAddressControlOptions.newInstance();
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  public void testPosition() {
    LoadApi.go(new Runnable() {
      public void run() {
        StreetViewAddressControlOptions o = StreetViewAddressControlOptions.newInstance();
        ControlPosition left = ControlPosition.TOP_CENTER;
        o.setPosition(left);
        ControlPosition right = o.getPosition();
        assertEquals(left, right);
        finishTest();
      }
    }, false);
    delayTestFinish(ASYNC_DELAY_MS);
  }
  
  
  
  
  
}
