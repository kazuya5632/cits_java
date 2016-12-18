package task1215;

public class Task1215_3 {
	public static void main(String[] args) {
		SmartPhone useSmartPhone = new SmartPhone();
		useSmartPhone.download();
		useSmartPhone.upload();
		useSmartPhone.music();
		useSmartPhone.mail();
		useSmartPhone.radio();
		useSmartPhone.tell();
	}
}

interface Remotable {
	void upload();
	void download();
}

interface Audio {
	void music();
	void radio();
}

class CellPhone implements Audio {
	public void tell() {
		System.out.println("携帯で電話をする");
	} 
	public void mail() {
		System.out.println("携帯でメールをする");
	}
	public void music() {
		System.out.println("携帯で音楽を聞く");
	}
	public void radio() {
		System.out.println("携帯でラジオを聞く");
	}
}

class SmartPhone extends CellPhone implements Audio, Remotable {
	public void upload() {
		System.out.println("スマートフォンでファイルをアップロードする");
	}
	public void download() {
		System.out.println("スマートフォンでファイルをダウンロードする");
	}
	public void music() {
		System.out.println("スマートフォンで音楽を聞く");
	}
	public void radio() {
		System.out.println("スマートフォンでラジオを聞く");
	}
	public void game() {
		System.out.println("スマートフォンでゲームをする");
	}
	public void tell() {
		System.out.println("スマートフォンで電話をする");
	} 
	public void mail() {
		System.out.println("スマートフォンでメールをする");
	}
}
