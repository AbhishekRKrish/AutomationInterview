import java.util.*;

// Returns smallest missing integer value in an array

class Solution {
    public int solution(int[] A) {
        int smallestInt = 1;

        if (A.length == 0) return smallestInt;

        Arrays.sort(A);

        if (A[0] > 1) return smallestInt;
        if (A[A.length - 1] <= 0) return smallestInt;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == smallestInt) {
                smallestInt++;
            }
        }

        return smallestInt;
       
}
}
