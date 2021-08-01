package Buoi01;
import java.util.Scanner;
/* vào 2 số nguyên a và b. Tính tổng và hiển thị ra màn hình. Nếu 
số nhập vào không đúng định dạng thì hiển thị thông báo lỗi, yêu cầu nhập lại
 */
public class Bai_04 {
	public int nhap() {
		Scanner sc = new Scanner(System.in);
		String s;
		int n;
		//ham kiem tra ngoai le
		do {
			System.out.print("\nNhap 1 so nguyen: ");
			s = sc.nextLine();
			try {n = Integer.parseInt(s);}
			catch (NumberFormatException e){
				n = Integer.MAX_VALUE;
				System.out.print("Ban nhap sai dinh dang, nhap lai.");
			}
		}while (n==Integer.MAX_VALUE);
		return n;
	}
	public static void main(String[] args) {
		Bai_04 t = new Bai_04();
		int a = t.nhap();
		int b = t.nhap();
		System.out.print("\nTong = " + (a+b));
	}
}

Nhan
