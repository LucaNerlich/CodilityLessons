package Lessons.StacksAndQueues;

/**
 * Created by lnerlich on 18.05.17.
 */
public class Brackets {



  /**
   * @param input N characters
   * @return 1 = true, 0 = false
   */
  public int solution(String input) {


    /*
    A = (
    B = {
    C = [

    D = ]
    E = }
    F = )
     */

    //todo improve speed by killing loop if error detected

    final char a = '(';
    final char b = '{';
    final char c = '[';
    final char d = ']';
    final char e = '}';
    final char f = ')';


    int counterA = 0;
    int counterB = 0;
    int counterC = 0;

    char[] x = input.toCharArray();
    for (char ch : x) {
      switch (ch) {
        case a:
          counterA++;
          break;
        case b:
          counterB++;
          break;
        case c:
          counterC++;
          break;
        case d:
          counterC--;
          break;
        case e:
          counterB--;
          break;
        case f:
          counterA--;
          break;
      }
      System.out.print(ch);
    }

//    System.out.println();
//    System.out.println(counterA);
//    System.out.println(counterB);
//    System.out.println(counterC);
    int solution = 0;
    if (counterA == 0 && counterB == 0 && counterC == 0) {
      solution = 1;
    }

    return solution;

  }
}


/*
  A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:

        S is empty;
        S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
        S has the form "VW" where V and W are properly nested strings.
        For example, the string "{[()()]}" is properly nested but "([)()]" is not.

        Write a function:

       class Solution { public int solution(String S); }
that, given a string S consisting of N characters, returns 1 if S is properly nested and 0 otherwise.

        For example, given S = "{[()()]}", the function should return 1 and given S = "([)()]", the function should return 0, as explained above.

        Assume that:

        N is an integer within the range [0..200,000];
        string S consists only of the following characters: "(", "{", "[", "]", "}" and/or ")".
        Complexity:

        expected worst-case time complexity is O(N);
        expected worst-case space complexity is O(N) (not counting the storage required for input arguments).

        */