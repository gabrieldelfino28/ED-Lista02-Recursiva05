package view;

import java.util.Scanner;

import controller.MDC_Controller;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		MDC_Controller mc = new MDC_Controller();
		
		System.out.println("Informe X:");
		int x = s.nextInt();
		System.out.println("Informe Y:");
		int y = s.nextInt();
		
		int res= mc.FuncMDC(x, y);
		System.out.println("MDC de "+x+" e "+y+" = "+res);
	}

}
