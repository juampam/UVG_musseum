package Musseum;

public class Mammal extends Specimen{
	private String diete;
	private String habitat;

	public Mammal(String type; String geo_age, String found_location, String diete, String habitat){
		super(type,geo_age,found_location);
		this.diete = diete;
		this.habitat = habitat;
	}

	
	/**
	 * Get diete.
	 *
	 * @return diete as String.
	 */
	public String getDiete()
	{
	    return diete;
	}
	
	/**
	 * Set diete.
	 *
	 * @param diete the value to set.
	 */
	public void setDiete(String diete)
	{
	    this.diete = diete;
	}
	
	/**
	 * Get habitat.
	 *
	 * @return habitat as String.
	 */
	public String getHabitat()
	{
	    return habitat;
	}
	
	/**
	 * Set habitat.
	 *
	 * @param habitat the value to set.
	 */
	public void setHabitat(String habitat)
	{
	    this.habitat = habitat;
	}
}
