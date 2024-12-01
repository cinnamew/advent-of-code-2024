import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class D1P2 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		String s;
		HashMap<Integer, Integer> numCounts = new HashMap<Integer, Integer>();
		ArrayList<Integer> listOne = new ArrayList<Integer>();
		while((s = br.readLine()) != null && s.length() != 0) {
			String[] temp = s.split("   ");
			listOne.add(Integer.parseInt(temp[0]));
			if(numCounts.get(Integer.parseInt(temp[1])) == null) numCounts.put(Integer.parseInt(temp[1]), 1);
			else numCounts.put(Integer.parseInt(temp[1]), numCounts.get(Integer.parseInt(temp[1])) + 1);
		}
		
		int ans = 0;
		for(int i = 0; i < listOne.size(); i++) {
//			System.out.println(listOne.get(i) + ", " + numCounts.get(listOne.get(i)));
			if(numCounts.get(listOne.get(i)) == null) continue;
			ans += listOne.get(i)*numCounts.get(listOne.get(i));
		}
		
		System.out.println(ans);
		
		br.close();
		pw.close();
	}
	
}
