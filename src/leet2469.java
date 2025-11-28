class Solution2469 {
    /*
    *   Kelvin = Celsius + 273.15
    *   Fahrenheit = Celsius * 1.80 + 32.00
    *   Input: celsius = 36.50   Output: [309.65000,97.70000]
    *
    * */
    public double[] convertTemperature(double celsius) {
        return new double[]{celsius + 273.15,celsius * 1.80 + 32.00 };
    }
}