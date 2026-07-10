package behavioral.chain_of_responsibility;

public class Main {
    public static void main(String[] main) {
        Level1Support level1 = new Level1Support();
        Level2Support level2 = new Level2Support();
        Level3Support level3 = new Level3Support();

        level1.setNextHandler(level2);
        level2.setNextHandler(level3);

        ServiceRequest level1Request = new ServiceRequest(1);
        ServiceRequest level2Request = new ServiceRequest(2);
        ServiceRequest level3Request = new ServiceRequest(3);

        level1.handle(level1Request);
        level1.handle(level2Request);
        level1.handle(level3Request);
    }
}

class ServiceRequest {
    private int complexity;

    public ServiceRequest(int complexity) {
        this.complexity = complexity;
    }

    public int getComplexity() {
        return this.complexity;
    }

}

abstract class SupportHandler {
    protected SupportHandler nextHandler;

    public void setNextHandler(SupportHandler next) {
        this.nextHandler = next;
    }

    abstract public void handle(ServiceRequest request);
}

class Level1Support extends SupportHandler {
    public void handle(ServiceRequest request) {
        if (request.getComplexity() > 1) {
            System.out.printf("Level 1 forwarded the request to %s\n", this.nextHandler.getClass().getSimpleName());
            this.nextHandler.handle(request);
            return;
        }

        System.out.println("Level 1 handled the service request");
    }
}

class Level2Support extends SupportHandler {
    public void handle(ServiceRequest request) {
        if (request.getComplexity() > 2) {
            System.out.printf("Level 2 forwarded the request to %s\n", this.nextHandler.getClass().getSimpleName());
            this.nextHandler.handle(request);
            return;
        }

        System.out.println("Level 2 handled the service request");
    }
}

class Level3Support extends SupportHandler {
    public void handle(ServiceRequest request) {
        System.out.println("Level 3 handled the service request");
    }
}
