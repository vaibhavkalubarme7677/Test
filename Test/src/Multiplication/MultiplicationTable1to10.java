package Multiplication;
//7.wrrite a program in java for multiplication table of 1to 10number (5marks)
public class MultiplicationTable1to10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=1;
		do {
			System.out.println("Table of =" + a);
			for(int i=1;i<=10;i++)
			{
				System.out.println(a + " * " + i + " = " +(a*i));
			}
			a++;
		}while(a<=10);
}	

}
		
	


