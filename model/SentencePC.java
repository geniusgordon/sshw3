package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SentencePC extends AbstractSentence {

	@Override
	public List<String> getRandomizedChineseSpans() {
		// TODO Auto-generated method stub
		List <Integer> list = this.randomIndexes();
		List <String> chin = new ArrayList <String>();
		Iterator it = list.iterator();
		while (it.hasNext()) {
			int i = (Integer)it.next();
			chin.add(this.elementList.get(i).chiField);
		}
		return chin;
	}

	@Override
	public List<String> getRandomizedChineseSpansWithLevel(int level) {
		// TODO Auto-generated method stub
		List <String> ran;
		String s = getChineseSpans().toString();
		do {
			ran = getRandomizedChineseSpans();
		} while (false);
		return null;
	}

	@Override
	public int score(List<String> candidate) {
		// TODO Auto-generated method stub
		return 0;
	}

}
