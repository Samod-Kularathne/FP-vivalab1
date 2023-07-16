object TemperatureConversion {
  def main(args: Array[String]): Unit = {
    val celsius = 35
    val fahrenheit = convertCelsiusToFahrenheit(celsius)
    println(s"$celsius°C is equivalent to $fahrenheit°F")
  }

  def convertCelsiusToFahrenheit(celsius: Double): Double = {
    celsius * 1.8 + 32
  }
}


