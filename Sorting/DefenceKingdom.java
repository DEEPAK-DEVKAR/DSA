package LeetCode.Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class DefenceKingdom {

    static long defkin(int w, int h, ArrayList<longPair> position)
    {

        ArrayList<Long> listX = new ArrayList<>();
        ArrayList<Long> listY = new ArrayList<>();

        listX.add(0L);
        listY.add(0L);

        for(int i = 0;i<position.size();i++){
            listX.add(position.get(i).first);
            listY.add(position.get(i).second);
        }

        Collections.sort(listX);
        Collections.sort(listY);
        long xMax = Integer.MIN_VALUE;
        long yMax = Integer.MIN_VALUE;
        for(int i=1;i<listX.size();i++)
            xMax = Math.max(xMax,listX.get(i)-listX.get(i-1) -1);
        for(int j=1;j<listY.size();j++)
            yMax = Math.max(yMax,listY.get(j)-listY.get(j-1) - 1);

        return xMax * yMax;

    }

    public static void main(String[] args) {
        ArrayList<longPair> list = new ArrayList<longPair>();
        list.add(new longPair(3L,8L));
        list.add(new longPair(11L,2L));
        list.add(new longPair(8L,6L));

        System.out.println(defkin(15,8,list));
    }
}

class longPair{
    public long first;

    public longPair(long first, long second) {
        this.first = first;
        this.second = second;
    }

    public long second;
}
