/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qltienluong;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class funcTion {
    
    // Kiểm tra năm nhuận    
    static boolean checkYear(int year){
        return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
    }
}


