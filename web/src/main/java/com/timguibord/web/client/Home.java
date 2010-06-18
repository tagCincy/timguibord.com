package com.timguibord.web.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.timguibord.widgets.client.weather.WeatherWidget;

public class Home implements EntryPoint {

	public void onModuleLoad() {

		RootPanel.get().add(new WeatherWidget());

	}
}
