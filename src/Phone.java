public interface Phone {
    void powerOn ();
    void callToNumber(String phoneNo);
    void recievedCall(String phoneNo);
    boolean answerCall();
    boolean isRinging();
}
