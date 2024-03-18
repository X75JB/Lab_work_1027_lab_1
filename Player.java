package lab1;

public class Player {
    private String name;
    private String position;
    private int jerseyNum;

    /**
     * Constructor to initialize a Player object with the given name, position, and jersey number.
     * 
     * @param name       The player's name.
     * @param position   The player's position.
     * @param jerseyNum  The player's jersey number.
     */
    public Player(String name, String position, int jerseyNum) {
    	 /*
         * This is the constructor so we will be initializing the instance variables here.
         */
    	this.name = name;
        this.position = position;
        this.jerseyNum = jerseyNum;
    }
    
    /**
     * Get the player's name.
     * 
     * @return The player's name.
     */
    public String getName() {
        //Get player name
    	return name;
    }

    public String getPosition() {
        return position;
    }

    public int getJerseyNum() {
        return jerseyNum;
    }
    
    /**
     * Set the player's name.
     * 
     * @param newName The new name to set.
     */
    public void setName(String newName) {
        this.name = newName;
    }

    public void setPosition(String newPosition) {
        this.position = newPosition;
    }

    public void setJerseyNum(int newJerseyNum) {
        this.jerseyNum = newJerseyNum;
    }

    @Override
    public String toString() {
        return this.name + ": #" + this.jerseyNum;
    }

    public boolean equals(Player other) {
        return this.name.equals(other.name) && this.jerseyNum == other.jerseyNum;
    }
}
