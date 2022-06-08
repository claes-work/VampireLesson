public class Vampire {

    /** @var firstName String */
    private String firstName;

    /**
     * Constructor for the VampireFamily Class
     *
     * @param name String
     */
    public Vampire (String name) {
        // Set the first name of this vampire, which is required by the constructor method
        setFirstName(name);
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
    public void setFirstName (String name) {
        firstName = name;
    }

}
