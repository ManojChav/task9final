package com.bellinfo.task9final;

public class vowelsandconsonents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="Peter piper picked a peck of pickled peppers";
		char[] vowels={'a','e','i','o','u'};
		int vowelscount=0,consonentscount=0;
		str=str.replaceAll(" ", "");		
		for(int i=0;i<str.length();i++){
			boolean flag=true;
			for(int j=0;j<vowels.length;j++){
				if(str.charAt(i)==vowels[j])
					flag=false;					
			}
			if(flag)
				consonentscount++;
			else
				vowelscount++;
		}
		System.out.println("Number of vowels- "+vowelscount);
		System.out.println("Number of consonants- "+consonentscount);

	}

}