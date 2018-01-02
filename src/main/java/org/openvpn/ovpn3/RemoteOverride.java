/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.openvpn.ovpn3;

public class RemoteOverride {
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected RemoteOverride(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(RemoteOverride obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				ovpncliJNI.delete_RemoteOverride(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setHost(String value) {
		ovpncliJNI.RemoteOverride_host_set(swigCPtr, this, value);
	}

	public String getHost() {
		return ovpncliJNI.RemoteOverride_host_get(swigCPtr, this);
	}

	public void setIp(String value) {
		ovpncliJNI.RemoteOverride_ip_set(swigCPtr, this, value);
	}

	public String getIp() {
		return ovpncliJNI.RemoteOverride_ip_get(swigCPtr, this);
	}

	public void setPort(String value) {
		ovpncliJNI.RemoteOverride_port_set(swigCPtr, this, value);
	}

	public String getPort() {
		return ovpncliJNI.RemoteOverride_port_get(swigCPtr, this);
	}

	public void setProto(String value) {
		ovpncliJNI.RemoteOverride_proto_set(swigCPtr, this, value);
	}

	public String getProto() {
		return ovpncliJNI.RemoteOverride_proto_get(swigCPtr, this);
	}

	public RemoteOverride() {
		this(ovpncliJNI.new_RemoteOverride(), true);
	}

}
