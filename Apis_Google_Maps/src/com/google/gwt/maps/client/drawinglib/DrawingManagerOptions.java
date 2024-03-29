package com.google.gwt.maps.client.drawinglib;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.MapImpl;
import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.maps.client.overlays.CircleOptions;
import com.google.gwt.maps.client.overlays.MarkerOptions;
import com.google.gwt.maps.client.overlays.PolygonOptions;
import com.google.gwt.maps.client.overlays.PolylineOptions;
import com.google.gwt.maps.client.overlays.RectangleOptions;

/**
 * Options for the drawing manager.
 * {@link http://code.google.com/apis/maps/documentation/javascript/reference.html#DrawingManagerOptions}
 */
public class DrawingManagerOptions extends JavaScriptObject {

  /**
   * use newInstance();
   */
  protected DrawingManagerOptions() {}
  
  /**
   * Options for the drawing manager.
   * @return
   */
  public static final DrawingManagerOptions newInstance() {
    return JavaScriptObject.createObject().cast();
  }
  
  /**
   * Options to apply to any new circles created with this DrawingManager. The center and radius properties are ignored, and the map property of a new circle is always set to the DrawingManager's map.
   * @param circleOptions
   */
  public final native void setCircleOptions(CircleOptions circleOptions) /*-{
    this.circleOptions = circleOptions;
  }-*/; 
  
  /**
   * Options to apply to any new circles created with this DrawingManager. The center and radius properties are ignored, and the map property of a new circle is always set to the DrawingManager's map.
   * @return
   */
  public final native CircleOptions getCircleOptions() /*-{
    return this.circleOptions;
  }-*/;
  
  /**
   * The enabled/disabled state of the drawing control. Defaults to true.
   * @param drawingControl
   */
  public final native void setDrawingControl(boolean drawingControl) /*-{
    this.drawingControl = drawingControl;
  }-*/;
  
  /**
   * The enabled/disabled state of the drawing control. Defaults to true.
   * @return
   */
  public final native boolean getDrawingControl() /*-{
    return this.drawingControl;
  }-*/;
  
  /**
   * The display options for the drawing control.
   * @param drawingControlOptions
   */
  public final native void setDrawingControlOptions(DrawingControlOptions drawingControlOptions) /*-{
    this.drawingControlOptions = drawingControlOptions;
  }-*/;
  
  /**
   * The display options for the drawing control.
   * @return
   */
  public final native DrawingControlOptions getDrawingControlOptions() /*-{
    return this.drawingControlOptions;
  }-*/;
  
  /**
   * The DrawingManager's drawing mode, which defines the type of overlay to be added on the map. Accepted values are MARKER, POLYGON, POLYLINE, RECTANGLE, CIRCLE, or null. A drawing mode of null means that the user can interact with the map as normal, and clicks do not draw anything.
   * @param drawingMode
   */
  public final void setDrawingMode(OverlayType drawingMode) {
    setDrawingModeImpl(drawingMode.value());
  }

  /**
   * The DrawingManager's drawing mode, which defines the type of overlay to be added on the map. Accepted values are MARKER, POLYGON, POLYLINE, RECTANGLE, CIRCLE, or null. A drawing mode of null means that the user can interact with the map as normal, and clicks do not draw anything.
   * @param drawingMode
   */
  private native void setDrawingModeImpl(String drawingMode) /*-{
    this.drawingMode = drawingMode;
  }-*/;
  
  /**
   * The Map to which the DrawingManager is attached, which is the Map on which the overlays created will be placed.
   * @return
   */
  public final MapWidget getMap() {
    return MapWidget.newInstance(getMapImpl());
  }
  
  private final native MapImpl getMapImpl() /*-{
    return this.map;
  }-*/;
  
  /**
   * The Map to which the DrawingManager is attached, which is the Map on which the overlays created will be placed.
   * @param mapWidget
   */
  public final void setMap(MapWidget mapWidget) {
    setMapImpl(mapWidget.getJso());
  }
  
  private final native void setMapImpl(MapImpl map) /*-{
    this.map = map;
  }-*/;
  
  /**
   * Options to apply to any new markers created with this DrawingManager. The position property is ignored, and the map property of a new marker is always set to the DrawingManager's map.
   * @param markerOptions
   */
  public final native void setMarkerOptions(MarkerOptions markerOptions) /*-{
    this.markerOptions = markerOptions;
  }-*/;
 
  /**
   * Options to apply to any new markers created with this DrawingManager. The position property is ignored, and the map property of a new marker is always set to the DrawingManager's map.
   * @return
   */
  public final native MarkerOptions getMarkerOptions() /*-{
    return this.markerOptions;
  }-*/;

  /**
   * Options to apply to any new polygons created with this DrawingManager. The paths property is ignored, and the map property of a new polygon is always set to the DrawingManager's map.
   * @param polygonOptions
   */
  public final native void setPolygonOptions(PolygonOptions polygonOptions) /*-{
    this.polygonOptions = polygonOptions;
  }-*/;
  
  /**
   * Options to apply to any new polygons created with this DrawingManager. The paths property is ignored, and the map property of a new polygon is always set to the DrawingManager's map.
   * @return
   */
  public final native PolygonOptions getPolygonOptions() /*-{
    return this.polygonOptions;
  }-*/;
  
  /**
   * Options to apply to any new polylines created with this DrawingManager. The path property is ignored, and the map property of a new polyline is always set to the DrawingManager's map.
   * @param polylineOptions
   */
  public final native void setPolylineOptions(PolylineOptions polylineOptions) /*-{
    this.polylineOptions = polylineOptions;
  }-*/;
  
  /**
   * Options to apply to any new polylines created with this DrawingManager. The path property is ignored, and the map property of a new polyline is always set to the DrawingManager's map.
   * @return
   */
  public final native PolylineOptions getPolylineOptions() /*-{
    return this.polylineOptions;
  }-*/;
  
  /**
   * Options to apply to any new rectangles created with this DrawingManager. The bounds property is ignored, and the map property of a new rectangle is always set to the DrawingManager's map.
   * @param rectangleOptions
   */
  public final native void setRectangleOptions(RectangleOptions rectangleOptions) /*-{
    this.rectangleOptions = rectangleOptions;
  }-*/;
  
  /**
   * Options to apply to any new rectangles created with this DrawingManager. The bounds property is ignored, and the map property of a new rectangle is always set to the DrawingManager's map.
   * @return
   */
  public final native RectangleOptions getRectangleOptions() /*-{
    return this.rectangleOptions;
  }-*/;
  
}
