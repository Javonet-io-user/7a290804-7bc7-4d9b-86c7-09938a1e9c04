package jio.System.Diagnostics;

public enum ProcessPriorityClass {
  Normal(32L),
  Idle(64L),
  High(128L),
  RealTime(256L),
  BelowNormal(16384L),
  AboveNormal(32768L),
  ;
  private long numVal;

  ProcessPriorityClass(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
