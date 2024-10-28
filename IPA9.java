// Create a class Player with below attributes: 

// playerId - int 
// skill - String 
// level - String 
// points - int

// Write getters, setters and parameterized constructor in the above mentioned attribute 
// sequence as required.

// Create class Solution with the main method.

// Implement two static methods - findPointsForGivenSkill and getPlayerBasedOnLevel in Solution class.

// findPointsForGivenSkill method: 
// ------------------------------------
// This method will take two input parameters - array of Player objects 
// and string parameter skill. The method will return the sum of the points attribute from player objects 
// for the skill passed as parameter. If no player with the given skill is present in the array of player 
// objects, then the method should return 0.

// getPlayerBasedOnLevel method: 
// -------------------------------------
// This method will take two String parameters level and skill, along with the array of Player objects. 
// The method will return the player object, if the input String parameters matches with the level and 
// skill attribute of the player object and its point attribute is greater than or equal to 20. If any 
// of the conditions are not met, then the method should return null.

// Note : No two player object would have the same value for skill and level attribute. All player object 
// would have the points greater than 0. All the searches should be case insensitive.

// These above mentioned static methods should be called from the main method.

// For findPointsForGivenSkill method - The main method should print the points as it is if the returned 
// price is greater than 0, or it should print "The given Skill is not available".

// For getPlayerBasedOnLevel method - The main method should print the playerId of the returned player object.
// If the returned value is null then it should print "No player is available with specified level, skill 
// and eligibility points".

// Before calling these static methods in main, use Scanner object to read the values of four Player objects 
// referring attributes in the above mentioned attribute sequence. Next, read the value for skill and level.
// Please consider the skill value read above as skill parameter for both the static methods.

// Input:
// -----------
// 101
// Cricket
// Basic
// 20
// 102
// Cricket
// Intermediate
// 25
// 111
// Football
// Intermediate
// 50
// 113
// BaseBall
// Advanced
// 100
// Cricket
// Intermediate

// Output:
// --------------
// 45
// 102

import java.util.*;
class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Player[] players = new Player[4];
        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String skill = sc.nextLine();
            String level = sc.nextLine();
            int point = sc.nextInt();
            players[i] = new Player(id, skill, level, point);
        }
        String skill = sc.nextLine();
        int ans1 = Ans1(players, skill);
if(ans1>0)
System.out.println(ans1);
else
System.out.println("The given Skill is not available");
        
        String level = sc.nextLine();
        int[] ans2 = Ans2(players, level, skill);
        if (ans2.length>0)
        {
            for (int i = 0; i < ans2.length; i++) {
                System.out.println(ans2[i]);
            }
        }
        else {
            System.out.println("No player is available with specified level, skill and eligibility points");
        }


    }
    
    private static int Ans1(Player[] p, String s) {

        int count = 0;
        for (int i = 0; i < p.length; i++) {
            if (p[i].getSkill().equalsIgnoreCase(s))
                count+=p[i].getPoint();
        }
        return count;
    }
    
    private static int[] Ans2(Player[] p, String l, String s) {
        int[] arr = new int[0];
        for (int i = 0; i < p.length; i++) {
            if (p[i].getPoint() >= 20 && p[i].getLevel().equalsIgnoreCase(l) && p[i].getSkill().equalsIgnoreCase(l)) {
                arr = Arrays.copyOf(arr, arr.length + 1);
                arr[arr.length - 1] = p[i].getId();
            }
        }
if(arr.length>0)
    return arr;
    else
        return null;
    }
}



class Player {
    

    private int id;
    private String skill;
    private String level;
    private int point;

    Player(int id, String skill, String level, int point) {
        this.id = id;
        this.skill = skill;
        this.level = level;
        this.point = point;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
    
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
   }
    

}