package api.lang.string;

public class StringBufferEx {
    public static void main(String[] args) {
        String str = "hello";
        StringBuilder sb = new StringBuilder(str);

        System.out.println(str);
        System.out.println(sb);

        str += " world";
        sb.append(" world");

        System.out.println(str);
        System.out.println(sb);

        // 중간에 추가하기
        sb.insert(6, "my ");
        System.out.println(sb);

        // 문자열 변경하기
        sb.replace(6, 8, "your");
        System.out.println(sb);

        // 문자열 삭제
        sb.delete(6, 11);
        System.out.println(sb);

        System.out.println("-------------------------");

        // 문자열과 StringBuffer 차이
        long start = System.currentTimeMillis();

//        String s = "A";
//        for (int i=1;i<=300000; i++){
//            s += "A";
//        }
        StringBuilder a = new StringBuilder("A");
        for(int i=1;i<=300000;i++){
            a.append("A");
        }
        long end = System.currentTimeMillis();

        System.out.println((end-start)*0.001+"초");
    }
}
