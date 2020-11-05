/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;

/**
 *
 * @author kiry
 */
public class ComparatorClass implements Comparator {

    @Override
    public int compare(Object t, Object t1) {
        String o1 = (String) t;
        String o2 = (String) t1;
        if(o1.compareTo(o2) > 0) {
            return -1;}
        else if (o1.compareTo(o2) < 0) {
            return 1;
        } else
        return 0;
    }
    }
    
