package Lessons;

import Lessons.StacksAndQueues.Brackets;

public class Main {

    // https://codility.com/programmers/lessons/

    public static void main(String[] args) {
	// write your code here

        Brackets brackets = new Brackets();
        System.out.println("Should be 1:");
        System.out.println(brackets.solution("{[]}"));
        System.out.println("#######");
        System.out.println("Should be 0:");
        System.out.println(brackets.solution("{[}"));
    }
}
