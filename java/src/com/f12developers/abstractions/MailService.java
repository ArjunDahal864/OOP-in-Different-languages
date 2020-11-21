package com.f12developers.abstractions;

public class MailService {
    public void sendEmails(){
        connectToEmailServer();
        authenticateWithEmailServer();
        sendEmail();

    }

    private void connectToEmailServer(){
        System.out.println("Connecting to email server");
    }

    private void authenticateWithEmailServer(){
        System.out.println("Authenticating to the email sever");
    }

    private void sendEmail(){
        System.out.println("Sending email to the client");
    }
    private void disconnect(){
        System.out.println("Email Sent now disconnecting");
    }

}

