public class PostPreInc {
    public static void main(String[] args)
    {
        int i=5;
        int j=i++; //here i is first assigned to j then incremented
        System.out.println(j);
        j=++i ; //here i is first incremented then assigned to j
        System.out.println(j);
    }
}
