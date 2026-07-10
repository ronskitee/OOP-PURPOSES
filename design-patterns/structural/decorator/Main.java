package structural.decorator;

class Notification {
    private String subject;
    private String content;

    public Notification(String subject, String content) {
        this.subject = subject;
        this.content = content;
    }

    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }
}

class ToastNotification {
    protected Notification notification;

    public ToastNotification(Notification notification) {
        this.notification = notification;
    }

    public void display() {
        System.out.println("[" + notification.getSubject() + "] " + notification.getContent());
    }
}

class ToastPrivacyNotification extends ToastNotification {
    public ToastPrivacyNotification(Notification notification) {
        super(notification);
    }

    @Override
    public void display() {
        System.out.println("New notification from " + notification.getSubject());
    }
}

public class Main {
    public static void main(String[] args) {
        Notification newMessage = new Notification("Messenger", "New message from Juan Tamad");

        ToastNotification androidNotif = new ToastNotification(newMessage);
        androidNotif.display();

        ToastNotification androidPrivNotif = new ToastPrivacyNotification(newMessage);
        androidPrivNotif.display();
    }
}
