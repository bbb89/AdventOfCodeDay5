package com.lukasz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Integer> getInput() {
        List<Integer> jumps = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter jumps: ");
        String number;
        while((number = scanner.nextLine()) != "") {
            try {
                jumps.add(Integer.valueOf(number));
            }catch (NumberFormatException e) {
                break;
            }
        }

        return jumps;
    }

    public static void main(String[] args) {
	    List<Integer> jumps = getInput();
	    Solution solution = new Solution(jumps);
	    SolutionPart2 solution2 = new SolutionPart2(jumps);
        System.out.println("PART I: The exit is reached in " + solution.getNumberOfSteps() + " steps.");
        System.out.println("PART II: The exit is reached in " + solution2.getNumberOfSteps() + " steps.");
    }
}
