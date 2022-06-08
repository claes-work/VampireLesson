public class Vampire {

    /** @var firstName String */
    final private String firstName;

    /** @var lastName String */
    final private String lastName;

    /** @var yearOfBirth String */
    final private String yearOfBirth;

    /** @var animalShape String */
    private String animalShape;

    /** @var humanLivesTaken int */
    private int humanLivesTaken = 0;

    /**
     * Constructor for the VampireFamily Class
     *
     * @param firstName String
     * @param lastName  String
     */
    public Vampire (String firstName, String lastName, String yearOfBirth) {
        // Set the first name and last name of this vampire
        // There is no need for a setter method, since the variables are final and strict type anyway
        this.firstName   = firstName;
        this.lastName    = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    /**
     * Get the first name of this vampire
     *
     * @return firstName String
     */
    public String getFirstName () {
        return firstName;
    }

    /**
     * Get the last name of this vampire
     *
     * @return lastName String
     */
    public String getLastName () {
        return lastName;
    }

    /**
     * Get the vampires' year of birth
     *
     * @return yearOfBirth String
     */
    public String getYearOfBirth () {
        return yearOfBirth;
    }

    /**
     * Get the animal shape of this vampire
     *
     * @return animalShape String
     */
    public String getAnimalShape () {
        return animalShape;
    }

    /**
     * Set the animal shape of this vampire
     *
     * @param animal String
     */
    public void setAnimalShape (String animal) {
        animalShape = animal;
    }

    /**
     * Get the count of human lives that this vampire has taken
     *
     * @return humanLivesTaken int
     */
    public int getHumanLivesTaken () {
        return humanLivesTaken;
    }

    /**
     * Add human lives that have been taken by this vampire
     *
     * @param i int
     */
    public void addHumanLivesTaken (int i) {
        humanLivesTaken = humanLivesTaken + i;
    }
}
