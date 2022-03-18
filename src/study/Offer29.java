package study;

/**
 * @author yanggq
 * @create 2022-03-15 19:18
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字
 */
public class Offer29 {

    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }

        //m为矩阵的行数,n为列数
        int m=matrix.length;
        int n=matrix[0].length;
        int total=m*n;
        //存储遍历结果
        int[] order=new int[total];
        //是否被遍历
        boolean[][] visit=new boolean[m][n];
        //向右{0,1} 向下{1,0} 向左{0，-1} 向上{-1，0}
        int[][] direction={{0,1},{1,0},{0,-1},{-1,0}};
        int index=0;
        int tx=0,ty=0;
        int row=0,conclum=0;
        visit[0][0]=true;

        for (int i = 0; i < total; i++) {
            order[i]=matrix[row][conclum];
            visit[row][conclum]=true;
            //tx,ty主要是为了判断移动后是否越界
            tx=row+direction[index][0];
            ty=conclum+direction[index][1];
            if(tx<0||tx>=m||ty<0||ty>=n||visit[tx][ty]==true){
                index=(index+1)%4;
            }
            row+=direction[index][0];
            conclum+=direction[index][1];
           }
        return order;
    }


    public static void main(String[] args) {
        Offer29 offer29 = new Offer29();
        offer29.spiralOrder(new int[][]{{1,2,3},{1,2,3}});
    }
}
