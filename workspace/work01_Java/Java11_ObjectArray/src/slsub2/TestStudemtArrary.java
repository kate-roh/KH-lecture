package slsub2;

public class TestStudemtArrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

int count = 0;
boolean chek = true;

while(check) {
	System.out.print("�г�: ");
	Int grade = next.
			
	If(yn=='y'){
		count ++;
	}else {
		check = false;
	}
}
	Int sumKor = 0, sumEng = 0, sumMath = 0;
	
	for(int i =0; i<= count; i++) {
		sumKor += sarr[i].getKor();
		sumEng += sarr[i].getEng();
		sumMath += sarr[i].getMath();
		
	}
	System.out.println("���� ���: " + (sumKor/(count+1)));
	System.out.println("���� ���: " + (sumEng/(count+1)));
	System.out.println("���� ���: " + (sumMath/(count+1)));
	
	//��ü �л� ����
	for(int i = 0; i<=count; i++) {
		System.out.println(sarr[i].informatio());
	}