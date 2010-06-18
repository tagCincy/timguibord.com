package com.timguibord.widgets.client.weather;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface WeatherWidgetServiceAsync {

	void getWeatherObjects(String zipCode, AsyncCallback<WeatherWidgetObjects> callback);
}
