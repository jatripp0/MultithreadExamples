/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author Johnathan Tripp (╯°□°）╯︵ ┻━┻
 */
public class Average implements Runnable{
    
    private int[] arr;
    private int sum;
    private Result average;
    
    public Average(int[] arr, Result res){
        this.arr = arr;
        average = res;
        sum = 0;
    }
    
    public void run(){
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        average.setResult(sum/arr.length);
    }
}
