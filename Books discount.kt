fun main(){
    println(countDiscount(listOf(1, 1, 2, 2, 3)))
    println(countDiscount(listOf(1, 2)))
    println(countDiscount(listOf(2,2,2,1,1)))
 }
fun countDiscount(list: List<Int>): Double {
    val books: List<Int> = listOf(1, 2 ,3 ,4 ,5)
    val price: Double = 8.0
    var totalPrice: Double = 0.0
    var discount: Double = - 0.05
    var booksToApplyDiscountTo: Double = 0.0
    for (book in books) {
        if (book in list){
            discount += 0.05
            booksToApplyDiscountTo += 1.0
        }
    }
    totalPrice = (price * list.size.toDouble()) - ((booksToApplyDiscountTo * price) * discount)
    return totalPrice
}
