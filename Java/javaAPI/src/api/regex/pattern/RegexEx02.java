package api.regex.pattern;

import java.util.regex.*;

public class RegexEx02 {
    public static void main(String[] args) {
        String str = "123123-45644 GS25(치킨도시락) 4,400원";
        String str2 = "123123-3453454 GS25(마늘햄쌈) 5,000원";
        String str3 = "123456-3453 GS25(갓혜자도시락) 6,000";
        String str4 = "123456-3453233 CU(부대찌개라면) 4,000";


        // 상품 번호, GS25, 상품명, 가격
        String prodNum = "[0-9]{6}-[0-9]{4,}";
        String market = "[a-zA-Z가-힣]+(25)?";
        String prodName = "\\(([^)]+)\\)";
        String price = "[0-9]+,[0-9]+원?";

        String[] arr = {str, str2, str3, str4};

        for(String s: arr){
            Matcher pNum = Pattern.compile(prodNum).matcher(s);
            Matcher m = Pattern.compile(market).matcher(s);
            Matcher pName = Pattern.compile(prodName).matcher(s);
            Matcher pri = Pattern.compile(price).matcher(s);

            if(pNum.find()) {
                System.out.println("상품 번호: " + pNum.group());
            }
            if(m.find()) {
                System.out.println("판매처: " + m.group());
            }
            if(pName.find()) {
                System.out.println("상품: " + pName.group(1));
            }
            if(pri.find()) {
                System.out.println("가격: " + pri.group());
            }
            System.out.println("--------------------");
        }
    }
}
