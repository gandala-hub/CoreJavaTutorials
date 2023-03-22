package com.interviews.toptal.sceening.real;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DayoftheWeekAfterKDays {

	public static String dayOfWeek(String day, int k) {
        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        int index = days.indexOf(day);
        return days.get((index + k) % 7);
    }

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //String day = scanner.nextLine();
    	String day = "Tuesday";
        //int k = Integer.parseInt(scanner.nextLine());
        //scanner.close();
    	int k = 101;
        String res = dayOfWeek(day, k);
        System.out.println(res);
    }
}


