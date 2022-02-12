package study;

/**
 * @author yanggq
 * @create 2022-02-12 9:40
 */

/**
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 */
public class replace_Offer05 {
    //方法一：使用了StringBuilder,占用内存较高
    public String replacespace(String s) {
        char[] chars = s.toCharArray();
        StringBuilder temp=new StringBuilder();
        for(char newchar:chars){
            if(newchar==' '){
                temp.append("%20");
                continue;
            }
            temp.append(newchar);
        }
        return temp.toString();

    }

    public String replacespace2(String s) {
        int length=s.length();
        char[] temp=new char[length*3];
        int j=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' '){
                temp[j++]='%';
                temp[j++]='2';
                temp[j++]='0';
            }else {
                temp[j++]=s.charAt(i);
            }
        }
        String newString = new String(temp, 0, j);
        return newString;
    }


    public void findString(String s){
        char[] toCharArray = s.toCharArray();
        for(char newchar:toCharArray){
            System.out.println(newchar);
        }
    }

    public static void main(String[] args) {
        replace_Offer05 replace_offer05 = new replace_Offer05();
        //replace_offer05.findString("qwe rty");
        System.out.println(replace_offer05.replacespace2("qwe r  yz"));

    }
}
