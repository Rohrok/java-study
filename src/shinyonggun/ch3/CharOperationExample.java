package shinyonggun.ch3;

public class CharOperationExample {
    public static void main(String[] args) {
        char c1 = 'A' + 1;
        char c2 = 'A';
        //char c3 = c2 + 1; // char c3 = (char) (c2 +1); 강제 타입 변환(캐스팅) 해야함

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        //System.out.println("c3: " + c3);
    }
}
