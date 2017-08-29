/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package callbackinjava;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thomas Hartmann - tha@cphbusiness.dk
 */
public class CallbackInJava {

    /**
     * @param args the command line arguments
     */
    
    //In javascript we hava callbacks like: array.filter(function(){...})
    //In java an equivilent would be (not using lambda) to use an object
    public static void main(String[] args) {
        String[] strs = {"Andy", "Beatrice", "Charles", "Dorthea", "Eric", "Beatles"};
        Filter min5 = new FilterByMinLength5();
        String[] result1 = filter(strs, min5);
        for (String string : result1) {
            System.out.println(string);
        }
        System.out.println("----------------------------- Now filter on words starting with 'Bea'-------------------------");
        //Here we use the Interface to create an anonymous object directly inside the filter method.
        String[] result2 = filter(strs, new Filter(){
            @Override
            public boolean validate(String element) {
                return element.startsWith("Bea");
            }
        });
        for (String string : result2) {
            System.out.println(string);
        }
        System.out.println("-------------------------------Now filter on words containing 'a'------------------------------");
        //Here we use Lambda expression
        String[] result3 = filter(strs, (str)-> str.contains("a"));
        for (String string : result3) {
            System.out.println(string);
        }
    }
    
    // filter method here uses a functional interface (interface with only one method). It can then be used with lambda expressions
    private static String[] filter(String[] strs, Filter filterObj){
        List<String> filtered = new ArrayList();
        for (String str : strs) {
            if(filterObj.validate(str)){
                filtered.add(str);
            }
        }
        return filtered.toArray(new String[0]);
    }
    
    
    
    
    private static class FilterByMinLength5 implements Filter{
        @Override
        public boolean validate(String element){
            return element.length() >= 5 ;
        }
    }
    //Functional interface:
    private static interface Filter{
        boolean validate(String element);
    }
}
