
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Team> teamData = new ArrayList<>();
        Boolean teamExists = false;

        System.out.println("File: ");
        String file = scan.nextLine();

        // read file
        try ( Scanner readFile = new Scanner(Paths.get(file))) {
            while (readFile.hasNextLine()) {
                String row = readFile.nextLine();

                String[] dataArray = row.split(",");

                String home = dataArray[0];
                String away = dataArray[1];
                int homePoints = Integer.valueOf(dataArray[2]);
                int awayPoints = Integer.valueOf(dataArray[3]);

                // check if home team exists. Create Team object if not.
                for (Team i : teamData) {
                    if (i.getName().equals(home)) {
                        teamExists = true;
                    }
                }
                if (teamExists == false) {
                    teamData.add(new Team(home));
                }

                teamExists = false; // reset

                // check if away team exists. Create Team object if not.
                for (Team i : teamData) {
                    if (i.getName().equals(away)) {
                        teamExists = true;
                    }
                }
                if (teamExists == false) {
                    teamData.add(new Team(away));
                }
                teamExists = false; // reset

                // times played
                for (Team i : teamData) {
                    if (i.getName().equals(home)) {
                        i.hasPlayed();
                    } else if (i.getName().equals(away)) {
                        i.hasPlayed();
                    }
                }

                // who won? update Team object
                if (homePoints > awayPoints) {
                    for (Team i : teamData) {
                        if (i.getName().equals(home)) {
                            i.hasWon();
                        } else if (i.getName().equals(away)) {
                            i.hasLost();
                        }
                    }
                }

                if (homePoints < awayPoints) {
                    for (Team i : teamData) {
                        if (i.getName().equals(home)) {
                            i.hasLost();
                        } else if (i.getName().equals(away)) {
                            i.hasWon();
                        }
                    }
                }

            }

        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }

        // ask user for team data to display   
        System.out.println("Team: ");
        String teamSearch = scan.nextLine();
        
        Boolean hasPlayed = false;
        
        for (Team i : teamData) {
            if (i.getName().equals(teamSearch)) {
                System.out.println(i);
                hasPlayed = true;
            }   
        }
        
        if (hasPlayed == false) {
            System.out.println("Games: 0\nWins: 0\nLosses: 0");
        }
        hasPlayed = false; // reset
    }

}
