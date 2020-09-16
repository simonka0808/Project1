/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassessment2.model;


/**
 * subclass of UpdatedContestants
 * stores information about Rabbit objects;
 * @author simona georgieva
 * version 1.1
 */
public class Rabbit extends Contestant {
  
    private String breed;
    private String colour;  

    public Rabbit(String breed, String colour, String nameCont, double weigth, Owner owner) {
        super(nameCont, weigth, owner);
        this.breed = breed;
        this.colour = colour;
    }

    public String getBreed() {
        return breed;
    }

    public String getColour() {
        return colour;
         
    }
    
    @Override
    public String toString() {
    	StringBuilder sb = new StringBuilder();
    	sb.append(Rabbit.class.getSimpleName());
    	sb.append(super.toString());
    	sb.append(System.lineSeparator());
    	sb.append(String.format("breed: %s", this.getBreed()));
    	sb.append(System.lineSeparator());
    	sb.append((String.format("colour: %s", this.getColour())));
        return sb.toString();
    }
}
