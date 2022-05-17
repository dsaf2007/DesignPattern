//2016112154 정동구
public abstract class Customer implements Cloneable{
    private String name;

    public String getName(){
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}