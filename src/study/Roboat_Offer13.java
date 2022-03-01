package study;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author yanggq
 * @create 2022-02-28 18:19
 */
public class Roboat_Offer13 {
    public int movingCount(int m, int n, int k) {
        if (k == 0)
            return 1;
        int count=1;
        //是否访问过（true,访问过）
        boolean[][] visit = new boolean[m][n];
        Queue<int[]> queue = new LinkedList<int[]>();
        queue.offer(new int[]{0, 0});
        //向下移动
        int[] dy = {0, 1};
        //向右移动
        int[] dr = {1, 0};
        while (!queue.isEmpty()) {
            int[] temp = queue.poll();
            visit[0][0] = true;
            for (int i = 0; i < 2; i++) {
                int tx = temp[0] + dy[i];
                int ty = temp[1] + dr[i];
                if (tx < 0 || tx >= m || ty < 0 || ty >= n || visit[tx][ty] ||get(tx)+get(ty)>k)
                    continue;
                visit[tx][ty]=true;
                queue.offer(new int[]{tx,ty});
                ++count;
            }

        }
        return count;

    }
    private int get(int x) {
        int res = 0;
        while (x != 0) {
            res += x % 10;
            x /= 10;
        }
        return res;
    }

//        if (k == 0) {
//            return 1;
//        }
//        Queue<int[]> queue = new LinkedList<int[]>();
//        // 向右和向下的方向数组
//        int[] dx = {0, 1};
//        int[] dy = {1, 0};
//        boolean[][] vis = new boolean[m][n];
//        queue.offer(new int[]{0, 0});
//        vis[0][0] = true;
//        int ans = 1;
//        while (!queue.isEmpty()) {
//            int[] cell = queue.poll();
//            int x = cell[0], y = cell[1];
//            for (int i = 0; i < 2; ++i) {
//                int tx = dx[i] + x;
//                int ty = dy[i] + y;
//                if (tx < 0 || tx >= m || ty < 0 || ty >= n || vis[tx][ty] || get(tx) + get(ty) > k) {
//                    continue;
//                }
//                queue.offer(new int[]{tx, ty});
//                vis[tx][ty] = true;
//                ans++;
//            }
//        }
//        return ans;



    public static void main(String[] args) {
        Roboat_Offer13 roboat_offer13 = new Roboat_Offer13();
        System.out.println(roboat_offer13.movingCount(3,3,0));;
    }

}
