package CLassInInter;

public interface EmailService {

    public void sendMail(EmailDetails emailDetails);


    class EmailDetails implements EmailService{

        @Override
        public void sendMail(EmailDetails emailDetails) {
            System.out.println("email sending");
        }
    }
}

class Test {
    public static void main(String[] args) {

        int Integer=123;
        System.out.println(Integer);
        EmailService.EmailDetails emailDetails=new EmailService.EmailDetails();
        new Test().sendMail(emailDetails);
        emailDetails.sendMail(emailDetails);
    }


    public void sendMail(EmailService.EmailDetails emailDetails) {
        System.out.println("implemented outside");

    }
}
