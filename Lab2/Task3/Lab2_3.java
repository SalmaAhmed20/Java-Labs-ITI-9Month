
public class Lab2_3
{
    public static void main(String[] args) {
        //int [] arr ={10,50,9,80,55,45,8,90,5,200};
          int [] arr=new int [1000];
          for(int i =0;i<1000;i++)
          {
           arr[i] = (int)(Math.random()*1000);
          }
         
        ArrayAlgorithms araAlgo=new ArrayAlgorithms();
        System.out.println("Minimum Value in Array = "+araAlgo.min(arr));
        
        System.out.println("Maximum Value in Array = "+araAlgo.max(arr));
        
        System.out.println("Index of 80: "+araAlgo.binarySearch(arr, 80));
       

    }
}