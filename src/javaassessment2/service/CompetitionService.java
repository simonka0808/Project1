package javaassessment2.service;

import java.util.List;

import javaassessment2.model.Contestant;

public interface CompetitionService {
	
	public List<Contestant> getContestant();
	public void addContestant(Contestant contestant);
	public void removeContestant(Contestant contestant);
	public void printSummaryForContestants();
	public List<String> getContestantsByOwner(String owner);
	public void classifyContestants();
	public List<String> getContestantBySpecificWieght(double weigth);
	public List<String> getContestantsByWeigth(double weigth1, double weigth2);
	public void printAllContestants();
	public List<String> getContestantsByOwnerNationality(String nationality);
	public List<String> getContestantsByOwnerMembership(boolean memberBLCA);
	public void identifyContestant(Contestant aSpecies);
	public List<String> getContestantBySpecies(Class aSpecies);
	
}
