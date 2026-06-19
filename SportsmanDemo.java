class Sportsman {

    String name;
    int age;
    String sport;
    String team;
    int medals;

  
    void play() {
        System.out.println(name + " is playing " + sport);
    }

    void practice() {
        System.out.println(name + " is practicing");
    }

    void winMedal() {
        medals++;
        System.out.println(name + " won a medal");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Sport: " + sport);
        System.out.println("Team: " + team);
        System.out.println("Medals: " + medals);
    }
}

public class SportsmanDemo {

    public static void main(String[] args) {

        Sportsman s1 = new Sportsman();

        s1.name = "Virat Kohli";
        s1.age = 37;
        s1.sport = "Cricket";
        s1.team = "India";
        s1.medals = 5;

        s1.display();
        s1.play();
        s1.practice();
        s1.winMedal();
    }
}