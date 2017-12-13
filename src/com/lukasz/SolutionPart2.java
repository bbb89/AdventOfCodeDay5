package com.lukasz;

import java.util.ArrayList;
import java.util.List;

public class SolutionPart2 {
    private List<Integer> jumps;
    private int currentPosition;
    private int currentPositionValue;
    private int numberOfSteps;

    public SolutionPart2(List<Integer> jumps) {
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
        changeValueOfCurrentPosition(currentPosition, currentPositionValue);

        currentPosition += currentPositionValue;
    }

    private void changeValueOfCurrentPosition(int currentPosition, int currentPositionValue) {
        if(currentPositionValue >= 3) {
            jumps.set(currentPosition, currentPositionValue - 1);
        }else {
            jumps.set(currentPosition, currentPositionValue + 1);
        }
    }

    public int getNumberOfSteps() {
        return numberOfSteps;
    }
}


