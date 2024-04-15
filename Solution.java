/*
rm *.class
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Solution {

    public int numJewelsInStones(String jewels, String stones) {

        HashSet<Character> hashsetOfJewels = new HashSet<Character>();

        int ans = 0;

        char[] jewelsCharArray = jewels.toCharArray();

        for (int i = 0; i < jewelsCharArray.length; i++) {
            hashsetOfJewels.add(jewelsCharArray[i]);
        }

        char[] stonesCharArray = stones.toCharArray();

        for (int i = 0; i < jewelsCharArray.length; i++) {
            if (hashsetOfJewels.contains(stonesCharArray[i])) {
                ans++;
            }
        }

        return ans;
    }

}
