public class pattern {
    public static void main(String[] args) {

        /*This for loops will print the following pattern..

        *  *  *  *  * 
        *  *  *  *  * 
        *  *  *  *  * 
        *  *  *  *  * 
        *  *  *  *  * 
        
        */
        for(int i=0;i<=4;i++) // no. of rows
        {
            for(int j=0;j<=4;j++)// no. of columns
            {
                System.out.printf(" * "); //print the pattern
            }
            System.out.println("");//new line character...
        }

        System.out.printf("\n\n");

        /* This for loops will print the following pattern

        * 
        *  * 
        *  *  * 
        *  *  *  * 

        */

        for(int i=1;i<=4;i++)  // no. of rows
        {
            for(int j=1;j<=i;j++)  // no. of cols
            {
                System.out.printf(" * ");
            }
            System.out.println(""); //new line character
        }

        System.out.printf("\n\n");

        /* The loop condition will be printing the following patter

        *  *  *  * 
        *        * 
        *        * 
        *  *  *  * 
        
        */

        for(int i=1;i<=4;i++)  // no. of rows
        {
            for(int j=1;j<=4;j++)  // no. of cols
            {
                if(i==1 | i==4 | j==1 | j==4) //print * if i is 1 or 4 or if j is 1 or 4
                System.out.printf(" * ");
                else
                System.out.printf("   ");//space character...
            }
            System.out.println();//new line character...
        }


        System.out.printf("\n\n");

        /* The for loop will print the following patter

        1  2  3  4 
        2  3  4  1 
        3  4  1  2 
        4  1  2  3 

        */
        
        
        for(int i=1;i<=4;i++)  // no. of rows
        {
            int k=i;
            for(int j=1;j<=4;j++)  // no. of cols
            {
                if(k>4)
                    k=1;    //if value of k increases by 4 then replace it by 1
                System.out.printf(" %d ",k++); //print statement
            }
            System.out.println("");
        }

        System.out.printf("\n\n");

        /* The for loops will be giving the following output

        1 
        0  1 
        1  0  1 
        0  1  0  1 
        1  0  1  0  1 

        */
        for(int i=1;i<=5;i++)  // no. of rows
        {
            for(int j=1;j<=i;j++)  // no. of cols
            {   
                if((i+j)%2==0)
                    System.out.print(" 1 "); // print 1 if i+j is even
                else
                    System.out.print(" 0 "); //print 0 if i+j is odd
            }
            System.out.println(""); //new line character
        }

        System.out.printf("\n\n");

    }
    
}
