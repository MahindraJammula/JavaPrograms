package com.kn.countcharacters;

public class FindCountCharacters {

	public void findCountCharacters(String s1) {
		char[] crr=s1.toCharArray();
	    crr=sortCharacterArray(crr);
	    int count=1;
	    for(int i=0;i<crr.length-1;i++) {
	    	if(crr[i]==crr[i+1]) {
	    		count++;
	    	}else {
	    		System.out.println("The occurence "+ crr[i]+" of:"+count);
	    		count=1;
	    	}
	    	if(i+1==crr.length-1) {
	    		System.out.println("The occurence "+ crr[i+1]+" of:"+count);
	    	}
	    }
 	}
		//sort the char Array
	public static char[] sortCharacterArray(char[] crr) {
		for(int i=0;i<crr.length;i++) {
			for(int j=0;j<crr.length-1-i;j++) {
				if(crr[j]>crr[j+1]) {
					char temp=crr[j];
					crr[j]=crr[j+1];
					crr[j+1]=temp;
				}
			}
		}
		return crr;
	}
}
