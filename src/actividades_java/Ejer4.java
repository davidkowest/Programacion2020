package actividades_java;

public class Ejer4 {

	public static void main(String[] args) {
		
		int x,i;
		i=0;
		
		while (i<5) {
			if (i==0) {
				System.out.println("*");
			} else {
				if (i==1) {
					System.out.println("**");
				} else {
					if (i==2) {
						System.out.println("***");
					} else {
						if (i==3) {
							System.out.println("****");
						} else {
							System.out.println("*****");
						}
					}
				}
			}
			i=i+1;
		}
		

	}

}
