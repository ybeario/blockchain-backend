package java8.methodreferences;

import java.util.List;
import java.util.ArrayList;
 
public class Java8Tester {
   public static void main(String args[]){
      List<String> names = new ArrayList<String>();
        
      names.add("Google");
      names.add("Runoob");
      names.add("Taobao");
      names.add("Baidu");
      names.add("Sina");
        for (String string : names) {
			System.out.println(string);
		}
      names.forEach(System.out::println);
   }
}
