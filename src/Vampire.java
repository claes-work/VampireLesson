public class Vampire {

    /** @var firstName String */
    private String firstName;

    /** @var firstName String */
    private String lastName;

    /**
     * Constructor for the VampireFamily Class
     *
     * @param firstName String
     * @param lastName  String
     */
    public Vampire (String firstName, String lastName) {
        // Set the first name of this vampire, which is required by the constructor method
        setFirstName(firstName);
        setLastName(lastName);
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
     * Set the first name of this vampire
     */
    public void setFirstName (String thisFirstName) {
        firstName = thisFirstName;
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
     * Set the last name of this vampire
     */
    public void setLastName (String thisLastName) {
        lastName = thisLastName;
    }

}
