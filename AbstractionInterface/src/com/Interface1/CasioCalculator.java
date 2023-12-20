package com.Interface1;

public class CasioCalculator {
	public void acceptCalci(Calculator ref) {
		ref.add();
		ref.subtraction();
		ref.multi();
		int res = ref.div();
		System.out.println(res);

	}

}
