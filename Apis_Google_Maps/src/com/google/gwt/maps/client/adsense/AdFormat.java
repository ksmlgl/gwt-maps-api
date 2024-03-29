package com.google.gwt.maps.client.adsense;

/**
 * Identifiers used to specify an AdSense For Content format. See https://google.com/adsense/adformats
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#AdFormat}
 * 
 * class is $wnd.google.maps.adsense.AdFormat
 */
public enum AdFormat {
  
  /**
   *  A horizontal "banner" ad. (468x60px)
   */
  BANNER("468x60_as"),
  
  /**
   * A small ad. (125x125px)
   */
  BUTTON("125x125_as"),
  
  /**
   * A smaller horizontal "banner" ad. (234x60px)
   */
  HALF_BANNER("234x60_as"),
  
  /**
   * A large rectangulare ad. (336x280px)
   */
  LARGE_RECTANGLE("336x280_as"),
  
  /**
   * A fully horizontal display area. (728x90px)
   */
  LEADERBOARD("728x90_as"),
  
  /**
   * A medium rectangular ad. (300x250px)
   */
  MEDIUM_RECTANGLE("300x250_as"),
  
  /**
   * A large vertical ad. (120x600px)
   */
  SKYSCRAPER("120x600_as"),
  
  /**
   * A small rectangular ad. (180x150px)
   */
  SMALL_RECTANGLE("180x150_as"),
  
  /**
   * A smaller square ad. (200x200px)
   */
  SMALL_SQUARE("200x200_as"),
  
  /**
   * A square ad with large type. (250x250px)
   */
  SQUARE("250x250_as"),
  
  /**
   * A medium-sized vertical ad. (120x240px)
   */
  VERTICAL_BANNER("120x240_as"), 
  
  /**
   * A wide, vertical ad using larger type. (160x600px)
   */
  WIDE_SKYSCRAPER("160x600_as");
  
  private String value;
  
  AdFormat(String value) {
    this.value = value;
  }
  
  public String value() {
    return value;
  }
  
  public String getName() {
    return name();
  }

  public String toString() {
    return name() + "(" + value + ")";
  }
  
  public static AdFormat fromValue(String value) {
    if (value == null) {
      return null;
    }
    AdFormat r = null;
    if (value.equals("468x60_as")) {
      r = BANNER;
      
    } else if (value.equals("125x125_as")) {
      r = BUTTON;
      
    } else if (value.equals("234x60_as")) {
      r = HALF_BANNER;
      
    } else if (value.equals("336x280_as")) {
      r = LARGE_RECTANGLE;
      
    } else if (value.equals("728x90_as")) {
      r = LEADERBOARD;
      
    } else if (value.equals("300x250_as")) {
      r = MEDIUM_RECTANGLE;
      
    } else if (value.equals("120x600_as")) {
      r = SKYSCRAPER;
      
    } else if (value.equals("180x150_as")) {
      r = SMALL_RECTANGLE;
      
    } else if (value.equals("200x200_as")) {
      r = SMALL_SQUARE;
      
    } else if (value.equals("250x250_as")) {
      r = SQUARE;
      
    } else if (value.equals("120x240_as")) {
      r = VERTICAL_BANNER;
      
    } else if (value.equals("160x600_as")) {
      r = WIDE_SKYSCRAPER;
    } 
    return r;
  }
}
