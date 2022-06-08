public class VampireTest {

    /**
     * Main method, that will do some fancy suff
     *
     * @param args String[]
     */
    public static void main (String[] args) {

        // Initialize a new vampire family
        VampireFamily family  = new VampireFamily("Crimsons");

        // Initialize a new vampire
        Vampire vampire = new Vampire(
                "Amber",
                family.getFamilyName(),
                "1862"
        );

        // Set the vampires animal shape
        vampire.setAnimalShape("Fledermaus");

        // Add a count of human lives that the vampire has taken
        vampire.addHumanLivesTaken(12);

        // Print the information about this vampire
        print(vampire);
    }

    /**
     * Print all information of this vampire
     *
     * @param vampire Vampire
     */
    protected static void print(Vampire vampire) {
        System.out.println("Der Vampir mit dem Namen " + vampire.getFirstName() + " " + vampire.getLastName() + ", wurde im Jahr " + vampire.getYearOfBirth() + " geboren und kann die Gestalt einer " + vampire.getAnimalShape() + " annehmen. Er hat bereits " + vampire.getHumanLivesTaken() + " Menschen getoetet.");
    }

    /**
     * Add a vampire to an existing vampire family.
     *
     * @param  thisFamily  VampireFamily
     * @param  thisVampire Vampire
     */
    protected static void addVampireToFamily (
            VampireFamily thisFamily,
            Vampire       thisVampire
    ) {
        // Get the family member array
        Vampire[] familyMemberArray = thisFamily.getFamilyMembers();

        // Iterate through the family member array and check what positions are not used yet
        for (int i = 0; i < familyMemberArray.length; i++) {

            // The first position of the array that is null, can be overwritten with the vampire that should be added to the family
            // NOTE: Since a vampire family can only have one hundred members, any attempts to add a vampire beyond that, won't be considered
            if (familyMemberArray[i] == null) {

                // Set the vampire at this position
                familyMemberArray[i] = thisVampire;
                // Make sure to break the loop, so that the vampire will only be set once
                break;
            }
        }

        // After the vampire has been added to the family members array, update this array by using the setter method
        thisFamily.setFamilyMembers(familyMemberArray);
    }

    /**
     * Print the names of all vampires, that are members of a specific vampire family
     *
     * @param thisFamily VampireFamily
     */
    protected static void printVampireFamily (VampireFamily thisFamily) {

        // Introduce the family by its name
        System.out.println("\nDie Vampir Familie mit dem Namen \"" + thisFamily.getFamilyName() + "\", besteht aus folgenden Vampiren:");

        // Loop through all family members and print each vampire name
        for (int i = 0; i < thisFamily.getFamilyMembers().length; i++) {

            // Get the specific member
            Vampire member = thisFamily.getFamilyMembers()[i];
            // Ensure that the member is a valid vampire object and if so print its first name and surname
            if (member != null) System.out.println("- " + member.getFirstName() + " " + member.getLastName());
        }
    }
}
