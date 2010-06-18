package com.timguibord.widgets.service;

import com.google.gwt.user.client.rpc.IsSerializable;
import com.timguibord.backend.httpcall.beans.WeatherWidgetBean;
import com.timguibord.backend.httpcall.impl.WeatherWidgetImpl;
import com.timguibord.widgets.client.weather.WeatherWidgetObjects;

public class WeatherService implements IsSerializable{

	public static WeatherWidgetObjects getWeather(String zipCode){
		WeatherWidgetBean bean = WeatherWidgetImpl.getWeather(zipCode);
		return new WeatherWidgetObjects(bean.getForcastData(), bean.getWeatherTitle(), bean.getGatherTimestamp());
	}
}
