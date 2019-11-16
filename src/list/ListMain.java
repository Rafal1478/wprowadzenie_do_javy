package list;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<List<Integer>>  l = new ArrayList<>();
        int maxIndex = 10;
        for(int i = 0; i <= 10; i++){
            List<Integer> tempList = new ArrayList<>();
            for(int j = 0; j <= maxIndex; j++){
                tempList.add(i*j);
                l.add(tempList);
            }
            System.out.println(l.get(4).get(7));
        }
    }
}

