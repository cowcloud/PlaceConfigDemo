package com.cowcloud.placeconfig.client;

import com.cowcloud.placeconfig.client.config1.Presenter1a;
import com.cowcloud.placeconfig.client.config1.Presenter1b;
import com.cowcloud.placeconfig.client.config2.Presenter2a;
import com.cowcloud.placeconfig.client.config2.Presenter2b;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;
 

/*
 * This class implements the Dependency injection pattern for processing that occurs within the browser.
 * Resources configured here may be injected into a presenter class for the purpose of simplifying the loading 
 * of the presenter's associated objects , allowing for implementation to be associated with an interface,
 * managing the lifecycle of an object ( singletons / new memory objects) , and to improving the testability of the class.
 */
public class AppGinModule extends AbstractGinModule {

    @Override
    protected void configure() {

	    
        bind(PlaceDispatcher.class).in( Singleton.class);
        bind(EventBus.class).to(SimpleEventBus.class).in(Singleton.class);
    	
        bind(Presenter1a.class).in( Singleton.class);
        bind(Presenter1b.class).in( Singleton.class);
        bind(Presenter2a.class).in( Singleton.class);
        bind(Presenter2b.class).in( Singleton.class);
        

        
   
    }

}
