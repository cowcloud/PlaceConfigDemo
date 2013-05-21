package com.cowcloud.placeconfig.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class PlaceConfigDemo implements EntryPoint {
	

	public static AppGinjector injector = GWT.create(AppGinjector.class);

	   
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() { 
		
	 	  DemoPlaceDispatcher appDispatcher = injector.getPlaceDispatcher();

		  appDispatcher.onModuleLoad(injector , RootPanel.get() );
		  
	}
}
