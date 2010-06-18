package com.timguibord.widgets.client.weather;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("weather")
public interface WeatherWidgetService extends RemoteService {

	WeatherWidgetObjects getWeatherObjects(String zipCode);

}
