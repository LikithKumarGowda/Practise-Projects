package first;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;



public class string2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String[][] s=new String[5][3];
		for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
				s[i][j]=sc.nextLine();
			}
		}
		Arrays.sort(s, new Comparator<String[]>(){
		    @Override
		    public int compare(String[] first, String[] second){
		    	final String time1 = first[0];
                final String time2 = second[0];
                int compare = time1.compareTo(time2);
                if(compare != 0){
                    return compare;
                }else{
                    return first[1].compareTo(second[1]);
                }
		    }

		});
		for (int i=0; i<5; i++){
		    for(int j=0; j<3;j++){
		        System.out.println(s[i][j]);
		    }

		}
		sc.close();

	}

}
