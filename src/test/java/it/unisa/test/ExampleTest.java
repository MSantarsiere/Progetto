/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.test;

import it.unisa.progetto.Example;

import org.junit.Test;

/**
 *
 * @author Rembor
 */
public class ExampleTest {

    @Test
    public void test1() {
        new Example().doSomething(1);
    }

    @Test
    public void test2() {
        new Example().doSomething(2);
    }
    
     @Test
    public void test3(){
        new Example().doSomething(22);
    }

}
