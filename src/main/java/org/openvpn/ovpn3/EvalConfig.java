/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.openvpn.ovpn3;

public class EvalConfig {
	private transient long swigCPtr;
	protected transient boolean swigCMemOwn;

	protected EvalConfig(long cPtr, boolean cMemoryOwn) {
		swigCMemOwn = cMemoryOwn;
		swigCPtr = cPtr;
	}

	protected static long getCPtr(EvalConfig obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				ovpncliJNI.delete_EvalConfig(swigCPtr);
			}
			swigCPtr = 0;
		}
	}

	public void setError(boolean value) {
		ovpncliJNI.EvalConfig_error_set(swigCPtr, this, value);
	}

	public boolean getError() {
		return ovpncliJNI.EvalConfig_error_get(swigCPtr, this);
	}

	public void setMessage(String value) {
		ovpncliJNI.EvalConfig_message_set(swigCPtr, this, value);
	}

	public String getMessage() {
		return ovpncliJNI.EvalConfig_message_get(swigCPtr, this);
	}

	public void setUserlockedUsername(String value) {
		ovpncliJNI.EvalConfig_userlockedUsername_set(swigCPtr, this, value);
	}

	public String getUserlockedUsername() {
		return ovpncliJNI.EvalConfig_userlockedUsername_get(swigCPtr, this);
	}

	public void setProfileName(String value) {
		ovpncliJNI.EvalConfig_profileName_set(swigCPtr, this, value);
	}

	public String getProfileName() {
		return ovpncliJNI.EvalConfig_profileName_get(swigCPtr, this);
	}

	public void setFriendlyName(String value) {
		ovpncliJNI.EvalConfig_friendlyName_set(swigCPtr, this, value);
	}

	public String getFriendlyName() {
		return ovpncliJNI.EvalConfig_friendlyName_get(swigCPtr, this);
	}

	public void setAutologin(boolean value) {
		ovpncliJNI.EvalConfig_autologin_set(swigCPtr, this, value);
	}

	public boolean getAutologin() {
		return ovpncliJNI.EvalConfig_autologin_get(swigCPtr, this);
	}

	public void setExternalPki(boolean value) {
		ovpncliJNI.EvalConfig_externalPki_set(swigCPtr, this, value);
	}

	public boolean getExternalPki() {
		return ovpncliJNI.EvalConfig_externalPki_get(swigCPtr, this);
	}

	public void setStaticChallenge(String value) {
		ovpncliJNI.EvalConfig_staticChallenge_set(swigCPtr, this, value);
	}

	public String getStaticChallenge() {
		return ovpncliJNI.EvalConfig_staticChallenge_get(swigCPtr, this);
	}

	public void setStaticChallengeEcho(boolean value) {
		ovpncliJNI.EvalConfig_staticChallengeEcho_set(swigCPtr, this, value);
	}

	public boolean getStaticChallengeEcho() {
		return ovpncliJNI.EvalConfig_staticChallengeEcho_get(swigCPtr, this);
	}

	public void setPrivateKeyPasswordRequired(boolean value) {
		ovpncliJNI.EvalConfig_privateKeyPasswordRequired_set(swigCPtr, this, value);
	}

	public boolean getPrivateKeyPasswordRequired() {
		return ovpncliJNI.EvalConfig_privateKeyPasswordRequired_get(swigCPtr, this);
	}

	public void setAllowPasswordSave(boolean value) {
		ovpncliJNI.EvalConfig_allowPasswordSave_set(swigCPtr, this, value);
	}

	public boolean getAllowPasswordSave() {
		return ovpncliJNI.EvalConfig_allowPasswordSave_get(swigCPtr, this);
	}

	public void setRemoteHost(String value) {
		ovpncliJNI.EvalConfig_remoteHost_set(swigCPtr, this, value);
	}

	public String getRemoteHost() {
		return ovpncliJNI.EvalConfig_remoteHost_get(swigCPtr, this);
	}

	public void setRemotePort(String value) {
		ovpncliJNI.EvalConfig_remotePort_set(swigCPtr, this, value);
	}

	public String getRemotePort() {
		return ovpncliJNI.EvalConfig_remotePort_get(swigCPtr, this);
	}

	public void setRemoteProto(String value) {
		ovpncliJNI.EvalConfig_remoteProto_set(swigCPtr, this, value);
	}

	public String getRemoteProto() {
		return ovpncliJNI.EvalConfig_remoteProto_get(swigCPtr, this);
	}

	public void setServerList(ServerEntryVector value) {
		ovpncliJNI.EvalConfig_serverList_set(swigCPtr, this, ServerEntryVector.getCPtr(value), value);
	}

	public ServerEntryVector getServerList() {
		long cPtr = ovpncliJNI.EvalConfig_serverList_get(swigCPtr, this);
		return (cPtr == 0) ? null : new ServerEntryVector(cPtr, false);
	}

	public EvalConfig() {
		this(ovpncliJNI.new_EvalConfig(), true);
	}

}