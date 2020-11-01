public class demoloops {
    public static void main(String[] args) {
        //loops are used when you need to do a same task repeatedly

        //FOR loop

        for(int i=0; i<=5;i++)//for (initializatin;condition;increment)
        {
            System.out.println(i);
        }

        //While loop

        int j=1;
        while(j<=10)
        {
            System.out.println(j);
            j++;
        }

        //while infinit loop

        boolean b=true;
        int i=10;
         while(b)
         {
             System.out.println(i);
             i++;
             if (i == 25) 
                break;
         }
        //Do while......it is used when you dont know the condition to stop before starting the first iteration
        //It first execute the statement and then check the condition

        do
        {
            System.out.println(i);
            i++;
        }while(i<=50);
    }
    
}
