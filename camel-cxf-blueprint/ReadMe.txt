Camel Router Project for Blueprint (OSGi)
=========================================

To build this project use

    mvn install

To run the project you can execute the following Maven goal

    mvn camel:run

To deploy the project in OSGi. For example using Apache ServiceMix
or Apache Karaf. You can run the following command from its shell:

    osgi:install -s mvn:com.redhat.samples.fuse.cxf/camel-cxf-blueprint/1.0.0-SNAPSHOT

You can update with the following command:   
    
    osgi:update <id> mvn:com.redhat.samples.fuse.cxf/camel-cxf-blueprint/1.0.0-SNAPSHOT

In src/test/resources/sopaui there are some SoapUI projects to test the Camel CXF Services. 
You only need to load in SoapUI these files.
The based URIs are: 

    - http://localhost:8181/cxf: List of all services (WS, RS)
    - WSDL: 
    	http://localhost:8181/cxf/webservices/HelloWorld?wsdl
    	http://localhost:8181/cxf/webservices/ByeWorld?wsdl
    - REST:
    	http://localhost:8181/cxf/rs/HelloWorld/{name}
    	http://localhost:8181/cxf/rs/ByeWorld/{name}
    
---
For more help see the Apache Camel documentation

    http://camel.apache.org/
