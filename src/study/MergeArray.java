package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

/**
 * @author yanggq
 * @create 2021-11-27 19:45
 * 以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。请你合并所有重叠的区间，并返回一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间。
 *
 */
public class MergeArray {
    public int[][] merge(int[][] intervals) {
        //对数组进行初步排序（第一列由小到大排序），Arrays,Comparator可以看看
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        ArrayList<int[]> arrayList = new ArrayList<>();
        arrayList.add(intervals[0]);
        //
        int j=0;
        int [] temp=new int[2];
        for (int i = 1; i < intervals.length; i++) {
            //System.out.println(arrayList.get(j)[1]);
            //下一行0标和当前行1下标比大小
            if(intervals[i][0]<=arrayList.get(j)[1])
            {
                //arrayList.remove(j);
                temp[0]=arrayList.get(j)[0];
                temp[1]= Math.max(arrayList.get(j)[1],intervals[i][1]);
                arrayList.remove(j);
                arrayList.add(temp);
                continue;
            }
            arrayList.add(intervals[i]);
            ++j;

        }
        return arrayList.toArray(new int[arrayList.size()][]);

    }

    public int getIndex(ArrayList<int[]> a){
        return  a.get(0)[0];
    }

    public static void main(String[] args) {
        MergeArray mergeArray = new MergeArray();
        int [][] a={{2,3},{1,4},{4,5}};
        int [][] b=mergeArray.merge(a);
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j]+"\t");
            }
            System.out.println();
        }
//        ArrayList<int[]> arrayList = new ArrayList<>();
//        arrayList.add(new int[]{1,3});
//        System.out.println(mergeArray.getIndex(arrayList));

    }

}
