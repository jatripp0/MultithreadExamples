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
public class Result {
    private int result;
    
    public int getResult(){
        return result;
    }
    
    public void setResult(int result){
        this.result = result;
    }
    
    public void clear(){
        result = 0;
    }
}
