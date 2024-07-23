package Inheritance;

public class Multiple1_2Class implements Multiple1,Multiple2{

	@Override
	public void Bdata() {
		// TODO Auto-generated method stub
		System.out.println("X="+x+"Y="+y);
	}

	@Override
	public void Adata() {
		// TODO Auto-generated method stub
		System.out.println("A="+a+"B="+b);
	}

}
