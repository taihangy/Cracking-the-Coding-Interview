public class StringUniqueCharacters{
	public boolean stringUniqueueCharacters(String s){
		if(s==null||s.length()<=1) return true;
		boolean[] chars=new boolean[256];
		for(int i=0;i<s.length();i++){
			int val=s.charAt(i);
			if(chars[val]) return false;
			else chars[val]=true;
		}
		return true;
	}

	//assume 'a'-'z'
	public boolean stringUniqueueCharacters(String s){
		if(s==null||s.length()<=1) return true;
		int checker=0;
		for(int i=0;i<s.length();i++){
			int val=s.charAt(i)-'a';
			if((checker & (1<<val))>0) return false;
			checker|=1<<val;
		}
		return true;
	}

	public static void main(String[] args){
		StringUniqueCharacters suc=new StringUniqueCharacters();
		System.out.println("ABCDSADHWQIODASNCSAD213124:"+suc.stringUniqueueCharacters("ABCDSADHWQIODASNCSAD213124"));
		System.out.println("ABCDEFGHI1234567890:"+suc.stringUniqueueCharacters("ABCDEFGHI1234567890"));
		System.out.println("\"\":"+suc.stringUniqueueCharacters(""));
		System.out.println("null:"+suc.stringUniqueueCharacters(null));
	}
}