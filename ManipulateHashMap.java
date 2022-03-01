import java.util.*;

public class ManipulateHashMap {
    static final int LIMIT = 500;
    static final int LOWER_BOUND = 1000;
    static final int HIGHER_BOUND = 9999;

    public static HashMap<Integer, Integer> addAndSort(HashMap<Integer, Integer> inserted_hm, int valueToInsert){
        inserted_hm.put(valueToInsert, valueToInsert);
        return inserted_hm;
    }

    // Swapped Integers in a HashMap
//    public static HashMap<Integer, Integer> swapValues(HashMap<Integer, Integer> swapped_hm, int first_pos, int sec_pos){
//        int first_pos_value = swapped_hm.get(first_pos);
//        int sec_pos_value = swapped_hm.get(sec_pos);
//        swapped_hm.set(first_pos, sec_pos_value);
//        swapped_hm.set(sec_pos, first_pos_value);
//        return swapped_hm;
//    }

    // Random Generated List
//    public static int randomHashMap(HashMap<Integer, Integer> random_hm){
//        int counter = 0;
//        int random_value;
//        while(counter < LIMIT){
//            random_value = (int)Math.floor(Math.random()*(HIGHER_BOUND-LOWER_BOUND+1)+LOWER_BOUND);
//            random_hm.add(random_value);
//            counter++;
//        }
//        return (int)Math.floor(Math.random()*(HIGHER_BOUND-LOWER_BOUND+1)+LOWER_BOUND);
//    }
//
//    // Find Value in a list of Random Values
//    public static int findValue(HashMap<Integer, Integer> random_hm, int intToCompare){
//        int matching_pos = 0;
//        for(int current_value: random_hm){
//            if(current_value == intToCompare){
//                return matching_pos;
//            }
//            matching_pos++;
//        }
//        return -1;
//    }



    public static void main(String[] args){
        HashMap<Integer, Integer> sorted_hm = new HashMap<>();
        sorted_hm.put(1, 1);
        sorted_hm.put(3, 3);
        sorted_hm.put(5, 5);
        sorted_hm.put(7, 7);
        sorted_hm.put(9, 9);
        sorted_hm.put(11, 11);

        System.out.println("Qn4. Before Insertion --> " + sorted_hm);
        HashMap<Integer, Integer> inserted_hm = new HashMap<>(sorted_hm);
        addAndSort(inserted_hm, 6);
        System.out.println("Qn4. After Insertion --> " + inserted_hm);

        System.out.println("\nQn5. Before Swapped --> " + sorted_hm);
        HashMap<Integer, Integer> swapped_hm = new HashMap<>(sorted_hm);
//        swapValues(swapped_hm, 1, 3);
        System.out.println("Qn5. After Swapped --> " + swapped_hm);
        System.out.println("!! Qn5. cannot be done in HashMap as position matters.\n!! Hashmap auto sorts in ascending order by its keys or values!\n!! Hence the matching position might not be accurate!");

//        HashMap<Integer, Integer> random_hm = new HashMap<>();
//        int intToCompare = randomHashMap(random_hm);
//        System.out.println("Random List --> " + random_hm);
//        int matching_pos = findValue(random_hm, intToCompare);
//        String result_str = String.format("Random Value %d found @ Position: %d", intToCompare, matching_pos);
//        System.out.println(result_str);

    }
}
