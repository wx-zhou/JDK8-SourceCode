package top.wxzhou;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    @Test
    public void case1(){
        Map<String, Double> hashMap = new HashMap<>();
        hashMap.put("k1", 0.1);
        hashMap.put("k2", 0.2);
        hashMap.put("k3", 0.3);
        hashMap.put("k4", 0.4);
    }


}
