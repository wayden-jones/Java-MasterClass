public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-222));
    }
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int num = number;
        System.out.println("num: "+num);
        System.out.println("rev: "+ reverse);
        while (num != 0){

            reverse += (num%10);
            num /= 10;
            System.out.println("num: "+num);
            System.out.println("rev: "+ reverse);
            if(reverse == number)
                return true;
            reverse *= 10;
        }
        return false;
    }
}
