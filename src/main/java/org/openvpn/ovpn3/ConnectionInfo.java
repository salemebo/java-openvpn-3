/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.openvpn.ovpn3;

public class ConnectionInfo {
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected ConnectionInfo(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(ConnectionInfo obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				ovpncliJNI.delete_ConnectionInfo(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setDefined(boolean value) {
		ovpncliJNI.ConnectionInfo_defined_set(swigCPtr, this, value);
	}

	public boolean getDefined() {
		return ovpncliJNI.ConnectionInfo_defined_get(swigCPtr, this);
	}

	public void setUser(String value) {
		ovpncliJNI.ConnectionInfo_user_set(swigCPtr, this, value);
	}

	public String getUser() {
		return ovpncliJNI.ConnectionInfo_user_get(swigCPtr, this);
	}

	public void setServerHost(String value) {
		ovpncliJNI.ConnectionInfo_serverHost_set(swigCPtr, this, value);
	}

	public String getServerHost() {
		return ovpncliJNI.ConnectionInfo_serverHost_get(swigCPtr, this);
	}

	public void setServerPort(String value) {
		ovpncliJNI.ConnectionInfo_serverPort_set(swigCPtr, this, value);
	}

	public String getServerPort() {
		return ovpncliJNI.ConnectionInfo_serverPort_get(swigCPtr, this);
	}

	public void setServerProto(String value) {
		ovpncliJNI.ConnectionInfo_serverProto_set(swigCPtr, this, value);
	}

	public String getServerProto() {
		return ovpncliJNI.ConnectionInfo_serverProto_get(swigCPtr, this);
	}

	public void setServerIp(String value) {
		ovpncliJNI.ConnectionInfo_serverIp_set(swigCPtr, this, value);
	}

	public String getServerIp() {
		return ovpncliJNI.ConnectionInfo_serverIp_get(swigCPtr, this);
	}

	public void setVpnIp4(String value) {
		ovpncliJNI.ConnectionInfo_vpnIp4_set(swigCPtr, this, value);
	}

	public String getVpnIp4() {
		return ovpncliJNI.ConnectionInfo_vpnIp4_get(swigCPtr, this);
	}

	public void setVpnIp6(String value) {
		ovpncliJNI.ConnectionInfo_vpnIp6_set(swigCPtr, this, value);
	}

	public String getVpnIp6() {
		return ovpncliJNI.ConnectionInfo_vpnIp6_get(swigCPtr, this);
	}

	public void setGw4(String value) {
		ovpncliJNI.ConnectionInfo_gw4_set(swigCPtr, this, value);
	}

	public String getGw4() {
		return ovpncliJNI.ConnectionInfo_gw4_get(swigCPtr, this);
	}

	public void setGw6(String value) {
		ovpncliJNI.ConnectionInfo_gw6_set(swigCPtr, this, value);
	}

	public String getGw6() {
		return ovpncliJNI.ConnectionInfo_gw6_get(swigCPtr, this);
	}

	public void setClientIp(String value) {
		ovpncliJNI.ConnectionInfo_clientIp_set(swigCPtr, this, value);
	}

	public String getClientIp() {
		return ovpncliJNI.ConnectionInfo_clientIp_get(swigCPtr, this);
	}

	public void setTunName(String value) {
		ovpncliJNI.ConnectionInfo_tunName_set(swigCPtr, this, value);
	}

	public String getTunName() {
		return ovpncliJNI.ConnectionInfo_tunName_get(swigCPtr, this);
	}

	public ConnectionInfo() {
		this(ovpncliJNI.new_ConnectionInfo(), true);
	}

}
