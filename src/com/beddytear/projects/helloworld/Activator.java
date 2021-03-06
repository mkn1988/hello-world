package com.beddytear.projects.helloworld;

import java.util.Dictionary;
import java.util.Hashtable;

import org.apache.felix.dm.Component;
import org.opendaylight.controller.sal.core.ComponentActivatorAbstractBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Activator extends ComponentActivatorAbstractBase {

	private static final Logger log = LoggerFactory.getLogger(HelloWorld.class);

	public Object[] getImplementations() {
		log.trace("Getting Implementations");

		Object[] res = { HelloWorld.class };
		return res;
	}

	public void configureInstance(Component c, Object imp, String containerName) {
		log.trace("Configuring instance");

		if (imp.equals(HelloWorld.class)) {

			// Define exported and used services for PacketHandler component.

			Dictionary<String, Object> props = new Hashtable<String, Object>();
			props.put("salListenerName", "helloworld");
		}
	}
}