package algorithms.easy;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class RomanToInteger {
    Map<String, Integer> simple = Map.of(
      "I", 1,
      "V", 5,
      "X", 10,
      "L", 50,
      "C", 100,
      "D", 500,
      "M", 1000
    );
    Map<String, Integer> complex = Map.of(
      "II", 2,
      "IV", 4,
      "IX", 9,
      "XX", 20,
      "XL", 40,
      "XC", 90,
      "CC", 200,
      "CD", 400,
      "CM", 900,
      "MM", 2000
    );
    public int romanToInt(String s) {
        final AtomicInteger result = new AtomicInteger();
        final String[] temp = { s };
        complex.forEach((k,v) ->{
            if(s.contains(k)){
                result.set(result.get() + v);
                temp[0] = temp[0].replace(k,"");
            }
        });
        simple.forEach((k,v) ->{
            if(temp[0].contains(k)){
                result.set(result.get() + v);
                temp[0] = temp[0].replaceFirst(k,"");
            }
        });
        return result.get();
    }
}
