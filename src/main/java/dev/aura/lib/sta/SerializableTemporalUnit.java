package dev.aura.lib.sta;

import java.time.Duration;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalUnit;
import lombok.Getter;

public enum SerializableTemporalUnit implements TemporalUnit {
  ;

  @Getter
  private final Duration duration;
  @Getter
  private final boolean durationEstimated;
  
  private SerializableTemporalUnit(Duration duration) {
    this(duration, false);
  }
  
  private SerializableTemporalUnit(Duration duration, boolean durationEstimated) {
    this.duration = duration;
    this.durationEstimated = durationEstimated;
  }

  @Override
  public <R extends Temporal> R addTo(R arg0, long arg1) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public long between(Temporal arg0, Temporal arg1) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public boolean isDateBased() {
    return false;
  }

  @Override
  public boolean isTimeBased() {
    return true;
  }
}
