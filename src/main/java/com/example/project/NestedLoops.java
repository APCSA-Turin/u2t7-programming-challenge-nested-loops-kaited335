package com.example.project;

/*
1.Manually test first in the Runner class.
2.Run ./gradlew test to run automated tests.
3.Once you have completed the challenges, push to your repository.
4.Submit at turninterminal.netlify.app
*/

public class NestedLoops {
               /*
return the string below for given height=5
*
**
***
****
*****  
           */
public static String starStaircase(int height){
    String stars = "";
    for (int row = 1; row <= height; row++) {
        for (int col = 1; col <= row; col ++) {
            stars += "*";
        }
        stars += "\n";
    }
    stars = stars.substring(0, stars.length()-1);
    return stars;
}
          /*
return the string below for given height=5
*****
****
***
**
*
           */

public static String starStaircaseReverse(int height){ 
    String stars = "";
    for (int row = height; row >= 1; row--) {
        for (int col = row; col >= 1; col --) {
            stars += "*";
        }
        stars += "\n";
    }
    stars = stars.substring(0, stars.length()-1);
    return stars;
}
            /*

width=5 height=5
*****
*   *
*   *
*   *
*****
          */
    public static String emptyBox(int width, int height) {
        if (width == 1 || height == 1) {
            return "";
        }
        String stars = "";
        for (int row = 1; row <= height; row ++) {
            for (int col = 1; col <= width; col ++) {
                if (row == 1 || row == height) {
                    stars += "*";
                } else if (col == 1 || col == width) {
                    stars += "*";
                } else {
                    stars += " ";
                }
            }
            stars += "\n";
        }
        stars = stars.substring(0, stars.length()-1);
        return stars;
    }
                    /*
return the string below for word="HELLO" rows=5                    
HELLO
ELLOH
LLOHE
LOHEL
OHELL

  i will provide a hint for this one if you get stuck.. use modulo
                */
    public static String repeatRectangle(String word, int rows){
        String answer = "";
        int split = 0;
        for (int i = 0; i < rows; i++) {
            split = i % word.length();
            if (split == 0) {
                answer += word;
            } else {
                answer += word.substring(split) + word.substring(0, split);
            }
            answer += "\n";
        }
        answer = answer.substring(0, answer.length() - 1);
        return answer;
    }

}