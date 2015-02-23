class HelloWorld {
	int color = 7;



	static int square(int x) {
		return x*x;
	}
	public static void main (String[] arg) {
		System.out.println("hello world!");
	
		int sq15;
		sq15 = 2;
		
		int g;
		g = sq15;
		
		sq15 = square(15);
		System.out.println(sq15);
		System.out.println(g);
		System.out.println(square(2));
		System.out.println(square(3));
		System.out.println(square(4));
		System.out.println(square(5));
		System.out.println(square(6));
		System.out.println(square(7));
		System.out.println(square(8));


		new HelloWorld();
		HelloWorld test1;
		new HelloWorld();
		test1 = new HelloWorld();
		System.out.println(test1.color);
	}
}