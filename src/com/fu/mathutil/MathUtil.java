/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fu.mathutil;

/**
 *
 * @author Khong Trung Son
 */
public class MathUtil {

    public static long getAnFactorial(int n) {
        if (n > 20 || n < 0) {
            throw new IllegalArgumentException("Invalid argument n must be 0..20");
        }
        // xuống đên đây thì không chạy nữa
        if (n == 0 || n == 1) {
            return 1;
        }
        long res = 1;
        for (int i = 2; i <= n; i++) {
            res*= i;
        }
        return res;
    }
}
