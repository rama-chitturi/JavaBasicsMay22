package advanced;

sealed interface PaymentGateway permits UPI, ScanQR, SealedInterfaceDemo {
	

}

non-sealed interface UPI extends PaymentGateway {
	

}

non-sealed interface ScanQR extends PaymentGateway {
	

}
non-sealed class SealedInterfaceDemo implements PaymentGateway{
	
	
}

