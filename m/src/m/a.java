package m;

public class a {

	public a() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
	String c="d";
	String a;
	a=c;
	System.out.println(System.identityHashCode(c));
	System.out.println(System.identityHashCode(a));
	a="m";
	System.out.println(System.identityHashCode(c));
	System.out.println(System.identityHashCode(a));
	}

}
