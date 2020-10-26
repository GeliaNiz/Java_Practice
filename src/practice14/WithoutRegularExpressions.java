package practice14;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class WithoutRegularExpressions{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new HashMap<String, String>();
        String[] str=new String[2];
        Boolean b = false;
        int number;
        int index = 0;
        int j = 0;
        String s1="";
        String s2="";
        String st;
        String result = "";
        String curr="";
        number = Integer.parseInt(sc.nextLine());
        while (number > 0) {
            s1=sc.nextLine();
            str=s1.split(" ");
            map.put(str[0], str[1]);
            number--;
        }
        st = sc.nextLine();
        //Конец ввода данных
       List<Map.Entry<String, String>> l = new ArrayList<>(map.entrySet());
        for (j = 0; j < st.length(); j++) {
            b=false;
            for (int i = 0; i < l.size(); i++) {
                if (j + l.get(i).getKey().length() <= st.length()) {
                    curr = st.substring(j, j + l.get(i).getKey().length());
                    if (curr.equals(l.get(i).getKey())) {
                        b = true;
                        result += l.get(i).getValue();
                        j += l.get(i).getKey().length()-1;
                        break;
                    }
                }
            }
            if(!b){
                result+=st.charAt(j);
            }
        }
        System.out.println(result);
    }
}






