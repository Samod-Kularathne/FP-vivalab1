object DiskArea {
  def main(args: Array[String]): Unit = {
    val radius = 5
    val area = calculateDiskArea(radius)
    println(s"The area of a disk with radius $radius is $area")
  }

  def calculateDiskArea(radius: Double): Double = {
    val pi = math.Pi
    pi * radius * radius
  }
}
