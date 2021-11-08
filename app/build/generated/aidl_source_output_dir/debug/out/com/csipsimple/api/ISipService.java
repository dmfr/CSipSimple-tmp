/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.csipsimple.api;
public interface ISipService extends android.os.IInterface
{
  /** Default implementation for ISipService. */
  public static class Default implements com.csipsimple.api.ISipService
  {
    /**
    	* Get the current API version
    	* @return version number. 1000 x major version + minor version
    	* Each major version must be compatible with all versions of the same major version
    	*/
    @Override public int getVersion() throws android.os.RemoteException
    {
      return 0;
    }
    //Stack control
    /**
    	* Start the sip stack
    	*/
    @Override public void sipStart() throws android.os.RemoteException
    {
    }
    /**
    	* Stop the sip stack
    	*/
    @Override public void sipStop() throws android.os.RemoteException
    {
    }
    /**
    	* Force to stop the sip service (stack + everything that goes arround stack)
    	*/
    @Override public void forceStopService() throws android.os.RemoteException
    {
    }
    /**
    	* Restart the sip stack
    	*/
    @Override public void askThreadedRestart() throws android.os.RemoteException
    {
    }
    //Account control
    /**
    	* Add all accounts available in database and marked active to running sip stack (loaded previously using sipStart)
    	*/
    @Override public void addAllAccounts() throws android.os.RemoteException
    {
    }
    /**
    	* Remove all accounts from running sip stack (this does nothing in database)
    	*/
    @Override public void removeAllAccounts() throws android.os.RemoteException
    {
    }
    /**
    	* remove and add all accounts available in database and marked active
    	*/
    @Override public void reAddAllAccounts() throws android.os.RemoteException
    {
    }
    /**
    	* Change registration for a given account/profile id (id in database)
    	* @param accountId the account for which we'd like to change the registration state
    	* @param renew 0 if we don't want to unregister, 1 to renew registration
    	*/
    @Override public void setAccountRegistration(int accountId, int renew) throws android.os.RemoteException
    {
    }
    /**
    	* Get registration state for a given account id
    	* @param accountId the account/profile id for which we'd like to get the info (in database)
    	* @return the Profile state
    	*/
    @Override public com.csipsimple.api.SipProfileState getSipProfileState(int accountId) throws android.os.RemoteException
    {
      return null;
    }
    //Call configuration control
    /**
    	 * Switch next incoming request to auto answer
    	 */
    @Override public void switchToAutoAnswer() throws android.os.RemoteException
    {
    }
    /**
    	 * Ignore next outgoing call request from tel handler processing
    	 */
    @Override public void ignoreNextOutgoingCallFor(java.lang.String number) throws android.os.RemoteException
    {
    }
    //Call control
    /**
    	 * Place a call.
    	 * 
    	 * @param callee The sip uri to call. 
    	 * It can also be a simple number, in which case the app will autocomplete.
    	 * If you add the scheme, take care to fill completely else it could be considered as a call
    	 * to a sip IP/domain
    	 * @param accountId The id of the account to use for this call. 
    	 */
    @Override public void makeCall(java.lang.String callee, int accountId) throws android.os.RemoteException
    {
    }
    /**
    	 * Place a call.
    	 * 
    	 * @param callee The sip uri to call. 
    	 * It can also be a simple number, in which case the app will autocomplete.
    	 * If you add the scheme, take care to fill completely else it could be considered as a call
    	 * to a sip IP/domain
    	 * @param accountId The id of the account to use for this call. 
    	 * @param options The options you'd like to apply for this calls {@link SipCallSession#OPT_CALL_VIDEO}, {@link SipCallSession#OPT_CALL_EXTRA_HEADERS}
    	 */
    @Override public void makeCallWithOptions(java.lang.String callee, int accountId, android.os.Bundle options) throws android.os.RemoteException
    {
    }
    /**
    	 * Answer a call.
    	 * 
    	 * @param callId The id of the call to answer.
    	 * @param status The sip status code you'd like to answer with. 200 to take the call.  400 <= status < 500 if refusing.
    	 */
    @Override public int answer(int callId, int status) throws android.os.RemoteException
    {
      return 0;
    }
    /**
    	 * Hangup a call.
    	 *
    	 * @param callId The id of the call to hangup.
    	 * @param status The sip status code you'd like to hangup with.
    	 */
    @Override public int hangup(int callId, int status) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public int sendDtmf(int callId, int keyCode) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public int hold(int callId) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public int reinvite(int callId, boolean unhold) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public int xfer(int callId, java.lang.String callee) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public int xferReplace(int callId, int otherCallId, int options) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public com.csipsimple.api.SipCallSession getCallInfo(int callId) throws android.os.RemoteException
    {
      return null;
    }
    @Override public com.csipsimple.api.SipCallSession[] getCalls() throws android.os.RemoteException
    {
      return null;
    }
    @Override public java.lang.String showCallInfosDialog(int callId) throws android.os.RemoteException
    {
      return null;
    }
    //Media control

    @Override public void setMicrophoneMute(boolean on) throws android.os.RemoteException
    {
    }
    @Override public void setSpeakerphoneOn(boolean on) throws android.os.RemoteException
    {
    }
    @Override public void setBluetoothOn(boolean on) throws android.os.RemoteException
    {
    }
    @Override public void confAdjustTxLevel(int port, float value) throws android.os.RemoteException
    {
    }
    @Override public void confAdjustRxLevel(int port, float value) throws android.os.RemoteException
    {
    }
    /**
    	 * Get Rx and Tx sound level for a given port.
    	 *
    	 * @param port Port id we'd like to have the level
    	 * @return The RX and TX (0-255) level encoded as RX << 8 | TX
    	 */
    @Override public long confGetRxTxLevel(int port) throws android.os.RemoteException
    {
      return 0L;
    }
    @Override public void setEchoCancellation(boolean on) throws android.os.RemoteException
    {
    }
    @Override public void adjustVolume(com.csipsimple.api.SipCallSession callInfo, int direction, int flags) throws android.os.RemoteException
    {
    }
    @Override public com.csipsimple.api.MediaState getCurrentMediaState() throws android.os.RemoteException
    {
      return null;
    }
    @Override public int startLoopbackTest() throws android.os.RemoteException
    {
      return 0;
    }
    @Override public int stopLoopbackTest() throws android.os.RemoteException
    {
      return 0;
    }
    // Record calls
    /**
    	 * Start recording of a call to a file.
    	 * 
    	 * @param callId the call id to start recording of.
         * @param way the way the recording takes
         *  {@link SipManager#BITMASK_IN} => record remote party (what goes out speaker/earpiece)
         *  {@link SipManager#BITMASK_OUT} =>  record self (what comes from micro), 
         * If 0 will record all ways.
    	 */
    @Override public void startRecording(int callId, int way) throws android.os.RemoteException
    {
    }
    /**
    	 * Stop recording of a call.
    	 * 
    	 * @param callId the call id to stop recording (of all recording ways)
    	 */
    @Override public void stopRecording(int callId) throws android.os.RemoteException
    {
    }
    /**
    	 * Is the call being recorded (for at least one way) ?
    	 * 
    	 * @param callId the call id to get recording status of.
    	 * @return true if the call is currently being recorded
    	 */
    @Override public boolean isRecording(int callId) throws android.os.RemoteException
    {
      return false;
    }
    /**
    	 * Can the call be recorded ?
    	 * 
    	 * @param callId the call id to get record capability of.
    	 * @return true if it's possible to record the call. 
    	 */
    @Override public boolean canRecord(int callId) throws android.os.RemoteException
    {
      return false;
    }
    // Play files to stream
    /**
    	* @param filePath filePath the file to play in stream
    	* @param callId the call to play to
    	* @param way the way the file should be played 
    	* {@link SipManager#BITMASK_IN} =>  send to user (speaker/earpiece)
    	*  {@link SipManager#BITMASK_OUT}  => send to remote party (micro), 
    	* example : way = 3 : will play sound both ways
    	*/
    @Override public void playWaveFile(java.lang.String filePath, int callId, int way) throws android.os.RemoteException
    {
    }
    // SMS

    @Override public void sendMessage(java.lang.String msg, java.lang.String toNumber, long accountId) throws android.os.RemoteException
    {
    }
    // Presence

    @Override public void setPresence(int presence, java.lang.String statusText, long accountId) throws android.os.RemoteException
    {
    }
    @Override public int getPresence(long accountId) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public java.lang.String getPresenceStatus(long accountId) throws android.os.RemoteException
    {
      return null;
    }
    //Secure

    @Override public void zrtpSASVerified(int callId) throws android.os.RemoteException
    {
    }
    // Video

    @Override public void updateCallOptions(int callId, android.os.Bundle options) throws android.os.RemoteException
    {
    }
    /**
    	 * Revoke a ZRTP SAS
    	 */
    @Override public void zrtpSASRevoke(int callId) throws android.os.RemoteException
    {
    }
    /**
    	 * Get nat type detected by the sip stack
    	 * @return String representing nat type detected by the stack. Empty string if nothing detected yet.
    	 */
    @Override public java.lang.String getLocalNatType() throws android.os.RemoteException
    {
      return null;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.csipsimple.api.ISipService
  {
    private static final java.lang.String DESCRIPTOR = "com.csipsimple.api.ISipService";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.csipsimple.api.ISipService interface,
     * generating a proxy if needed.
     */
    public static com.csipsimple.api.ISipService asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.csipsimple.api.ISipService))) {
        return ((com.csipsimple.api.ISipService)iin);
      }
      return new com.csipsimple.api.ISipService.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_getVersion:
        {
          data.enforceInterface(descriptor);
          int _result = this.getVersion();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_sipStart:
        {
          data.enforceInterface(descriptor);
          this.sipStart();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_sipStop:
        {
          data.enforceInterface(descriptor);
          this.sipStop();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_forceStopService:
        {
          data.enforceInterface(descriptor);
          this.forceStopService();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_askThreadedRestart:
        {
          data.enforceInterface(descriptor);
          this.askThreadedRestart();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_addAllAccounts:
        {
          data.enforceInterface(descriptor);
          this.addAllAccounts();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_removeAllAccounts:
        {
          data.enforceInterface(descriptor);
          this.removeAllAccounts();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_reAddAllAccounts:
        {
          data.enforceInterface(descriptor);
          this.reAddAllAccounts();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setAccountRegistration:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.setAccountRegistration(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getSipProfileState:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          com.csipsimple.api.SipProfileState _result = this.getSipProfileState(_arg0);
          reply.writeNoException();
          if ((_result!=null)) {
            reply.writeInt(1);
            _result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          }
          else {
            reply.writeInt(0);
          }
          return true;
        }
        case TRANSACTION_switchToAutoAnswer:
        {
          data.enforceInterface(descriptor);
          this.switchToAutoAnswer();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_ignoreNextOutgoingCallFor:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.ignoreNextOutgoingCallFor(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_makeCall:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          this.makeCall(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_makeCallWithOptions:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          android.os.Bundle _arg2;
          if ((0!=data.readInt())) {
            _arg2 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg2 = null;
          }
          this.makeCallWithOptions(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_answer:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _result = this.answer(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_hangup:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _result = this.hangup(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_sendDtmf:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _result = this.sendDtmf(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_hold:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.hold(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_reinvite:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          boolean _arg1;
          _arg1 = (0!=data.readInt());
          int _result = this.reinvite(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_xfer:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _result = this.xfer(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_xferReplace:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          int _result = this.xferReplace(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getCallInfo:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          com.csipsimple.api.SipCallSession _result = this.getCallInfo(_arg0);
          reply.writeNoException();
          if ((_result!=null)) {
            reply.writeInt(1);
            _result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          }
          else {
            reply.writeInt(0);
          }
          return true;
        }
        case TRANSACTION_getCalls:
        {
          data.enforceInterface(descriptor);
          com.csipsimple.api.SipCallSession[] _result = this.getCalls();
          reply.writeNoException();
          reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          return true;
        }
        case TRANSACTION_showCallInfosDialog:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _result = this.showCallInfosDialog(_arg0);
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_setMicrophoneMute:
        {
          data.enforceInterface(descriptor);
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          this.setMicrophoneMute(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setSpeakerphoneOn:
        {
          data.enforceInterface(descriptor);
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          this.setSpeakerphoneOn(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setBluetoothOn:
        {
          data.enforceInterface(descriptor);
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          this.setBluetoothOn(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_confAdjustTxLevel:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          float _arg1;
          _arg1 = data.readFloat();
          this.confAdjustTxLevel(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_confAdjustRxLevel:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          float _arg1;
          _arg1 = data.readFloat();
          this.confAdjustRxLevel(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_confGetRxTxLevel:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          long _result = this.confGetRxTxLevel(_arg0);
          reply.writeNoException();
          reply.writeLong(_result);
          return true;
        }
        case TRANSACTION_setEchoCancellation:
        {
          data.enforceInterface(descriptor);
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          this.setEchoCancellation(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_adjustVolume:
        {
          data.enforceInterface(descriptor);
          com.csipsimple.api.SipCallSession _arg0;
          if ((0!=data.readInt())) {
            _arg0 = com.csipsimple.api.SipCallSession.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          this.adjustVolume(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getCurrentMediaState:
        {
          data.enforceInterface(descriptor);
          com.csipsimple.api.MediaState _result = this.getCurrentMediaState();
          reply.writeNoException();
          if ((_result!=null)) {
            reply.writeInt(1);
            _result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          }
          else {
            reply.writeInt(0);
          }
          return true;
        }
        case TRANSACTION_startLoopbackTest:
        {
          data.enforceInterface(descriptor);
          int _result = this.startLoopbackTest();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_stopLoopbackTest:
        {
          data.enforceInterface(descriptor);
          int _result = this.stopLoopbackTest();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_startRecording:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.startRecording(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_stopRecording:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.stopRecording(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_isRecording:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          boolean _result = this.isRecording(_arg0);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_canRecord:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          boolean _result = this.canRecord(_arg0);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_playWaveFile:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          this.playWaveFile(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_sendMessage:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          long _arg2;
          _arg2 = data.readLong();
          this.sendMessage(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setPresence:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          long _arg2;
          _arg2 = data.readLong();
          this.setPresence(_arg0, _arg1, _arg2);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getPresence:
        {
          data.enforceInterface(descriptor);
          long _arg0;
          _arg0 = data.readLong();
          int _result = this.getPresence(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getPresenceStatus:
        {
          data.enforceInterface(descriptor);
          long _arg0;
          _arg0 = data.readLong();
          java.lang.String _result = this.getPresenceStatus(_arg0);
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_zrtpSASVerified:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.zrtpSASVerified(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_updateCallOptions:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          android.os.Bundle _arg1;
          if ((0!=data.readInt())) {
            _arg1 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          this.updateCallOptions(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_zrtpSASRevoke:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.zrtpSASRevoke(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getLocalNatType:
        {
          data.enforceInterface(descriptor);
          java.lang.String _result = this.getLocalNatType();
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.csipsimple.api.ISipService
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      /**
      	* Get the current API version
      	* @return version number. 1000 x major version + minor version
      	* Each major version must be compatible with all versions of the same major version
      	*/
      @Override public int getVersion() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getVersion, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getVersion();
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //Stack control
      /**
      	* Start the sip stack
      	*/
      @Override public void sipStart() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sipStart, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().sipStart();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
      	* Stop the sip stack
      	*/
      @Override public void sipStop() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sipStop, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().sipStop();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
      	* Force to stop the sip service (stack + everything that goes arround stack)
      	*/
      @Override public void forceStopService() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_forceStopService, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().forceStopService();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
      	* Restart the sip stack
      	*/
      @Override public void askThreadedRestart() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_askThreadedRestart, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().askThreadedRestart();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      //Account control
      /**
      	* Add all accounts available in database and marked active to running sip stack (loaded previously using sipStart)
      	*/
      @Override public void addAllAccounts() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_addAllAccounts, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().addAllAccounts();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
      	* Remove all accounts from running sip stack (this does nothing in database)
      	*/
      @Override public void removeAllAccounts() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_removeAllAccounts, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().removeAllAccounts();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
      	* remove and add all accounts available in database and marked active
      	*/
      @Override public void reAddAllAccounts() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_reAddAllAccounts, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().reAddAllAccounts();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
      	* Change registration for a given account/profile id (id in database)
      	* @param accountId the account for which we'd like to change the registration state
      	* @param renew 0 if we don't want to unregister, 1 to renew registration
      	*/
      @Override public void setAccountRegistration(int accountId, int renew) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(accountId);
          _data.writeInt(renew);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setAccountRegistration, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setAccountRegistration(accountId, renew);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
      	* Get registration state for a given account id
      	* @param accountId the account/profile id for which we'd like to get the info (in database)
      	* @return the Profile state
      	*/
      @Override public com.csipsimple.api.SipProfileState getSipProfileState(int accountId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.csipsimple.api.SipProfileState _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(accountId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getSipProfileState, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getSipProfileState(accountId);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = com.csipsimple.api.SipProfileState.CREATOR.createFromParcel(_reply);
          }
          else {
            _result = null;
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //Call configuration control
      /**
      	 * Switch next incoming request to auto answer
      	 */
      @Override public void switchToAutoAnswer() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_switchToAutoAnswer, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().switchToAutoAnswer();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
      	 * Ignore next outgoing call request from tel handler processing
      	 */
      @Override public void ignoreNextOutgoingCallFor(java.lang.String number) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(number);
          boolean _status = mRemote.transact(Stub.TRANSACTION_ignoreNextOutgoingCallFor, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().ignoreNextOutgoingCallFor(number);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      //Call control
      /**
      	 * Place a call.
      	 * 
      	 * @param callee The sip uri to call. 
      	 * It can also be a simple number, in which case the app will autocomplete.
      	 * If you add the scheme, take care to fill completely else it could be considered as a call
      	 * to a sip IP/domain
      	 * @param accountId The id of the account to use for this call. 
      	 */
      @Override public void makeCall(java.lang.String callee, int accountId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(callee);
          _data.writeInt(accountId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_makeCall, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().makeCall(callee, accountId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
      	 * Place a call.
      	 * 
      	 * @param callee The sip uri to call. 
      	 * It can also be a simple number, in which case the app will autocomplete.
      	 * If you add the scheme, take care to fill completely else it could be considered as a call
      	 * to a sip IP/domain
      	 * @param accountId The id of the account to use for this call. 
      	 * @param options The options you'd like to apply for this calls {@link SipCallSession#OPT_CALL_VIDEO}, {@link SipCallSession#OPT_CALL_EXTRA_HEADERS}
      	 */
      @Override public void makeCallWithOptions(java.lang.String callee, int accountId, android.os.Bundle options) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(callee);
          _data.writeInt(accountId);
          if ((options!=null)) {
            _data.writeInt(1);
            options.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_makeCallWithOptions, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().makeCallWithOptions(callee, accountId, options);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
      	 * Answer a call.
      	 * 
      	 * @param callId The id of the call to answer.
      	 * @param status The sip status code you'd like to answer with. 200 to take the call.  400 <= status < 500 if refusing.
      	 */
      @Override public int answer(int callId, int status) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(callId);
          _data.writeInt(status);
          boolean _status = mRemote.transact(Stub.TRANSACTION_answer, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().answer(callId, status);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
      	 * Hangup a call.
      	 *
      	 * @param callId The id of the call to hangup.
      	 * @param status The sip status code you'd like to hangup with.
      	 */
      @Override public int hangup(int callId, int status) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(callId);
          _data.writeInt(status);
          boolean _status = mRemote.transact(Stub.TRANSACTION_hangup, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().hangup(callId, status);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int sendDtmf(int callId, int keyCode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(callId);
          _data.writeInt(keyCode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sendDtmf, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().sendDtmf(callId, keyCode);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int hold(int callId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(callId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_hold, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().hold(callId);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int reinvite(int callId, boolean unhold) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(callId);
          _data.writeInt(((unhold)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_reinvite, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().reinvite(callId, unhold);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int xfer(int callId, java.lang.String callee) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(callId);
          _data.writeString(callee);
          boolean _status = mRemote.transact(Stub.TRANSACTION_xfer, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().xfer(callId, callee);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int xferReplace(int callId, int otherCallId, int options) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(callId);
          _data.writeInt(otherCallId);
          _data.writeInt(options);
          boolean _status = mRemote.transact(Stub.TRANSACTION_xferReplace, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().xferReplace(callId, otherCallId, options);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public com.csipsimple.api.SipCallSession getCallInfo(int callId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.csipsimple.api.SipCallSession _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(callId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCallInfo, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getCallInfo(callId);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = com.csipsimple.api.SipCallSession.CREATOR.createFromParcel(_reply);
          }
          else {
            _result = null;
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public com.csipsimple.api.SipCallSession[] getCalls() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.csipsimple.api.SipCallSession[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCalls, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getCalls();
          }
          _reply.readException();
          _result = _reply.createTypedArray(com.csipsimple.api.SipCallSession.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public java.lang.String showCallInfosDialog(int callId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(callId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_showCallInfosDialog, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().showCallInfosDialog(callId);
          }
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //Media control

      @Override public void setMicrophoneMute(boolean on) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((on)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setMicrophoneMute, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setMicrophoneMute(on);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setSpeakerphoneOn(boolean on) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((on)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setSpeakerphoneOn, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setSpeakerphoneOn(on);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setBluetoothOn(boolean on) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((on)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setBluetoothOn, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setBluetoothOn(on);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void confAdjustTxLevel(int port, float value) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(port);
          _data.writeFloat(value);
          boolean _status = mRemote.transact(Stub.TRANSACTION_confAdjustTxLevel, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().confAdjustTxLevel(port, value);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void confAdjustRxLevel(int port, float value) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(port);
          _data.writeFloat(value);
          boolean _status = mRemote.transact(Stub.TRANSACTION_confAdjustRxLevel, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().confAdjustRxLevel(port, value);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
      	 * Get Rx and Tx sound level for a given port.
      	 *
      	 * @param port Port id we'd like to have the level
      	 * @return The RX and TX (0-255) level encoded as RX << 8 | TX
      	 */
      @Override public long confGetRxTxLevel(int port) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        long _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(port);
          boolean _status = mRemote.transact(Stub.TRANSACTION_confGetRxTxLevel, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().confGetRxTxLevel(port);
          }
          _reply.readException();
          _result = _reply.readLong();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void setEchoCancellation(boolean on) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((on)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setEchoCancellation, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setEchoCancellation(on);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void adjustVolume(com.csipsimple.api.SipCallSession callInfo, int direction, int flags) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((callInfo!=null)) {
            _data.writeInt(1);
            callInfo.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeInt(direction);
          _data.writeInt(flags);
          boolean _status = mRemote.transact(Stub.TRANSACTION_adjustVolume, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().adjustVolume(callInfo, direction, flags);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public com.csipsimple.api.MediaState getCurrentMediaState() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.csipsimple.api.MediaState _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCurrentMediaState, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getCurrentMediaState();
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = com.csipsimple.api.MediaState.CREATOR.createFromParcel(_reply);
          }
          else {
            _result = null;
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int startLoopbackTest() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_startLoopbackTest, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().startLoopbackTest();
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int stopLoopbackTest() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_stopLoopbackTest, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().stopLoopbackTest();
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      // Record calls
      /**
      	 * Start recording of a call to a file.
      	 * 
      	 * @param callId the call id to start recording of.
           * @param way the way the recording takes
           *  {@link SipManager#BITMASK_IN} => record remote party (what goes out speaker/earpiece)
           *  {@link SipManager#BITMASK_OUT} =>  record self (what comes from micro), 
           * If 0 will record all ways.
      	 */
      @Override public void startRecording(int callId, int way) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(callId);
          _data.writeInt(way);
          boolean _status = mRemote.transact(Stub.TRANSACTION_startRecording, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().startRecording(callId, way);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
      	 * Stop recording of a call.
      	 * 
      	 * @param callId the call id to stop recording (of all recording ways)
      	 */
      @Override public void stopRecording(int callId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(callId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_stopRecording, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().stopRecording(callId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
      	 * Is the call being recorded (for at least one way) ?
      	 * 
      	 * @param callId the call id to get recording status of.
      	 * @return true if the call is currently being recorded
      	 */
      @Override public boolean isRecording(int callId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(callId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isRecording, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().isRecording(callId);
          }
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
      	 * Can the call be recorded ?
      	 * 
      	 * @param callId the call id to get record capability of.
      	 * @return true if it's possible to record the call. 
      	 */
      @Override public boolean canRecord(int callId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(callId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_canRecord, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().canRecord(callId);
          }
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      // Play files to stream
      /**
      	* @param filePath filePath the file to play in stream
      	* @param callId the call to play to
      	* @param way the way the file should be played 
      	* {@link SipManager#BITMASK_IN} =>  send to user (speaker/earpiece)
      	*  {@link SipManager#BITMASK_OUT}  => send to remote party (micro), 
      	* example : way = 3 : will play sound both ways
      	*/
      @Override public void playWaveFile(java.lang.String filePath, int callId, int way) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(filePath);
          _data.writeInt(callId);
          _data.writeInt(way);
          boolean _status = mRemote.transact(Stub.TRANSACTION_playWaveFile, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().playWaveFile(filePath, callId, way);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      // SMS

      @Override public void sendMessage(java.lang.String msg, java.lang.String toNumber, long accountId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(msg);
          _data.writeString(toNumber);
          _data.writeLong(accountId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sendMessage, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().sendMessage(msg, toNumber, accountId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      // Presence

      @Override public void setPresence(int presence, java.lang.String statusText, long accountId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(presence);
          _data.writeString(statusText);
          _data.writeLong(accountId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setPresence, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setPresence(presence, statusText, accountId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public int getPresence(long accountId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeLong(accountId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPresence, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPresence(accountId);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public java.lang.String getPresenceStatus(long accountId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeLong(accountId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPresenceStatus, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPresenceStatus(accountId);
          }
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //Secure

      @Override public void zrtpSASVerified(int callId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(callId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_zrtpSASVerified, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().zrtpSASVerified(callId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      // Video

      @Override public void updateCallOptions(int callId, android.os.Bundle options) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(callId);
          if ((options!=null)) {
            _data.writeInt(1);
            options.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_updateCallOptions, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().updateCallOptions(callId, options);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
      	 * Revoke a ZRTP SAS
      	 */
      @Override public void zrtpSASRevoke(int callId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(callId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_zrtpSASRevoke, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().zrtpSASRevoke(callId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
      	 * Get nat type detected by the sip stack
      	 * @return String representing nat type detected by the stack. Empty string if nothing detected yet.
      	 */
      @Override public java.lang.String getLocalNatType() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getLocalNatType, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getLocalNatType();
          }
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      public static com.csipsimple.api.ISipService sDefaultImpl;
    }
    static final int TRANSACTION_getVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_sipStart = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_sipStop = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_forceStopService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_askThreadedRestart = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_addAllAccounts = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_removeAllAccounts = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_reAddAllAccounts = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_setAccountRegistration = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_getSipProfileState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_switchToAutoAnswer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_ignoreNextOutgoingCallFor = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_makeCall = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_makeCallWithOptions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_answer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_hangup = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_sendDtmf = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_hold = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    static final int TRANSACTION_reinvite = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
    static final int TRANSACTION_xfer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
    static final int TRANSACTION_xferReplace = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
    static final int TRANSACTION_getCallInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
    static final int TRANSACTION_getCalls = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
    static final int TRANSACTION_showCallInfosDialog = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
    static final int TRANSACTION_setMicrophoneMute = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
    static final int TRANSACTION_setSpeakerphoneOn = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
    static final int TRANSACTION_setBluetoothOn = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
    static final int TRANSACTION_confAdjustTxLevel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
    static final int TRANSACTION_confAdjustRxLevel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
    static final int TRANSACTION_confGetRxTxLevel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
    static final int TRANSACTION_setEchoCancellation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
    static final int TRANSACTION_adjustVolume = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
    static final int TRANSACTION_getCurrentMediaState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
    static final int TRANSACTION_startLoopbackTest = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
    static final int TRANSACTION_stopLoopbackTest = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
    static final int TRANSACTION_startRecording = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
    static final int TRANSACTION_stopRecording = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
    static final int TRANSACTION_isRecording = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
    static final int TRANSACTION_canRecord = (android.os.IBinder.FIRST_CALL_TRANSACTION + 38);
    static final int TRANSACTION_playWaveFile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 39);
    static final int TRANSACTION_sendMessage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 40);
    static final int TRANSACTION_setPresence = (android.os.IBinder.FIRST_CALL_TRANSACTION + 41);
    static final int TRANSACTION_getPresence = (android.os.IBinder.FIRST_CALL_TRANSACTION + 42);
    static final int TRANSACTION_getPresenceStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 43);
    static final int TRANSACTION_zrtpSASVerified = (android.os.IBinder.FIRST_CALL_TRANSACTION + 44);
    static final int TRANSACTION_updateCallOptions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 45);
    static final int TRANSACTION_zrtpSASRevoke = (android.os.IBinder.FIRST_CALL_TRANSACTION + 46);
    static final int TRANSACTION_getLocalNatType = (android.os.IBinder.FIRST_CALL_TRANSACTION + 47);
    public static boolean setDefaultImpl(com.csipsimple.api.ISipService impl) {
      // Only one user of this interface can use this function
      // at a time. This is a heuristic to detect if two different
      // users in the same process use this function.
      if (Stub.Proxy.sDefaultImpl != null) {
        throw new IllegalStateException("setDefaultImpl() called twice");
      }
      if (impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static com.csipsimple.api.ISipService getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
  	* Get the current API version
  	* @return version number. 1000 x major version + minor version
  	* Each major version must be compatible with all versions of the same major version
  	*/
  public int getVersion() throws android.os.RemoteException;
  //Stack control
  /**
  	* Start the sip stack
  	*/
  public void sipStart() throws android.os.RemoteException;
  /**
  	* Stop the sip stack
  	*/
  public void sipStop() throws android.os.RemoteException;
  /**
  	* Force to stop the sip service (stack + everything that goes arround stack)
  	*/
  public void forceStopService() throws android.os.RemoteException;
  /**
  	* Restart the sip stack
  	*/
  public void askThreadedRestart() throws android.os.RemoteException;
  //Account control
  /**
  	* Add all accounts available in database and marked active to running sip stack (loaded previously using sipStart)
  	*/
  public void addAllAccounts() throws android.os.RemoteException;
  /**
  	* Remove all accounts from running sip stack (this does nothing in database)
  	*/
  public void removeAllAccounts() throws android.os.RemoteException;
  /**
  	* remove and add all accounts available in database and marked active
  	*/
  public void reAddAllAccounts() throws android.os.RemoteException;
  /**
  	* Change registration for a given account/profile id (id in database)
  	* @param accountId the account for which we'd like to change the registration state
  	* @param renew 0 if we don't want to unregister, 1 to renew registration
  	*/
  public void setAccountRegistration(int accountId, int renew) throws android.os.RemoteException;
  /**
  	* Get registration state for a given account id
  	* @param accountId the account/profile id for which we'd like to get the info (in database)
  	* @return the Profile state
  	*/
  public com.csipsimple.api.SipProfileState getSipProfileState(int accountId) throws android.os.RemoteException;
  //Call configuration control
  /**
  	 * Switch next incoming request to auto answer
  	 */
  public void switchToAutoAnswer() throws android.os.RemoteException;
  /**
  	 * Ignore next outgoing call request from tel handler processing
  	 */
  public void ignoreNextOutgoingCallFor(java.lang.String number) throws android.os.RemoteException;
  //Call control
  /**
  	 * Place a call.
  	 * 
  	 * @param callee The sip uri to call. 
  	 * It can also be a simple number, in which case the app will autocomplete.
  	 * If you add the scheme, take care to fill completely else it could be considered as a call
  	 * to a sip IP/domain
  	 * @param accountId The id of the account to use for this call. 
  	 */
  public void makeCall(java.lang.String callee, int accountId) throws android.os.RemoteException;
  /**
  	 * Place a call.
  	 * 
  	 * @param callee The sip uri to call. 
  	 * It can also be a simple number, in which case the app will autocomplete.
  	 * If you add the scheme, take care to fill completely else it could be considered as a call
  	 * to a sip IP/domain
  	 * @param accountId The id of the account to use for this call. 
  	 * @param options The options you'd like to apply for this calls {@link SipCallSession#OPT_CALL_VIDEO}, {@link SipCallSession#OPT_CALL_EXTRA_HEADERS}
  	 */
  public void makeCallWithOptions(java.lang.String callee, int accountId, android.os.Bundle options) throws android.os.RemoteException;
  /**
  	 * Answer a call.
  	 * 
  	 * @param callId The id of the call to answer.
  	 * @param status The sip status code you'd like to answer with. 200 to take the call.  400 <= status < 500 if refusing.
  	 */
  public int answer(int callId, int status) throws android.os.RemoteException;
  /**
  	 * Hangup a call.
  	 *
  	 * @param callId The id of the call to hangup.
  	 * @param status The sip status code you'd like to hangup with.
  	 */
  public int hangup(int callId, int status) throws android.os.RemoteException;
  public int sendDtmf(int callId, int keyCode) throws android.os.RemoteException;
  public int hold(int callId) throws android.os.RemoteException;
  public int reinvite(int callId, boolean unhold) throws android.os.RemoteException;
  public int xfer(int callId, java.lang.String callee) throws android.os.RemoteException;
  public int xferReplace(int callId, int otherCallId, int options) throws android.os.RemoteException;
  public com.csipsimple.api.SipCallSession getCallInfo(int callId) throws android.os.RemoteException;
  public com.csipsimple.api.SipCallSession[] getCalls() throws android.os.RemoteException;
  public java.lang.String showCallInfosDialog(int callId) throws android.os.RemoteException;
  //Media control

  public void setMicrophoneMute(boolean on) throws android.os.RemoteException;
  public void setSpeakerphoneOn(boolean on) throws android.os.RemoteException;
  public void setBluetoothOn(boolean on) throws android.os.RemoteException;
  public void confAdjustTxLevel(int port, float value) throws android.os.RemoteException;
  public void confAdjustRxLevel(int port, float value) throws android.os.RemoteException;
  /**
  	 * Get Rx and Tx sound level for a given port.
  	 *
  	 * @param port Port id we'd like to have the level
  	 * @return The RX and TX (0-255) level encoded as RX << 8 | TX
  	 */
  public long confGetRxTxLevel(int port) throws android.os.RemoteException;
  public void setEchoCancellation(boolean on) throws android.os.RemoteException;
  public void adjustVolume(com.csipsimple.api.SipCallSession callInfo, int direction, int flags) throws android.os.RemoteException;
  public com.csipsimple.api.MediaState getCurrentMediaState() throws android.os.RemoteException;
  public int startLoopbackTest() throws android.os.RemoteException;
  public int stopLoopbackTest() throws android.os.RemoteException;
  // Record calls
  /**
  	 * Start recording of a call to a file.
  	 * 
  	 * @param callId the call id to start recording of.
       * @param way the way the recording takes
       *  {@link SipManager#BITMASK_IN} => record remote party (what goes out speaker/earpiece)
       *  {@link SipManager#BITMASK_OUT} =>  record self (what comes from micro), 
       * If 0 will record all ways.
  	 */
  public void startRecording(int callId, int way) throws android.os.RemoteException;
  /**
  	 * Stop recording of a call.
  	 * 
  	 * @param callId the call id to stop recording (of all recording ways)
  	 */
  public void stopRecording(int callId) throws android.os.RemoteException;
  /**
  	 * Is the call being recorded (for at least one way) ?
  	 * 
  	 * @param callId the call id to get recording status of.
  	 * @return true if the call is currently being recorded
  	 */
  public boolean isRecording(int callId) throws android.os.RemoteException;
  /**
  	 * Can the call be recorded ?
  	 * 
  	 * @param callId the call id to get record capability of.
  	 * @return true if it's possible to record the call. 
  	 */
  public boolean canRecord(int callId) throws android.os.RemoteException;
  // Play files to stream
  /**
  	* @param filePath filePath the file to play in stream
  	* @param callId the call to play to
  	* @param way the way the file should be played 
  	* {@link SipManager#BITMASK_IN} =>  send to user (speaker/earpiece)
  	*  {@link SipManager#BITMASK_OUT}  => send to remote party (micro), 
  	* example : way = 3 : will play sound both ways
  	*/
  public void playWaveFile(java.lang.String filePath, int callId, int way) throws android.os.RemoteException;
  // SMS

  public void sendMessage(java.lang.String msg, java.lang.String toNumber, long accountId) throws android.os.RemoteException;
  // Presence

  public void setPresence(int presence, java.lang.String statusText, long accountId) throws android.os.RemoteException;
  public int getPresence(long accountId) throws android.os.RemoteException;
  public java.lang.String getPresenceStatus(long accountId) throws android.os.RemoteException;
  //Secure

  public void zrtpSASVerified(int callId) throws android.os.RemoteException;
  // Video

  public void updateCallOptions(int callId, android.os.Bundle options) throws android.os.RemoteException;
  /**
  	 * Revoke a ZRTP SAS
  	 */
  public void zrtpSASRevoke(int callId) throws android.os.RemoteException;
  /**
  	 * Get nat type detected by the sip stack
  	 * @return String representing nat type detected by the stack. Empty string if nothing detected yet.
  	 */
  public java.lang.String getLocalNatType() throws android.os.RemoteException;
}
