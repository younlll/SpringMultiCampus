package polymorphism3;

public class FactoryPattern {

	public Object getBean(String id) {
		if(id.equals("lg")) {
			return new LgTV();
		} else if(id.equals("samsung")) {
			return new SamsungTV();
		}
		return null;
	}
}
