

// public class Test{
//     public static void main(String[] args) {
//         int x=2,y=5;
        
//         int exp1= (x*y/x);
//         int exp2= (x*(y/x));

//     System.out.println(exp1+",");
//     System.out.println(exp2);

// }
// }



// public class Test{
//     public static void main(String[] args) {
//         int x=200,y=50,z=100;

//         if(x > y && y > z){
//             System.out.println("Hello ");
//         }
//         if(z > y && z < x){
//             System.out.println("Java ");

//         }
//         if((y+200)< x && (y+150) <z){
//             System.out.println("Hello Java ");
//         }
        

// }
// }



// public class Test{
//     public static void main(String[] args) {
//         int x,y,z;
//         x = y = z = 2;
//         x+=y;
//         y-=z;
//         z/=(x + y);
//         System.out.println(x +" "+ y +" " + z);

// }
// // }


// // public class Test{
// //     public static void main(String[] args){

// //        int x=9,y=12;
// //        int a=2,b=4,c=6;

// //        int exp= 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b * y);
// //        System.out.println(exp); 

        

//     }
// }

// public class Test{
//     public static void main(String[] args){



//     }
// }

// Fibonacci series program in java


// class FibonacciExample1{  
//     public static void main(String args[])  
//     {    
//      int n1=0,n2=1,n3,i,n;    
//      System.out.print(n1+" "+n2);
        
//      for(i=2;i<n;++i)  
//      {    
//       n3=n1+n2;    
//       System.out.print(" "+n3);    
//       n1=n2;    
//       n2=n3;    
//      }    
      
//     }
// }


class Fibonacci {
    static int fib(int n)
    {
        if (n==0)
            return 0;
      else if(n==1 || n==2)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }
 
    public static void main(String args[])
    {
        int n = 7;
        System.out.println(fib(n));
    }
}