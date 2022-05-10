enum MotorClass { LG, HYUNDAI }
interface MotorFactory {
    public Motor createMotor(MotorClass motorClass);
}

class ConcreteMotor implements MotorFactory{
    public Motor createMotor(MotorClass motorClass){
        switch(motorClass)
        {
            case LG:
                return new LGMotor();
            case HYUNDAI:
                return new HyundaiMotor();
        }
        return null;
    }
}
