/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs;

import java.time.LocalDate;



/**
 *
 * @author kiry
 */
public class PersonClass implements Person {
    public String name;
    public LocalDate birthDate;

    public PersonClass(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
        
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Object t) {
         PersonClass persons = (PersonClass) t;
        if (name.compareTo(persons.name) == 0) {
            return birthDate.compareTo(persons.birthDate);
        }
        return name.compareTo(persons.name);
    }

    @Override
    public LocalDate getBirthDate() {
        return birthDate;
    }

 @Override
    public String toString() {
        return name + " дата рождения - " + birthDate;
    }   


    
    
    
    
    
    
    
}
