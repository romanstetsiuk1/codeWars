package EqualSidesOfAnArray;

/*
    You are going to be given an array of integers. Your job is to take that array and find an index N where
    the sum of the integers to the left of N is equal to the sum of the integers to the right of N.
    If there is no index that would make this happen, return -1.
 */

public class Kata {

    public static int findEvenIndex(int[] arr) {
        int sumBefforIndex = 0, sumAfterIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                sumAfterIndex += arr[j];
            }

            if (sumBefforIndex == sumAfterIndex) {
                return i;
            } else {
                sumBefforIndex += arr[i];
                sumAfterIndex = 0;
            }
        }

        return -1;
    }

    /*
    another way:

    public static int findEvenIndex(int[] arr) {
        int sumRight = Arrays.stream(arr).sum() - arr[0];
        if(sumRight==0)return 0;
        int sumLeft = 0;
        for (int i = 1; i < arr.length; i++) {
            sumLeft += arr[i-1];
            sumRight -= arr[i];
            if (sumLeft == sumRight) return i;
        }
        return -1;
    }
     */

}
