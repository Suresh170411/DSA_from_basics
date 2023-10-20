package Assignment;

import java.util.*;
import java.util.stream.Collectors;

import java.util.*;

public class Qestion1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalNumberOfSongs = sc.nextInt();

        List<String> songList  = new ArrayList<>();

        for (int i=0; i<totalNumberOfSongs; i++){
            songList.add(sc.next());
        }

        int limit = sc.nextInt();

        findTheFrequencyOfSongs(songList, limit);

        sc.close();
    }

    public static void findTheFrequencyOfSongs(List<String> songList , int limit){
        HashMap<String, Integer> map = new HashMap<>();

        for (String s : songList){
            map.put(s, map.getOrDefault(s, 0)+1);
        }

        LinkedHashMap<String, Integer> sortedMap = map.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .collect(Collectors.toMap(
            Map.Entry::getKey,
            Map.Entry::getValue,
            (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        
        int count = 0;
        for (String s : sortedMap.keySet()){
            if (count < limit){
                System.out.println(s+"="+sortedMap.get(s));
            }
            count++;
        }
    }
}