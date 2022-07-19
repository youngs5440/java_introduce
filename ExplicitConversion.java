public class ExplicitConversion {
    
    public static void main(String[] args){

        int iNum = 1000;
        byte bNum = (byte)iNum; // 그냥 bNum = iNum; 으로 하면 타입이 안맞음 명시해주어야함

        System.out.println(iNum);
        System.out.println(bNum); // iNum을 byte에 집어넣었으므로 -127 ~ 128 까지 표현 잘려서 들어가므로 -24가 나옴

        double dNum = 3.14;
        iNum = (int)dNum; // 명시를 하지 않으면 바이트 수가 맞지않아 못들어감

        System.out.println(iNum); // 정수로 표현하므로 3.14가 아닌 3으로 출력된다.

        float fNum = 0.9f;
        int num1 = (int)dNum + (int)fNum;
        int num2 = (int)(dNum + fNum);

        System.out.println(num1); // 정수로 먼저 바꾸어 3 + 0 = 3 됨
        System.out.println(num2); // 실수를 먼저 더하여 3.14 + 0.9 = 4.04 에서 정수로 변환되어 4로 나옴

    }
    
}
