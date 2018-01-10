public class One
{
    public static void main(String args[])
    {
        int arr[]=new int[5];
        int i;
        arr[0]=2;
        arr[1]=4;
        arr[2]=6;
        arr[3]=8;
        arr[4]=10;
        int[] arr2=arr;
        dosum(arr);
        dosum(arr2);
        for(i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        
        for(i=0;i<arr2.length;i++)
        {
            System.out.println(arr2[i]);
        }
    }
    public static void dosum(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=arr[i]+2;  
              }
    }
}