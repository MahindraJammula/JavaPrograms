package com.kn.IpAddress;

public class IpAddressDemo {

	public boolean validIpAddress(String s1) {
		String[] srr = s1.split("\\.");
		if (srr.length != 4) {
			return false;
		}
		for (int i = 0; i < srr.length; i++) {
			int digit = Integer.parseInt(srr[i]);
			if (digit < 0 || digit > 255) {
				return false;
			} else
				continue;
		}
		return true;
	}
}
