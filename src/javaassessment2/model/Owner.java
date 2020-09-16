
package javaassessment2.model;

public class Owner {
	private String ownerName;
	private String nationality;
	private boolean memberBLCA;

	public Owner(String ownerName, String nationality, boolean memberBLCA) {
		this.ownerName = ownerName;
		this.nationality = nationality;
		this.memberBLCA = memberBLCA;

	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getNationality() {
		return nationality;
	}

	public boolean getMemberBLCA() {
		return memberBLCA;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public void setMemberBLCA(boolean memberBLCA) {
		this.memberBLCA = memberBLCA;
	}

	public String printOutOwnerClassInfo() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("Owner: %s", this.getOwnerName()));
		sb.append(System.lineSeparator());
		sb.append(String.format("Nationality: %s", this.getNationality()));
		sb.append(System.lineSeparator());
		sb.append(String.format("Member BLCA: %b", this.getMemberBLCA()));
		return sb.toString();
		
	}

}
