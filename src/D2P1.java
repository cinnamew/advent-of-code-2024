import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class D2P1 {		//and part 2 oops hehe

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
			int dampener = 0;
			for(int i = 0; i < nums.length - 1; i++) {
				if(!test(nums[i], nums[i + 1], increasing)) {
					if((i == nums.length - 2 || test(nums[i], nums[i + 2], increasing)) || (i == 0 || test(nums[i - 1], nums[i + 1], increasing))) {
						if(dampener == 0) dampener++;
						else {
							valid = false;
							break;
						}
					}else {
						valid = false;
						break;
					}
				}
//				if(Math.abs(nums[i + 1] - nums[i]) > 3 || Math.abs(nums[i + 1] - nums[i]) < 1) {
//					valid = false;
//					break;
//				}
//				if(increasing && nums[i + 1] < nums[i]) {
//					if(dampener == 0) {
//						dampener++;
//					}else {
//						valid = false;
//						break;
//					}
//				}
//				if(!increasing && nums[i + 1] > nums[i]) {
//					if(dampener == 0) {
//						dampener++;
//					}else {
//						valid = false;
//						break;
//					}
//				}
				
			}
			if(valid) ans++;
			
		}
		System.out.println(ans);
		
		br.close();
		pw.close();
	}
	
	public static boolean test(int one, int two, boolean increasing) {
		if(Math.abs(one - two) > 3 || Math.abs(one - two) < 1) return false;
		if(increasing && two < one) return false;
		if(!increasing && two > one) return false;
		return true;
	}
	
}
