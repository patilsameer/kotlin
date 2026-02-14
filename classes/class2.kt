/**
 * The code demonstrates the use of sealed classes in Kotlin, which are a powerful way to represent 
 * restricted class hierarchies. 
 * A sealed class can have subclasses, but all of them must be declared in the same file. 
 * This allows for exhaustive when expressions, where the compiler can check if all cases are covered.
 */

sealed class PaymentStatus {
    object Pending : PaymentStatus()
    object Complete : PaymentStatus()
    data class Failed(val reason: String) : PaymentStatus()
}
fun main() {
    val pending: PaymentStatus = PaymentStatus.Pending
    val complete: PaymentStatus = PaymentStatus.Complete
    val failed: PaymentStatus = PaymentStatus.Failed("Insufficient funds")

    listOf(pending, complete, failed).forEach { status ->
        when (status) {
            is PaymentStatus.Pending -> println("Status: Pending")
            is PaymentStatus.Complete -> println("Status: Complete")
            is PaymentStatus.Failed -> println("Status: Failed, reason: ${status.reason}")
        }
    }
}