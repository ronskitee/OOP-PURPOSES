package creational.builder;

public class Main {
    public static void main(String[] args) {
        try {
            SocialProfileBuilder profileBuilder = new SocialProfileBuilder();

            profileBuilder.setDisplayName("juan123");
            profileBuilder.setLastName("Tamad");
            profileBuilder.setFirstName("Juan");
            profileBuilder.setAge(20);
            profileBuilder.setCivilStatus(CivilStatus.Single);

            Profile juan = profileBuilder.getProfile();
            juan.displayInfo();
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}

enum CivilStatus {
    Single,
    Married,
    Widowed,
    Divorced,
}

class Profile {
    private String displayName;
    private String lastName;
    private String firstName;
    private String middleName;
    private String namePrefix;
    private int age;
    private CivilStatus civilStatus;

    public Profile(String displayName, String lastName, String firstName) {
        this.displayName = displayName;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setNamePrefix(String prefix) {
        this.namePrefix = prefix;
    }

    public String getNamePrefix() {
        return this.namePrefix;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setCivilStatus(CivilStatus status) {
        this.civilStatus = status;
    }

    public CivilStatus getCivicStatus() {
        return this.civilStatus;
    }

    public void displayInfo() {
        System.out.printf("%s, %s (%s)\n", this.lastName, this.firstName,
                this.civilStatus != null ? this.civilStatus.name() : "Unknown");
    }
}

interface ProfileBuilder {
    public void setDisplayName(String name);

    public void setLastName(String name);

    public void setFirstName(String name);

    public void setMiddleName(String name);

    public void setNamePrefix(String name);

    public void setAge(int age);

    public void setCivilStatus(CivilStatus status);

    public Profile getProfile() throws Exception;
}

class SocialProfileBuilder implements ProfileBuilder {
    private String displayName;
    private String lastName;
    private String firstName;
    private String middleName;
    private String namePrefix;
    private int age;
    private CivilStatus civilStatus;

    public void setDisplayName(String name) {
        this.displayName = name;
    }

    public void setLastName(String name) {
        this.lastName = name;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public void setMiddleName(String name) {
        this.middleName = name;
    }

    public void setNamePrefix(String prefix) {
        this.namePrefix = prefix;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCivilStatus(CivilStatus status) {
        this.civilStatus = status;
    }

    public Profile getProfile() throws Exception {
        if (this.displayName == null || this.firstName == null || this.lastName == null) {
            throw new Exception("Missing display name, first name, or last name");
        }

        Profile newProfile = new Profile(this.displayName, this.firstName, this.lastName);

        if (this.middleName != null) {
            newProfile.setMiddleName(this.middleName);
        }

        if (this.namePrefix != null) {
            newProfile.setNamePrefix(this.namePrefix);
        }

        newProfile.setAge(this.age);

        if (this.civilStatus != null) {
            newProfile.setCivilStatus(this.civilStatus);
        }

        return newProfile;
    }
}
