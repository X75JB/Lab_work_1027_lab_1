package lab1;

public class Testlab {
    public static void main(String[] args) {
        Player p1 = new Player("Jackson", "defense", 10);

        System.out.println("Name: " + p1.getName());
        System.out.println("Position: " + p1.getPosition());
        System.out.println("Jersey Number: " + p1.getJerseyNum());

        p1.setName("Blackman");
        p1.setPosition("forward");
        p1.setJerseyNum(20);

        System.out.println("Updated Name: " + p1.getName());
        System.out.println("Updated Position: " + p1.getPosition());
        System.out.println("Updated Jersey Number: " + p1.getJerseyNum());

        System.out.println("Player Object: " + p1);

        Player p2 = new Player("Blackman", "forward", 20);

        if (p1.equals(p2)) {
            System.out.println("Same player");
        } else {
            System.out.println("Different player");
        }
    }
}
