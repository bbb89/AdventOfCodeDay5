package com.lukasz;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<Integer> jumps;
    private int currentPosition;
    private int currentPositionValue;
    private int numberOfSteps;

    public Solution(List<Integer> jumps) {
        this.jumps = new ArrayList<>(jumps);
        currentPosition = 0;
        numberOfSteps = 0;

        turnOnCPU();
    }

    private void turnOnCPU() {
        while (true) {
            try {
                jump();
            }catch (IndexOutOfBoundsException e) {
                break;
            }
        }
    }

    private void jump() throws IndexOutOfBoundsException {
        currentPositionValue = jumps.get(currentPosition);
        numberOfSteps++;
        jumps.set(currentPosition, currentPositionValue + 1);
        currentPosition += currentPositionValue;
    }


    public int getNumberOfSteps() {
        return numberOfSteps;
    }
}
