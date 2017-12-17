/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.I2GroceryStore;

/**
 *
 * @author Chris
 */
public class Pair<T> {
    private final T key;
    private final T value;
    
    public Pair(T key, T value){
        this.key = key;
        this.value = value;
    }
    
    public boolean equals(Pair<T> that){
        return (   that.getKey().equals(this.key) 
                && that.getValue().equals(this.value));
    }
    
    public T getKey() {return key;}
    public T getValue() {return value;}
}
