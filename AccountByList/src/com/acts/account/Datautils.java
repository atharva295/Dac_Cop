package com.acts.account;

import java.util.LinkedList;
import java.util.List;

public class Datautils {
	public static List<Account> getAccountList(){
		List<Account> list = new LinkedList<Account>();
		
		Address add1 = new Address("Atharva pg","panchavati pune",411033);
		Address add2 = new Address("102 nikash lawns","pashan",411012);
		Address add3 = new Address("atharvaganga","pashan",421542);
		Address add4 = new Address("mane pg","panchavati",411035);
		
		Type type1 = Type.valueOf("SAVING");
		Type type2 = Type.valueOf("CURRENT");
		Type type3 = Type.valueOf("OVERDRAFT");
		Type type4 = Type.valueOf("FIXEDDIPOSIT");
		Type type5 = Type.valueOf("RECURINGDIPOSIT");
		Account s1 = new Account(420023,"Andleeb",type1,"2022-03-25",12000.0,add1);
		Account s2 = new Account(420027,"Atharva",type2,"2022-02-25",13689.0,add2);
		Account s3 = new Account(420013,"shivam",type3,"2022-01-25",25478.0,add3);
		Account s4 = new Account(420069,"pravin",type4,"2022-05-25",65241.0,add4);
		Account s5 = new Account(420071,"swati",type5,"2022-04-25",78321.0,add4);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		
		
		
		
		return list;
		
	}

}
