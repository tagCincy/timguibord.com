package com.timguibord.widgets.client.weather;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;

public class WeatherWidget extends Composite {

	private FlowPanel fp = new FlowPanel();
	private Label requestLabel = new Label("Entered zip code for current weather:");
	private TextBox zipCodeInput = new TextBox();
	private Button requestSubmit = new Button("<b>Get Weather</b>");
	private Label errorLabel = new Label();
	
	
	public WeatherWidget() {
		BuildInputWidget();
		initWidget(fp);
	}
	
	public WeatherWidget(String zipCode) {
		BuildOutputWidget(zipCode);
		initWidget(fp);
	}


	private void BuildInputWidget() {
		requestSubmit.addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				if(event.getSource() == requestSubmit){
					ProcessSubmission();
				}
				
			}
		});
		
		
		fp.add(requestLabel);
		zipCodeInput.setMaxLength(5);
		zipCodeInput.setSize("90", "30");
		fp.add(zipCodeInput);
		fp.add(requestSubmit);
		fp.add(errorLabel);
	}


	private void BuildOutputWidget(String zipCode) {
		if(!ZipCodeInputValid(zipCode)){
			errorLabel.setText("You must enter a valid zip code");
		} else {
			GetWeatherData(zipCode);
		}	
	}
	
	private void BuildOutputWidget(WeatherWidgetObjects obj) {
		fp.clear();
		fp.add(new HTML(obj.getWeatherTitle()));
		fp.add(new HTML(obj.getForcastData(), true));
		fp.add(new HTML(obj.getGatherTimestamp()));
	}

	private void ProcessSubmission() {
		if(!ZipCodeInputValid()){
			errorLabel.setText("You must enter a valid zip code");
		} else {
			GetWeatherData(zipCodeInput.getText().trim());
		}
		
	}

	private void GetWeatherData(String zipCode) {
		WeatherWidgetServiceAsync getWeatherData = (WeatherWidgetServiceAsync) GWT.create(WeatherWidgetService.class);

		getWeatherData.getWeatherObjects(zipCode, new WeatherCallback());
		
	}

	private boolean ZipCodeInputValid() {
		String enteredZipCode = zipCodeInput.getText().trim();
		
		if(enteredZipCode.isEmpty()){
			return false;
		}else if(!enteredZipCode.matches("^\\d{5}$")) {
			return false;
		}
		
		return true;
	}
	
	private boolean ZipCodeInputValid(String zipCode) {
		
		if(zipCode.isEmpty()){
			return false;
		}else if(!zipCode.matches("^\\d{5}$")) {
			return false;
		}
		
		return true;
	}
	
 	private class WeatherCallback implements AsyncCallback<WeatherWidgetObjects> {

 		public void onFailure(Throwable caught) {
 			
 			Window.alert(caught.getMessage());
 		}

 		public void onSuccess(WeatherWidgetObjects result) {
 			
 			BuildOutputWidget(result);
 		}
 	}
}


