package org.jboss.jbossas.quickstarts.wshelloworld.helloworld;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.6-redhat-3
 * 2013-10-24T11:27:30.608-05:00
 * Generated source version: 2.6.6-redhat-3
 * 
 */
@WebService(targetNamespace = "http://www.jboss.org/jbossas/quickstarts/wshelloworld/HelloWorld", name = "HelloService")
@XmlSeeAlso({ObjectFactory.class})
public interface HelloService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://www.jboss.org/jbossas/quickstarts/wshelloworld/HelloWorld", className = "org.jboss.jbossas.quickstarts.wshelloworld.helloworld.SayHello")
    @WebMethod
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://www.jboss.org/jbossas/quickstarts/wshelloworld/HelloWorld", className = "org.jboss.jbossas.quickstarts.wshelloworld.helloworld.SayHelloResponse")
    public java.lang.String sayHello();
}
