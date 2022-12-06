/*
Learning Targets:
Students will be able to:

    *Represent iterative processes using a while loop
    *Execute a return or break statement inside an iteration statement to halt the loop and exit the method
    *Develop an algorithm
    *Identify if an integer is or is not evenly divisible by another integer
    *Determine a minimum or maximum value
    *Compute a sum, average, or mode
 */
/*
    Template for while loop

    //initialize loop control variable
    while ( some boolean expression) {
        //loop stuff accessed if boolean expression true
        //more loop stuff
        ...
        //update loop control variable
    }
 */


public class WhileLoopFun {

    public static void main(String[] args) {
        //count to 10

        int counter = 1;
        while(counter <= 10) {
            System.out.print(counter + " ");
            counter++;
        }
        //what does this code loop do? Do this without running it
        int count = 2;
        while(count <= 100){
            System.out.print(count + " ");
            count *= 2;
        }
        System.out.println();
        //write a loop that counts by 5 until you get to 100
        int counta = 0;
        while(counta <= 100){
            System.out.print(counta + " ");
            counta += 5;
        }
        //write a loop that counts down from 10 to 1 then prints "Blast off!"
        int county = 10;
        while(county != 0){
            System.out.print(county + " ");
            county--;
        }
        System.out.println("Blast off!");
        //loop mistakes and while vs do while loop
        //make an infinite loop happen


    }
}
