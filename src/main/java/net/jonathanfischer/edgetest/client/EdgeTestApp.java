package net.jonathanfischer.edgetest.client;

import com.google.gwt.core.client.EntryPoint;
import elemental2.dom.DomGlobal;

public class EdgeTestApp implements EntryPoint {
	@Override
	public void onModuleLoad() {
		DomGlobal.window.location.assign("#an-empty-hash");
		Location location = (Location)DomGlobal.window.location;
		DomGlobal.console.log(location.hash);
	}
}

