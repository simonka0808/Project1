package javaassessment2;

import javaassessment2.model.Contestant;
import javaassessment2.model.Owner;
import javaassessment2.model.Rabbit;
import javaassessment2.service.CompetitionService;
import javaassessment2.service.CompetitionServiceImpl;

public class App {

	private static CompetitionService service = new CompetitionServiceImpl();
	
	public static void main(String[] args) {
		
	}
	
	public static void addRabbit() {
		Owner elenaO = new Owner("Elena", "bulgarian", true);
		Contestant zaiko = new Rabbit("RabbitBreed", "white", "Zaiko", 6.9, elenaO);
		service.addContestant(zaiko);
	}
	
	public static void printInfo() {
		service.printAllContestants();// print out summary for all objects(contestants)
		System.out.println("-----------------------");

		service.getContestantsByOwnerNationality("bulgarian");// return an array list of all contestant who have an
																// owner with specific nationality
		System.out.println(service.getContestantsByOwnerNationality("bulgarian"));

		System.out.println(service.getContestantsByOwnerMembership(true));// .....by owners` membership
		System.out.println("-------------------------------");
	}
}