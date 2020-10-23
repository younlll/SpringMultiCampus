package polymorphism4;

public class GoogleTV implements TV {
	private Speaker speaker;
	private int price;
	
	public GoogleTV() {
		System.out.println("===> GoogleTV(1) ����");
	}
	
	public GoogleTV(Speaker speaker) {
		System.out.println("===> GoogleTV(2) ����");
		this.speaker = speaker;
	}

	public GoogleTV(Speaker speaker, int price) {
		System.out.println("===> GoogleTV(3) ����");
		this.speaker = speaker;
		this.price = price;
	}

	public void powerOn() {
		System.out.println("GoogleTV---���� �Ҵ�." + price);
	}
	public void powerOff() {
		System.out.println("GoogleTV---���� ����.");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}
}
