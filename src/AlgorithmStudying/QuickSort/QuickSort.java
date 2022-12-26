package AlgorithmStudying.QuickSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    for(int i=0; i<10;i++){
        list.add((int) (Math.random()*100));
    }
        System.out.println(splitFunc(list));
    }


        public static ArrayList<Integer> splitFunc(ArrayList<Integer> dataList) {
            if (dataList.size() <= 1) {
                return dataList;
            }
            int pivot = dataList.get(0);
            ArrayList<Integer> leftArr = new ArrayList<>();
            ArrayList<Integer> rightArr = new ArrayList<>();
            for (int i = 1; i < dataList.size(); i++) {
                if (dataList.get(i) > pivot) {
                    rightArr.add(dataList.get(i));
                } else {
                    leftArr.add(dataList.get(i));
                }
            }
            ArrayList<Integer> mergedArr = new ArrayList<>();
            mergedArr.addAll(splitFunc(leftArr));
            mergedArr.add(pivot);
            mergedArr.addAll(splitFunc(rightArr));
            return mergedArr;
        }



}
