// // create a class Footwear which consists of the below attributes.
// //   footwearId=int
// //   footwearName=String
// //   footwearType=String
// //   price =int


// // the above attributes should be private.
// // write getter and setter and parametrised constructor as required.

// // create the class footwearProgrammm with the main method.
// // implement the 2 static methods.getCountByType and
// // getSecondHighestPriceByBrand in the Solution class.


// // getCountByType method:
// //    this method will take two input parameters.
// // array of the Footwear objects and string parameter footwear type.
// // this method will return the count of the footwears from array of the
// // footwear objects for the given type of footwear.
// // if no footwear with the given footwear type is found in the
// // array of footwear abjects,then the method should return 0.



// // getSecondHighestPriceByBrand method:
// //   this method will take 2 input parameters-array of footwear objects and string parameter inputFootwearName.the method
// // will return the second highest footwear objects based on the price from the array of the Footwear objects


// // whose brand name matches with the input string parameter.


// // if no footwear with the given brand is present in the array of the footwear objects,the the method
// // should return null.

// // NOTE: no two footwear objects would have the same footwearId.All the searches should be case insensitive.
// // the above mentioned static methods should be called from the main method.

// // for getCountByType method- the main method should print the count of the footwears ,if the returned value
// // is greater than zero. or it should print "Footwear not available";

// // for getSecondHighestPriceByBrand method-The main method should print price from the returned footwear objects


// // if the returned footwear object is not null.else it should print "Brand not available".
// // for example.
// // 112
// // ABC
// // 25555
// //   where 112 is the footwear id,ABC is brand name,25555 is price.

// // consider the sample input and output.
// // 100
// // Sketchers
// // sneekers
// // 12345
// // 103
// // Puma
// // running shoes
// // 10099
// // 102
// // reebok
// // Running shoes
// // 5667
// // 101
// // Reebok
// // running shoes
// // 5656
// // 99
// // reebok
// // floaters
// // 5666
// // Running shoes
// // reebok

// // Sample output:
// // 3
// // 99
// // reebok
// // 5666

// // Sample input2:

// // 100
// // Puma
// // sneekers
// // 12345
// // 101
// // Puma
// // sneekers
// // 10099
// // 102
// // Puma
// // sneekers
// // 5000
// // 102
// // Reebok
// // sneekers
// // 8000
// // 104
// // Puma
// // floaters
// // 2000
// // running shoes
// // bata

// // Sample output:
// // Footwear not available
// // Brand not available

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Scanner;

// class Solution {

    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("How Many Shoes Youw ");
//         int n = sc.nextInt();
//         Footwear[] footwears = new Footwear[n];
//         for (int i = 0; i < footwears.length; i++) {
//             int id = sc.nextInt();
//             String name = sc.nextLine();
//             String type = sc.nextLine();
//             int price = sc.nextInt();
//             footwears[i] = new Footwear(id, name, type, price);
//         }
      
//         String type = sc.next();
//         int result1 = FootwearProgrammm.getCountByType(footwears, type);
//         System.out.println(result1);
//         String name = sc.next();
//         Footwear result2 = FootwearProgrammm.getSecondHighestPriceByBrand(footwears, name);

// System.out.println(result2);
//     }
    
   

//     class FootwearProgrammm {
//         private static int getCountByType(Footwear[] footwears, String type) {
//             int count = 0;
//             if (footwears == null || type == null)
//                 return count;
//             for (int i = 0; i < footwears.length; i++) {
//                 if (type.equals(footwears[i].type)) {
//                     count++;  
//                 }
//             }
    
//             return count;  
//         }

//         public static Footwear getSecondHighestPriceByBrand(Footwear[] footwears, String name) {
//            if(footwears==null || name==null)
//                return null;
//            int[] price = new int[footwears.length];
//            for (int i = 0; i < price.length; i++) {
//                price[i] = footwears[i].price;
//            }
//            Arrays.sort(price);
//            int second=price[footwears.length-1];
//            for (int i = price.length; i >=0 ; i--) {
//                if (second != price[i]) {
//                    second = price[i];
//                    break;
//                }
//            }
// for (int i = 0; i < footwears.length; i++) {
//     if (name.equals(footwears[i].name) && second==footwears[i].price) {
//         return footwears[i]; 
//     }
// }
// return null;
           
//         }
//     }
// }
//  class Footwear {
   
//      int id;
//      String name;
//      String type;
//      int price;

//      Footwear(int id, String name, String type, int price) {
//          this.id = id;
//          this.name = name;
//          this.type = type;
//          this.price = price;
        
//      }

// }

