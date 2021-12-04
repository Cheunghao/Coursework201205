package adck823;

public class Test {
    public static void main(String[] args) {
        //Question 2
        Student cheunghao = new Student("Cheunghao", 210027606);
        System.out.println(cheunghao.getPassJava());

        //Question 4
        Student jesse = new Student("Jesse", 44444);
        Student ali = new Student("Ali", 55555);

        Team team = new Team(cheunghao, jesse, ali);
        System.out.println(team.getNumberOfTeams());

        //Testing onePass method
        team.getMember2().setPassJava(true);
        System.out.println(onePass(team));

        //Testing numberOfTeams method
        Team team2 = new Team(ali, jesse, cheunghao);
        System.out.println(team2.getNumberOfTeams());
        Team team3 = new Team(ali, cheunghao, jesse);
        System.out.println(team3.getNumberOfTeams());
    }

    static Boolean onePass(Team newTeam) {
        if (newTeam.getMember1().getPassJava() == true) {
            return true;
        } else if (newTeam.getMember2().getPassJava() == true) {
            return true;
        } else if (newTeam.getMember3().getPassJava() == true) {
            return true;
        } else {
            return false;
        }
    }
}
