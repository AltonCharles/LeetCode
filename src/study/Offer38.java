package study;

/**
 * @author yanggq
 * @create 2022-03-23 20:56
 */

import java.util.ArrayList;
import java.util.HashSet;

/**
 * 输入一个字符串，打印出该字符串中字符的所有排列。
 */
public class Offer38 {
    ArrayList<String> list=new ArrayList<>();
    char[] c;
    public String[] permutation(String s) {
        String[] result=new String[s.length()];
        if(s==null)
            return null;
        if(s.length()==1){
            result[0]=s;
            return result;
        }
        c=s.toCharArray();
        dfs(0);
        return list.toArray(new String[list.size()]);
    }

    public void dfs(int x){
        //递归中止条件
        if(x==c.length-1)
        {
            list.add(String.valueOf(c));
            return;
        }
        HashSet<Character> set=new HashSet<>();
        for(int i=x;i<c.length;i++){
            //不考虑重复
            if(set.contains(c[i]))
                continue;
            set.add(c[i]);
            swap(i,x);
            dfs(x+1);
            swap(i,x);

        }

    }

    public void swap(int a,int b){
        char temp=c[a];
        c[a]=c[b];
        c[b]=temp;
    }
}



