object WholesaleCost {
  def main(args: Array[String]): Unit = {
    val coverPrice = 24.95
    val discount = 0.4
    val numCopies = 60
    val shippingCostFirst50 = 3
    val shippingCostPerAdditional = 0.75

    val discountedPrice = coverPrice * (1 - discount)
    val shippingCost =
      if (numCopies <= 50)
        shippingCostFirst50
      else
        shippingCostFirst50 + (numCopies - 50) * shippingCostPerAdditional

    val totalCost = shippingCost + discountedPrice * numCopies 
    println(s"The total wholesale cost for $numCopies copies is Rs. $totalCost")
  }
}
