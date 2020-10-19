package me.yevgnenll.op.domain;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Reservation {

  public Reservation(Screening screening, Long numberOf, Long actualPaymentAmount) {

  }

  private Screening screening;
  private Long numberOf;
  private Long actualPaymentAmount;

}
