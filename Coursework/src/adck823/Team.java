package adck823;

public class Team {
    private Student member1, member2, member3;

    //Question 5
    private static int numberOfTeams = 0;

    Team(Student member1, Student member2, Student member3) {
        numberOfTeams++;
        this.member1 = member1;
        this.member2 = member2;
        this.member3 = member3;
    }

    Student getMember1() {
        return member1;
    }
    Student getMember2() {
        return member2;
    }
    Student getMember3() {
        return member3;
    }

    void setMember1(Student member1) {
        this.member1 = member1;
    }
    void setMember2(Student member2) {
        this.member2 = member2;
    }
    void setMember3(Student member3) {
        this.member3 = member3;
    }

    //Question 5
    int getNumberOfTeams() {
        return numberOfTeams;
    }
}
