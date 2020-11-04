package Lv3;

public class I implements IInterface{
	public static void main(String[] args){
		JDInterface jd = new JD();
		jd.getOrder("联想小新");
	}

	@Override
    public void getComputer(String s){
		System.out.println("我得到了" + s + "电脑");
    }
}
