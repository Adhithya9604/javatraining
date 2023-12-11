package string_package;

public class equalIgnorecase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String Str1 = "HelloWorld";
       String Str2 = "heLLowORlD";
       String Str3 = "HellOwOrldd";
       boolean result = Str2.equalsIgnoreCase(Str1);
       System.out.println(result);
        
	

}
}