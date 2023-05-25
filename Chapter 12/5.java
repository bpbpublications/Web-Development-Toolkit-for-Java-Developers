package calc.util;

import java.text.NumberFormat;

public classs NumberFormater{

	public static String format(double number, int minFractionDigits, int maxFractionDigits)
	{
		NUmberFormat format = NumberFormat.getInstance();
		format.setMaximumFormatDigits(maxFractionDigits);
		format.setMinimumFormatDigits(minFractionDigits);
		return format.format(number);
	}
}	