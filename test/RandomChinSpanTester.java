package test;

import java.util.Iterator;
import java.util.List;

import model.SentencePC;

public class RandomChinSpanTester {
	public static void main(String[] args) {
		SentencePC p = new SentencePC();
		List<String> l = p.getChineseSpans();
		Iterator<String> it = l.iterator();
		String s = "";
		while (it.hasNext()) {
			s += it.next();
		}
		System.out.println(s);
	}
}
