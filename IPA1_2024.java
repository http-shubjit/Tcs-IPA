import java.util.*;
 
// You are required to create a Player class and a Solution class with the following functionalities:

// Class Player

// playerId (int)
// playerName (String)
// runs (int)
// playerType (String)
// matchType (String)
// Constructor:
// A parameterized constructor to initialize all the attributes.
// Getters:
// Provide getters for each of the private attributes.
// Class Solution:
// Implement the following methods:

// findPlayerWithLowestRuns:

// This static method takes two input parameters:
// A list of Player objects.
// A String parameter representing a playerType.
// The method should return the lowest runs of a player whose type matches the given playerType. If no players of that type exist, return 0.

// AssId:
// This static method takes two input parameters:
// A list of Player objects.
// A String parameter representing a matchType.
// The method should return a list of player IDs in reverse order, where the matchType matches the input. If no players match, return an empty list.
// Main Method in Solution:
// In the main method, read details for four players from user input.
// Read a playerType and a matchType from user input.
// Use the findPlayerWithLowestRuns method to print the runs of the player with the lowest score. If no such player exists, print "No such player".
// Use the AssId method to print the player IDs for the given matchType in reverse order. If no players match the type, print "No Player with given matchType".
// Sample Input:
// Copy code
// 1 Virat 500 Batsman ODI
// 2 Rohit 450 Batsman ODI
// 3 Bumrah 200 Bowler Test
// 4 Ashwin 150 Bowler ODI
// Batsman
// ODI

// Sample Output:

// 450
// 4
// 2
// 1
 class IPA1_2024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player[] players=new Player[4];

        // Input player details
        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            int runs = sc.nextInt();
            String type = sc.next();
            String matchType = sc.next();
            players[i]=new Player(id, name, runs, type, matchType);
        }

        // Find player with lowest runs
        System.out.println("Enter player type to find the player with lowest runs:");
        String playertype = sc.next();
        int res = findPlayerWithLowestRuns(players, playertype);

        if (res > 0) {
            System.out.println(res);
        } else {
            System.out.println("No such player");
        }

        // Find players by match type
        System.out.println("Enter match type to find player IDs:");
        String matchtype = sc.next();
        List<Integer> ids = AssId(players, matchtype);

        if (ids.isEmpty()) {
            System.out.println("No Player with given matchType");
        } else {
            for (int i = ids.size() - 1; i >= 0; i--) {
                System.out.println(ids.get(i));
            }
        }

        sc.close();
    }

    public static int findPlayerWithLowestRuns(Player[] players, String playertype) {
      
        List<Integer> runsList = new ArrayList<>();

        
        for (Player player : players) {
            if (player.getPtype().equals(playertype)) {
                runsList.add(player.getRuns());
            }
        }

        
        if (!runsList.isEmpty()) {
            int minRuns = runsList.get(0); 
            for (int i = 1; i < runsList.size(); i++) {
                if ( minRuns>runsList.get(i) ) {
                    minRuns = runsList.get(i); 
                }
            }
            return minRuns; 
        } else {
            return 0; 
        }
    }

    public static List<Integer> AssId(Player [] pl, String m) {
        List<Integer> ids = new ArrayList<>();

        for (Player player : pl) {
            if (player.getMtype().equals(m)) {
                ids.add(player.getId());
            }
        }

        return ids;
    }
}

class Player {
    private int playerId;
    private String playerName;
    private int runs;
    private String playerType;
    private String matchType;

    Player(int playerId, String playerName, int runs, String playerType, String matchType) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.runs = runs;
        this.playerType = playerType;
        this.matchType = matchType;
    }

    public int getId() {
        return playerId;
    }

    public String getName() {
        return playerName;
    }

    public int getRuns() {
        return runs;
    }

    public String getPtype() {
        return playerType;
    }

    public String getMtype() {
        return matchType;
    }
}