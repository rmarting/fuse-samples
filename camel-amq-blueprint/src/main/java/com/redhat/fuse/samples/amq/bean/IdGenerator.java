package com.redhat.fuse.samples.amq.bean;

/**
 * An interface for implementing ID Generator services.
 */
public interface IdGenerator {

	/**
	 * @return New unique ID
	 */
	String generateNewID();
	
}
