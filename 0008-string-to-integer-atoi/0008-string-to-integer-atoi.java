class Solution {
    public int myAtoi(String s) {
        int ind=0,total=0,sign=1;

        if(s.length()==0)   //check for empty string
            return 0;   

        while(ind < s.length() && s.charAt(ind)==' ')   //remove whitespaces
            ind++;     

        if(ind==s.length())     //if after removing whitespaces nothing is left
            return 0;

        if(s.charAt(ind)=='+' || s.charAt(ind)=='-'){
            sign = s.charAt(ind) == '+' ? 1 : -1;
            ind++;      //convert sign to integer for multiplication of sign
        }
        while(ind<s.length()){
            int dig = s.charAt(ind) - '0';      //asci range check

            if(dig<0 || dig>9)
                break;          //out of asci range for integers

            if(Integer.MAX_VALUE/10 < total || Integer.MAX_VALUE/10==total && Integer.MAX_VALUE%10<dig)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;//check if integer is max or min

            total = total*10 + dig; //forming numbers like eg 123 = 12*10+3
            ind++;      
        }
        return total*sign;          //finally req integer should be with sign so integer multiplication 
    }
}