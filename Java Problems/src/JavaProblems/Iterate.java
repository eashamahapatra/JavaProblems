package JavaProblems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> TVSeries = new ArrayList<String>();
		TVSeries.add("GOT");
		TVSeries.add("Breaking Bad");
		TVSeries.add("Big Bang Theory");

		System.out.println("********Lambda*******");

		TVSeries.forEach(shows -> {
			System.out.println(shows);
		});

		System.out.println("*******Iterator********");

		Iterator<String> it = TVSeries.iterator();
		while (it.hasNext()) {
			String shows = it.next();
			System.out.println(shows);
		}

		System.out.println("*******Iterator-Lambda-Each Remaining********");

		Iterator<String> tt = TVSeries.iterator();
		tt.forEachRemaining(shows -> {
			System.out.println(shows);
		});

		System.out.println("*******For Each-Advance for loop********");

		for (String shows : TVSeries) {
			System.out.println(shows);
		}

		System.out.println("*******For Each-Simple for loop********");

		for (int i = 0; i < TVSeries.size(); i++) {
			System.out.println(TVSeries.get(i));
		}

		System.out.println("*******List Iterator********");

		ListIterator<String> lt = TVSeries.listIterator(TVSeries.size());
		while (lt.hasPrevious()) {
			String shows = lt.previous();
			System.out.println(shows);
		}

	}
}
