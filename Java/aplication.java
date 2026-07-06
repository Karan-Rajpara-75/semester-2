import java.util.*;

// Custom Exception
class InvalidInputException extends Exception {
    public InvalidInputException(String msg) {
        super(msg);
    }
}

// Interface
interface Statistics {
    void displayStats();
}

// Abstract Class
abstract class Match {
    abstract void startMatch();
}

// Player Class (Encapsulation)
class Player {
    private String name;
    private int runs;
    private int balls;
    private int fours;
    private int sixes;
    private boolean isOut;

    public Player(String name) {
        this.name = name;
        this.runs = 0;
        this.balls = 0;
        this.fours = 0;
        this.sixes = 0;
        this.isOut = false;
    }

    public void addRun(int run) {
        this.runs += run;
        this.balls++;

        if (run == 4) fours++;
        if (run == 6) sixes++;
    }

    public void out() {
        this.isOut = true;
    }

    public int getRuns() { return runs; }
    public int getBalls() { return balls; }
    public boolean isOut() { return isOut; }

    public void display() {
        System.out.println(name + " -> Runs: " + runs + " Balls: " + balls);
    }
}

// Team Class
class Team {
    private String name;
    private Player[] players;
    private int totalRuns;
    private int wickets;
    private int balls;

    public Team(String name, int size) {
        this.name = name;
        players = new Player[size];

        for (int i = 0; i < size; i++) {
            players[i] = new Player("Player" + (i + 1));
        }
    }

    public void addScore(int runs) {
        totalRuns += runs;
    }

    public void addBall() {
        balls++;
    }

    public void addWicket() {
        wickets++;
    }

    public int getRuns() { return totalRuns; }
    public int getWickets() { return wickets; }
    public int getBalls() { return balls; }
    public Player getPlayer(int i) { return players[i]; }

    public void displayScore() {
        System.out.println(name + " Score: " + totalRuns + "/" + wickets);
    }

    public void displayPlayers() {
        for (Player p : players) {
            p.display();
        }
    }
}

// Inheritance + Abstraction + Polymorphism
class CricketMatch extends Match implements Statistics {

    private Team team1;
    private Team team2;
    private int overs;
    private static final int BALLS_PER_OVER = 6;

    public CricketMatch(Team t1, Team t2, int overs) {
        this.team1 = t1;
        this.team2 = t2;
        this.overs = overs;
    }

    // Method Overriding
    @Override
    public void startMatch() {
        System.out.println("Match Started!");
    }

    // Method Overloading
    public void playBall(Team team, int run) {
        team.addScore(run);
        team.addBall();
    }

    public void playBall(Team team, String event) {
        switch (event) {
            case "wide":
                team.addScore(1);
                break;
            case "no":
                team.addScore(1);
                break;
            case "wicket":
                team.addWicket();
                team.addBall();
                break;
        }
    }

    public void playInnings(Team team, Scanner sc) throws InvalidInputException {
        int totalBalls = overs * BALLS_PER_OVER;

        for (int i = 0; i < totalBalls; i++) {
            System.out.print("Enter run (0-6 / wide / no / wicket): ");
            String input = sc.next();

            if (input.matches("[0-6]")) {
                int run = Integer.parseInt(input);
                playBall(team, run);
            } 
            else if (input.equals("wide") || input.equals("no") || input.equals("wicket")) {
                playBall(team, input);
                if (!input.equals("wicket")) i--; // extra ball
            } 
            else {
                throw new InvalidInputException("Invalid Input!");
            }
        }
    }
    public void decideWinner() {
        if (team1.getRuns() > team2.getRuns()) {
            System.out.println("Winner: Team 1");
        } else if (team2.getRuns() > team1.getRuns()) {
            System.out.println("Winner: Team 2");
        } else {
            System.out.println("Match Draw!");
        }
    }

    // Interface method
    @Override
    public void displayStats() {
        System.out.println("\n--- Match Stats ---");
        team1.displayScore();
        team2.displayScore();

        double avg1 = (double) team1.getRuns() / overs;
        double avg2 = (double) team2.getRuns() / overs;

        System.out.println("Team1 Avg: " + avg1);
        System.out.println("Team2 Avg: " + avg2);
    }
}

// Main Class
public class aplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Team team1 = new Team("India", 5);
        Team team2 = new Team("Australia", 5);

        System.out.print("Enter number of overs: ");
        int overs = sc.nextInt();

        CricketMatch match = new CricketMatch(team1, team2, overs);

        try {
            match.startMatch();

            System.out.println("\nTeam 1 Batting:");
            match.playInnings(team1, sc);

            System.out.println("\nTeam 2 Batting:");
            match.playInnings(team2, sc);

            match.displayStats();
            match.decideWinner();

        } catch (InvalidInputException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}