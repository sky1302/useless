public  class Armstrong  {
    public static void main (String args[]){
        int num = 1634;
        int c = num;
        int count = 0;
        int temp = num;
        int sum = 0;

        while (temp!=0){
            temp /= 10;
            count++;
        }
        
        while (num>0){
            int digit = num % 10;
            sum += Math.pow(digit,count);
            num /= 10;
        }
        System.out.println(count);
        System.out.println(sum);
        if (sum == c){
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }
    }
}
