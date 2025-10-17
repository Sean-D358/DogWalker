public class DogWalker {
    /**
     * The maximum number of dogs this walker can walk simultaneously
     * per hour
     */
    private int maxDogs;
    /** The dog-walking company this dog walker is associated with */
    private DogWalkCompany company;

    /**
     * Assigns max to maxDogs and comp to company
     * Precondition: max > 0
     */
    public DogWalker(int max, DogWalkCompany comp) {
        maxDogs = max;
        company = comp;
    }
