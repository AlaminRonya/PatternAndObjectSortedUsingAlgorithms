package quickSortInJava.modul;

import java.util.Collections;
import java.util.List;

public class QuickSort {

    public static void  quickSort(List<StudentNameAndMark> quickSortedClassList, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(quickSortedClassList, begin, end);
            quickSort(quickSortedClassList, begin, partitionIndex-1);
            quickSort(quickSortedClassList, partitionIndex+1, end);
        }
    }

    private static int partition(List<StudentNameAndMark> quickSortedClassList, int begin, int end) {
        int pivot = quickSortedClassList.get(end).getMarks();
        System.out.println(pivot);
        int i = (begin-1);
        for (int j = begin; j < end; j++) {
            if (quickSortedClassList.get(j).getMarks() <= pivot) {
                i++;
                Collections.swap(quickSortedClassList,j,i);
            }
        }
        Collections.swap(quickSortedClassList,end,i+1);
        return i+1;
    }
}
