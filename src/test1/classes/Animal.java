/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.classes;

/**
 *
 * @author admin
 */
abstract public class Animal implements Sleepable{
    private String nom;
    abstract public void manger();
    abstract public void bouger();
}
