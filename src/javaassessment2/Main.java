
package javaassessment2;

import javaassessment2.model.Contestant;
import javaassessment2.model.GuineaPig;
import javaassessment2.model.Owner;
import javaassessment2.model.Rabbit;
import javaassessment2.repository.CompetitionRepository;
import javaassessment2.service.CompetitionService;
import javaassessment2.service.CompetitionServiceImpl;

public class Main {
	public static void main(String[] args) {

		// Creating owner`s objects
		Owner elenaO = new Owner("Elena", "bulgarian", true);
//		Owner suzanaO = new Owner("Suzana", "bulgarian", false);
//		Owner simonaO = new Owner("Simona", "british", true);
//		Owner deaO = new Owner("Dea", "italian", true);
//		Owner lorenzoO = new Owner("Lorenzo", "french", false);

		// Creating contestant`s objects
		Contestant zaiko = new Rabbit("RabbitBreed", "white", "Zaiko", 6.9, elenaO);
//		Contestant oreo = new Contestant("Oreo", 1.350, suzanaO);
//		Contestant ceaser = new Contestant("Ceaser", 1.600, simonaO);
//		Contestant boncho = new Contestant("Boncho", 3.450, deaO);
//		Contestant ronny = new Contestant("Ronny", 0.900, lorenzoO);

		// print out a summary for a specific contestant
		System.out.println(zaiko.contestantInfo());
		System.out.println("-------------------");

		/*
		 * // System.out.println(oreo.contestantInfo()); //
		 * System.out.println("-------------------"); // //
		 * System.out.println(ceaser.contestantInfo()); //
		 * System.out.println("-------------------"); // //
		 * System.out.println(boncho.contestantInfo()); //
		 * System.out.println("-------------------"); // //
		 * System.out.println(ronny.contestantInfo()); //
		 * System.out.println("------------");
		 */
		// Creating competition object and performing the methods;

		// CompetitionRepository comp1 = new CompetitionRepository();

		CompetitionService service = new CompetitionServiceImpl();

		// Filling the array list with objects i have created at the beginning ;
		service.addContestant(zaiko);
//		comp1.addContestant(oreo);
//		comp1.addContestant(oreo);
//		comp1.addContestant(ceaser);
//		comp1.addContestant(boncho);
//		comp1.addContestant(ronny);
		System.out.println("---------------------");

		service.removeContestant(zaiko);// this method removes a contestant from the competition or in other words
										// method which removes an object from array list
		System.out.println("--------------------");

		service.printSummaryForContestants();// return a String representation of all contestants in the competition.
		System.out.println("--------------------");

		System.out.println(service.getContestantsByOwner("Simona"));// return an Array List with all contestants who
																	// belong to a specific owner
		System.out.println("---------------");

		service.classifyContestants();// method which classify the contestant into categories by weigth;
		System.out.println("--------------");

		System.out.println(service.getContestantsByWeigth(0.900, 3.450));// return a list of those contestants which
																			// have
																			// weights between two specified values.
		System.out.println("------------------");

		System.out.println(service.getContestantBySpecificWieght(3.450));//// this method return a list of all
																			//// contestant
																			//// that are in a specified weigth category

		// Creating new object called UpdatedCompetition similar to Competition
		// UpdatedCompetition competition1 = new UpdatedCompetition();

		// Creating new updated contestants objects
//		Contestant upcont1 = new Contestant("Zaiko", 6.900, elenaO);
//		Contestant upcont2 = new Contestant("Oreo", 1.350, suzanaO);
//		Contestant upcont3 = new Contestant("Ceaser", 1.600, simonaO);
//		Contestant upcont4 = new Contestant("Boncho", 3.450, deaO);
//		Contestant upcont5 = new Contestant("Ronny", 0.900, lorenzoO);
//
//		competition1.addContestant(upcont1);
//		competition1.addContestant(upcont2);
//		competition1.addContestant(upcont3);
//		competition1.addContestant(upcont4);
//		competition1.addContestant(upcont5);

		service.printAllContestants();// print out summary for all objects(contestants)
		System.out.println("-----------------------");

		service.getContestantsByOwnerNationality("bulgarian");// return an array list of all contestant who have an
																// owner with specific nationality
		System.out.println(service.getContestantsByOwnerNationality("bulgarian"));

		System.out.println(service.getContestantsByOwnerMembership(true));// .....by owners` membership
		System.out.println("-------------------------------");

		Owner max = new Owner("Max", "icelandic", false);
		Owner david = new Owner("David", "british", false);
		Owner jess = new Owner("Jess", "bolivian", true);
		Owner mark = new Owner("Mark", "maltese", true);

		GuineaPig guineaPig1 = new GuineaPig("short", "Colin the Barbarian ", 0.800, david);
		GuineaPig guineaPig2 = new GuineaPig("long", "Porcellus Decimus Meridius", 1.1, jess);

		Rabbit rabbit1 = new Rabbit("Lionhead", "white", "Fluffy", 1.890, max);
		Rabbit rabbit2 = new Rabbit("Florida", "brown", "Big Ears", 2.256, max);

		// UpdatedCompetition competition2 = new UpdatedCompetition();

		service.addContestant(rabbit1);
		service.addContestant(rabbit2);
		service.addContestant(guineaPig1);
		service.addContestant(guineaPig2);

		service.printAllContestants();// print out only tha names of contestants
		service.printSummaryForContestants();// print out all of the information

//		competition2.identifyContestant(upcont5);// get an error message
		service.identifyContestant(rabbit2);

		service.getContestantBySpecies(Rabbit.class);

		System.out.println(service.getContestantBySpecies(Rabbit.class));
		System.out.println(service.getContestantBySpecies(GuineaPig.class));

		
	}

}
