//2016112154 정동구
class Agent
{
	public void placeOrder(Order o)
	{
		o.execute();
	}
}

interface Order{
	public void execute();
}

class StockTrade
{
	public void sell()
	{
		System.out.println("you want to sell stocks");
	}
	public void buy()
	{
		System.out.println("you want to buy stocks");
	}
}

class BuyStockOrder implements Order
{
	StockTrade stock;
	BuyStockOrder(StockTrade s)
	{
		stock = s;
	}
	public void execute()
	{
		stock.buy();
	}
	
}

class SellStockOrder implements Order{
	StockTrade stock;
	SellStockOrder(StockTrade s)
	{
		stock = s;
	}
	public void execute()
	{
		stock.sell();
	}
}


public class Command {
	
	public static void main(String[] args) {

		StockTrade stock = new StockTrade();

		BuyStockOrder buyStockOrder = new BuyStockOrder(stock); SellStockOrder sellStockOrder = new SellStockOrder(stock); Agent agent = new Agent();

		agent.placeOrder(buyStockOrder ); // Buy Shares

		agent.placeOrder(sellStockOrder ); // Sell Shares

		}


}
