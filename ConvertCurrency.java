package SS1BT7;

import java.util.Scanner;

public class ConvertCurrency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào mệnh giá tiền (vnd) : ");
        int vnd = scn.nextInt();
        System.out.println(vnd + " VND = " + VNDtoUSD(vnd) + " USD");

    }
    static float VNDtoUSD(int vnd) {
        float usdCurrency = (float)vnd/23000 ;
        return  usdCurrency;
    }
}
