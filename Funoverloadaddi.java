package oopsprogram;
class functionoverloadingadd{
	void add(int i,int j) {
		int add=i+j;
		System.out.println("integer addition="+add);
	}
	void add(float i,float j) {
		float add=i+j;
		System.out.println("float addition="+add);
	}
	void add(double i,double j) {
		double add=i+j;
		System.out.println("double addition="+add);
	}
	void add(short i,short j) {
		short add=(short)(i+j);
		System.out.println("short addition="+add);
	}
	void add(byte i,byte j) {
		byte add=(byte)(i+j);
		System.out.println("byte addition="+add);
	}
}

public class Funoverloadaddi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		functionoverloadingadd ob=new functionoverloadingadd();
		ob.add(5, 6);
		ob.add(1.5f,1.5f);
		ob.add(1.5,1.5);
		ob.add((short)1,(short)3);
		ob.add((byte)1,(byte)3);
	}

}
