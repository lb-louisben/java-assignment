# 6.092 Assignment 2

Foo Corporation needs a program to calculate how much to pay their hourly employees. The US Department of Labor requires
that employees get paid time and a half for any hours over 40 that they work in a single week. For example, if an
employee works 45 hours, they get 5 hours of overtime, at 1.5 times their base pay. The State of Massachusetts requires
that hourly employees be paid at least $8.00 an hour. Foo Corp requires that an employee not work more than 60 hours in
a week.

## Summary of Rules

- An employee gets paid (hours worked) × (base pay), for each hour up to 40 hours.
- For every hour over 40, they get overtime = (base pay) × 1.5.
- The base pay must not be less than the minimum wage ($8.00 an hour). If it is, print an error.
- If the number of hours is greater than 60, print an error message.

## Directions

Create a new class called `FooCorporation`. Write a method that takes the base pay and hours worked as parameters, and
prints the total pay or an error. Write a `main` method that calls this method for each of these employees:

|    Emp     | Base Pay | Hours Worked |
|:----------:|:--------:|:------------:|
| Employee 1 |  $7.50   |      35      |
| Employee 2 |  $8.20   |      47      |
| Employee 3 |  $10.00  |      73      |

## Hint

Do not try to write the entire program in one go. It is much easier to write a small piece and test it, then write
another small piece and test it. For example, start by writing just a skeleton of your method and your main program.
Then add the code to do the normal salary computation, without any special rules. Then add each additional rule, one at
a time. You should test your program with simple test inputs to check that you handle each case. Good luck!
