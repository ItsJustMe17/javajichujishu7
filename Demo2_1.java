package javajichu_8;

public class Demo2_1 {
//	空和空判定
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="";
		if(name != null && name.equals("")) {
			System.out.println("name非空");
		}else {
			System.out.println("name为空");
		}
		
		String name2=null;
		if(name2 != null && name2.equals("")) {
			System.out.println("name非空");
		}else {
			System.out.println("name为空");
		}
	}

}
