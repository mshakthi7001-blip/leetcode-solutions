class Solution {
    public int myAtoi(String s) {
        int sum=0;
        s=s.trim();
        char [] a=s.toCharArray();
         if (s.length() == 0)
            return 0;

        int sign = 1;
        int i = 0;

        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        }
        else if (s.charAt(i) == '+') {
            i++;
        }
        for(int j=i;j<s.length();j++){
            if(Character.isDigit(a[j])){
                int result=a[j]-'0'; 
                if(sum > (Integer.MAX_VALUE - result) / 10) {
                    if(sign == -1)
                        return Integer.MIN_VALUE;
                    else
                        return Integer.MAX_VALUE;
                }
                sum=sum*10+result;
            }
            else{
                return sum*sign;
            }
        }
return sum*sign;
    }
}