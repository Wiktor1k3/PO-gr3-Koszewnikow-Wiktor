----------(a)---------
package com.company;

public class zad1_a {
    public static int countChar(String str, char c){
        char[] chars= str.toCharArray();
        int count =0;
        for(char d: chars){
            if(d==c){
               count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Ilość liter c:" + countChar("cos", 'c'));
    }
}

----------(b)---------

package com.company;

import java.lang.StringBuffer;

public class zad1 {
    public static void main(String[] args) {

        String s = "łełełe";
        String sub = "łe";
        System.out.println(countSubStr(s,sub));
        }


    public static int countSubStr(String str, String subStr) {
        int count = 0;
        StringBuffer sb = new StringBuffer(str);
        if (subStr.length() > str.length())
            return 0;
        for (int i = 0; i <= sb.length() - 1; i++) {
            if ((sb.length() - 1) >= i + subStr.length() - 1) {
                String s = sb.substring(i, i + subStr.length());
                if (s.equals(subStr)) {

                    count++;
                }
            }
        }

        return count;
    }
}

----------(c)---------
package com.company;

public class zad1_c {
    public static String middle(String str){
        int position ;
        int length;
        if(str.length()%2==0){
            position = str.length()/2-1;
            length = 2;
        }
        else{
           position = str.length()/2;
           length=1;
        }
        return str.substring(position, position + length);
    }
    public static void main(String[] args) {

        System.out.println("Srodkowa litera: " + middle("middle"));
    }
}

----------(d)---------
    
package com.company;
import java.lang.StringBuffer;

public class zad1_d {
    public static String repeat(String str, int n) {
        StringBuffer sb =new StringBuffer(str.length()*n);
        for(int i=0; i<n; i++){
            sb.append(str);
        }
        return sb.toString();
    }
    public static void main(String[] args) {

        System.out.println("Powtorzenie: " + repeat("aha ",3));
        }

    }
    
  ----------(e)---------
  
package com.company;

import java.lang.StringBuffer;

public class zad1 {
    public static void main(String[] args) {

        String s = "hehehihihehe";
        String sub = "he";
        int[] tab = where(s, sub);
        for (int i = 0; i <= tab.length - 1; i++) {
            System.out.println(tab[i]);
        }
    }

    public static int[] where(String str, String subStr) {
        int n = countSubStr(str, subStr);
        int[] where = new int[n];
        int j = 0;
        StringBuffer sb = new StringBuffer(str);
        for (int i = 0; i <= sb.length() - 1; i++) {
            if ((sb.length() - 1) >= i + subStr.length() - 1) {
                String s = sb.substring(i, i + subStr.length());
                if (s.equals(subStr)) {
                    where[j] = i;
                    j++;

                }
            }
        }
        return where;
    }



    public static int countSubStr(String str, String subStr) {
        int count = 0;
        StringBuffer sb = new StringBuffer(str);
        if (subStr.length() > str.length())
            return 0;
        for (int i = 0; i <= sb.length() - 1; i++) {
            if ((sb.length() - 1) >= i + subStr.length() - 1) {
                String s = sb.substring(i, i + subStr.length());
                if (s.equals(subStr)) {

                    count++;
                }
            }
        }

        return count;
    }
}

  ----------(f)---------
  
package com.company;

import java.lang.StringBuffer;

import static java.lang.Character.*;
import static java.lang.Character.toLowerCase;

public class zad1 {
    public static void main(String[] args) {
        System.out.println(change("HehEHe"));
    }

    public static String change(String str) {
        StringBuffer changed = new StringBuffer();
        StringBuffer sb = new StringBuffer(str);
        for (int i = 0; i <= sb.length() - 1; i++) {
            if (isLowerCase(sb.charAt(i)))
                changed.append(toUpperCase(sb.charAt((i))));
            if (isUpperCase(sb.charAt(i)))
                changed.append(toLowerCase(sb.charAt(i)));
        }


        return changed.toString();
    }
}

 ----------(g)---------

package com.company;

import java.lang.StringBuffer;

public class zad1 {
    public static void main(String[] args) {
        System.out.println(nice("1234567891", '|', 5));
    }

    public static String nice(String str, char separator, int range) {
        StringBuffer decimal = new StringBuffer();
        StringBuffer sb = new StringBuffer(str);
        int count = 0;
        for (int i = sb.length() - 1; i >= 0; i--) {
            if (count == range) {
                decimal.append(separator);
                decimal.append(sb.charAt(i));
                count = 0;
            } else
                decimal.append(sb.charAt(i));
            count++;
        }
        return decimal.reverse().toString();
    }
}


     
