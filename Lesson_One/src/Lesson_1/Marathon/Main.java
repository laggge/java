package Lesson_1.Marathon;


public class Main {
//    public static void main(String[] args) {
//        Competitor[] competitors = {new Human("Боб"), new Cat("Барсик"), new Dog("Бобик")};
//        Obstacle[] course = {new Cross(80), new Water(5), new Wall(1), new Cross(120)};
//        for (Competitor c : competitors) {
//            for (Obstacle o : course) {
//                o.doIt(c);
//                if (!c.isOnDistance()) break;
//            }
//        }
//        for (Competitor c : competitors) {
//            c.info();
//        }
//    }
    public static void main(String[] args) {

        Course course1 = new Course(new Cross(300), new Wall(2), new Water(5));

        Team team1 = new Team("Team Alfa", new Human("ChosenOne"), new Cat("Garfild"),
                new Dog("Tuzik"), new Dog("Bobik"));

        Team team2 = new Team("Team Beta", new Human("ChosenTwo"), new Cat("Murka"),
                new Dog("Polkan"), new Dog("NePolkan"));


        course1.doIt(team1);
        course1.doIt(team2);

        System.out.println("\n===== Info =====\n");
        team1.showResults();
        System.out.println();
        team2.showResults();
    }

}