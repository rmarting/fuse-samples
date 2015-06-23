Camel ActiveMQ Project
======================

This project embeds Apache ActiveMQ together with Apache Camel.

To build this project use

    mvn install

To run this project use the following Maven goal

    mvn camel:run

Fuse Standalone
---------------
To deploy the project in Fuse Standalone. You can run the following command from its shell:

    osgi:install -s mvn:com.redhat.fuse.samples/camel-amq-spring/1.0.0-SNAPSHOT
