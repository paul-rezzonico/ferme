package ferme.model;

public class Cow {
	private String breed;
	private Colour colour;
	private int birthYear;
	private double maximumOutputMilk;
	private double currentMilkAvailable;

	public Cow(String breed, Colour colour, int birthYear, double maximumOutputMilk) {
		this.breed = breed;
		this.colour = colour;
		this.birthYear = birthYear;
		this.maximumOutputMilk = maximumOutputMilk;
		this.currentMilkAvailable = 0;
	}

	public Cow(String breed, int birthYear, double maximumOutputMilk) {
		this.breed = breed;
		this.colour = Colour.RED;
		this.birthYear = birthYear;
		this.maximumOutputMilk = maximumOutputMilk;
		this.currentMilkAvailable = 0;
	}

	// Cette méthode simule ce qui se passe lorsque la vache mange pendant
// une heure
	public void eat() {
		this.currentMilkAvailable += this.maximumOutputMilk / 15;
		if (this.currentMilkAvailable > this.maximumOutputMilk) {
			this.currentMilkAvailable = this.maximumOutputMilk;
		}

	}

	// Cette méthode permet au fermier de récupérer le lait d’une vache
	public double milk() {
		double milkRetrieved = this.currentMilkAvailable;
		this.currentMilkAvailable = 0;
		return milkRetrieved;
	}

	// Cette méthode indique si la vache est prête à se débarrasser de son lait
	public String readyToMilk() {
		String readyToMilk = "Moooooo! I could still eat!";
		if (this.currentMilkAvailable > this.maximumOutputMilk - 10) {
			readyToMilk = "Moooooo! Now's a good time to milk me!";
		}
		return readyToMilk;
	}

	public double getCurrentMilkAvailable() {
		return this.currentMilkAvailable;
	}

}
