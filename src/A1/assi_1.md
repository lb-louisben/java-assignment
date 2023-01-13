# 6.092 Assignment 1

In this assignment, you will create a program that computes the distance an object will fall in Earth's gravity.

## Part One

-
    1. Create a new class called `GravityCalculator`.
-
    2. Copy and paste the following initial version:

```java
class GravityCalculator {
    public static void main(String[] arguments) {
        double gravity = -9.81; // Earth's gravity in m/s^2 double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;
        System.out.println("The object's position after " + fallingTime +
                " seconds is " + finalPosition + " m.");
    }
}
```

-
    3. Run it in IDEA.

What is the output of the unmodified program? Include this as a comment in the source code of your submission.

## Part Two

Modify the example program to compute the position of an object after falling for 10 seconds, outputting the position in
meters. The formula in Math notation is:
`x(t) = 0.5 × at^2 + v_i*t + x_i`

| Variable | Meaning                | Value |
|----------|------------------------|-------|
| a        | Acceleration (m/s2)    | -9.81 |
| t        | Times(s)               | 10    |
| v_i      | Initial Velocity (m/s) | 0     |
| p_i      | Initial Position (m)   | 0     |

*Note*: the correct value is -490.5 m. Java will output more digits after the decimal place, but that is unimportant.

