class CheckString{
public static void main(String[] args){
	String current="HAI";
	StringBuffer buffer=new StringBuffer(current).reverse();
	System.out.println("Original String :"+current+" Reverse String :"+buffer.toString());
	
	String current_str="BANANA";
	System.out.println("Reverse :"+reverse(current_str));


	}
	public static String reverse(String str){
	String finalString="";
	for (int i=str.length()-1;i>=0;i--){
	
	finalString=finalString+str.charAt(i);
	
	}
	System.out.println("Reverse :"+finalString);
	return finalString;
	}
}
