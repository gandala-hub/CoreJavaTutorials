package com.interviews.toptal.sceening.real;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
public class NameandSortPictures {
	
			public static void main(String args[]) {
			String S = "photo.jpg, Warsaw, 2013-09-05 14:08:15\n" 
					+ "john.png, London, 2015-06-20 15:13:22\n"
					+ "myFriends.png, Warsaw, 2013-09-05 14:07:13\n"
					+ "Eiffle.jpg, Paris, 2015-07-23 08:03:02\n"
					+ "pisatower.jpg, Paris, 2015-07-22 23:59:59\n" 
					+ "BOB.jpg, London, 2015-08-05 00:02:03\n"
					+ "notrademe.png, Paris, 2015-09-01 12:00:00\n" 
					+ "me.jpg, Warsaw, 2013-09-06 15:40:22\n"
					+ "a.png, Warsaw, 2016-02-13 13:33:50\n" 
					+ "b.jpg, Warsaw, 2016-01-02 15:12:22\n"
					+ "c.jpg, Warsaw, 2016-01-02 14:34:30\n" 
					+ "d.jpg, Warsaw, 2016-01-02 15:15:01\n"
					+ "e.png, Warsaw, 2016-01-02 09:49:09\n" 
					+ "f.png, Warsaw, 2016-01-02 10:55:32\n"
					+ "g.jpg, Warsaw, 2016-02-29 22:13:11\n";
			String newNames = solution(S);
			System.out.println(newNames);
			

		}

		public static String solution(String S) {
			String newNames = "";
			Map<String, String> hashMap = new HashMap<String, String>();
			List<List<String>> lists = new ArrayList<List<String>>();
			
			String nameList[] = S.split("\\n");
			lists = groupElements(nameList, nameList.length);
			Iterator<List<String>> itr = lists.iterator();
			while (itr.hasNext()) {

				List<String> list = itr.next();
				Comparator<String> cmp = new Comparator<String>() {
					public int compare(String o1, String o2) {
						Date o1date = new Date();
						Date o2date = new Date();
						try {
							o1date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH)
									.parse(o1.split(",")[2].trim());
							o2date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH)
									.parse(o2.split(",")[2].trim());
						} catch (ParseException e) {
							e.printStackTrace();
						}

						int diff = (o1date.compareTo(o2date));
						return (diff == 0) ? (o1date.compareTo(o2date)) : diff;
					}
				};
				Collections.sort(list, cmp);

				int appendCount = countOfDigits(list.size());
				  for(int y =0; y<nameList.length;y++) { 
					  if(list.contains(nameList[y])) {
						hashMap.put(nameList[y], appendZeros(list.indexOf(nameList[y])+1,appendCount)); 
				  		} 
				  }
			 
			}
			  String newNamesArray[] = new String[nameList.length];
			  for(int y =0; y<nameList.length;y++) { 
				for (Map.Entry<String, String> entry: hashMap.entrySet()) {
						if(nameList[y].equals(entry.getKey())){
							newNamesArray[y] = nameList[y].split(",")[1].trim()+entry.getValue()+"."+nameList[y].split(",")[0].split("\\.")[1].trim();	
						}
					  }
			  }
			  
			  for(int y =0; y<newNamesArray.length;y++) {
				  newNames= newNames+newNamesArray[y]+"\n";
			  }
			return newNames;
		}
		
		
		/* For counting Digits to append */
		public static int countOfDigits(int num) {
			int count = 0;
			while (num != 0) {
				num /= 10;
				++count;
			}
			return count;
		}

		/* To append Zeros */
		public static String appendZeros(int num, int n) {
			return String.format("%0" + n + "d", num);

		}
		
		/* To group the Cities */
		public static List<List<String>> groupElements(String arr[], int n) {
			// Initialize all elements as not visited
			boolean visited[] = new boolean[n];
			for (int i = 0; i < n; i++) {
				visited[i] = false;
			}
			int k = 0;
			String citygroup[] = new String[n];
			// Traverse all elements
			for (int i = 0; i < n - 1; i++) {
				// Check if this is first occurrence
				if (!visited[i]) {
					String temp = "";
					temp = temp + arr[i] + "\n";

					for (int j = i + 1; j < n; j++) {
						if (arr[i].split(",")[1].equals(arr[j].split(",")[1])) {
							temp = temp + arr[j] + "\n";
							visited[j] = true;
						}
					}
					citygroup[k] = temp;
					k++;
				}
			}
			List<List<String>> lists = new ArrayList<List<String>>();

			for (int x = 0; x < k; x++) {
				lists.add(Arrays.asList(citygroup[x].split("\\n")));
			}
			return lists;
		}
	
}
