//package interview_prepare;
//
//import javafx.util.Pair;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.LinkedHashMap;
//import java.util.List;
//
//public class UserStatistics {
//    List<Stat> pairList = new ArrayList<>();
//
//
//    public void event(long time, long userId) {
//        if (pairList.isEmpty()) {
//            Stat stat = new Stat();
//            stat.time = time;
//            stat.hashMap.put(userId, 1);
//            pairList.add(stat);
//        } else {
//            Stat prev = pairList.get(pairList.size() - 1);
//            Stat stat1 = new Stat();
//            stat1.time = time;
//            stat1.hashMap = new HashMap<>(prev.hashMap);
//            stat1.hashMap.put(userId, prev.hashMap.getOrDefault(userId, 0) + 1);
//            pairList.add(stat1);
//        }
//    }
//
//    public int robotCount(long time) {
//
//    }
//
//    class Stat {
//        Long time;
//        HashMap<Long, Integer> hashMap = new HashMap<>();
//    }
//}
