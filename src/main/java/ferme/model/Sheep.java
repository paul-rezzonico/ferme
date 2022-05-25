package ferme.model;

public class Sheep {
	private String breed;
	private Colour colour;
	private int birthYear;
	private double maximumOutputMilk;
	private double currentMilkAvailable;
	private double maximumAmountOfWool;
	private double currentWoolAvailable;

	public Sheep(String breed, Colour colour, int birthYear, double maximumOutputMilk, double maximumAmountOfWool) {
		this.breed = breed;
		this.colour = colour;
		this.birthYear = birthYear;
		this.maximumOutputMilk = maximumOutputMilk;
		this.currentMilkAvailable = 0;
		this.maximumAmountOfWool = maximumAmountOfWool;
		this.currentWoolAvailable = 0;

	}

	public Sheep(String breed, int birthYear, double maximumOutputMilk, double maximumAmountOfWool) {
		this(breed, Colour.WHITE, birthYear, maximumOutputMilk, maximumAmountOfWool);
	}

	// Cette méthode simule ce qui se passe lorsque la brebis mange pendant
	// une heure
	
	public void eat() {
		this.currentMilkAvailable += this.maximumOutputMilk / 15;
		if (this.currentMilkAvailable > this.maximumOutputMilk) {
			this.currentMilkAvailable = this.maximumOutputMilk;
		}

		this.currentWoolAvailable += 10;
		if (this.currentWoolAvailable > this.maximumAmountOfWool) {
			this.currentWoolAvailable = this.maximumAmountOfWool;
		}

	}

	// Cette méthode permet au fermier de récupérer le lait d’une brebis
	public double milk() {
		double milkRetrieved = this.currentMilkAvailable;
		this.currentMilkAvailable = 0;
		return milkRetrieved;
	}

	// Cette méthode indique si la brebis est prête à se débarrasser de son lait
	public String readyToMilk() {
		String readyToMilk = "Baaaaah! I could still eat!";
		if (this.currentMilkAvailable > this.maximumOutputMilk - 10) {
			readyToMilk = "Baaaaah! Now's a good time to milk me!";
		}
		return readyToMilk;
	}

	// Cette méthode permet au fermier de récupérer la laine d’une brebis
	public double sheer() {
		double woolRetrieved = this.currentWoolAvailable;
		this.currentWoolAvailable = 0;
		return woolRetrieved;
	}

	// Cette méthode indique si la brebis est prête à se débarrasser de sa laine
	public String readyToSheer() {
		String readyToSheer = "Baaaaah! I could still grow some wool!";
		if (this.currentWoolAvailable > this.maximumAmountOfWool - 5) {
			readyToSheer = "Baaaaah! I'm ready to get rid of my coat now!";
		}
		return readyToSheer;
	}

	public double getCurrentMilkAvailable() {
		return this.currentMilkAvailable;
	}

	public double getCurrentWoolAvailable() {
		return this.currentWoolAvailable;
	}

}
