/*
 * 
 *
 *
 */
package javaassessment2.model;

/**
 *A subclass of UpdatedContestants;
 *
 * @author Simona Georgivea
 * version 1.1
 */
public class GuineaPig extends Contestant{
   private String furType;    

    public GuineaPig(String furType, String nameCont, double weigth, Owner owner) {
        super(nameCont, weigth, owner);
        this.furType = furType;
    }

    public String getFurType() {
        return furType;
    }

    @Override
    public String toString() {
    	StringBuilder sb = new StringBuilder();
    	sb.append(GuineaPig.class.getSimpleName());
    	sb.append(super.toString());
    	sb.append(System.lineSeparator());
    	sb.append(String.format("fur type: %s", this.getFurType()));
        return sb.toString();
    }
      
 
}
