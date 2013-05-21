package com.cowcloud.placeconfig.client;
 
import java.util.Map;

import com.cowcloud.placeconfig.client.config1.Presenter1a;
import com.cowcloud.placeconfig.client.config1.Presenter1b;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;

public class Configuration1   { 
		
  @Inject Presenter1a presenter1a;
  @Inject Presenter1b presenter1b;
  
  public static enum Place {
		 a,
		 b
  }
	

  public void go(String pageName , Map<String, String> params, HasWidgets container) {
	Place place =   Place.valueOf(pageName);
 
	container.clear();
	switch (place) {

		case  a: { 
			 presenter1a.go(params,container );  
			 break;
		}
		case  b: {
			 presenter1b.go(params,container );  
			 break;
		}
	}
	 

  } 
  
 
}
