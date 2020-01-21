package Question2;

// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
class Solution {

  // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
  public int generalizedGCD(int num, int[] arr) {
    // WRITE YOUR CODE HERE

    int result = arr[0];
    for (int i = 1; i < num; i++) {
      result = gcd(arr[i], result);

      if (result == 1) {
        return 1;
      }
    }

    return result;
  }

  int gcd(int a, int b) {
    if (a == 0) {
      return b;
    }
    return gcd(b % a, a);
  }
  // METHOD SIGNATURE ENDS
}