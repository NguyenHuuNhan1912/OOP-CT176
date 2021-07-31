package Buoi01;

public class Bai_03 {
	// args = {"7.5" "2.3" "20a1" "50"}
	// >        7.5   2.3	0	   50, sum, max
	public static void main(String[] args) {
		double tong = 0, n , max = Double.MIN_VALUE;
		for(String s : args) {
			//ham xu li ngoai le(Exception Handling)
			try{n = Double.parseDouble(s);}
			catch(NumberFormatException e) {
				n = 0;
			}
			tong += n;
			if (max < n) max = n;
		}
		System.out.print("Tong = "+ tong +", MAX = " + max);
	}
}
Anh la Nguyen Huu Nhan
