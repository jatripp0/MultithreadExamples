/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 * Exercise 4.21
 * @author Johnathan Tripp (╯°□°）╯︵ ┻━┻
 */
public class Driver {
    
    private static int[] arr;
    private static int r1,r2,r3;
    
    public static void main(String[] args) {
        if(args.length > 0){
            if(Integer.parseInt(args[0]) < 0)
                System.err.println(args[0] + " must be >= 0.");
            else {
                arr = new int[args.length];
                for(int i=0; i<args.length; i++){
                    arr[i] = Integer.parseInt(args[i]);
                }
                Result res1 = new Result();
                Result res2 = new Result();
                Result res3 = new Result();
                Thread thrd1 = new Thread(new Average(arr, res1));
                Thread thrd2 = new Thread(new Minimum(arr, res2));
                Thread thrd3 = new Thread(new Maximum(arr, res3));
                thrd1.start();
                thrd2.start();
                thrd3.start();
                try{
                    thrd1.join();
                    r1 = res1.getResult();
                    System.out.println("The average of the numbers is: " + r1);
                    thrd2.join();
                    r2 = res2.getResult();
                    System.out.println("The minimum of the numbers is: " + r2);
                    thrd3.join();
                    r3 = res3.getResult();
                    System.out.println("The maximum of the numbers is: " + r3);
                } catch (InterruptedException ie){}                
            }
        }
    }
}
