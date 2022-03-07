
public class EdxMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y = 7;
		int x = 5;
		int z = 10;
		double[] ary = {1,2,3,4};

		System.out.println("Pregunta 1 = " + y);
		System.out.println("Pregunta 2 = " + x);
		System.out.println("Pregunta 3 = " + z);
		Hello();
		Comillas();
	
	}

	int pregunta2(int x) {
		for (int i = 5; i < 5; i++) {
			x = x + i;
		}
		return x;
	}

	int pregunta1(int y) {
		while (y < 8) {
			y = y + 2;
		}
		return y;
	}

	int pregunta3(int z) {
		do {
			z = z * 2;
		} while (z <= 20);

		return z;
	}

	static void Hello() {
		for (int i = 0; i < 3; i++) {
		}
		for (int j = 10; j > 4; j--) {
			System.out.println("Hello");
		}
	}

	static void Comillas() {
		for (int i = 5; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.print(" ");
		}
	}
	

	
}
