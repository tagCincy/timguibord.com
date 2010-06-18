package com.timguibord.backend.httpcall.doa;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;
import org.json.JSONObject;

import com.timguibord.backend.httpcall.beans.WeatherWidgetBean;

public class WeatherWidgetDoa {
	
	private static final String URI_BASE = "http://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20location%3D";
	private static final String JSON_FORMAT = "&format=json";
	
	
	public static WeatherWidgetBean getWeatherBean(String zipCode) {
		
		WeatherWidgetBean bean = new WeatherWidgetBean();
		try {
			
			HttpClient client = new DefaultHttpClient();
			HttpGet get = new HttpGet(URI_BASE + zipCode + JSON_FORMAT);
			HttpResponse response = client.execute(get);
			HttpEntity entity = response.getEntity();
			InputStream is = entity.getContent();
			
			String resultString = IOUtils.toString(is);
			
			JSONObject obj = new org.json.JSONObject(resultString);
			JSONObject queryObj = obj.getJSONObject("query");
			JSONObject resultObj = queryObj.getJSONObject("results");
			JSONObject channelObj = resultObj.getJSONObject("channel");
			JSONObject itemObj = channelObj.getJSONObject("item");
			
			bean.setForcastData(itemObj.getString("description"));
			bean.setGatherTimestamp(channelObj.getString("lastBuildDate"));
			bean.setWeatherTitle(channelObj.getString("description"));
			
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return bean;
	}

}
