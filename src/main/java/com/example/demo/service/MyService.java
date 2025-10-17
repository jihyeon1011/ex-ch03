package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.controller.MyController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MyService {

	private static final Logger log = LoggerFactory.getLogger(MyService.class);

	public String sayHello(String hi) {

		String msg = hi + "좋은날";
		System.out.println(msg);
		log.info(msg);
		return msg;
	}

	public String ex321() {

		String result = "";
		int number = 1;

		if (number == 1) {
			result = "if 블록입니다.";
		} else if (number == 2) {
			result = "else if 블록입니다.";
		} else {
			result = "else 블록입니다.";
		}
		System.out.println(result);
		log.info(result);

		String msg = "ex70결과는: " + result;
		return msg;
	}

	public Integer ex70_int() {
		log.info("999");
		return 999;
	}

	public String ex322() {

		int[] array = { 1, 2, 3, 4, 5 };
		String result = "";

		for (int i = 0; i < array.length; i++) {
			result += ("i = " + array[i] + "<br>");
		}
		log.info(result);
		return result;
	}

	public String ex323() {
		int[] array = { 1, 2, 3, 4, 5 };
		int i = 0;
		String result = "";

		while (i < array.length) {
			result += ("i= " + array[i]);
			i++;
		}
		log.info(result);
		return result;
	}

	public interface Car {
		public String getColor();
	}

	public class Sonata implements Car {
		public Sonata() {
			log.info("=== 출고 === Sonata");
		}

		@Override
		public String getColor() {
			return "=== 색상:RED === Sonata";

		}
	}

	public class K5 implements Car {
		public K5() {
			log.info("=== 출고 === K5");
		}

		@Override
		public String getColor() {
			return "=== 색상:Yello === K5";

		}
	}

	public String ex324() {
		Car car1 = new Sonata();
		String re1 = car1.getColor();
		Car car2 = new K5();
		String re2 = car2.getColor();

		String result = re1 + "<br>" + re2 + "<br>" + "차 두대 출고";
		log.info(result);
		return result;
	}

	public String ex325() {
		List<Integer> list = new ArrayList<>();
		String result = "";

		list.add(1);
		list.add(2);
		list.add(3);

		result = list.get(1).toString();

		return "인덱스 1번째 값: " + result;

	}

	public String ex326() {
		List<String> list = new ArrayList();

		list.add("public");
		list.add("static");
		list.add("void");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		list.remove(1);
		int voidIndex = list.indexOf("void");
		System.out.println("void의 index = " + voidIndex);
		return String.valueOf(voidIndex);

	}

	public String ex327() {
		String str1 = new String("is same?");
		String str2 = new String("is same?");

		boolean result = str1 == str2;

		return String.valueOf(result);
	}

	public String ex328() {
		String str1 = new String("is same?");
		String str2 = new String("is same?");

		boolean result = str1.equals(str2);

		return String.valueOf(result);
	}

	public String ex331() {
		List<String> list = new ArrayList<>();

		list.add("public");
		list.add("static");
		list.add("void");

		list.sort(new Comparator<String>() {
			@Override
			public int compare(String str1, String str2) {
				return str1.compareTo(str2);
			}
		});

		list.sort((Comparator<String>) (str1, str2) -> str1.compareTo(str2));
		return list.toString();
	}

	public String ex332() {
		List<String> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();

		list.add("public");
		list.add("static");
		list.add("void");

		list.stream().forEach(str -> sb.append(str).append("<br>"));

		return sb.toString();
	}

	public String ex333() {
		Integer[] integerArray = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> list = Arrays.asList(integerArray);
		
		String result = "";
		
		List evenList = new ArrayList<Integer>();

		for (int i = 0; i < list.size(); i++) {
			Integer number = list.get(i);
			if (number % 2 == 0) {
				evenList.add(number);
			}
		}
		
		for (int i = 0; i < evenList.size(); i++) {
			result += evenList.get(i) + "<br>";
		}
		return result;

	}

	public String ex334() {
		Integer[] integerArray = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		List<Integer> list = Arrays.asList(integerArray);
		
		List evenList = list.stream()
				.filter(value -> value % 2 == 0).collect(Collectors.toList());
		
		StringBuilder result = new StringBuilder();
		evenList.stream().forEach(value -> result.append(value).append("<br>"));
		return result.toString();
	}
}