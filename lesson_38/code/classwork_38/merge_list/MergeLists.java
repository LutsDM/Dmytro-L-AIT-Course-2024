package classwork_38.merge_list;
//Напишите программу, которая объединяет два списка целых чисел (ArrayList<Integer>), удаляет из объединенного списка дубликаты и сортирует его в порядке возрастания.
//list1 = [3, 5, 1, 9, 3]
//list2 = [8, 2, 5, 3]
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MergeLists {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(List.of(3, 5, 1, 9, 3));
        ArrayList<Integer> list2= new ArrayList<>(List.of(8, 2, 5, 3));

        //Merging lists

        ArrayList<Integer> mergeList = new ArrayList<>(list1); //add list1 to mergeList
        mergeList.addAll(list2);// add list2 to mergeList

        //Remove duplicate
        Set<Integer> uniqueNumbers = new HashSet<>(mergeList);
        System.out.println(uniqueNumbers);

        //Put Set into List
        mergeList = new ArrayList<>(uniqueNumbers);
        mergeList.sort(Integer::compareTo);

        System.out.println(mergeList);
    }





}
