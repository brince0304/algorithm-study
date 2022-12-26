import java.util.ArrayList;
import java.util.List;

public class practice01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<10; i++){
            list.add((int) (Math.random()*100));
        }
        System.out.println(mergeSplitFunc(list));
    }

    public static void split(ArrayList<Integer> list){
        if(list.size()<=1){
            return;
        }
        int medium = list.size()/2;
        List<Integer> leftList = new ArrayList<>(list.subList(0,medium));
        List<Integer> rightList = new ArrayList<>(list.subList(medium,list.size()));
        System.out.println(leftList);
        System.out.println(rightList);
    }

    public static ArrayList<Integer> mergeSplitFunc(ArrayList<Integer> list){
        if(list.size()<=1){
            return list;
        }
        else{
            int medium = list.size()/2;
            //재귀 호출로 더 이상 나눌 수 없을때까지 나눈다.
            ArrayList<Integer> leftList = mergeSplitFunc(new ArrayList<>(list.subList(0,medium)));
            ArrayList<Integer> rightList = mergeSplitFunc(new ArrayList<>(list.subList(medium,list.size())));
            return mergeFunc(leftList,rightList);
        }
    }

    public static ArrayList<Integer> mergeFunc(ArrayList<Integer> leftList,ArrayList<Integer> rightList){
        ArrayList<Integer> mergedList = new ArrayList<>();
        int leftPoint = 0;
        int rightPoint = 0;

        //CASE1 : left / right 둘 다 존재할 때
        while(leftList.size() > leftPoint && rightList.size()>rightPoint){
            if(leftList.get(leftPoint)> rightList.get(rightPoint)){
                mergedList.add(rightList.get(rightPoint));
                rightPoint++;
            }
            else{
                mergedList.add(leftList.get(leftPoint));
                leftPoint++;
            }
        }
        //CASE2 : right 데이터가 없을 때
        while(leftList.size()>leftPoint){
            mergedList.add(leftList.get(leftPoint));
            leftPoint++;
            //나머지를 다 넣어준다.
        }
        // 왼쪽 데이터가 처리된 상태이지만 오른쪽 데이터가 아직 존재하는 상태라면
        // case3으로 들어올 수가 있다.
        //CASE3 : left 데이터가 없을 때
        while(rightList.size()>rightPoint){
            mergedList.add((rightList.get(rightPoint)));
            rightPoint++;
        }
        return mergedList;
    }
    }


