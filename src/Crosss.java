
public class Crosss {

public static void main(String[] args) {
	int r,c;
	for(r=1;r<=5;r++){
		for(c=1;c<=5;c++){
		if(r==c){
		System.out.print("x");
			
		}
		else if((c+r)==6){ 
			System.out.print("x");
		}
		else{
			System.out.print("_");
		}
	}
		System.out.print("\n");
}
}







}
