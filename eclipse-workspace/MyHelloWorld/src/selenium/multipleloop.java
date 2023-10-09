package selenium;

public class multipleloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int shor=6;
		for(int i=1;i<=shor;i++){
		for(int j=shor;j>=i;j--){
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
