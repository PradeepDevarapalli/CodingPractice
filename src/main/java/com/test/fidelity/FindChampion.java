package com.test.fidelity;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindChampion {
    public static void main(String[] args) {
        List<List<String>> matches = Arrays.asList(
                Arrays.asList("CSK", "MI"),
                Arrays.asList("RCB", "SRH"),
                Arrays.asList("PK", "MI"),
                Arrays.asList("MI", "KKR"),
                Arrays.asList("RCB", "MI")
        );

        List<Integer> result = Arrays.asList(
                0,
                1,
                0,
                1,
                0
        );

        System.out.println("Tournament winner: " +findWinner(matches, result));
    }

    public static String findWinner(List<List<String>> matches, List<Integer> results) {
        Map<String, Integer>  pointsTable = new HashMap<>();

        String winner = "";
        pointsTable.put(winner, 0);

        for(int i=0; i<matches.size(); i++) {
            String team1 = matches.get(i).get(0);
            String team2 = matches.get(i).get(1);

            int result = results.get(i);

            String matchWiner;
            if(result ==1){
                matchWiner = team1;
            } else
                matchWiner= team2;

            pointsTable.put(matchWiner, pointsTable.getOrDefault(matchWiner, 0)+2);
            if(pointsTable.get(matchWiner) > pointsTable.get(winner)) {
                winner = matchWiner;
            }
        }
        return winner;
    }


    //Enhancement
    public static String usingStreams(List<List<String>> matches, List<Integer> wins) {
        return IntStream.of(0, matches.size())
                .mapToObj( i -> wins.get(i) == 1? matches.get(i).get(0) : matches.get(i).get(1))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get().getKey();
    }



}
