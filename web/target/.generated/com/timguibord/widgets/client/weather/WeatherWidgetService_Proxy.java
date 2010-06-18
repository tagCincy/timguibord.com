package com.timguibord.widgets.client.weather;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;

public class WeatherWidgetService_Proxy extends RemoteServiceProxy implements com.timguibord.widgets.client.weather.WeatherWidgetServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "com.timguibord.widgets.client.weather.WeatherWidgetService";
  private static final String SERIALIZATION_POLICY ="62400E8C66F1226D3CBEC5044BE6BA0B";
  private static final com.timguibord.widgets.client.weather.WeatherWidgetService_TypeSerializer SERIALIZER = new com.timguibord.widgets.client.weather.WeatherWidgetService_TypeSerializer();
  
  public WeatherWidgetService_Proxy() {
    super(GWT.getModuleBaseURL(),
      "weather", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void getWeatherObjects(java.lang.String zipCode, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    int requestId = getNextRequestId();
    boolean toss = isStatsAvailable() && stats(timeStat("WeatherWidgetService_Proxy.getWeatherObjects", requestId, "begin"));
    SerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    try {
      streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
      streamWriter.writeString("getWeatherObjects");
      streamWriter.writeInt(1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(zipCode);
      String payload = streamWriter.toString();
      toss = isStatsAvailable() && stats(timeStat("WeatherWidgetService_Proxy.getWeatherObjects", requestId, "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "WeatherWidgetService_Proxy.getWeatherObjects", requestId, payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
}
