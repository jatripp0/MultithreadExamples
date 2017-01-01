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
public class Maximum implements Runnable{
    
    private int[] arr;
    private int max;
    private Result maximum;
    
    public Maximum(int[] arr, Result res){
        this.arr = arr;
        maximum = res;
        max = 0;
    }
    
    public void run(){
        max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        maximum.setResult(max);
    }
}
