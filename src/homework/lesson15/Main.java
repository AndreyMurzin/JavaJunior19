package homework.lesson15;

public class Main {
    public static void main(String[] args) {
        NHL nhl = new NHL();
        nhl.addPoints("Pittsburgh Penguins", 50);
        nhl.addPoints("Washington Capitals", 54);
        nhl.addPoints("Toronto Maple Leafs", 57);
        nhl.addPoints("Boston Bruins",46);
        nhl.addPoints("New York Rangers", 41);

        nhl.printAllTeams();

        nhl.addPoints("Pittsburgh Penguins", 3);
        nhl.addPoints("Washington Capitals", 3);
        nhl.addPoints("Toronto Maple Leafs", 2);
        nhl.addPoints("Boston Bruins",0);
        nhl.addPoints("New York Rangers", 1);

        nhl.printAllTeams();
    }
}
