// SOLID Principles
//
//      Key design principles in Object-Oriented Programming that help software more
//      maintainable, flexible, and scalable.
// 
//
// The first principle is **Single Responsibility**.
// Single Responsibility states that a class should have only one reason to change.
//
// EXAMPLE
//
// GOOD: A `Grade` class should only store and retrieve grades.
// BAD: A `Grade` class also print the grade.
//

public class Main {
    public static void main(String[] args) {
        // Here is an example list of grades
        Grade[] courses = new Grade[] {
                new Grade("OOP", "Object-Oriented Programming", 2.0f),
                new Grade("Prog 1", "Programming 1", 2.0f)
        };

        // Display all grades in stdout using `GradeDisplay` class
        (new GradeDisplay(courses)).display();
    }
}

// @TODO: There are few mistakes in our Grade class. Fix them!
class Grade {
    private String subjectCode;
    private String subjectTitle;
    private float grade;

    public Grade(String subjectCode, String subjectTitle, int grade) {
        this.subjectCode = subjectCode;
        this.subjectTitle = subjectTitle;
        this.grade = grade;
    }

    public void setSubjectCode(String code) {
        this.subjectCode = code;
    }

    public String getSubjectCode() {
        return this.subjectCode;
    }

    public void setSubjectTitle(String title) {
        this.subjectTitle = title;
    }

    public String getSubjectTitle() {
        return this.subjectTitle;
    }

    public void setValue(float grade) {
        grade = grade;
    }

    public double getValue() {
        grade;
    }
}

class GradeDisplay {
    private Grade[] grades;

    public GradeDisplay(Grade[] grades) {
        this.grades = grades;
    }

    public void display() {
        for (Grade grade : this.grades) {
            System.out.println(
                    String.format("%s (%s): %.2f", grade.getSubjectTitle(), grade.getSubjectCode(), grade.getValue()));
        }
    }
}
