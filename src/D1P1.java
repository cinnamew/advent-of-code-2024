import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class D1P1 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		String s;
		ArrayList<Integer> listOne = new ArrayList<Integer>();
		ArrayList<Integer> listTwo = new ArrayList<Integer>();
		while((s = br.readLine()) != null && s.length() != 0) {
			String[] temp = s.split("   ");
			listOne.add(Integer.parseInt(temp[0]));
			listTwo.add(Integer.parseInt(temp[1]));
//			System.out.println(temp[0]);
		}
		
		listOne.sort(null);
		listTwo.sort(null);
		
		int ans = 0;
		for(int i = 0; i < listOne.size(); i++) {
			ans += Math.abs(listTwo.get(i) - listOne.get(i));
		}
		
		System.out.println(ans);
		br.close();
		pw.close();
	}
}
