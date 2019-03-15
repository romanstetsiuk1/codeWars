package FindTheOddInt;

/*
Given an array, find the int that appears an odd number of times.

There will always be only one integer that appears an odd number of times.
 */


public class FindOdd {

    public static int findIt(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int Odd = 1;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    Odd++;
                }

            }
            if (Odd % 2 == 0) {
                return a[i];
            }
        }
        return 0;
    }

}


/*
Best answer:

  public static int findIt(int[] A) {
    int xor = 0;
    for (int i = 0; i < A.length; i++) {
      xor ^= A[i];
    }
    return xor;
  }
 */

