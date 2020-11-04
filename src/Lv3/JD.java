package Lv3;

public class JD implements JDInterface{
	@Override
	public void getOrder(String s){
		System.out.println("京东：收到客服订单，准备发货");
		expressage(s);
	}
	
	public void expressage(String s){
		System.out.println("京东：你的" + s + "已发货");
		inform(s);
	}
	
	public void inform(String s){
		System.out.println("京东：你的" + s + "正在派送");
		receiving(s);
	}
	
	public void receiving(String s){
		IInterface i = new I();
		i.getComputer(s);
	}
}
