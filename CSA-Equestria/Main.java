class Main {

  public static void main(String[] args) {
    System.out.println("\nWelcome to Equestria!");

		//1b. Use the getDistance() method THREE times! to find the distances between the most popular cities and print them out here
		System.out.println("\n(1) The 3 most popular routes in Equestria have distances of .... ");



		//2b. Use the getTripCircumference() method here to find the trip length of the specific circular path that Princess Luna and Celestia plan on taking
		System.out.println("\n(2) Princess Luna & Celestia's circular tour of the kingdom will have a distance of ....");

		//3b. Use the getDistance() method to find the 3 distances between the 3 chosen cities.  Store each distance in a variable.




		//3d. Use the getAngle() function to calculate the 3 angles made between each of the 3 chosen cities.  Store each angle as a variable




		//3e. Print out to the console a summary of the 3 city trip, which should include all 3 distances and all 3 angles!
		System.out.println("\n(3) Here are the directions for Princess Luna's 3-City Trip: \n");


		//[EXT] 4b. Use the longestTrip() method to calculate which leg of the 3 that Fluttershy might have trouble with.  (Use your variables from 3b as parameters here.)
		System.out.println("[EXT] (4) Fluttershy discovered that the longest leg of the trip is... ");


		//5b. Print out the random length of Soarin Skies & Rainbow Dash's vacation
		System.out.println("\n(5) The Soarin-Dash vacation should be .... miles away");








  }


	//getDistance() method used to find the distance between 2 cities in Equestria, given each of their x and y coordinates
	public static double getDistance(int x1, int y1, int x2, int y2){

		double distance = 0.0;		//initial value of 0.0, but should change before being returned

		//1a. calculate the distance between points(x1,y1) and (x2,y2)


		return distance;
	}


	//getTripCircumference() method used to find the distance around any circular path that Princess Luna and Celestia are taking around Equestria.
	public static double getTripCircumference(int diameter){

		double tripCircumference = 0.0;		//initial value of 0.0, but should change before being returned

		//2a. calculate the circumference to find the total length of the trip


		return tripCircumference;
	}


	//getAngle() method used to find the angle between 2 lines of travel when provided with the 3 lines of a triangular path
	public static double getAngle(double ab, double bc, double ac){

		double angleC = 0.0;		//initial value of 0.0, but should change before being returned

		//3c. calculate the angle at point C of the triangle (See worksheet for help with formula)
		

		return angleC;
	}



	//longestTrip() method to find the largest distance among three
	public static double longestTrip(double ab, double bc, double ac){

		double longest = 0.0;

		//[EXT] 4a. calculate the longest distance between the 3 distances


		return longest;

	}


	//getRandomTrip() method to find a random number between 25 and 150 miles
	public static int getRandomTrip(){

		int length = 0;

		//5a. Write an expression to provide the proper random number and store as length


		return length;

	}






}