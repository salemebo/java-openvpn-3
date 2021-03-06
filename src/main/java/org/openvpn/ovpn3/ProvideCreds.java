/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.openvpn.ovpn3;

public class ProvideCreds {
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected ProvideCreds(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(ProvideCreds obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				ovpncliJNI.delete_ProvideCreds(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setUsername(String value) {
		ovpncliJNI.ProvideCreds_username_set(swigCPtr, this, value);
	}

	public String getUsername() {
		return ovpncliJNI.ProvideCreds_username_get(swigCPtr, this);
	}

	public void setPassword(String value) {
		ovpncliJNI.ProvideCreds_password_set(swigCPtr, this, value);
	}

	public String getPassword() {
		return ovpncliJNI.ProvideCreds_password_get(swigCPtr, this);
	}

	public void setResponse(String value) {
		ovpncliJNI.ProvideCreds_response_set(swigCPtr, this, value);
	}

	public String getResponse() {
		return ovpncliJNI.ProvideCreds_response_get(swigCPtr, this);
	}

	public void setDynamicChallengeCookie(String value) {
		ovpncliJNI.ProvideCreds_dynamicChallengeCookie_set(swigCPtr, this, value);
	}

	public String getDynamicChallengeCookie() {
		return ovpncliJNI.ProvideCreds_dynamicChallengeCookie_get(swigCPtr, this);
	}

	public void setReplacePasswordWithSessionID(boolean value) {
		ovpncliJNI.ProvideCreds_replacePasswordWithSessionID_set(swigCPtr, this, value);
	}

	public boolean getReplacePasswordWithSessionID() {
		return ovpncliJNI.ProvideCreds_replacePasswordWithSessionID_get(swigCPtr, this);
	}

	public void setCachePassword(boolean value) {
		ovpncliJNI.ProvideCreds_cachePassword_set(swigCPtr, this, value);
	}

	public boolean getCachePassword() {
		return ovpncliJNI.ProvideCreds_cachePassword_get(swigCPtr, this);
	}

	public ProvideCreds() {
		this(ovpncliJNI.new_ProvideCreds(), true);
	}

}
