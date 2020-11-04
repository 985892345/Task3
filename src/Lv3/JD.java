package Lv3;

public class JD implements Shop{
	private String name = "京东";

	@Override
	public String getName() {
		return name;
	}

	//收订单
	@Override
	public void getOrder(String s, Customer customer){
		System.out.println("京东：收到客服订单，准备发货");
		expressage(s, customer);
	}

	//发快递
	public void expressage(String s, Customer customer){
		System.out.println("京东：你的" + s + "已发货");
		inform(s, customer);
	}

	//派送
	public void inform(String s, Customer customer){
		System.out.println("京东：你的" + s + "正在派送");
		receiving(s, customer);
	}

	//通知客户收到
	public void receiving(String s, Customer customer){
		customer.getComputer(s);
	}
}
