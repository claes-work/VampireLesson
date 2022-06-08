public class VampireFamily {

    /** @var familyName String */
    private String familyName;

    /** @var familyMembers Vampire[] */
    private Vampire[] familyMembers = new Vampire[100];

    /**
     * Constructor for the VampireFamily Class
     *
     * @param name String
     */
    public VampireFamily (String name) {
        // Set the family name, which is required by the constructor method
        setFamilyName(name);
    }

    /**
     * Get the name of this vampire family
     *
     * @return name String
     */
    public String getFamilyName () {
        return familyName;
    }

    /**
     * Set the name of this vampire family
     */
    public void setFamilyName (String name) {
        familyName = name;
    }

    /**
     * Get the array that holds all family members
     *
     * @return name Vampire[]
     */
    public Vampire[] getFamilyMembers () {
        return familyMembers;
    }

    /**
     * Set the array that already holds, or will hold the family members
     *
     * @param familyMemberArray Vampire[]
     */
    public void setFamilyMembers (Vampire[] familyMemberArray) {
        familyMembers = familyMemberArray;
    }
}