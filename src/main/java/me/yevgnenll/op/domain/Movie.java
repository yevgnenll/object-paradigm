package me.yevgnenll.op.domain;

import java.time.Duration;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import me.yevgnenll.op.domain.discount.DiscountCondition;
import me.yevgnenll.op.domain.discount.DiscountPolicy;

@Getter
@EqualsAndHashCode
public class Movie {

  private String title;
  private Long fee;
  private Duration runningTime;

  private List<DiscountCondition> discountConditions;
  private DiscountPolicy discountPolicy;

}
