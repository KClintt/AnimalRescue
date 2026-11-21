/*
 * Name: [Your Name]
 * Class: CS1050
 * Description: Animal Rescue Center Analysis - Iteration 02
 */
public class Project02AnimalRescue
{
	public static void main(String[] args)
	{
//		displayProgramSummary();
//
//		// ===== TEST 1 =====
//		String fileName = "rescue1.txt";
//		try
//		{
//			RescueCenter rescue = new RescueCenter("Happy Tails Rescue", 5);
//			System.out.println("\nReading file: " + fileName);
//			rescueSetUp(fileName, rescue);
//			runAnalysis(rescue);
//			System.out.println("\nEnding Analysis for: " + rescue.getRescueName());
//			System.out.println("\n");
//		} catch (FileNotFoundException exception)
//		{
//			System.out.println("Error: Unable to find file " + fileName);
//		}
//
//		displayProgramSummary();
//
//		// ===== TEST 2 =====
//		fileName = "rescue2.txt";
//		try
//		{
//			RescueCenter rescue = new RescueCenter("Second Chance Rescue", 3);
//			System.out.println("\nReading file: " + fileName);
//			rescueSetUp(fileName, rescue);
//			runAnalysis(rescue);
//			System.out.println("\n");
//		} catch (FileNotFoundException exception)
//		{
//			System.out.println("Error: Unable to find file " + fileName);
//		}
//
//		System.out.println("\nEnd of program");
//	}
//
//	// ================= SETUP =================
//	public static void rescueSetUp(String fileName, RescueCenter rescue) throws FileNotFoundException
//	{
//		File inputFile = new File(fileName);
//		Scanner fileScanner = new Scanner(inputFile);
//
//		while (fileScanner.hasNext())
//		{
//			// Add code to read the values from the file
//			// Implement using lecture and Dealership Example
//			String name = fileScanner.next();
//			String species = fileScanner.next();
//			double weight = fileScanner.nextDouble();
//			double dailyFoodAmount = fileScanner.nextDouble();
//
//			Animal animal = new Animal(name, species, weight, dailyFoodAmount);
//			rescue.addAnimal(animal);
//		}
//
//		fileScanner.close();
//	}
//
//	// ================= ANALYSIS =================
//	public static void runAnalysis(RescueCenter rescue) throws FileNotFoundException
//	{
//		rescue.displayAnimalResults();
//
//		System.out.println("\n========== " + rescue.getRescueName() + " Food Analysis ==========");
//		System.out.println("Total number of animals: " + rescue.getAnimalCount());
//		System.out.printf("Total weekly food required: %.2f cups%n", rescue.calculateTotalWeeklyFood());
//
//		double average = rescue.calculateAverageDailyFood();
//		System.out.printf("Average daily food amount: %.2f cups%n", average);
//		rescue.displayAnimalsAtOrAboveAverageDailyFood(average);
//		System.out.println("========================================");
//
//		String outputFileName = rescue.getRescueName().replace(" ", "") + ".txt";
//		rescue.writeAnimalsToFile(outputFileName);
//	}
//
//	// ================= DISPLAY =================
//	public static void displayProgramSummary()
//	{
//		System.out.println("**************************************");
//		System.out.println("Animal Rescue Center Analysis");
//		System.out.println("**************************************");
//		System.out.println("Reads animal information from a text file");
//		System.out.println("Displays each animal's weight category and weekly food");
//		System.out.println("Calculates average daily and total weekly food");
//		System.out.println("Writes rescue information and analysis to a file");
//	}
//	// end of main
	}

//================= ANIMAL CLASS =================
//After independently implementing and testing the Animal class,
//add your completed Animal class below.
	/**
	 * Represents an animal in the rescue center. Stores information about the
	 * animal.
	 */
	class Animal
	{
		private String name;
		private String species;
		private double weight;
		private double dailyFoodAmount;

		public Animal(String name, String species, double weight, double dailyFoodAmount)
		{
			this.name = name;
			this.species = species;
			this.weight = weight;
			this.dailyFoodAmount = dailyFoodAmount;
		}

	}

}

//================= RESCUE CENTER CLASS =================
//After independently implementing and testing each RescueCenter
//method, add your completed RescueCenter class below.
