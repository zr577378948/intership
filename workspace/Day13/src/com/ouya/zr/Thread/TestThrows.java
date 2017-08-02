package com.ouya.zr.Thread;
/**
 * throws
 * 在定义一个方法时，可以使用throws来声明，
 * 使用throws声明方法表示此方法不处理，而是交给方法的调用处理
 * 
 * public 返回值类型 方法名（参数列表） throws 异常类{}
 * 
 * 什么时候catch什么时候throws
 * 功能可以解决，用catch
 * 解决不了，用throws告诉调用者，由调用者解决
 * 如果调用声明异常函数，要么try、catch要么throws，否则编译失败。
 * @author Administrator
 *
 */
public class TestThrows {
//在主方法里，如果使用throws Exception ,后边就不需要try-catch处理。
	public static void main(String[] args) throws Exception{
		Math1 m = new Math1();
		/*try {
			System.out.println("除法操作："+m.div(10, 1));//因为有throws，不管是否有异常，都必须处理。
		} catch (Exception e) {
//			e.printStackTrace();//打印异常
			System.out.println(e.getMessage());
		}*/
		System.out.println("除法操作："+m.div(10, 1));
		
	}
		
}

class Math1{
	public int div(int i , int j) throws Exception{//定义一个除法，如果有异常，就交给调用处解决
		int temp = i/j;
		return temp;
	}
}
