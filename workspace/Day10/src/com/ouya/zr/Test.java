package com.ouya.zr;
/**
 * 公司中程序员有姓名、工号、薪水、工作内容
 * 项目经理除了有姓名、工号、薪水，还有奖金，工作内容
 * 分析：在这个问题领域中，通过，名词提炼发：程序员： 属性： 姓名、工号、薪水。行为：工作 
 * 经理：属性：姓名、工号、薪水、奖金。行为：工作。
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Employee em = new Boss("老王", "123", 133.0, 232.0);
		em.work();
	}

}

//员工
abstract class Employee{
	private String name;
	private String id;
	private double pay;
	
	public Employee(String name,String id,double pay) {
		this.name = name;
		this.id = id;
		this.pay = pay;
	}
	
	public void work(){
		System.out.println("我要赚钱");
	}
	
}

//经理
class Boss extends Employee{

	private double jiangjin;
	public Boss(String name, String id, double pay,double jiangjin) {
		super(name, id, pay);
		this.jiangjin = jiangjin;
	}
	public void work(){
		System.out.println("监工");
	}
	
}

