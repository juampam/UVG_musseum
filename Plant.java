package Musseum;

public class Plant extends Specimen{
	private String Type;
	private String life_time;

	public Plant{
	
	}

	
	/**
	 * Get Type.
	 *
	 * @return Type as String.
	 */
	public String getType()
	{
	    return Type;
	}
	
	/**
	 * Set Type.
	 *
	 * @param Type the value to set.
	 */
	public void setType(String Type)
	{
	    this.Type = Type;
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
}

