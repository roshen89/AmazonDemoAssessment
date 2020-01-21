package Question1;

/**
 * @author ROSH - 1/22/2020
 */
// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution {

  // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
  public List<Integer> cellCompete(int[] states, int days) {
    // WRITE YOUR CODE HERE
    for (int j = 0; j < days; j++) {
      int[] nextDay = new int[states.length];
      for (int i = 0; i < states.length; i++) {

        int next;
        int previous;

        if (i == 0) {
          previous = 0;
        } else {
          previous = states[i - 1];
        }

        if (i == states.length - 1) {
          next = 0;
        } else {
          next = states[i + 1];
        }

        if (previous == next) {
          nextDay[i] = 0;
        } else {
          nextDay[i] = 1;
        }
      }
      states = nextDay;
    }

    return this.toList(states);
  }

  public List<Integer> toList(int[] ints) {
    return Arrays.stream(ints).boxed().collect(Collectors.toList());
  }
  // METHOD SIGNATURE ENDS
}