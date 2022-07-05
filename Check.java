package junit1;

import static org.junit.Assert.assertEquals;

public class Check {
	public String toCheck(String name1,String name2,String name3) {
	String[] name = {name1,name2,name3};
	int max = 0;
	String name4 = "";
	for(int i=0;i<name.length;i++) {
		if(name[i].length()>max) {
		max = name[i].length();
		name4 = name[i].toUpperCase();
	}
	}
	return name4;	
	}
}
