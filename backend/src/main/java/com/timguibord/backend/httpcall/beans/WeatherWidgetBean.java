package com.timguibord.backend.httpcall.beans;

import java.io.Serializable;

public class WeatherWidgetBean implements Serializable {

	private String forcastData = "";
	private String weatherTitle = "";
	private String gatherTimestamp = "";
	
	public WeatherWidgetBean() {
		// TODO Auto-generated constructor stub
	}

	public WeatherWidgetBean(String forcastData, String weatherTitle,
			String gatherTimestamp) {
		this.forcastData = forcastData;
		this.weatherTitle = weatherTitle;
		this.gatherTimestamp = gatherTimestamp;
	}

	public String getForcastData() {
		return forcastData;
	}

	public void setForcastData(String forcastData) {
		this.forcastData = forcastData;
	}

	public String getWeatherTitle() {
		return weatherTitle;
	}

	public void setWeatherTitle(String weatherTitle) {
		this.weatherTitle = weatherTitle;
	}

	public String getGatherTimestamp() {
		return gatherTimestamp;
	}

	public void setGatherTimestamp(String gatherTimestamp) {
		this.gatherTimestamp = gatherTimestamp;
	}
}
