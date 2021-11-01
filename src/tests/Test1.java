package tests;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {

	public static void main(String[] args) {
		Date dt = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("Test ran at: " + sdf1.format(dt));
		System.out.println("SUCCESS!");

	}

}
