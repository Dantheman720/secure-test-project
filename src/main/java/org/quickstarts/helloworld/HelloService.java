package org.quickstarts.helloworld;

import javax.jws.WebService;


@WebService(targetNamespace = "http://www.jboss.org/jbossas/quickstarts/wshelloworld/HelloWorld")
public interface HelloService {

	public String sayHello();
	
}
