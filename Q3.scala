object SphereVolume {
  def main(args: Array[String]): Unit = {
    val radius = 5
    val volume = calculateSphereVolume(radius)
    println(s"The volume of a sphere with radius $radius is $volume")
  }

  def calculateSphereVolume(radius: Double): Double = {
    val pi = math.Pi
    (4.0 / 3.0) * pi * math.pow(radius, 3)
  }
}
