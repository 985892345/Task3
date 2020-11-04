package Lv3;

public class I implements Customer {

	public void buyComputer(String s, Shop shop){
		System.out.println("我选择在" + shop.getName() + "购买" + s + "电脑");
		shop.getOrder(s, this);
	}

	@Override
    public void getComputer(String s){
		System.out.println("我得到了" + s + "电脑");
    }
}
