package org.quickstarts.helloworld;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class Client {

	public static void main(String[] args) throws MalformedURLException {
		
			HelloService hello;
			URL wsdlUrl = new URL("http://localhost:8080/secure-test-project/HelloService?wsdl");
			QName serviceName = new QName("http://www.jboss.org/jbossas/quickstarts/wshelloworld/Hello", "HelloService");
			
			Service service = Service.create(wsdlUrl, serviceName);
			hello = service.getPort(HelloService.class);
			
			System.out.println(hello.sayHello());
			
		
	}

}
