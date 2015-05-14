Camel Router Project for Blueprint (OSGi)
=========================================

To build this project use

    mvn install

To run the project you can execute the following Maven goal

    mvn camel:run

To deploy the project in OSGi. For example using Apache ServiceMix
or Apache Karaf. You can run the following command from its shell:

    osgi:install -s mvn:com.redhat.samples.fuse/camel-blueprint/1.0.0-SNAPSHOT
    
You can update with the following command:

    osgi:update <ID> mvn:com.redhat.samples.fuse/camel-blueprint/1.0.0-SNAPSHOT

In src/test/resources/orders there are some xml files with data to test the Camel Routes. 
You only need to copy these files in $JBOSS_FUSE_INSTALL/orders with the next rules:

    - simple-order-XX.xml to $JBOSS_FUSE_INSTALL/orders/pending/simple
    - multiple-order-XX.xml to $JBOSS_FUSE_INSTALL/orders/pending/multiple
    
The result will be saved in $JBOSS_FUSE_INSTALL/orders/done     

---
For more help see the Apache Camel documentation

    http://camel.apache.org/
