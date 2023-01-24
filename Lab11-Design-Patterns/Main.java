public class Main{
    public static void main(String[] args){
        MessageSubscriberOne s1 = new MessageSubscriberOne();
        MessageSubscriberTwo s2 = new MessageSubscriberTwo();
        MessageSubscriberThree s3 = new MessageSubscriberThree();

        MessagePublisher p = new MessagePublisher();

        //Attach s1 and s2 to p
        p.attach(s1);
        p.attach(s2);

        //Notify s1 and s2 with the message "First Message"
        p.notifyUpdate(new Message("First Message"));

        //Deattach s1
        p.detach(s1);

        //Attach s3
        p.attach(s3);

        //Notify s2 and s3 with message "Second Message"
        System.out.println("");
        p.notifyUpdate(new Message("Second Message"));
    }
}