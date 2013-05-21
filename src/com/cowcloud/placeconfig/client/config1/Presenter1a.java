package com.cowcloud.placeconfig.client.config1;
 
import java.util.Map;

import com.cowcloud.placeconfig.client.PlaceDispatcher;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.inject.Inject;


public class Presenter1a   {

	@Inject EventBus eventBus;

	private Map<String, String> params;
	
	private SimplePanel view = new SimplePanel();
	
	public Presenter1a() {
  
	}
	

	public void go(Map<String, String> params, final HasWidgets container ) {
		
		container.add(view);
		go(params);
		
	}
	
	private  void go(Map<String, String> params) {
	     
		this.params = params;

		VerticalPanel vp = new VerticalPanel();
		Label label = new Label("Hello 1a");
		vp.add(label);
		Anchor anchor1 = new Anchor();
		//specify url as string ... good for supporting right click on hyperlinks
		anchor1.setText("goto 1b");
		anchor1.setHref("/PlaceConfigDemo.html#config1.b");
		vp.add(anchor1);
		
		Anchor anchor2 = new Anchor();
		//specify url as string ... good for supporting right click on hyperlinks
		anchor2.setText("goto 2a");
		anchor2.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				PlaceDispatcher.gotoPlace("config2.a", Presenter1a.this.params, eventBus);
				
			}
		});
		vp.add(anchor2);
		
		view.setWidget(vp);
		
		

	}
 

}
