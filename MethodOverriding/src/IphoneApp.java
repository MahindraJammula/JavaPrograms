
public class IphoneApp {

	public static void main(String[] args) {
		Iphone ip = new Iphone();
		ip.os();
		ip.design();

		Iphone4 ip4 = new Iphone4();
		ip4.os();
		ip4.design();
		ip4.playsong();

		Iphone6 ip6 = new Iphone6();
		ip6.os();
		ip6.design();
		ip6.unlockingfingerprint();

		Iphone14 ip14 = new Iphone14();
		ip14.os();
		ip14.design();
		ip14.unlockingface();
	}

}
