# RoboticsPreSeason

Assignments List:


1. 
12x12 Multiplication Table:
Print the multiplication table. It should be well formatted, with (relatively) even spacing between the numbers as a 12x12 grid.


2. 
Fizz Buzz: 
Have the computer count from 0 to 100, printing each number unless if meets one of the following conditions
If the number is divisible by 3 and 5, print the word “FizzBuzz” instead of the number
If it is divisible by 5 print the the word Buzz instead of the number
If it is divisible by 3 print the word Fizz instead of the number
If it is not divisible by 3, but has a 3 in it, replace the 3 with the word Fizz (i.e. for 31, print “Fizz1”


3.
Factorials: 
Write a program that will print out the factorial for all numbers from 1 to 100.
Reminder: factorial 4 is 1 x 2 x 3 x 4 (i.e. 24)
 	Note: You may find the higher results for above Factorial 12 generate the wrong result – why do you think this is? How would you solve this problem?


4.
Calculator: 
The calculator introduces human input. You will need to use a command line scanner to get info from the user. Have the user input 2 numbers and then an operation (add, subtract, multiply, and divide), then print the result of the operation. 


5.
Make Change:
Have the user input the price of a number of items, or the letter ‘d’ when done, then have the user enter an amount of cash. Compute the proper change and list the change in descending order of denomination. For example, if the total is $1.60 and the user gives $2, the proper change is one quarter, one dime, and one nickel. If it is 1 of an type (1 dime), do not user plural, but if it is 2 or more use the plural. You should support up to $100 bills for change.


6.
High-Low Guessing Game (Human Guesses):
If you’re not familiar with this game, this is how it works.
1) The computer will think of a number between 1 and 100.
2) You are prompted to guess the number.
3) If you guess wrong, then the computer will tell you if your guess was too high
or too low.
4) You continue guessing until you get it right.
5) Print the number of guesses it took


7.
High-Low Guessing Game (Computer Guesses):
Reimplement the high-low guessing game, but with the human entering high or low and the computer guessing the number. The computer should use an optimal strategy when guessing. Print the number of guesses at then end.


8.
Pet Nursery:
You will implement a pet nursery that takes 2 types of animals, puppies and kittens. Both types of animals shall have the same parent class (Animal) that holds the pets name and age. For puppies, the subclass shall have the breed, and for kittens the subclass shall have the color. The PetNursery class shall hold a number of puppies or kittens, and be able to print the info for all the pets currently being lodged in the nursery.


9.
Arduino:
Complete the following tasks in order:
1) Basic Code: Follow the paper code handout. Add a line that sets the brightness to 25 so that you don’t blind yourself.
2) Rainbow: To create a rainbow, look up the colors on Google and manually assign the colors to the lights
3) Moving Rainbow: To make the rainbow move around the 
4) Fade from Color to Color: This requires creating a state machine. Say you are moving from red to blue through purple, the states would be RedMovingDown, RedMovingUp, BlueMovingDown, and BlueMovingUp. You need to sets of if-then chains, one to see if the state needs to change (for example if red reaches the top, the state changes from RedMovingUp to BlueMovingDown). The second set of if-thens checks the current state and takes and appropriate action, i.e if the state is BlueMovingUp, you would increase the intensity of the blue LEDs. Use variables for the states and the colors.
