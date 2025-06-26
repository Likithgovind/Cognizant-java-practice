class Solution {
    public int addDigits(int num) {
        if(num==0){
            return 0;
        }
        while(num>9){
            int count=0;
            while(num>0){
                int a=num%10;
                count+=a;
                num=num/10;
            }
            num=count;
        }
        return num;
    }
}
