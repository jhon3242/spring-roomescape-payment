package roomescape.payment.dto;

import roomescape.reservation.controller.dto.ReservationPaymentRequest;

public record PaymentRequest(
        String paymentKey,
        String orderId,
        Long amount
) {
    public PaymentRequest(ReservationPaymentRequest reservationPaymentRequest) {
        this(reservationPaymentRequest.paymentKey(), reservationPaymentRequest.orderId(), reservationPaymentRequest.amount());
    }
}
