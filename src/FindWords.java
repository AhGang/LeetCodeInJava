import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class FindWords {
public static String[] findWords(String[] words) {
	String[] Str = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};//��ż��̵��ַ�������
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
        index = map.get(word.toUpperCase().toCharArray()[0]);//�жϸ��ַ�������λ���ڵڼ���
        //�������ַ�����ĳһ���Ƿ�һֱ���г��֣�û������index = -1��
        for(char c : word.toUpperCase().toCharArray()) {
            if(map.get(c) != index) {
                index = -1;//��������flag ֱ�Ӱ�index��Ϊ-1����
                break;
            }
        }
        //��res�����ӷ��ϵ��ַ���
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
