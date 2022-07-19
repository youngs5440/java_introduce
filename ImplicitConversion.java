public class ImplicitConversion {
    public static void main(String[] args){
        byte bNum = 10;
        int num = bNum;

        System.out.println(num);

        long lNum = 10; 
        float fNum = lNum; // long보다 더 정밀한 숫자

        System.out.println(fNum);

        double dNum = fNum + num; // 실수 + 정수

        System.out.println(dNum); // 최종은 double 값으로 나옴

        

        
    }
    
}
