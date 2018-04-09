import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class FindWords {
public static String[] findWords(String[] words) {
	String[] Str = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};//存放键盘的字符串数组
    Map<Character,Integer> map = new HashMap<>();
    for(int i=0; i<Str.length; i++) {
        for(char c : Str[i].toCharArray()) {
            map.put(c, i);
        }
    }
    int index = 0;
    List<String> res = new ArrayList<>();
    for(String word : words) {
        if (word.equals("")) continue;
        index = map.get(word.toUpperCase().toCharArray()[0]);//判断该字符串的首位属于第几行
        //遍历该字符串在某一行是否一直都有出现，没有则令index = -1；
        for(char c : word.toUpperCase().toCharArray()) {
            if(map.get(c) != index) {
                index = -1;//不用设置flag 直接把index设为-1即可
                break;
            }
        }
        //在res中增加符合的字符串
        if(index != -1) res.add(word);
    }
    return res.toArray(new String[res.size()]);
    }
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	String words[] = {"Hello", "Alaska", "Dad", "Peace"};
	
	System.out.println(findWords(words));
}
}
