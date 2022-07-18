public class CharacterEx {
    public static void main(String[] args){
        char ch = 'A'; // A는 아스키 코드 숫자가 65이다

        System.out.println(ch);
        System.out.println((int)ch); // int는 숫자 출력이므로 A는 65가 출력된다.

        ch = 66;
        System.out.println(ch); // 66은 아스키 코드에서 B 뜻하므로 B 출력

        int ch2 = 67;
        System.out.println(ch2); // 67 그대로 출력
        System.out.println((int)ch2); // 67은 아스키 코드에서 C를 나타낸다

        

    }
    
}
