object RunningTime {
  def main(args: Array[String]): Unit = {
    val easyPaceDistance = 2 // km
    val tempoDistance = 3 // km
    val totalTime = calculateRunningTime(easyPaceDistance, tempoDistance)
    println(s"The total running time is $totalTime minutes")
  }

  def calculateRunningTime(easyPaceDistance: Double, tempoDistance: Double): Double = {
    val easyPaceTimePerKm = 8 // minutes
    val tempoTimePerKm = 7 // minutes

    val totalTime =
      easyPaceDistance * easyPaceTimePerKm +
      tempoDistance * tempoTimePerKm +
      easyPaceDistance * easyPaceTimePerKm

    totalTime
  }
}
