package adck823;

public class Student {
    private String name;
    private int studentNumber;
    private boolean passJava;


    Student(String name, int studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.passJava = false;
    }

    String getName() {
        return name;
    }

    int getStudentNumber() {
        return studentNumber;
    }

    boolean getPassJava() {
        return passJava;
    }

    void setName(String name) {
        this.name = name;
    }

    void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    void setPassJava(boolean passJava) {
        this.passJava = passJava;
    }
}
