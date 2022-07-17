package br.com.globallabs.exemplo.maven;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class ExemploMavenApplication {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String size_list = in.nextLine();
		Integer size = Integer.parseInt(size_list);


		Set<String> pair_name = new HashSet<>();
		List<Integer> list_count = new ArrayList();

		for (int i = 0; i < size; i++) {
			String pair = in.nextLine();
			String[] pair_string = pair.split(" ");
			pair_name.add(pair_string[0] + "-" + pair_string[1]);
			list_count.add(pair_name.size());
		}

		for (int m  = 0; m < size; m++) {
			System.out.println(list_count.get(m));
		}
	}
}
