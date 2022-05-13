package OfferII;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yanggq
 * @create 2022-05-13 21:11
 */
public class Offer85 {
    List<String> list=new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        String str="";
        dfs(str,n,n);
        return list;
    }


    public void dfs(String s,int left,int right){
        if(left==0&&right==0){
            list.add(new String(s));
            return;
        }

        if(left<0||right<0||right<left)
            return ;
        dfs(s+"(",left-1,right);
        dfs(s+")",left,right-1);
    }
}
