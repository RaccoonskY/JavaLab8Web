package jspappl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Individual {

    public ArrayList<Integer> nums;
    public static ArrayList<Integer> GetNumArr(String[] unsortedStringArr){
        return (ArrayList<Integer>) Arrays.stream(unsortedStringArr).map(Integer::parseInt).collect(Collectors.toList());

    }

    public static ArrayList<Integer> getSortedArray(ArrayList<Integer> lst_) {
        Collections.sort(lst_);
        return lst_;
    }

    public static ArrayList<Integer> getSortedArray(String[] unsortedStringArr) {
        ArrayList<Integer> lst_ = GetNumArr(unsortedStringArr);
        Collections.sort(lst_);
        return lst_;
    }

    public static String getResultsToWeb(ArrayList<Integer> lst_){
        String results = "";
        for (Integer elem:lst_) {
            results+="<tr><td>"+elem.toString()+"</td></tr>";
        }
        return results;
    }


}
