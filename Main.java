/*
rm *.class
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {

        System.out.println("Jewels and Stones");
        System.out.println("Solving problems using hashmap");
        System.out.println("");

        Solution solution = new Solution();
        String jewels1 = "aA";
        String stones1 = "aAAbbbb";

        int return_value = solution.numJewelsInStones(jewels1, stones1);

        System.out.println("Output , number of times  = " + return_value); // how to print tree

        String jewels2 = "z";
        String stones2 = "ZZ";

        int return_value2 = solution.numJewelsInStones(jewels2, stones2);

        System.out.println("Output , number of times  = " + return_value2); // how to print tree

    }

}
