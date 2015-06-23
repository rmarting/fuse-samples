package com.redhat.fuse.samples.amq.bean;

import java.util.Random;

/**
 * A bean which we use in the route
 */
public class IdGeneratorBean implements IdGenerator {

	private Random random = new Random();

	@Override
	public String generateNewID() {
		return "ID-{" + random.nextInt(10000) + "}";
	}

}
