package org.jboss.jbossas.quickstarts.wshelloworld.hello;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.6-redhat-3
 * 2013-10-24T11:27:30.656-05:00
 * Generated source version: 2.6.6-redhat-3
 * 
 */
@WebServiceClient(name = "HelloService", 
                  wsdlLocation = "http://localhost:8080/secure-test-project/HelloService?wsdl",
                  targetNamespace = "http://www.jboss.org/jbossas/quickstarts/wshelloworld/Hello") 
public class HelloService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.jboss.org/jbossas/quickstarts/wshelloworld/Hello", "HelloService");
    public final static QName TestHello = new QName("http://www.jboss.org/jbossas/quickstarts/wshelloworld/Hello", "TestHello");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/secure-test-project/HelloService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(HelloService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/secure-test-project/HelloService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public HelloService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HelloService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public HelloService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public HelloService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public HelloService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns HelloService
     */
    @WebEndpoint(name = "TestHello")
    public org.jboss.jbossas.quickstarts.wshelloworld.helloworld.HelloService getTestHello() {
        return super.getPort(TestHello, org.jboss.jbossas.quickstarts.wshelloworld.helloworld.HelloService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloService
     */
    @WebEndpoint(name = "TestHello")
    public org.jboss.jbossas.quickstarts.wshelloworld.helloworld.HelloService getTestHello(WebServiceFeature... features) {
        return super.getPort(TestHello, org.jboss.jbossas.quickstarts.wshelloworld.helloworld.HelloService.class, features);
    }

}
