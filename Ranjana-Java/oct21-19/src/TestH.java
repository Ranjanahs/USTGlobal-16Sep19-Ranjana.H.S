
public class TestH {
	public static void main(String[] args) {
		FirstGen f=new FirstGen();
		f.call();
		f.msg();
		System.out.println("----------------------------");
		SecondGen s=new SecondGen();
		s.call();
		s.msg();
		s.games();
		System.out.println("------------------------------");
		ThirdGen t=new ThirdGen();
		t.msg();
		t.call();
		t.camera();
		t.games();
		System.out.println("------------------------------");
	}

}
