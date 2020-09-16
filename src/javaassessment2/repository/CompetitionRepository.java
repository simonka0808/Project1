
package javaassessment2.repository;

/**
 *class that stores information about the contestants
entered into the competition.
* @author Simona Georgieva 1900745
* version 1.1 
 */
import java.util.ArrayList;
import java.util.List;

import javaassessment2.model.Contestant;

public class CompetitionRepository {
	private List<Contestant> contestantList;

	public CompetitionRepository() {
		contestantList = new ArrayList<>();
	}
	
	public List<Contestant> getContestant() {
		return contestantList;
	}

	public void addContestant(Contestant contestant) {
		if (!contestantList.contains(contestant)) {
			contestantList.add(contestant);
			System.out.println(contestant.getNameCont().toUpperCase() + " was added successfully!");
		} else {
			System.out.println("Sorry!" + contestant.getNameCont().toUpperCase() + " is already in the list.");
		}

	}

	public void removeContestant(Contestant contestant) {
		if (contestantList.contains(contestant)) {
			contestantList.remove(contestant);
			System.out.println(contestant.getNameCont().toUpperCase() + " was removed successfully!");
		} else {
			System.out.println(
					"Sorry!" + contestant.getNameCont().toUpperCase() + " is not in the list, it cannot be removed");
		}
	}

	public List<String> getContestantsByOwner(String owner) {
		System.out.println("The following contestants belong to " + owner);
		List<String> listByOwners = new ArrayList<>();
		for (Contestant contestant : contestantList) {
			if (contestant.getOwner().getOwnerName().equals(owner)) {
				listByOwners.add(contestant.getNameCont());
			}
		}
		return listByOwners;
	}

	public List<String> getContestantBySpecificWieght(double weigth) {
		List<String> listByWeight = new ArrayList<>();
		System.out.println("The contestants with " + weigth + " are: " + "\n");

		for (Contestant contestant : contestantList) {
			if (contestant.getWeigth() == weigth) {
				listByWeight.add(contestant.getNameCont());
			}
		}
		return listByWeight;
	}

	public List<String> getContestantsByWeigth(double weigth1, double weigth2) {
		List<String> listByWeigth = new ArrayList<>();
		System.out.println("The contestants which have weigths between " + weigth1 + " and " + weigth2 + " are: ");

		for (Contestant contestant : contestantList) {

			if (contestant.getWeigth() >= weigth1 && contestant.getWeigth() <= weigth2) {
				listByWeigth.add(contestant.getNameCont() + " : " + contestant.getWeigth() + " kg");
			}
		}
		return listByWeigth;
	}

	public List<String> getContestantsByOwnerNationality(String nationality) {

		List<String> listByOwnersNationality = new ArrayList<>();
		for (Contestant contestant : contestantList) {
			if (contestant.getOwner().getNationality().equals(nationality)) {
				listByOwnersNationality.add(contestant.getNameCont());
			}
		}
		return listByOwnersNationality;
	}

	public List<String> getContestantsByOwnerMembership(boolean memberBLCA) {

		List<String> listByMembership = new ArrayList<>();
		for (Contestant contestant : contestantList) {
			if (contestant.getOwner().getMemberBLCA() == true) {
				listByMembership.add(contestant.getNameCont());

			}
		}
		return listByMembership;
	}

	//TODO Fix the problem with contestant !
	public List<String> getContestantBySpecies(Class aSpecies) {

		List<String> contBySpecies = new ArrayList();

		for (Contestant contestant : contestantList) {
			if (aSpecies.getClass().equals(contestant.getClass())) {
				contBySpecies.add(contestant.getNameCont());
			}
		}
		return contBySpecies;
	}

}