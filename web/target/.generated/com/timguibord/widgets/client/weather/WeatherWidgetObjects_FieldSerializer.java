package com.timguibord.widgets.client.weather;

@SuppressWarnings("deprecation")
public class WeatherWidgetObjects_FieldSerializer {
  private static native java.lang.String getForcastData(com.timguibord.widgets.client.weather.WeatherWidgetObjects instance) /*-{
    return instance.@com.timguibord.widgets.client.weather.WeatherWidgetObjects::forcastData;
  }-*/;
  
  private static native void  setForcastData(com.timguibord.widgets.client.weather.WeatherWidgetObjects instance, java.lang.String value) /*-{
    instance.@com.timguibord.widgets.client.weather.WeatherWidgetObjects::forcastData = value;
  }-*/;
  
  private static native java.lang.String getGatherTimestamp(com.timguibord.widgets.client.weather.WeatherWidgetObjects instance) /*-{
    return instance.@com.timguibord.widgets.client.weather.WeatherWidgetObjects::gatherTimestamp;
  }-*/;
  
  private static native void  setGatherTimestamp(com.timguibord.widgets.client.weather.WeatherWidgetObjects instance, java.lang.String value) /*-{
    instance.@com.timguibord.widgets.client.weather.WeatherWidgetObjects::gatherTimestamp = value;
  }-*/;
  
  private static native java.lang.String getWeatherTitle(com.timguibord.widgets.client.weather.WeatherWidgetObjects instance) /*-{
    return instance.@com.timguibord.widgets.client.weather.WeatherWidgetObjects::weatherTitle;
  }-*/;
  
  private static native void  setWeatherTitle(com.timguibord.widgets.client.weather.WeatherWidgetObjects instance, java.lang.String value) /*-{
    instance.@com.timguibord.widgets.client.weather.WeatherWidgetObjects::weatherTitle = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.timguibord.widgets.client.weather.WeatherWidgetObjects instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setForcastData(instance, streamReader.readString());
    setGatherTimestamp(instance, streamReader.readString());
    setWeatherTitle(instance, streamReader.readString());
    
  }
  
  public static native com.timguibord.widgets.client.weather.WeatherWidgetObjects instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.timguibord.widgets.client.weather.WeatherWidgetObjects::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.timguibord.widgets.client.weather.WeatherWidgetObjects instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeString(getForcastData(instance));
    streamWriter.writeString(getGatherTimestamp(instance));
    streamWriter.writeString(getWeatherTitle(instance));
    
  }
  
}
