package Musseum;

public class Dino extends Specimen{
	private String kindOfDino;
	private double size;
	private double weight;

	public Dino(String type, String geo_age, String found_location String kindOfDino double size double weight ){
	 	super(type, geo_age, found_location);
	 	this.KindOfDino = kindOfDino;
	 	this.size = size;
	 	this.weight = weight;
	}


// getters and setters
	
	/**
	 * Get kindOfdino.
	 *
	 * @return kindOfDino as String.
	 */
	public String getKindOfDino()
	{
	    return kindOfDino;
	}
	
	/**
	 * Set kindOfDino.
	 *
	 * @param type the value to set.
	 */
	public void setKindOfDino(String kindOfDino)
	{
	    this.kindOfDino = kindOfDino;
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
