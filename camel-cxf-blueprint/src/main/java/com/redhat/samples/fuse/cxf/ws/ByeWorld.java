package com.redhat.samples.fuse.cxf.ws;

import javax.jws.WebService;

@WebService
public interface ByeWorld {
	
	String sayBye(String name);

}
