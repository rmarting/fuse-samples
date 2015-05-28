CICS Sample Camel Router Project for Blueprint (OSGi)
=====================================================

This route uses CICS Camel Component to invoke a COBOL Program in a Mainframe

The uri to Mainframe is based in the following formats: 
    
    <to uri="cics://serverName1:port/program1?ServerName=CI0ARDE&amp;TraceLevel=9&amp;sslKeyring=sslKeyring1&amp;sslPassword=sslPassword1&amp;userId=userId1&amp;password=password1&amp;commAreaSize=0&amp;port=100"/>
    <to uri="cics://arde.intrallianz.es:2006/DC00CO01?ServerName=CI0ARDE&amp;TraceLevel=9"/>

	TODO: Complete with all available attributes    

---
To build this project use

    mvn install

To run the project you can execute the following Maven goal

    mvn camel:run

To deploy the project in OSGi. For example using Apache ServiceMix
or Apache Karaf. You can run the following command from its shell:

    osgi:install -s mvn:com.redhat.samples.fuse.cics/camel-cics-blueprint/<version>

For more help see the Apache Camel documentation

    http://camel.apache.org/
