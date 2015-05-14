package com.redhat.samples.fuse.cxf.ws;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
	
	String sayHi(String name);

}
