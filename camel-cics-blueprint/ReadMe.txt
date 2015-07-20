CICS Transaction Gateway Sample Camel Router Project for Blueprint (OSGi)
=========================================================================

This route uses CICS Transaction Gateway Camel Component to invoke a COBOL Program in a Mainframe

The uri to Mainframe is based in the following formats: 
    
    <to uri="cics://HOST:PORT/SERVER?TraceLevel=9&amp;sslKeyring=sslKeyring1&amp;sslPassword=sslPassword1&amp;userId=userId1&amp;password=password1&amp"/>

	TODO: Complete with all available attributes    

---
To build this project use

    mvn install

To run the project you can execute the following Maven goal

    mvn camel:run

To deploy the project in OSGi. For example using Apache ServiceMix
or Apache Karaf. You can run the following command from its shell:

    osgi:install -s mvn:com.redhat.fuse.samples/camel-cics-blueprint/<version>

For more help see the Apache Camel documentation

    http://camel.apache.org/

Fuse Fabric (TODO)
===========    
    
	JBossFuse:karaf@root> fabric:profile-edit --repository file:/my-features-repo.xml com.redhat.fuse.samples-camel-cics-blueprint 
	Adding feature repository:file:/my-features-repo.xml to profile:com.redhat.fuse.samples-camel-cics-blueprint version:1.0
    
	Feature: camel-cics
