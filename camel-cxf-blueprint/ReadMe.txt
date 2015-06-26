Camel Router Project for Blueprint (OSGi)
=========================================

To build this project use

    mvn install

To run the project you can execute the following Maven goal

    mvn camel:run

To deploy the project in OSGi. For example using Apache ServiceMix
or Apache Karaf. You can run the following command from its shell:

    osgi:install -s mvn:com.redhat.fuse.samples/camel-cxf-blueprint/1.0.0-SNAPSHOT

You can update with the following command:   
    
    osgi:update <id> mvn:com.redhat.fuse.samples/camel-cxf-blueprint/1.0.0-SNAPSHOT
    
Fuse Fabric
-----------
To deploy the project in Fuse Fabric. You can run the following Mavenl goal:

    mvn fabric8:deploy
    
From a Fuse Console you can create a container and add this profile in it:
 
    # Create container
	fabric:container-create-child --zookeeper-password admin --bind-address 127.0.0.1 --zookeeper-password admin --resolver manualip root camel-cxf-ct
	
	# Add Profile to container
	fabric:container-add-profile camel-cxf-ct com.redhat.fuse.samples-camel-cxf-blueprint

	# Remove Profile from container
	fabric:container-remove-profile camel-cxf-ct com.redhat.fuse.samples-camel-cxf-blueprint
	
	fabric:profile-import mvn:com.redhat.fuse.samples/camel-cxf-blueprint/1.0.0-SNAPSHOT/zip/profile    


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
    	
    Using a GateWay
		http://localhost:9000/cxf/webservices/ByeWorld/?wsdl    	
    
---
For more help see the Apache Camel documentation

    http://camel.apache.org/
