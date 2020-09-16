/*
 * @author Simona Georgieva/1900745
 * version 1.1 29.03.2020
 */
package javaassessment2.model;

public abstract class Contestant {

	private String nameCont;
	private double weigth;
	private Owner owner;

	public Contestant(String nameCont, double weigth, Owner owner) {
		setNameCont(nameCont);
		setWeigth(weigth);
		setOwner(owner);

	}

	public String getNameCont() {
		return nameCont;
	}

	public double getWeigth() {
		return weigth;
	}

	public Owner getOwner() {
		return owner;
	}

	private void setNameCont(String nameCont) {
		this.nameCont = nameCont;
	}

	private void setWeigth(double weigth) {
		this.weigth = weigth;
	}

	private void setOwner(Owner owner) {
		this.owner = owner;
	}

	public String contestantInfo() {
		//StringBuilder sb = new StringBuilder();
		String output = "";
		output += " Name of contestant: " + getNameCont() + "\n";
		output += " Weight: " + getWeigth() + " kg." + "\n";
		output += " Owner: " + owner.printOutOwnerClassInfo() + "\n";
		return output;
	}

}
