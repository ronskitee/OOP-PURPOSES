package structural.bridge;

public class Main {
    public static void main(String[] args) {
        EmailSender emailSender = new EmailSender();
        SMSSender smsSender = new SMSSender();

        NormalMessage normalMessage = new NormalMessage(emailSender, "Hello!");
        UrgentMessage sosMessage = new UrgentMessage(smsSender, "Need help!");

        normalMessage.send();
        sosMessage.send();
    }
}

abstract class MessageSender {
    protected String message;

    public void setMessage(String message) {
        this.message = message;
    }

    abstract void send();
}

class EmailSender extends MessageSender {
    public void send() {
        System.out.println("Email Sent:" + this.message);
    }
}

class SMSSender extends MessageSender {
    public void send() {
        System.out.println("SMS Sent:" + this.message);
    }
}

abstract class Message {
    protected MessageSender sender;

    public Message(MessageSender sender, String message) {
        this.sender = sender;
        this.sender.setMessage(message);
    }

    abstract public void send();
}

class NormalMessage extends Message {
    public NormalMessage(MessageSender sender, String message) {
        super(sender, message);
    }

    public void send() {
        this.sender.send();
    }
}

class UrgentMessage extends Message {
    public UrgentMessage(MessageSender sender, String message) {
        super(sender, String.format("URGENT! %s", message));
    }

    public void send() {
        this.sender.send();
    }
}
