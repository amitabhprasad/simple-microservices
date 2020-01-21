package com.example.demo;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SentenceController {
	
	@Value("${verbs}") String verbs;
	@Value("${adjectives}") String adjectives;
	@Value("${article}") String articles;
	@Value("${noun}") String nouns;
	@Value("${subject}") String subjects;
	
	@GetMapping("/sentence")
	  public @ResponseBody String getWord() {
		
		String subject, verb, article, adjective,noun;
	    
		String[] subjectArray = subjects.split(",");
	    int i = (int)Math.round(Math.random() * (subjectArray.length - 1));
	    	subject= subjectArray[i];
	    	
	    	String[] verbsArray = verbs.split(",");
	    int j = (int)Math.round(Math.random() * (verbsArray.length - 1));
	    	verb= verbsArray[j];
	    	
	    	String[] articleArray = articles.split(",");
	    int k = (int)Math.round(Math.random() * (articleArray.length - 1));
	    article= articleArray[k];
	    	
	    	String[] adjectivesArray = adjectives.split(",");
	    int x = (int)Math.round(Math.random() * (adjectivesArray.length - 1));
	    	adjective= adjectivesArray[x];
	    
	    	String[] nounArray = nouns.split(",");
	    int y = (int)Math.round(Math.random() * (nounArray.length - 1));
	    	noun= nounArray[y];
		    	
	    	
	    	return subject+" "+verb+" "+article+" "+adjective+" "+noun;
	  }

}
