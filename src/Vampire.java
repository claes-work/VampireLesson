public class Vampire {

    /** @var firstName String */
    private String firstName;

    /** @var firstName String */
    private String surname;

    /**
     * Constructor for the VampireFamily Class
     *
     * @param firstName String
     * @param surname   String
     */
    public Vampire (String firstName, String surname) {
        // Set the first name of this vampire, which is required by the constructor method
        setFirstName(firstName);
        setSurname(surname);
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
     * Get the surname of this vampire
     *
     * @return surname String
     */
    public String getSurname () {
        return surname;
    }

    /**
     * Set the surname of this vampire
     */
    public void setSurname (String thisSurname) {
        surname = thisSurname;
    }

}
