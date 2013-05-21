package com.cowcloud.placeconfig.client.config2;
 
import java.util.Map;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.SimplePanel;


public class Presenter2a   {


	private Map<String, String> params;
	
	private SimplePanel view = new SimplePanel();
	
	public Presenter2a() {
  
	}
	

	public void go(Map<String, String> params, final HasWidgets container ) {
		
		container.add(view);
		go(params);
		
	}
	
	private  void go(Map<String, String> params) {
	     
		this.params = params;

 
		Label label = new Label("Hello 2a");
		view.setWidget(label);

	}
 

}
