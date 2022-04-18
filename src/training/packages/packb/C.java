package training.packages.packb;

import training.packages.packa.A;

public class C extends A{
	public static void main(String[] args) {
		C a = new C();
//		System.out.println(a.defvar);
		System.out.println(a.pubVar);
		System.out.println(a.getPriVar());
		System.out.println(a.proVar);
	}
}
