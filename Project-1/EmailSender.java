import java.util.Properties;

import jakarta.mail.*;
import jakarta.mail.internet.*;

public class EmailSender {

    public static void sendEmail(String toEmail, String userName) {

        // APNA GMAIL
        final String fromEmail = "sheetalnarwariya40@gmail.com";

        // GOOGLE APP PASSWORD
        final String password = "erdz wjfv daqw vegq";

        Properties props = new Properties();

        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(props,
                new Authenticator() {

                    protected PasswordAuthentication getPasswordAuthentication() {

                        return new PasswordAuthentication(fromEmail, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);

            message.setFrom(new InternetAddress(fromEmail));

            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(toEmail));

            message.setSubject("Registration Successful");

            message.setText(
                    "Hello " + userName +
                    "\n\nWelcome to KBC Java Quiz App!" +
                    "\nYour registration is successful.");

            Transport.send(message);

            System.out.println("Email Sent Successfully!");

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}
