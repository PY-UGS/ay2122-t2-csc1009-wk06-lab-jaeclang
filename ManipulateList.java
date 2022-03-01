import java.util.*;

public class ManipulateList {
    static final int LIMIT = 500;
    static final int LOWER_BOUND = 1000;
    static final int HIGHER_BOUND = 9999;

    // Insert Integer into List Method
    public static LinkedList<Integer> addAndSort(LinkedList<Integer> inserted_list, int valueToInsert){
        int insertPos = 0;
        for(int pos = 0; pos < inserted_list.size(); pos ++){
            if(pos == 0){
                if(valueToInsert <= inserted_list.get(pos)){
                    insertPos = 0;
                    break;
                }
            }
            else if(pos == inserted_list.size()-1){
                if(valueToInsert >= inserted_list.get(pos)){
                    insertPos = inserted_list.size();
                    break;
                }
            }
            else{
                if((valueToInsert >= inserted_list.get(pos)) && (valueToInsert < inserted_list.get(pos+1))){
                    insertPos = pos+1;
                    break;
                }
            }

        }
        inserted_list.add(insertPos, valueToInsert);
        return inserted_list;
    }

    // Swapped Integers in a LinkedList
    public static LinkedList<Integer> swapValues(LinkedList<Integer> swapped_list, int first_pos, int sec_pos){
        int first_pos_value = swapped_list.get(first_pos);
        int sec_pos_value = swapped_list.get(sec_pos);
        swapped_list.set(first_pos, sec_pos_value);
        swapped_list.set(sec_pos, first_pos_value);
        return swapped_list;
    }

    // Random Generated List
    public static int randomList(LinkedList<Integer> random_list){
        int counter = 0;
        int random_value;
        while(counter < LIMIT){
            random_value = (int)Math.floor(Math.random()*(HIGHER_BOUND-LOWER_BOUND+1)+LOWER_BOUND);
            random_list.add(random_value);
            counter++;
        }
        return (int)Math.floor(Math.random()*(HIGHER_BOUND-LOWER_BOUND+1)+LOWER_BOUND);
    }

    // Find Value in a list of Random Values
    public static int findValue(LinkedList<Integer> random_list, int intToCompare){
        int matching_pos = 0;
        for(int current_value: random_list){
            if(current_value == intToCompare){
                return matching_pos;
            }
            matching_pos++;
        }
        return -1;
    }

    public static void main(String[] args){
        LinkedList<Integer> sorted_list = new LinkedList<>();
        sorted_list.add(1);
        sorted_list.add(3);
        sorted_list.add(5);
        sorted_list.add(7);
        sorted_list.add(9);
        sorted_list.add(11);

        System.out.println("Before Insertion --> " + sorted_list);
        LinkedList<Integer> inserted_list = new LinkedList<>(sorted_list);
        addAndSort(inserted_list, 6);
        addAndSort(inserted_list, 0);
        addAndSort(inserted_list, 13);
        System.out.println("After Insertion --> " + inserted_list);

        System.out.println("\nBefore Swapped --> " + sorted_list);
        LinkedList<Integer> swapped_list = new LinkedList<>(sorted_list);
        swapValues(swapped_list, 1, 3);
        System.out.println("After Swapped --> " + swapped_list);

        LinkedList<Integer> random_list = new LinkedList<>();
        int intToCompare = randomList(random_list);
        System.out.println("\nRandom List --> " + random_list);
        int matching_pos = findValue(random_list, intToCompare);
        String result_str = String.format("Random Value %d found @ Position: %d", intToCompare, matching_pos);
        System.out.println(result_str);

    }
}
