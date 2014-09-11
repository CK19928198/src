import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Test1 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("C:/Users/CK/Desktop/test.txt"));
		stripComments(sc);
	}
	public static void stripComments(Scanner sc){
	    String wor = "";
	    String[] str = {};
	    int t = 1;
		while(sc.hasNextLine()){
			
	    	str = sc.nextLine().split(" ");
	    	wor = str[0];
	    	for(int i=1; i<str.length; i++){
	    		if(wor.equals(str[i])){
	    			t++;
	    			if(i == str.length-1){
	    				System.out.print(wor+"*"+t);
	    				t = 1;
	    			}
	    		}
	    		else{
	    			if(t>1){
	    				System.out.print(wor+"*"+t+" ");
	    			}
	    			t = 1;
	    			wor = str[i];
	    		}
	    	}
	    	System.out.println();
		}
    }
}

	