package p9_7;

import p9_1.Measurable;

public class MeasurableMeasurer implements Measurer<Measurable>
{
	public double measure(Measurable anObject)
	{
		return anObject.getMeasure();
	}
}
