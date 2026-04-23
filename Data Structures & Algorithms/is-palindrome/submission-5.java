class Solution {

	public boolean checkalphaNumeric(char c){
		if(c>='a' && c<='z') return true;
		else if(c>='A' && c<='Z') return true;
		else if(c>='0' && c<='9') return true;
        return false;
		}
    public boolean isPalindrome(String s) {
		if (s.length()<=1) return true;
        int l,r;
		l=0;
		r=s.length()-1;
		s=s.toLowerCase();
		System.out.println(s);
		while(l<r){
			if(!checkalphaNumeric(s.charAt(l))) {l++;continue;}
		    if(!checkalphaNumeric(s.charAt(r))) { r--;continue;}
			if(s.charAt(l)!=s.charAt(r)) return false;
			l++;
			r--;
		}
		return true;
    }
}
