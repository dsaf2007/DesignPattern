public abstract class Motor {
    private MotorStatus motorStatus;

   public Motor() {
      motorStatus = MotorStatus.STOPPING;
   }
   public MotorStatus getMotorStatus() {
      return motorStatus;
   }
   private void setMotorStatus(MotorStatus motorStatus) {
      this.motorStatus = motorStatus;
   }
   void move(Direction direction) {
      MotorStatus motorStatus = getMotorStatus();
      if (motorStatus == MotorStatus.MOVING)
         return;
      moveMotor(direction);
      setMotorStatus(MotorStatus.MOVING);
   }
private void moveMotor(Direction direction) {
}
public void stop() {
}
}
