package polymorphism4;

public class AppleSpeaker implements Speaker{
	public AppleSpeaker() {
		System.out.println("===> AppleSpeaker ����");
	}
	public void volumeUp() {
		System.out.println("AppleSpeaker---�Ҹ� �ø���.");
	}
	public void volumeDown() {
		System.out.println("AppleSpeaker---�Ҹ� ������.");
	}
}
