package com.ouya.zr.Thread;
/**
 * throws
 * �ڶ���һ������ʱ������ʹ��throws��������
 * ʹ��throws����������ʾ�˷��������������ǽ��������ĵ��ô���
 * 
 * public ����ֵ���� �������������б��� throws �쳣��{}
 * 
 * ʲôʱ��catchʲôʱ��throws
 * ���ܿ��Խ������catch
 * ������ˣ���throws���ߵ����ߣ��ɵ����߽��
 * ������������쳣������Ҫôtry��catchҪôthrows���������ʧ�ܡ�
 * @author Administrator
 *
 */
public class TestThrows {
//������������ʹ��throws Exception ,��߾Ͳ���Ҫtry-catch������
	public static void main(String[] args) throws Exception{
		Math1 m = new Math1();
		/*try {
			System.out.println("����������"+m.div(10, 1));//��Ϊ��throws�������Ƿ����쳣�������봦����
		} catch (Exception e) {
//			e.printStackTrace();//��ӡ�쳣
			System.out.println(e.getMessage());
		}*/
		System.out.println("����������"+m.div(10, 1));
		
	}
		
}

class Math1{
	public int div(int i , int j) throws Exception{//����һ��������������쳣���ͽ������ô����
		int temp = i/j;
		return temp;
	}
}