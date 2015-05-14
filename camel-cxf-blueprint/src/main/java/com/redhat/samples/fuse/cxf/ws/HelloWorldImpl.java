package com.redhat.samples.fuse.cxf.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.redhat.samples.fuse.cxf.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String sayHi(String name) {
		return "Hi " + name;
	}

}
