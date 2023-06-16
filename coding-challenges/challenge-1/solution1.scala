package lecture

object FirstObject {

  def computeShippingCost(input: Double): Double = {
    val base: Double = 30.0
    if (input> base) {
      5.0 + (input-base)*0.25
    } else {
      5.0
    }
  }
}