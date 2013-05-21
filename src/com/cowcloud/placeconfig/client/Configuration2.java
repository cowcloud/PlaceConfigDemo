package com.cowcloud.placeconfig.client;
 
import java.util.Map;

import com.cowcloud.placeconfig.client.config2.Presenter2a;
import com.cowcloud.placeconfig.client.config2.Presenter2b;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;

public class Configuration2   {  
	
  @Inject Presenter2a presenter2a;
  @Inject Presenter2b presenter2b;
  
  public static enum Place {
		 a,
		 b
  }
	

  public void go(String pageName , Map<String, String> params, HasWidgets container) {
	Place place =   Place.valueOf(pageName);
 
	container.clear();
	switch (place) {

		case  a: { 
			 presenter2a.go(params,container );  
			 break;
		}
		case  b: {
			 presenter2b.go(params,container );  
			 break;
		}
	}
	 

  } 
  
 
}
