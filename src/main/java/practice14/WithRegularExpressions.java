package practice14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

public class WithRegularExpressions {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        int number;
        String s1;
        String s2;
        String st;
        StringBuilder patterns= new StringBuilder();
        number = sc.nextInt();
        while (number > 0) {
            s1 = sc.next();
            s2 = sc.next();
            map.put(s1, s2);
            number--;
        }
        st = sc.next();
        List<Map.Entry<String, String>> l = new ArrayList<>(map.entrySet());
        for(int i=0;i<l.size();i++){
            patterns.append(l.get(i).getKey());
            if(i<l.size()-1) {
                patterns.append("|");
            }
        }
        Pattern pat = Pattern.compile(patterns.toString());
        Matcher match = pat.matcher(st);
        String res = match.replaceAll(h->map.get(h.group()));
        System.out.println(res);

    }
}
