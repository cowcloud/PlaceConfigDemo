package com.cowcloud.placeconfig.client;

import java.util.Map;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.user.client.ui.HasWidgets;

public class DemoPlaceDispatcher  extends PlaceDispatcher  {
	
 private AppGinjector injector;

	
  public static enum Configuration {
	  config1,
	  config2
  }
 

  public void onModuleLoad( AppGinjector injector , HasWidgets container ) {
		  
	    this.injector = injector;
	  	super.onModuleLoad(injector.getEventBus(),  container, "config1.a");
  
  }

  public void onValueChange(ValueChangeEvent<String> event) {
	  
	  final String[] configAndPlace= this.getConfigAndPlace(event);
	  if (configAndPlace == null)  return;
	  
	  final Map<String,String> params = this.getParams(event);

	  Configuration config = Configuration.valueOf(configAndPlace[0]);
	  final String placeString = configAndPlace[1];
      
	  switch (config) {
	  case config1:	   
		  GWT.runAsync(new RunAsyncCallback() {
			  public void onFailure(Throwable caught) {
			  }
			  public void onSuccess() {
				  injector.getConfiguration1().go(placeString,params,getContainer());
			  }
		  });
		  break; 
		  
	  case config2:	   
		  GWT.runAsync(new RunAsyncCallback() {
			  public void onFailure(Throwable caught) {
			  }
			  public void onSuccess() {
				  injector.getConfiguration2().go(placeString,params,getContainer());
			  }
		  });
		  break; 
	  }
	 
  }


  

}
