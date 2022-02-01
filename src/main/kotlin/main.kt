fun main() {
    val amount = 100_000_00
    val commissionInPercent = amount / 100 * 0.75
    val commissionСalculation = if(commissionInPercent < 3_500) amount - 3_500 else amount - commissionInPercent
    var result = amount - commissionСalculation.toInt()
    println("Комиссия равна $result копейкам")
}
