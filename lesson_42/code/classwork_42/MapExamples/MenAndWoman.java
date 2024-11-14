package classwork_42.MapExamples;

import java.util.HashMap;
import java.util.Map;

public class MenAndWoman {
    public static void main(String[] args) {

        //m - male, f - female

        Map<String ,String > genderMap = new HashMap();

        genderMap.put("LK", "m");
        genderMap.put("AD", "m");
        genderMap.put("DM", "m");
        genderMap.put("GA", "f");
        genderMap.put("JR", "m");
        genderMap.put("OF", "f");
        genderMap.put("DV", "f");
        genderMap.put("GT", "f");

        // 1 option - проходим по Keys, keySet

        int men = 0;
        for (String key : genderMap.keySet()) {
            if(genderMap.get(key).equals("m")){
                men++;
            }
        }
        int s = genderMap.size();
        int women = s - men;

        System.out.println("Men: " + men + ", women: " + women);

        // 2 option - проходит по values, values()
        for (String value : genderMap.values()) {
            if(value.equals("f")){
                women++;
            }
        }
        System.out.println(women);
    }
}
