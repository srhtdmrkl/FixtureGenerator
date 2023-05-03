import java.util.ArrayList;
import java.util.Collections;

public class FixtureGenerator {

    public static ArrayList<String> generateFixture(ArrayList<String> teams) {
        if (teams.size() % 2 != 0) {
            teams.add("Bay");
        }

        int numWeeks = teams.size() - 1;
        int halfSize = teams.size() / 2;

        ArrayList<String> fixture = new ArrayList<>();
        for (int i = 0; i < numWeeks; i++) {
            fixture.add("Week " + (i+1));
            for (int j = 0; j < halfSize; j++) {
                String homeTeam = teams.get(j);
                String awayTeam = teams.get(teams.size() - 1 - j);
                if(homeTeam != "Bay" || awayTeam != "Bay") {
                    fixture.add(homeTeam + " vs. " + awayTeam);
                }
            }
            Collections.rotate(teams.subList(1, teams.size()), 1);
        }
        
        return fixture;
        
    }
}
