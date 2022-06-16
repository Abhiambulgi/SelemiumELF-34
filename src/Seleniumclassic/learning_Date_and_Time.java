package Seleniumclassic;

import java.time.LocalDateTime;

public class learning_Date_and_Time {
public static void main(String[] args) {
	LocalDateTime systemdate=LocalDateTime.now();
	String date=systemdate.toString().replaceAll(":","-");
	System.out.println(date);
}
}
