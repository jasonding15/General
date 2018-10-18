package p5_14;

public class UnitConverter 
{

	private double INCH_TO_METER = 0.0254;
	private double FOOT_TO_METER = 0.3048;
	private double MILE_TO_METER = 1609.344;
	private double MM_TO_METER = 0.001;
	private double CM_TO_METER = 0.01;
	private double KM_TO_METER = 1000;
	private double YD_TO_METER = 0.9144;
	private double M_TO_M = 1;
	
	private double factor;
	
	public UnitConverter(String unit) 
	{
		if(unit.equals("in")) 
		{
			factor = INCH_TO_METER;
		}
		
		else if(unit.equals("ft")) 
		{
			factor = FOOT_TO_METER;
		}
		
		else if(unit.equals("mi")) 
		{
			factor = MILE_TO_METER;
		}
		
		else if(unit.equals("mm")) 
		{ 
			factor = MM_TO_METER;
		}
		
		else if(unit.equals("cm")) 
		{
			factor = CM_TO_METER;
		}
		
		else if(unit.equals("km")) 
		{
			factor = KM_TO_METER;
		}
		
		else if(unit.equals("yd")) 
		{
			factor = YD_TO_METER;
		}
		
		else if(unit.equals("m")) 
		{
			factor = M_TO_M;
		}
	}
	
	public double toMeters(double measurement) 
	{
		return(measurement * factor);
	}
	
	public double fromMeters(double measurement) 
	{
		return (measurement / factor);
	}
	
	
}

