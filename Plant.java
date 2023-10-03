package Musseum;

public class Plant extends Specimen{
	private String kindOfPlant;
	private String life_time;
// Constructor

	public Plant(String type, String geo_age, String found_location, String kindOfPlant, String life_time){
		super(type,geo_age,found_location);
		this.kindOfPlant = kindOfPlant;
		this.life_time = life_time;
	}
	
	
	/**
	 * Get life_time.
	 *
	 * @return life_time as String.
	 */
	public String getLife_time()
	{
	    return life_time;
	}
	
	/**
	 * Set life_time.
	 *
	 * @param life_time the value to set.
	 */
	public void setLife_time(String life_time)
	{
	    this.life_time = life_time;
	}
	
	/**
	 * Get kindOfPlant.
	 *
	 * @return kindOfPlant as String.
	 */
	public String getKindOfPlant()
	{
	    return kindOfPlant;
	}
	
	/**
	 * Set kindOfPlant.
	 *
	 * @param kindOfPlant the value to set.
	 */
	public void setKindOfPlant(String kindOfPlant)
	{
	    this.kindOfPlant = kindOfPlant;
	}
}

