/*
 * Name: Clinton Kessey
 * Class: CS1050
 * Description: Animal Rescue Center Analysis - Iteration 02
 */
public class Project02AnimalRescue
{
	public static void main(String[] args)
	{
		Animal animal1 = new Animal("Luna", "Dog", 20.0, 1.50);

		Animal animal2 = new Animal("Rex", "Dog", 100.0, 3.00);

		animal1.displayAnimalAnalysis();
		animal2.displayAnimalAnalysis();
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

	/**
	 * Creates an animal with its basic information.
	 *
	 * @param name            Animal name
	 * @param species         Animal species
	 * @param weight          Weight in pounds
	 * @param dailyFoodAmount Daily food in cups
	 */
	public Animal(String name, String species, double weight, double dailyFoodAmount)
	{
		this.name = name;
		this.species = species;
		this.weight = weight;
		this.dailyFoodAmount = dailyFoodAmount;
	}

	/**
	 * Gets the animal's name.
	 *
	 * @return The animal's name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Gets the animal's daily food amount.
	 *
	 * @return Daily food amount in cups
	 */
	public double getDailyFoodAmount()
	{
		return dailyFoodAmount;
	}

	/**
	 * Gets the animal's weight.
	 *
	 * @return Weight in pounds
	 */
	public double getWeight()
	{
		return weight;
	}

	/**
	 * Gets the animal's species.
	 *
	 * @return The animal's species
	 */
	public String getSpecies()
	{
		return species;
	}

	/**
	 * Calculates the amount of food needed for one week.
	 *
	 * @return Weekly food amount in cups
	 */
	public double calculateWeeklyFood()
	{
		double weeklyFood = dailyFoodAmount * 7;

		return weeklyFood;
	}

	/**
	 * Determines the animal's weight category.
	 *
	 * @return The weight category of the animal
	 */
	public String determineWeightCategory()
	{
		if (weight < 20)
		{
			return "Small";
		} else if (weight < 50)
		{
			return "Medium";
		} else if (weight < 100)
		{
			return "Large";
		} else
		{
			return "Extra Large";
		}
	}

	/**
	 * Displays the animal's information and food analysis.
	 */
	public void displayAnimalAnalysis()
	{
		System.out.println("Name: " + name);
		System.out.println("Species: " + species);
		System.out.printf("Weight: %.2f lbs%n", weight);
		System.out.println("Weight Category: " + determineWeightCategory());
		System.out.printf("Daily Food: %.2f cups%n", dailyFoodAmount);
		System.out.printf("Weekly Food: %.2f cups%n", calculateWeeklyFood());
		System.out.println();
	}
}

//================= RESCUE CENTER CLASS =================
class RescueCenter
{
	private String rescueName;
	private Animal[] animals;
	private int animalCount;

	/**
	 * Creates a rescue center with a specified capacity.
	 *
	 * @param rescueName Name of the rescue center
	 * @param maxAnimals Maximum number of animals
	 */
	public RescueCenter(String rescueName, int maxAnimals)
	{
		this.rescueName = rescueName;
		animals = new Animal[maxAnimals];
		animalCount = 0;
	}

	/**
	 * Gets the name of the rescue center.
	 *
	 * @return Name of the rescue center
	 */
	public String getRescueName()
	{
		return rescueName;
	}

	/**
	 * Gets the current number of animals.
	 *
	 * @return Number of animals in the rescue center
	 */
	public int getAnimalCount()
	{
		return animalCount;
	}

	/**
	 * Adds an animal if the rescue center has available space.
	 *
	 * @param animal The animal to add
	 */
	public void addAnimal(Animal animal)
	{
		if (animalCount < animals.length)
		{
			animals[animalCount] = animal;
			animalCount++;
		} else
		{
			System.out.println("Rescue center is full. Cannot add " + animal.getName());
		}
	}

	/**
	 * Displays the rescue center and all stored animal results.
	 */
	public void displayAnimalResults()
	{
		System.out.println("Rescue Center: " + rescueName);
		System.out.println("Maximum Capacity: " + animals.length);
		System.out.println("Current Animal Count: " + animalCount);
		System.out.println();

		for (int i = 0; i < animalCount; i++)
		{
			animals[i].displayAnimalAnalysis();
		}
	}

	/**
	 * Calculates the total weekly food needed for all animals.
	 *
	 * @return Total weekly food amount in cups
	 */
	public double calculateTotalWeeklyFood()
	{
		double totalWeeklyFood = 0;

		for (int i = 0; i < animalCount; i++)
		{
			double weeklyFood = animals[i].calculateWeeklyFood();
			totalWeeklyFood = totalWeeklyFood + weeklyFood;
		}

		return totalWeeklyFood;
	}

	/**
	 * Calculates the average daily food amount per animal.
	 *
	 * @return Average daily food amount in cups
	 */
	public double calculateAverageDailyFood()
	{
		double totalDailyFood = 0;

		if (animalCount == 0)
		{
			return 0;
		}

		for (int i = 0; i < animalCount; i++)
		{
			double dailyFood = animals[i].getDailyFoodAmount();
			totalDailyFood = totalDailyFood + dailyFood;
		}

		return totalDailyFood / animalCount;
	}

	/**
	 * Displays animals that eat at or above the average daily food amount.
	 *
	 * @param average Average daily food amount
	 */
	public void displayAnimalsAtOrAboveAverageDailyFood(double average)
	{
		System.out.println("Animals At or Above Average Daily Food:");

		for (int i = 0; i < animalCount; i++)
		{
			double dailyFood = animals[i].getDailyFoodAmount();

			if (dailyFood >= average)
			{
				animals[i].displayAnimalAnalysis();
			}
		}
	}

}
