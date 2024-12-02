import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class D2P1 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		String s;
		
		int ans = 0;
		while((s = br.readLine()) != null && s.length() != 0) {
			boolean increasing = false;
			String[] numTemp = s.split(" ");
			int[] nums = new int[numTemp.length];
			for(int i = 0; i < nums.length; i++) {
				nums[i] = Integer.parseInt(numTemp[i]);
			}
			
			if(nums[1] > nums[0]) increasing = true;
			boolean valid = true;
			for(int i = 0; i < nums.length - 1; i++) {
				if(Math.abs(nums[i + 1] - nums[i]) > 3 || Math.abs(nums[i + 1] - nums[i]) < 1) {
					valid = false;
					break;
				}
				if(increasing && nums[i + 1] < nums[i]) {
					valid = false;
					break;
				}
				if(!increasing && nums[i + 1] > nums[i]) {
					valid = false;
					break;
				}
				
			}
			if(valid) ans++;
			
		}
		
		System.out.println(ans);
		
		br.close();
		pw.close();
	}
	
}
