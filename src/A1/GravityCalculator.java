package A1;

/**
 * Aim: In this assignment, you will create a program that computes the distance an object will fall in Earth's gravity.
 *
 * What is the output of the unmodified program?
 * Include this as a comment in the source code of your submission.
 *
 *
 * formula in math notation is:
 * x(t) = 0.5 × a*t^2 + v_i*t + x_i
 */

class GravityCalculator {
    public static void main(String[] arguments) {
        double gravity = -9.81; // Earth's gravity in m/s^2 double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;
        // code below
        double initialVelocity = 0.0;
        finalPosition = 0.5 * gravity * fallingTime * fallingTime + initialVelocity * fallingTime + initialPosition;

        System.out.println("The object's position after " + fallingTime +
                " seconds is " + finalPosition + " m.");
    }
}




