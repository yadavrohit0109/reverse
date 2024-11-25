//reverse coping an array
public class reverse

{
    public static void main(String args[])
    {

        int a[]={5,5,6,9,8,7,4,2,4,5};
        int b[]= new int[20];
        for ( int i=a.length-1 , j=0; i>=0; i--,j++)
        {
            System.out.println(b[i]);
        }
    }
}