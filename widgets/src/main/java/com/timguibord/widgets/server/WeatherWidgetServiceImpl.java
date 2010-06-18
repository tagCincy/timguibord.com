package com.timguibord.widgets.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.timguibord.widgets.client.weather.WeatherWidgetObjects;
import com.timguibord.widgets.client.weather.WeatherWidgetService;
import com.timguibord.widgets.service.WeatherService;

public class WeatherWidgetServiceImpl extends RemoteServiceServlet implements
		WeatherWidgetService {

	public WeatherWidgetObjects getWeatherObjects(String zipCode) {

		return WeatherService.getWeather(zipCode);
	}
}
