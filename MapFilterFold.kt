data class Order(
    val orderId: Int,
    val month: String,
    val amount: Int
)


val orderList = listOf(
    Order(1, "August", 40),
    Order(2, "August", 27),
    Order(3, "September", 44),
    Order(4, "September", 57),
    Order(5, "October", 38),
)

val monthSelected = orderList.filter { it.month == "September"}


val taxAmt = monthSelected.map {(it.amount * 9.5)/ 100}




val aggregateSalesTax = taxAmt.fold(0.0) { acc,tax -> acc+tax} // tax starts with the first element in the list



fun main()
{
println("Tax amounts: $taxAmt")
println("Aggregate Sales Tax: $aggregateSalesTax")

}



   		 
