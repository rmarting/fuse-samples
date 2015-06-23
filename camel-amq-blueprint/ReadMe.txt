Camel Router Project for Blueprint (OSGi)
=========================================

To build this project use

    mvn install

To run the project you can execute the following Maven goal:

    mvn camel:run

Fuse Standalone
---------------
To deploy the project in Fuse Standalone. You can run the following command from its shell:

    osgi:install -s mvn:com.redhat.fuse.samples/camel-amq-blueprint/1.0.0-SNAPSHOT

Fuse Fabric
-----------
To deploy the project in Fuse Fabric. You can run the following Mavenl goal:

    mvn fabric8:deploy
    
From a Fuse Console you can create a container and add this profile in it:
 
    # Create container
	fabric:container-create-child --zookeeper-password admin root camel-amq-ct
	
	# Add Profile to container
	fabric:container-add-profile camel-amq-ct com.redhat.fuse.samples-camel-amq-blueprint

	# Remove Profile from container
	fabric:container-remove-profile camel-amq-app com.redhat.fuse.samples-camel-amq-blueprint

Links
=====

	JBoss Fuse/A-MQ - Easy way to achieve fault tolerant messaging 
		http://wei-meilin.blogspot.com.es/2014/10/jboss-fusea-mq-easy-way-to-achieve.html
	Creating ActiveMQ Broker cluster topologies using Fuse Fabric 		
		http://tmielke.blogspot.com.es/2013/08/creating-activemq-broker-cluster.html
	