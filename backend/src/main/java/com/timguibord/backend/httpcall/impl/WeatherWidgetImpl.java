package com.timguibord.backend.httpcall.impl;

import com.timguibord.backend.httpcall.beans.WeatherWidgetBean;
import com.timguibord.backend.httpcall.doa.WeatherWidgetDoa;


public class WeatherWidgetImpl {

	public static WeatherWidgetBean getWeather(String zipCode) {
		
		return WeatherWidgetDoa.getWeatherBean(zipCode);
	}

}
