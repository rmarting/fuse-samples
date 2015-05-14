package com.redhat.samples.fuse.cxf.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.redhat.samples.fuse.cxf.ws.ByeWorld")
public class ByeWorldImpl implements ByeWorld {

	@Override
	public String sayBye(String name) {
		return "Hi " + name;
	}

}
