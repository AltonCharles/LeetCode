package study;

/**
 * @author yanggq
 * @create 2021-12-27 16:48
 */
import java.util.HashMap;

/**
 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 *
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * 给定一个罗马数字，将其转换成整数。
 */
public class RomaToInt13 {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        char[] charArray = s.toCharArray();
        int sum=0;
        for (int i = 0; i < charArray.length; i++) {
            if(i<charArray.length-1&&map.get(charArray[i])<map.get(charArray[i+1])){
                sum+=map.get((charArray[i]))*(-1);
            }else {
                sum+=map.get(charArray[i]);
            }
        }
        return sum;
    }
//    public void test(){
//        int a=89;
//        switch (a){
//            case 90:
//                System.out.println("very good");
//                break;
//            case 89:
//                System.out.println("good");
//        }
//    }
    public static void main(String[] args) {
        RomaToInt13 romaToInt13 = new RomaToInt13();
        System.out.println(romaToInt13.romanToInt("LVIII"));
    }
}
