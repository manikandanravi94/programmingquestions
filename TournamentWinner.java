import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class TournamentWinner {

    public static void main(String[] args) {
        List<List<String>> competedTeamsList = new ArrayList<>();
        List<String> firstCompetition = new ArrayList<>();
        firstCompetition.add("HTML");
        firstCompetition.add("C#");
        List<String> secondCompetition = new ArrayList<>();
        secondCompetition.add("C#");
        secondCompetition.add("Python");
        List<String> thirdCompetition = new ArrayList<>();
        thirdCompetition.add("Python");
        thirdCompetition.add("HTML");
        competedTeamsList.add(firstCompetition);
        competedTeamsList.add(secondCompetition);
        competedTeamsList.add(thirdCompetition);
        List<Integer> results = Arrays.asList(0,0,1);
        System.out.println("Winner : "+ getTournamentWinner(competedTeamsList,results));
    }

    public static String getTournamentWinner(
            List<List<String>> competitions, List<Integer> results) {
        // Write your code here.
        AtomicReference<String> winner = new AtomicReference<>(new String());
        Map<String,Integer> teamWinCountMap = new HashMap();
        for(int i=0;i<results.size();i++){
            List<String> teamsCompeted = new ArrayList(competitions.get(i));
            if(results.get(i)==1){
                teamWinCountMap.compute(teamsCompeted.get(0),(team, point)-> point!=null?point+3:3);
            }else{
                teamWinCountMap.compute(teamsCompeted.get(1),(team, point)-> point!=null?point+3:3);
            }
        }

        return teamWinCountMap.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get().getKey();
    }
}
