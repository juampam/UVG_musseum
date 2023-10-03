package Musseum;

public class Dino extends Specimen{
	private String type;
	private double size;
	private double wight;

	public Dino{
	
	}


// getters and setters
	
	/**
	 * Get type.
	 *
	 * @return type as String.
	 */
	public String getType()
	{
	    return type;
	}
	
	/**
	 * Set type.
	 *
	 * @param type the value to set.
	 */
	public void setType(String type)
	{
	    this.type = type;
	}
	
	/**
	 * Get size.
	 *
	 * @return size as double.
	 */
	public double getSize()
	{
	    return size;
	}
	
	/**
	 * Set size.
	 *
	 * @param size the value to set.
	 */
	public void setSize(double size)
	{
	    this.size = size;
	}
	
	/**
	 * Get wight.
	 *
	 * @return wight as double.
	 */
	public double getWight()
	{
	    return wight;
	}
	
	/**
	 * Set wight.
	 *
	 * @param wight the value to set.
	 */
	public void setWight(double wight)
	{
	    this.wight = wight;
	}
}
