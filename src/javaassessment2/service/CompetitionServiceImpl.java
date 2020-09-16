package javaassessment2.service;

import java.util.ArrayList;
import java.util.List;

import javaassessment2.model.Contestant;
import javaassessment2.model.GuineaPig;
import javaassessment2.model.Rabbit;
import javaassessment2.repository.CompetitionRepository;

public class CompetitionServiceImpl implements CompetitionService{
	
	CompetitionRepository repository = new CompetitionRepository();

	@Override
	public List<Contestant> getContestant() {
		return repository.getContestant();
	}
	
	@Override
	public void addContestant(Contestant contestant) {
		repository.addContestant(contestant);
	}

	@Override
	public void removeContestant(Contestant contestant) {
		repository.removeContestant(contestant);
	}

	@Override
	public void printSummaryForContestants() {
		String output = "~~~Details of all the contestants in the competition~~~\n";
		for (Contestant contestant : repository.getContestant()) {
			output += contestant.contestantInfo() + "\n";
		}
		System.out.println(output);
	}

	@Override
	public List<String> getContestantsByOwner(String owner) {
		return repository.getContestantsByOwner(owner);
	}

	@Override
	public void classifyContestants() {
		List<String> ligthWeigth = new ArrayList<>();
		List<String> mediumWeigth = new ArrayList<>();
		List<String> heavyWeigth = new ArrayList<>();

		for (Contestant contestant : repository.getContestant()) {

			if (contestant.getWeigth() >= 1.8) {
				heavyWeigth.add(contestant.getNameCont());

			} else if (contestant.getWeigth() > 1 && contestant.getWeigth() <= 1.8) {
				mediumWeigth.add(contestant.getNameCont());

			} else if (contestant.getWeigth() <= 1.0) {
				ligthWeigth.add(contestant.getNameCont());
			}

		}
		System.out.println("Heavy contestants: " + heavyWeigth);
		System.out.println("Medium contestants: " + mediumWeigth);
		System.out.println("Ligth contestants: " + ligthWeigth);
		
	}

	@Override
	public List<String> getContestantBySpecificWieght(double weigth) {
		return repository.getContestantBySpecificWieght(weigth);
	}

	@Override
	public List<String> getContestantsByWeigth(double weigth1, double weigth2) {
		return repository.getContestantsByWeigth(weigth1, weigth2);
	}

	@Override
	public void printAllContestants() {
		String output = "~~~All contestants~~~\n";
		for (Contestant contestant : repository.getContestant()) {
			output += contestant.getNameCont() + "\n";
		}
		System.out.println(output);
	}

	@Override
	public List<String> getContestantsByOwnerNationality(String nationality) {
		return repository.getContestantsByOwnerNationality(nationality);
	}

	@Override
	public List<String> getContestantsByOwnerMembership(boolean memberBLCA) {
		return repository.getContestantsByOwnerMembership(memberBLCA);
	}

	@Override
	public void identifyContestant(Contestant aSpecies) {
		if (aSpecies.getClass().equals(Rabbit.class)) {
			System.out.println("It is a rabbit");
		} else if (aSpecies.getClass().equals(GuineaPig.class)) {
			System.out.println("It is a Guinea Pig");
		} else {
			System.out.println("Please enter a valid species");
		}
		
	}

	@Override
	public List<String> getContestantBySpecies(Class aSpecies) {
		return repository.getContestantBySpecies(aSpecies);
	}

}
