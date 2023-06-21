package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide < 1 || secondSide < 1 || thirdSide < 1 || firstSide + secondSide < thirdSide ||
                firstSide + thirdSide < secondSide || secondSide + thirdSide < firstSide) {
            System.out.println("it's not a triangle");
        } else {
            System.out.println("this is a valid triangle");
        }
    }
}
