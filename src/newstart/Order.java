package newstart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

class Item {
	int price;
	int qty;

	public Item(int price, int qty) {
		super();
		this.price = price;
		this.qty = qty;
	}

}

public class Order {
	public static void main(String[] args) {
		List<Item> or = new ArrayList<Item>();
		Item i1 = new Item(10, 99);
		Item i2 = new Item(10, 109);
		Item i3 = new Item(10, 199);
		Item i4 = new Item(10, 299);
		Item i5 = new Item(10, 399);
		or.add(i1);
		or.add(i2);

		or.add(i3);
		or.add(i4);
		or.add(i5);

		HashMap<String, Item> hm = new HashMap<>();
		for (Item i : or) {
			String key = "";
			if (i.qty >= 0 && i.qty <= 100) {
				key = "0to100";
			} else if (i.qty >= 100 && i.qty <= 200) {
				key = "100to200";
			} else if (i.qty >= 200 && i.qty <= 300) {
				key = "2000to300";
			} else {
				key = "300+";
			}
			hm.put(key, i);

		}
		
		
		Predicate<Integer> p = (a -> a % 2 == 0);
		System.out.println(p.test(2));

		Function<Integer, Integer> f = a -> a + 5;
		System.out.println(f.apply(5));

		BiFunction<Integer, Integer, Integer> f1 = (a, b) -> a + b + 5;
		BiFunction<Integer, Integer, Integer> andThen = f1.andThen(f);
		System.out.println(andThen.apply(1, 1));

		
		Consumer<Integer> c=(a->System.out.println(a));
		c.accept(5);
		
		Supplier<String> s=()->"hello neml";
		System.out.println(s.get());
		// System.out.println(hm);
	}
}
