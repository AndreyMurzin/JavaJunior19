package homework.lesson15;

import java.util.HashMap;

public class NHL {
    private HashMap<String, Integer> hokkeyTeams = new HashMap<>();


    public void addPoints(String team, int points) {
        if (hokkeyTeams.containsKey(team)) {
            int currentPoints = hokkeyTeams.get(team);
            hokkeyTeams.put(team, points + currentPoints);
        } else {
            hokkeyTeams.put(team, points);
        }
    }

    public void printAllTeams() {
        for (String key : hokkeyTeams.keySet()) {
            System.out.println(key + " - " + hokkeyTeams.get(key));
        }
    }
}

