//2016112154 정동구
public class HiVolCustomer extends Customer{

    private double discountRate = 1.00;
    private int purchuaseAmount = 2000;

    public double getDicountRate()
    {
        if(this.purchuaseAmount <50){
            return 1.05; //5% 추가지불
        }
        if(this.purchuaseAmount >2000)
        {
           return 0.95; //5% 할인
        }
         return this.discountRate;   
    }

    
}
