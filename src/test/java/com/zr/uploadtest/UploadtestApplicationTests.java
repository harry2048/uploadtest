package com.zr.uploadtest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UploadtestApplicationTests {

	@Test
	public void contextLoads() {
		List<Date> list = new ArrayList<>();
		Date date = new Date();
		for(int i=0;i<5;i++) {
			String key = String.valueOf(i);
			date.setDate(date.getDate()+1);
			list.add(date);
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for(int i=0;i<5;i++) {
			String key = String.valueOf(i);
			Date val = list.get(i);
			System.out.println("i="+i+" val="+sdf.format(val));
		}


		/*Map<String, Date> timeMap = new HashMap<>();
		Date date = new Date();
		for(int i=0;i<5;i++) {
			String key = String.valueOf(i);
			date.setDate(date.getDate()+1);
			timeMap.put(key, date);
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for(int i=0;i<5;i++) {
			String key = String.valueOf(i);
			Date val = timeMap.get(key);
			System.out.println("i="+i+" val="+sdf.format(val));
		}*/


		/*String text="";
		String word="";
		String[] split = text.split(",");
		for (String s : split) {
			if(s.startsWith(word)){
				return s;
			}
		}*/
	}

}
