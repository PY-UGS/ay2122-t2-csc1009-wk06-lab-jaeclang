import java.util.*;

public class ManipulateHashTable {
    static final int LIMIT = 500;
    static final int LOWER_BOUND = 1000;
    static final int HIGHER_BOUND = 9999;

    public static Hashtable<Integer, Integer> addAndSort(Hashtable<Integer, Integer> inserted_ht, int valueToInsert){
        inserted_ht.put(valueToInsert, valueToInsert);
        int number_of_items = inserted_ht.size();
        int[] desc_arr = new int[number_of_items];
        int pos = 0;

        while(pos < number_of_items){
            int temp_max = 0;
            for(int key: inserted_ht.keySet()){
                if(key >= temp_max){
                    temp_max = key;
                }
            }
            desc_arr[pos] = temp_max;
            pos++;
            inserted_ht.remove(temp_max);
        }
        for(int value: desc_arr) {
            inserted_ht.put(value, value);
        }
        return inserted_ht;
    }

    // Random Generated HashTable
    public static int randomHashTable(Hashtable<Integer, Integer> random_ht){
        int counter = 0;
        int random_value;
        while(counter < LIMIT){
            random_value = (int)Math.floor(Math.random()*(HIGHER_BOUND-LOWER_BOUND+1)+LOWER_BOUND);
            random_ht.put(random_value, random_value);
            counter++;
        }
        return (int)Math.floor(Math.random()*(HIGHER_BOUND-LOWER_BOUND+1)+LOWER_BOUND);
    }

    // Find Value in a HashTable of Random Values
    public static int findValue(Hashtable<Integer, Integer> random_ht, int intToCompare){
        int matching_pos = 0;
        for(int current_key: random_ht.keySet()){
            if(current_key == intToCompare){
                return matching_pos;
            }
            matching_pos++;
        }
        return -1;
    }


    public static void main(String[] args){
        Hashtable<Integer, Integer> sorted_ht = new Hashtable<>();
        sorted_ht.put(1, 1);
        sorted_ht.put(3, 3);
        sorted_ht.put(5, 5);
        sorted_ht.put(7, 7);
        sorted_ht.put(9, 9);
        sorted_ht.put(11, 11);

        System.out.println("Before Insertion --> " + sorted_ht);
        Hashtable<Integer, Integer> inserted_ht = new Hashtable<>(sorted_ht);
        addAndSort(inserted_ht, 6);
        System.out.println("After Insertion --> " + inserted_ht);
        System.out.println("!! Question 1 cannot be done in HashFormat/HashTable as order matters.\n!! Hashtable does not preserve the order by its keys or values!\n");

        System.out.println("!! Question 2 cannot be done in HashFormat/HashTable as order matters.\n!! Hashtable does not preserve the order by its keys or values!\n");

        Hashtable<Integer, Integer> random_ht = new Hashtable<>();
        int intToCompare = randomHashTable(random_ht);
        System.out.println("Random List --> " + random_ht);
        int matching_pos = findValue(random_ht, intToCompare);
        String result_str = String.format("Random Value %d found @ Position: %d", intToCompare, matching_pos);
        System.out.println(result_str);
            System.out.println("!! Question 3 cannot be done in HashFormat/HashTable as position matters.\n!! Hashtable does not preserve the order by its keys or values!\n!! Hence the matching position might not be accurate!");
        System.out.println("!! These questions can be done with the help of other collections & imports, but that defeats the purpose of this question.");

    }
}
