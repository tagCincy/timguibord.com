package com.timguibord.widgets.client.weather;

import com.google.gwt.user.client.rpc.IsSerializable;

public class WeatherWidgetObjects implements IsSerializable{

	private String forcastData = "";
	private String weatherTitle = "";
	private String gatherTimestamp = "";
	
	public WeatherWidgetObjects() {
		// TODO Auto-generated constructor stub
	}

	public WeatherWidgetObjects(String forcastData,
			String weatherTitle, String gatherTimestamp) {
		this.forcastData = forcastData;
		this.weatherTitle = weatherTitle;
		this.gatherTimestamp = gatherTimestamp;
	}

	public String getForcastData() {
		return forcastData;
	}

	public String getGatherTimestamp() {
		return gatherTimestamp;
	}

	public String getWeatherTitle() {
		return weatherTitle;
	}

	public void setForcastData(String forcastData) {
		this.forcastData = forcastData;
	}

	public void setGatherTimestamp(String gatherTimestamp) {
		this.gatherTimestamp = gatherTimestamp;
	}

	public void setWeatherTitle(String weatherTitle) {
		this.weatherTitle = weatherTitle;
	}
}
