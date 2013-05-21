package com.cowcloud.placeconfig.client;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
 
@GinModules(AppGinModule.class)
public interface AppGinjector  extends Ginjector {
 
	EventBus getEventBus();
	
    DemoPlaceDispatcher getPlaceDispatcher();
	
    Configuration1 getConfiguration1();
    Configuration2 getConfiguration2();


}
