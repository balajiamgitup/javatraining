package training.packages.packa;

public class A {

	int defvar;
	public int pubVar;
	private int priVar;
	protected int proVar;

	public int getPriVar() {
		return priVar;
	}

	public void setPriVar(int priVar) {
		this.priVar = priVar;
	}

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.defvar);
		System.out.println(a.pubVar);
		System.out.println(a.priVar);
		System.out.println(a.proVar);
	}
}
