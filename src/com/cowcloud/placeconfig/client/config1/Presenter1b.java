package com.cowcloud.placeconfig.client.config1;
 
import java.util.Map;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.SimplePanel;


public class Presenter1b   {


	private Map<String, String> params;
	
	private SimplePanel view = new SimplePanel();
	
	public Presenter1b() {
  
	}
	

	public void go(Map<String, String> params, final HasWidgets container ) {
		
		container.add(view);
		go(params);
		
	}
	
	private  void go(Map<String, String> params) {
	     
		this.params = params;

 
		Label label = new Label("Hello 1b");
		view.setWidget(label);

	}
 

}
