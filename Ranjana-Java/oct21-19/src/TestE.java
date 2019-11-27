
public class TestE {
	public static void main(String[] args) {
		BTM b=new BTM();
		b.swipe();
		int count=b.getCount();
		System.out.println("count is="+count);
		int c1=b.getTotalCount();
		System.out.println("tptal c1="+c1);
		
		BTM b1=new BTM();
		b1.swipe();
		int c2=b1.getCount();
		System.out.println("c2="+c2);
		int c3=b.getTotalCount();
		System.out.println("c3="+c3);
		
	}

}
