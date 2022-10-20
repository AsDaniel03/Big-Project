package utils;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.Properties;

public class SendEmail {
    public static void main(String[] args) {

        String emailSender = args[0];
        String emailRecipient = args[1];
        String emailSubject = args[2];
        String emailBody = args[3];
        String fileAttachment = args[4];

        System.out.println("===Start Send Email===");

        String host = "smtp.gmail.com";

        Properties properties = System.getProperties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("asdaniel0310@gmail.com", "password");
            }

        });

        session.setDebug(true);

        try {
            Message message = new MimeMessage(session);

            message.setFrom(new InternetAddress(emailSender));

            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailRecipient));

            message.setSubject(emailSubject);

            BodyPart messageBodyPart1 = new MimeBodyPart();

            messageBodyPart1.setText(emailBody);

            MimeBodyPart messageBodyPart2 = new MimeBodyPart();

            DataSource source = new FileDataSource(fileAttachment);

            messageBodyPart2.setDataHandler(new DataHandler(source));

            messageBodyPart2.setFileName(fileAttachment);

            Multipart multipart = new MimeMultipart();

            multipart.addBodyPart(messageBodyPart2);

            multipart.addBodyPart(messageBodyPart1);

            message.setContent(multipart);

            Transport.send(message);
            System.out.println("=====Email Sent=====");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
