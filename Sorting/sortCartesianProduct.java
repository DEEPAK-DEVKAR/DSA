package LeetCode.Sorting;

import java.util.ArrayList;
import java.util.Comparator;

public class sortCartesianProduct {

    public static void main(String[] args) {

        ArrayList<Pair> list = new ArrayList<Pair>();
        list.add(new Pair(1,2));
        list.add(new Pair(5,1));
        list.add(new Pair(3,1));

        list.sort(new SortCartesian());

        for(Pair p : list)
        {
            System.out.println(p.toString());
        }
    }
}

class Pair{
    int first;

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    int second;
    Pair(int first, int second)
    {
        this.first = first;
        this.second = second;
    }
}

class SortCartesian implements Comparator<Pair>
{
    @Override
    public int compare(Pair a, Pair b)
    {
        if(a.first != b.first)
            return a.first - b.first;
        return a.second - b.second;
    }
}