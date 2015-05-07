
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


/**
 * @author Nora Osei
 *
 */
public class CalorieTester {

	/**
	 * This is the tester class that interacts with the user.
	 * This project has been created to keep track of food and drink item consumed along with their calorie count
	 * That information is then able to be analyzed and manipulated once the user reads in data or adds their own
	 */
	public static void main(String[] args) throws FileNotFoundException {

		//Meal objects created to hold lists of food in each meal
		Meal breakfast = new Meal();
		Meal lunch = new Meal();
		Meal dinner = new Meal();
		Meal snack = new Meal();
		Meal drink = new Meal();

		//Keeps track of user input given for choices
		int answer = 0;

		//Keeps track of how many calories have been consumed in a day
		int daysTotalCalories = breakfast.totalMealCals() +
				lunch.totalMealCals() +
				dinner.totalMealCals() +
				snack.totalMealCals() +
				drink.totalMealCals();


		System.out.println("Welcome to Nora's Calorie Tracker!");
		System.out.println("You can keep track of the foods/drinks you consume and get some statisitcal information returned");

		System.out.println();
		System.out.println("Welcome to Nora's Calorie Tracker");
		System.out.println("Please type in the corresponding number");
		System.out.println("1 - If you would like to start with a premade list of meals");
		System.out.println("2 - If you would like to start with a blank list of meals ");

		Scanner userNumber = new Scanner(System.in);
		int userAnswer = userNumber.nextInt();


		//Prints a pre made list of items
		if (userAnswer == 1) {
			String breakfastFileName = "breakfast.txt";
			System.out.println("BREAKFAST ITEMS");
			breakfast.readFile(breakfastFileName);
			System.out.println();

			System.out.println("LUNCH ITEMS");
			String lunchFileName = "lunch.txt";
			lunch.readFile(lunchFileName);
			System.out.println();


			System.out.println("DINNER ITEMS");
			String dinnerFileName = "dinner.txt";
			dinner.readFile(dinnerFileName);
			System.out.println();


			System.out.println("SNACK ITEMS");
			String snackFileName = "snacks.txt";
			snack.readFile(snackFileName);
			System.out.println();


			System.out.println("DRINK ITEMS");
			String drinkFileName = "drinks.txt";
			drink.readFile(drinkFileName);


			System.out.println();
			System.out.println("Premade list huh? I see someone is a little lazy..");
			System.out.println("Okay, so above is all the items you have consumed so far.." );
		}

		//Prints empty meal lists which allows users to personalize and put in their own meals
		else {

			String breakfastFileName = "newbreakfast.txt";
			System.out.println("BREAKFAST ITEMS");
			breakfast.readFile(breakfastFileName);
			System.out.println();

			System.out.println("LUNCH ITEMS");
			String lunchFileName = "newlunch.txt";
			lunch.readFile(lunchFileName);
			System.out.println();

			System.out.println("DINNER ITEMS");
			String dinnerFileName = "newdinner.txt";
			dinner.readFile(dinnerFileName);
			System.out.println();

			System.out.println("SNACK ITEMS");
			String snackFileName = "newsnacks.txt";
			dinner.readFile(snackFileName);
			System.out.println();

			System.out.println("DRINK ITEMS");
			String drinkFileName = "newdrinks.txt";
			drink.readFile(drinkFileName);
		}


		while (answer != 12)
		{
			System.out.println();
			System.out.println("Would you like to do now? Type the corresponding number: ");

			//All the choices of options the user can choose
			
			System.out.println("1 - ADD a new item to a meal list?");
			System.out.println("2 - Find the MINIMUM amount of calories eaten in a meal?");
			System.out.println("3 - Find the MAXIMUM amount of calories eaten in a meal?");
			System.out.println("4 - FIND an item?");
			System.out.println("5 - Find the AVERAGE amount of calories you've eaten today?");
			System.out.println("6 - Find the TOTAL AMOUNT of calories you've eaten TODAY?");
			System.out.println("7 - Find the TOTAL AMOUNT calories you've in ONE MEAL?");
			System.out.println("8 - SAVE my calorie data into a text file.");
			System.out.println("9 - SORT the meal from Smallest to Largest?");
			System.out.println("10 - SORT the meal from Largest to Smallest?");
			System.out.println("11 - GRAPH how many items eaten per meal?");
			System.out.println("12- To EXIT");

			Scanner in = new Scanner(System.in);
			answer = in.nextInt();


			{
				//Add a new item to a meal list
				if (answer == 1)
				{
					System.out.println("What is the name of the product you would like to add?");
					Scanner in1 = new Scanner(System.in);
					String name = in1.next();

					System.out.println("How many calories is the product?");
					Scanner in1_2 = new Scanner(System.in);
					int cals = in1_2.nextInt();

					System.out.println("Which meal would you like to add it to?");
					Scanner in1_3 = new Scanner(System.in);
					String meal = in1_3.next();


					Product newProduct = new Product(name, cals);

					if (meal.equals("breakfast")) 

					{
						breakfast.addProduct(newProduct);
						System.out.println(breakfast);
					}

					else if ( meal.equals("lunch"))
					{
						lunch.addProduct(newProduct);
						System.out.println(lunch.toString());
					}
					else if (meal.equals("dinner") )
					{
						dinner.addProduct(newProduct);
						System.out.println(dinner.toString());
					}
					else if ( meal.equals("snack") )
					{
						snack.addProduct(newProduct);
						System.out.println(snack.toString());
					}
					else 
					{
						drink.addProduct(newProduct);
						System.out.println(drink.toString());
					}
				}

			}



			//Find the smallest food product in a meal list
			if (answer == 2) {
				System.out.println("What meal would you like to find your smallest food product in?: ");
				Scanner in2 = new Scanner(System.in);
				String meal = in2.next();

				if (meal.equals("breakfast")) 

				{
					System.out.println("The smallest amount of calories you had for breakfast was: " + breakfast.min() + " Calories");
					System.out.print("That's not bad!");
				}

				else if ( meal.equals("lunch"))
				{
					System.out.println("The smallest amount of calories you had for at lunch was: " + lunch.min() + " Calories");
					System.out.print("That's not bad!");
				}
				else if (meal.equals("dinner") )
				{
					System.out.println("The smallest amount of calories you had at dinner was : " + dinner.min() + " Calories");
					System.out.print("That's not bad!");
				}
				else if ( meal.equals("snack") )
				{
					System.out.println("The smallest amount of calories you had for a snack was: " + snack.min() + " Calories");
					System.out.print("That's not bad!");
				}
				else 
				{
					System.out.println("The smallest amount of calories you had as a drink was: " + drink.min() + " Calories");
					System.out.print("That's not bad!");
				}

			}

			//Find the largest food product in a meal list
			if (answer == 3) {
				System.out.println("What meal would you like to find your largest food product in?: ");
				Scanner in3 = new Scanner(System.in);
				String meal = in3.next();

				if (meal.equalsIgnoreCase("breakfast")) 

				{
					System.out.println("The largest amount of calories you had for breakfast was: " 
							+ breakfast.max() + " Calories. That's a lot!");

				}

				else if ( meal.equalsIgnoreCase("lunch"))
				{

					System.out.println("The largest amount of calories you had for at lunch was: " 
							+ lunch.max() + " Calories. That's a lot!");
				}
				else if (meal.equalsIgnoreCase("dinner") )
				{

					System.out.println("The largest amount of calories you had at dinner was : " 
							+ dinner.max() + " Calories. That's a lot!");
				}
				else if ( meal.equalsIgnoreCase("snack") )
				{
					System.out.println("The largest amount of calories you had for a snack was: " 
							+ snack.max() + " Calories. That's a lot!");

				}
				else 
				{
					System.out.println("The largest amount of calories you had as a drink was: " 
							+ drink.max() + " Calories. That's a lot!");

				}
			}

			//Searches for a given food item consumed in the whole day
			if (answer == 4) {
				System.out.println("What is the name of the item you are looking for? ");
				Scanner in4 = new Scanner(System.in);
				String name = in4.next();

				if (breakfast.find(name)) 
				{
					System.out.println("Yes, you had " +  name + " today during breakfast. Don't you remember?");
				}
				else if (lunch.find(name)) 
				{
					System.out.println("Yes, you had " +  name + " today during lunch. Don't you remember?");
				}
				else if (dinner.find(name)) 
				{
					System.out.println("Yes, you had " +  name + " today during dinner. Don't you remember?");
				}
				else if (snack.find(name)) 
				{
					System.out.println("Yes, you had " +  name + " today as a snack. Don't you remember?");
				}
				else if (drink.find(name)) 
				{
					System.out.println("Yes, you drank " +  name + " today. Don't you remember?");
				}
				else 
					System.out.println("You did not consume " + name + " today. "
							+ "But maybe you should have, " +name+ "'s are great!");
			}

			//Tells user an average how many calories they consume in a day
			if (answer == 5) {

				System.out.println("On average you consume about " + daysTotalCalories + " per day");
			}

			//Tells the user how many calories they consumed today
			if (answer == 6) {

				daysTotalCalories = 		
						breakfast.totalMealCals() +
						lunch.totalMealCals() +
						dinner.totalMealCals() +
						snack.totalMealCals() +
						drink.totalMealCals();

				if (daysTotalCalories > 2000) 
				{
					System.out.println("You have consumed " + daysTotalCalories + " calories today."+ " You know..2000 calories "
							+ "is the daily recommended average...right? Just saying" );
				}

				else 
					System.out.println("You have consumed " + daysTotalCalories + " calories today."+ " You haven't even hit 2000 calories"
							+ " yet...Go to Chick-fil-a!");

			}

			//Returns the total amount of calories for a specific meal
			if (answer == 7) {
				System.out.println("What meal do you want to find the total amount of calories in? ");
				Scanner in7 = new Scanner(System.in);
				String meal = in7.next();


				if (meal.equalsIgnoreCase("breakfast")) 

				{
					System.out.println("You've consumed " + breakfast.totalMealCals() + " calories for breakfast today.");
				}

				else if ( meal.equalsIgnoreCase("lunch"))
				{
					System.out.println("You've consumed " + lunch.totalMealCals() + " calories for lunch today.");
				}
				else if (meal.equalsIgnoreCase("dinner") )
				{
					System.out.println("You've consumed " + dinner.totalMealCals() + " calories for dinner today.");
				}
				else if ( meal.equalsIgnoreCase("snack") )
				{
					System.out.println("You've consumed " + snack.totalMealCals() + " calories in snacks today.");

				}
				else 
				{
					System.out.println("You've consumed " + drink.totalMealCals() + " calories in liquids today.");
				}
			}

			//Saves meal items to a text file
			if (answer == 8) {

				System.out.println("1 - Save each meal in it's own textfile so you can reimport them");
				System.out.println("2 - Save the day's food/drink consumption in one file with statistical information");
				
				Scanner in8 = new Scanner(System.in);
				int response = in8.nextInt();
				
				if (response == 1) 
				{
					String breakfastFileName = "TodaysBreakfast.txt";
					PrintWriter out1 = new PrintWriter(breakfastFileName);
					String breakfastList = breakfast.toString();
					System.out.println(breakfastList);
					out1.println(breakfastList);
					
					String lunchFileName = "TodaysLunch.txt";
					PrintWriter out2 = new PrintWriter(lunchFileName);
					String lunchList = lunch.toString();
					//System.out.println(lunchFileName);
					out2.println(lunchList);
					
					String dinnerFileName = "TodaysDinner.txt";
					PrintWriter out3 = new PrintWriter(dinnerFileName);
					String dinnerList = dinner.toString();
					//System.out.println(dinnerFileName);
					out3.println(dinnerList);
					
					String snackFileName = "TodaysSnack.txt";
					PrintWriter out4 = new PrintWriter(snackFileName);
					String snackList = snack.toString();
					System.out.println(snackList);
					out4.println(snackList);
					
					String drinkFileName = "TodaysDrink.txt";
					PrintWriter out5 = new PrintWriter(drinkFileName);
					String drinkList = drink.toString();
					System.out.println(drinkList);
					out5.println(drinkList);
					
					out1.close();
					out2.close();
					out3.close();
					out4.close();
					out5.close();
					
				}
					
				else 
				{
					System.out.print("Output file: ");
					Scanner console2 = new Scanner(System.in);
					String outputFileName = console2.next();
					PrintWriter out = new PrintWriter(outputFileName);

					String allFood = breakfast.toString() + lunch.toString() + dinner.toString()
							+ snack.toString() + drink.toString();
	
					int totalcals = breakfast.totalCals + lunch.totalCals 
							+ dinner.totalCals + snack.totalCals + drink.totalCals;
					
					System.out.println("Done");
					
					out.println("Items consumed today:");
					out.println();
					out.print(allFood);
					
					out.println();
					out.println("You consumed " + breakfast.totalCals + " for breakfast.");
					out.println(lunch.totalCals + " calories for lunch.");
					out.println(dinner.totalCals + " calories for dinner.");
					out.println(snack.totalCals + " calories in snacks.");
					out.println(drink.totalCals + " calories in drinks.");
					out.println("Total Calories Eaten Today: " + totalcals);
					
					out.close();
				}
				
				
				

			}

			//Sorts the items in a meals from smallest to largest
			if (answer == 9) {
				System.out.println("What meal do you want to sort from smallest to largest? ");
				Scanner in9 = new Scanner(System.in);
				String meal = in9.next();


				if (meal.equalsIgnoreCase("breakfast")) 

				{
					breakfast.sortLH();
					System.out.println(breakfast);
				}

				else if ( meal.equalsIgnoreCase("lunch"))
				{
					lunch.sortLH();
					System.out.println(lunch);
				}
				else if (meal.equalsIgnoreCase("dinner") )
				{
					dinner.sortLH();
					System.out.println(dinner);
				}
				else if (meal.equalsIgnoreCase("snack") )
				{
					snack.sortLH();
					System.out.println(snack);
				}
				else 
				{
					drink.sortLH();
					System.out.println(drink);
				}
			}

			//Sorts the items in a meal from largest to smallest
			if (answer == 10) {
				System.out.println("What meal do you want to sort from largest to smallest? ");
				Scanner in10 = new Scanner(System.in);
				String meal = in10.next();


				if (meal.equalsIgnoreCase("breakfast")) 

				{
					breakfast.sortHL();
					System.out.println(breakfast);
				}

				else if ( meal.equalsIgnoreCase("lunch"))
				{
					lunch.sortHL();
					System.out.println(lunch);
				}
				else if (meal.equalsIgnoreCase("dinner") )
				{
					dinner.sortHL();
					System.out.println(dinner);
				}
				else if ( meal.equalsIgnoreCase("snack") )
				{
					snack.sortHL();
					System.out.println(snack);
				}
				else 
				{
					drink.sortHL();
					System.out.println(drink);
				}
			}

			//Graphs how many items have been consumed in each meal
			if (answer == 11) {
				System.out.println();
				System.out.println("Breakfast| " + breakfast.graph());
				System.out.println("Lunch    | " + lunch.graph());
				System.out.println("Dinner   | " + dinner.graph());
				System.out.println("Snacks	 | " + snack.graph());
				System.out.println("Drinks	 | " + drink.graph());
				System.out.println("         ____________________________________________________");
				System.out.println("           1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20");
				System.out.println("           How Many Items Have Been Consumed In Each Meal");
			}

			//Ends the program
			if (answer == 12) {
				System.out.println();
				System.out.println("Bye!");

			}
			//console.close();	
		}

	}

}






