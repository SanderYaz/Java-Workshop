package lab;
package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document

public class SearchEngine {

		Map<String,Set<String>> index = new HashMap<>();
		public void index(String url) throws Exception{
			
			Document doc = Jsoup.connect(url).get();
			String content = doc.text();
			Pattern p = Pattern.compile("\\b\\w+\\b");
			Matcher m = p.matcher(content);
			while(m.finf()) {
				String word = m.group();
				//System.out.println(word);
				Set<String> links = index.get(word);
				if(links == null) {
					links = new HashSet<>();
					links.add(url);
					index.put(word , links);
					}else {
						lins.add(url);
					}
			}
			
		}
		public Set<String> search(String input){
			return index.get(input);
		}
}
