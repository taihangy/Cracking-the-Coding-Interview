import java.util.*;
public class PermutationofOther{
	public boolean permutationOfOther(String s,String t){
		if(s==null||t==null||s.length()!=t.length()) return false;
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++){
			char val=s.charAt(i);
			if(!map.containsKey(val)) map.put(val,1);
			else {
				int count=map.get(val);
				map.put(val,++count);
			}
		}
		for(int i=0;i<t.length();i++){
			char val=t.charAt(i);
			if(!map.containsKey(val)) return false;
			int count=map.get(val);
			if(--count<0) return false;
			else map.put(val,count);
		}
		return true;
	}

	public boolean permutationOfOther(String s,String t){
		if(s==null||t==null||s.length()!=t.length()) return false;
		int[] chars=new int[256];
		for(int i=0;i<s.length();i++){
			int val=s.charAt(i);
			chars[val]++;
		}
		for(int i=0;i<t.length();i++){
			int val=t.charAt(i);
			if(--chars[val]<0) return false;
		}
		return true;
	}

	public boolean permutationOfOther(String s,String t){
		if(s==null||t==null||s.length()!=t.length()) return false;
		char[] sc=s.toCharArray();
		char[] tc=t.toCharArray();
		Arrays.sort(sc);
		Arrays.sort(tc);
		String x=new String(sc);
		String y=new String(tc);
		if(!x.equals(y)) return false;
		return true;
	}



	public static void main(String[] args){
		PermutationofOther po=new PermutationofOther();
		System.out.println(po.permutationOfOther("ABCDEB","BDEACA"));
		System.out.println(po.permutationOfOther("ABA","AAB"));
		System.out.println(po.permutationOfOther("A",""));
		System.out.println(po.permutationOfOther("","A"));
		System.out.println(po.permutationOfOther("",""));
	}
}