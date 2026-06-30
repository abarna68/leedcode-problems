import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        //int sum=Integer.parseInt(a,2)+Integer.parseInt(b,2);
        BigInteger numa=new BigInteger(a,2);
        BigInteger numb=new BigInteger(b,2);
        BigInteger sum=numa.add(numb); 
        String bin=sum.toString(2);
        return bin; 
    }
}