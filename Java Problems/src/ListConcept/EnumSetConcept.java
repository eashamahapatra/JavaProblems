package ListConcept;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetConcept {

	enum Lang {
		JAVA, CSHARP, JAVASCRPT, PYTHON, RUBY
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create new list
		EnumSet<Lang> langs1 = EnumSet.allOf(Lang.class);
		System.out.println(langs1);
		System.out.println();
		// create null list
		EnumSet<Lang> langs2 = EnumSet.noneOf(Lang.class);
		System.out.println(langs2);
		System.out.println();
		// create range list
		EnumSet<Lang> langs3 = EnumSet.range(Lang.JAVA, Lang.PYTHON);
		System.out.println(langs3);
		System.out.println();
		// create list for only elements
		EnumSet<Lang> langs4 = EnumSet.of(Lang.JAVA, Lang.PYTHON);
		System.out.println(langs4);
		System.out.println();
		//
		EnumSet<Lang> lang1 = EnumSet.allOf(Lang.class);
		EnumSet<Lang> lang2 = EnumSet.noneOf(Lang.class);
		lang2.add(Lang.JAVASCRPT);
		System.out.println(lang2);
		System.out.println();
		lang2.addAll(lang1);
		System.out.println(lang2);
		System.out.println();
		
		Iterator<Lang> it= langs1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println();
		langs1.remove(Lang.CSHARP);
		System.out.println(langs1);
		System.out.println();
		
		langs1.removeAll(langs1);
		System.out.println(langs1);
		
	}

}
