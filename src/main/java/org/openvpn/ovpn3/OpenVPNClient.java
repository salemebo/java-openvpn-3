/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.openvpn.ovpn3;

public class OpenVPNClient extends TunBuilderBase {
	private transient long swigCPtr;

	protected OpenVPNClient(long cPtr, boolean cMemoryOwn) {
		super(ovpncliJNI.OpenVPNClient_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}

	protected static long getCPtr(OpenVPNClient obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	protected void finalize() {
		delete();
	}

	public synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				ovpncliJNI.delete_OpenVPNClient(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

	protected void swigDirectorDisconnect() {
		swigCMemOwn = false;
		delete();
	}

	public void swigReleaseOwnership() {
		swigCMemOwn = false;
		ovpncliJNI.OpenVPNClient_change_ownership(this, swigCPtr, false);
	}

	public void swigTakeOwnership() {
		swigCMemOwn = true;
		ovpncliJNI.OpenVPNClient_change_ownership(this, swigCPtr, true);
	}

	public OpenVPNClient() {
		this(ovpncliJNI.new_OpenVPNClient(), true);
		ovpncliJNI.OpenVPNClient_director_connect(this, swigCPtr, swigCMemOwn, true);
	}

	public static void init_process() {
		ovpncliJNI.OpenVPNClient_init_process();
	}

	public static void uninit_process() {
		ovpncliJNI.OpenVPNClient_uninit_process();
	}

	public static MergeConfig merge_config_static(String path, boolean follow_references) {
		return new MergeConfig(ovpncliJNI.OpenVPNClient_merge_config_static(path, follow_references), true);
	}

	public static MergeConfig merge_config_string_static(String config_content) {
		return new MergeConfig(ovpncliJNI.OpenVPNClient_merge_config_string_static(config_content), true);
	}

	public static EvalConfig eval_config_static(Config config) {
		return new EvalConfig(ovpncliJNI.OpenVPNClient_eval_config_static(Config.getCPtr(config), config), true);
	}

	public static int max_profile_size() {
		return ovpncliJNI.OpenVPNClient_max_profile_size();
	}

	public static boolean parse_dynamic_challenge(String cookie, DynamicChallenge dc) {
		return ovpncliJNI.OpenVPNClient_parse_dynamic_challenge(cookie, DynamicChallenge.getCPtr(dc), dc);
	}

	public EvalConfig eval_config(Config arg0) {
		return new EvalConfig(ovpncliJNI.OpenVPNClient_eval_config(swigCPtr, this, Config.getCPtr(arg0), arg0), true);
	}

	public Status provide_creds(ProvideCreds arg0) {
		return new Status(ovpncliJNI.OpenVPNClient_provide_creds(swigCPtr, this, ProvideCreds.getCPtr(arg0), arg0),
				true);
	}

	public boolean socket_protect(int socket) {
		return ovpncliJNI.OpenVPNClient_socket_protect(swigCPtr, this, socket);
	}

	public Status connect() {
		return new Status(ovpncliJNI.OpenVPNClient_connect(swigCPtr, this), true);
	}

	public ConnectionInfo connection_info() {
		return new ConnectionInfo(ovpncliJNI.OpenVPNClient_connection_info(swigCPtr, this), true);
	}

	public boolean session_token(SessionToken tok) {
		return ovpncliJNI.OpenVPNClient_session_token(swigCPtr, this, SessionToken.getCPtr(tok), tok);
	}

	public void stop() {
		ovpncliJNI.OpenVPNClient_stop(swigCPtr, this);
	}

	public void pause(String reason) {
		ovpncliJNI.OpenVPNClient_pause(swigCPtr, this, reason);
	}

	public void resume() {
		ovpncliJNI.OpenVPNClient_resume(swigCPtr, this);
	}

	public void reconnect(int seconds) {
		ovpncliJNI.OpenVPNClient_reconnect(swigCPtr, this, seconds);
	}

	public boolean pause_on_connection_timeout() {
		return ovpncliJNI.OpenVPNClient_pause_on_connection_timeout(swigCPtr, this);
	}

	public static int stats_n() {
		return ovpncliJNI.OpenVPNClient_stats_n();
	}

	public static String stats_name(int index) {
		return ovpncliJNI.OpenVPNClient_stats_name(index);
	}

	public long stats_value(int index) {
		return ovpncliJNI.OpenVPNClient_stats_value(swigCPtr, this, index);
	}

	public LLVector stats_bundle() {
		return new LLVector(ovpncliJNI.OpenVPNClient_stats_bundle(swigCPtr, this), true);
	}

	public InterfaceStats tun_stats() {
		return new InterfaceStats(ovpncliJNI.OpenVPNClient_tun_stats(swigCPtr, this), true);
	}

	public TransportStats transport_stats() {
		return new TransportStats(ovpncliJNI.OpenVPNClient_transport_stats(swigCPtr, this), true);
	}

	public void post_cc_msg(String msg) {
		ovpncliJNI.OpenVPNClient_post_cc_msg(swigCPtr, this, msg);
	}

	public void event(Event arg0) {
		ovpncliJNI.OpenVPNClient_event(swigCPtr, this, Event.getCPtr(arg0), arg0);
	}

	public void log(LogInfo arg0) {
		ovpncliJNI.OpenVPNClient_log(swigCPtr, this, LogInfo.getCPtr(arg0), arg0);
	}

	public void external_pki_cert_request(ExternalPKICertRequest arg0) {
		ovpncliJNI.OpenVPNClient_external_pki_cert_request(swigCPtr, this, ExternalPKICertRequest.getCPtr(arg0), arg0);
	}

	public void external_pki_sign_request(ExternalPKISignRequest arg0) {
		ovpncliJNI.OpenVPNClient_external_pki_sign_request(swigCPtr, this, ExternalPKISignRequest.getCPtr(arg0), arg0);
	}

	public boolean remote_override_enabled() {
		return (getClass() == OpenVPNClient.class) ? ovpncliJNI.OpenVPNClient_remote_override_enabled(swigCPtr, this)
				: ovpncliJNI.OpenVPNClient_remote_override_enabledSwigExplicitOpenVPNClient(swigCPtr, this);
	}

	public void remote_override(RemoteOverride arg0) {
		if (getClass() == OpenVPNClient.class)
			ovpncliJNI.OpenVPNClient_remote_override(swigCPtr, this, RemoteOverride.getCPtr(arg0), arg0);
		else
			ovpncliJNI.OpenVPNClient_remote_overrideSwigExplicitOpenVPNClient(swigCPtr, this,
					RemoteOverride.getCPtr(arg0), arg0);
	}

	public void clock_tick() {
		if (getClass() == OpenVPNClient.class)
			ovpncliJNI.OpenVPNClient_clock_tick(swigCPtr, this);
		else
			ovpncliJNI.OpenVPNClient_clock_tickSwigExplicitOpenVPNClient(swigCPtr, this);
	}

	public static String crypto_self_test() {
		return ovpncliJNI.OpenVPNClient_crypto_self_test();
	}

	public static int app_expire() {
		return ovpncliJNI.OpenVPNClient_app_expire();
	}

	public static String platform() {
		return ovpncliJNI.OpenVPNClient_platform();
	}

	public static String copyright() {
		return ovpncliJNI.OpenVPNClient_copyright();
	}

}
