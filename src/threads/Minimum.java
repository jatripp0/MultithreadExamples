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
public class Minimum implements Runnable{
    
    private int[] arr;
    private int min;
    private Result minimum;
    
    public Minimum(int[] arr, Result res){
        this.arr = arr;
        minimum = res;
        min = 0;
    }
    
    public void run(){
        min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        minimum.setResult(min);
    }
}
