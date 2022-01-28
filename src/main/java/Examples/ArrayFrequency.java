package Examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayFrequency {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();

		System.out.println("Informe o tamanho da lista");

		int size = scanner.nextInt();

		while (list.size() < size) {

			list.add(scanner.nextInt());

		}

		System.out.println(list);

		list.stream().filter(t -> Collections.frequency(list, t) == 1).forEach(key -> System.out.println(key));

	}
}
