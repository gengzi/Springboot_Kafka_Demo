package fun.gengzi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ValExample {

  private final int aa = 11;
  private final ArrayList<String> example = new ArrayList<>();

  public String example() {
    final ArrayList<String> example = new ArrayList<String>();
    example.add("Hello, World!");
    final String foo = example.get(0);
    return foo.toLowerCase();
  }
  
  public void example2() {
    final HashMap<Integer, String> map = new HashMap<Integer, String>();
    map.put(0, "zero");
    map.put(5, "five");
    for (final Map.Entry<Integer, String> entry : map.entrySet()) {
      System.out.printf("%d: %s\n", entry.getKey(), entry.getValue());
    }
  }

  public void example3() {
   final int a = 10;
   final int b = 100;
   int c = a+b;
    System.out.println(c);
  }
}