const val MELOMAN = true
const val NOT_MELOMAN = false

fun main() {
    var totalPrice = 0
    printResult(totalPrice, MELOMAN)
    totalPrice = 500_00
    printResult(totalPrice, MELOMAN)
    printResult(totalPrice, NOT_MELOMAN)
    totalPrice *= 2
    printResult(totalPrice, MELOMAN)
    printResult(totalPrice, NOT_MELOMAN)
    totalPrice *= 5
    printResult(totalPrice, MELOMAN)
    printResult(totalPrice, NOT_MELOMAN)
    totalPrice *= 3
    printResult(totalPrice, MELOMAN)
    printResult(totalPrice, NOT_MELOMAN)
}

fun applyDiscount(price: Int, meloman: Boolean): Int {
    return if (price > 10_000_00) {
        (price * 95 / 100) * (if (meloman) 99 else 100) / 100
    } else if (price > 1_000_00) {
        (price - 100_00) * (if (meloman) 99 else 100) / 100
    } else {
        price * (if (meloman) 99 else 100) / 100
    }
}

fun printResult(price: Int, meloman: Boolean) {
    println("Сумма покупки: ${ price / 100} руб. Итого с учетом скидки: ${ applyDiscount(price, meloman) / 100 } руб.")
}