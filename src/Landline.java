public class Landline implements Phone{
    private String myPhoneNo;
    private boolean isRinging;
    private boolean powerOn;

    public Landline(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
        isRinging=false;
        powerOn=true;
    }

    public String getMyPhoneNo() {
        return myPhoneNo;
    }

    public void setMyPhoneNo(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public boolean isPowerOn() {
        return powerOn;
    }

    public void setPowerOn(boolean powerOn) {
        this.powerOn = powerOn;
    }

    @Override
    public void powerOn() {
        this.powerOn=true;
    }

    @Override
    public void callToNumber(String phoneNo) {
        if(powerOn==true){
            System.out.println("Calling to the number:"+phoneNo);
        }
        else{
            System.out.println("Your landline is off");
        }

    }

    @Override
    public void recievedCall(String phoneNo) {
        if(powerOn&&myPhoneNo.equals(phoneNo)){
            this.isRinging=true;
            System.out.println("Hey"+ myPhoneNo +"recieving a call");
        }
        else{
            System.out.println("Call not recieved");
        }

    }

    @Override
    public boolean answerCall() {
       if(isRinging==true){
           System.out.println("Call Answered");
           this.isRinging=false;
           return true;
       }
       return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
