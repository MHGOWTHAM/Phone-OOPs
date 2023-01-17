public class Main {
    public static void main(String[] args) {
        Landline l1=new Landline("567");
        Landline l2=new Landline("345");
        l1.callToNumber("567");
        l2.recievedCall("345");
        System.out.println( l2.answerCall());
    }

}