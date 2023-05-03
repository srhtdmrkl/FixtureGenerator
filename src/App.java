import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> teams = new ArrayList<String>();
        teams.add("Palmeiras");
        teams.add("Santos");
        teams.add("Corinthians");
        teams.add("Flamengo");
        teams.add("São Paulo");
        teams.add("Cruzeiro");
        teams.add("Fluminense");
        teams.add("Vasco da Gama");
        teams.add("Internacional");
        teams.add("Grêmio");
        teams.add("Botafogo");
        teams.add("Atlético Mineiro");

        ArrayList<String> fixture = FixtureGenerator.generateFixture(teams);
        for (String match : fixture) {
            System.out.println(match);
        }
    }
}