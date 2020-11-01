

public class switchcase {
    public static void main(String[] args) {
        int i=6;

        // For integer

        switch(i){
            case 0:System.out.println("zero");
                    break;
            case 1:System.out.println("One");
                    break;
            case 2:System.out.println("Two");
                    break;
            case 3: System.out.println("Three");
                    break;
            case 4:System.out.println("Four");
                    break;
            default:System.out.println("Invalid input");
        }

        //For String onlu valid in java

        String ch= "hii";
        switch(ch){
            case "hii" :System.out.println("hi");
                    break;
            case "hello":System.out.println("hello");
                    break;
            default:System.out.println("Invalid String");
        }
        
    }
    
}
