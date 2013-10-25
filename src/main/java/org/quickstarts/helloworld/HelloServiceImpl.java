package org.quickstarts.helloworld;

import javax.jws.WebService;
import org.jboss.ws.api.annotation.EndpointConfig;

@WebService(endpointInterface = "org.quickstarts.helloworld.HelloService", serviceName = "HelloService", portName = "TestHello", targetNamespace = "http://www.jboss.org/jbossas/quickstarts/wshelloworld/Hello")
@EndpointConfig(configFile = "WEB-INF/jaxws-endpoint-config.xml", configName = "Custom WS-Security Endpoint")
public class HelloServiceImpl implements HelloService{

	public String sayHello() {
		return "Hello World";
	}

}
