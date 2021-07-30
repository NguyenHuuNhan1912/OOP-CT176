package Buoi01;
import java.util.Scanner;
public class Bai_08 {
	public static void nhap(int ds[]){
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<ds.length; i++) {
			System.out.print("Nhap phan tu thu " + (i+1)+": ");
			ds[i] = sc.nextInt();
		}
	}
	public static void in(int ds[]){
		for(int e : ds) {
			System.out.print(e + " " );
		}
	}
	public static void sapXep(int ds[]){
		for(int i=0; i<ds.length-1; i++)
			for(int j=i+1; j<ds.length; j++) {
				if(ds[i] > ds[j]) {
					int temp = ds[i];
					ds[i] = ds[j];
					ds[j] = temp;
				}
			}
	}
	public static int dem(int ds[], int x) {
		int count = 0;
		for(int i=0; i<ds.length-1; i++) {
			if(ds[i] == x) count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap so phan tu: ");
		int n = sc.nextInt();
		int ds[] = new int[n];
		Bai_08.nhap(ds);
		Bai_08.in(ds);
		System.out.println("\nDanh sach da sap xep");
		Bai_08.sapXep(ds);
		Bai_08.in(ds);
		System.out.print("\nNhap so can diem x= ");
		int x = sc.nextInt();
		System.out.print("\nSo lan x xuat hien = " + Bai_08.dem(ds, x));	
	}
}
