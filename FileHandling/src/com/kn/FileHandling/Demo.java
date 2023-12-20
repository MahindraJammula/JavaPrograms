package com.kn.FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo {

	public static void main(String[] args) {
		try {
			String path1 = "c:\\io\\input.txt";
			String path2 = "c:\\io\\output.txt";

			FileInputStream fis = new FileInputStream(path1);
			FileOutputStream fos = new FileOutputStream(path2);
			int x;
			while ((x = fis.read()) != -1) {
				fos.write(x);
			}
			fis.close();
			fos.close();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
