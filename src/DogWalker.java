public class DogWalker {
    /**
     * The maximum number of dogs this walker can walk simultaneously
     * per hour
     */
    private int maxDogs;
    /**
     * The dog-walking company this dog walker is associated with
     */
    private DogWalkCompany company;

    /**
     * Assigns max to maxDogs and comp to company
     * Precondition: max > 0
     */
    public DogWalker(int max, DogWalkCompany comp) {
        maxDogs = max;
        company = comp;
    }
    public int walkDogs(int hour) {
        int dogs = company.numAvailableDogs(hour);
        if (dogs < maxDogs)
        {
        return dogs;
    }
    /**
    * Decreases, by numberDogsWalked, the number of dogs available for a walk
    * during the time specified by hour
    * Preconditions: 0 <= hour <= 23
    * numberDogsWalked > 0
    */
    public void updateDogs(int hour, int numberDogsWalked)
    {
        schedule[hour] -= numberDogsWalked;
    }
}

