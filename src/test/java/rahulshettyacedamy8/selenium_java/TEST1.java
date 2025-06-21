package rahulshettyacedamy8.selenium_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TEST1 {
	//count the number of names start with aplhabet A
//	@Test
	public void regular()
	{
		ArrayList<String> names=new ArrayList<String>();
		names.add("ABhijeet");
		names.add("Adam");
		names.add("DON");
		names.add("ALEKHYA");
		names.add("Ram");
		int count=0;
		for(int i=0;i<names.size();i++)
		{
			String actual=names.get(i);
			if(actual.startsWith("A"))
			{
				count++;
			}
		}
		System.out.println(count);
	}
	@Test
	public void streamFilter()

	{
		ArrayList<String> names=new ArrayList<String>();
		names.add("man");
		names.add("Adam");
		names.add("women");
		
		//There is no life for intermediate operation if there is no terminal operation(count)
		//terminal operation is executes only if intermediate opeartion (filter) returns true
		//we can create stream
		//how to use filter in stream API
		Long c=names.stream().filter(s->s.startsWith("A")).count();
	//	System.out.println("test2 "+c);
		long d=Stream.of("ABhijeet","Adam","DON","Alekhya","Rama").filter(s->
		{
		s.startsWith("A");
		return true;
	}).count();
	//	System.out.println(d);
		
		//print all names of arraylist
	//	names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	//	names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	}
	@Test
	public void streamMap()
	{
		ArrayList<String> names=new ArrayList<String>();
		names.add("man");
		names.add("Adam");
		names.add("women");
		//print names which have last letter as "a" with uppercase
		Stream.of("ABhijeet","Adam","DON","Alekhya","Rama").filter(s->s.startsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		List<String> sortnames=Arrays.asList("Azhijeet","Amam","DON","Alekhya","Rama");
	
	
	sortnames.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	//merging 2 diff lists
		
		Stream<String> newStream=Stream.concat(names.stream(), sortnames.stream());
		//newStream.sorted().forEach(s->System.out.println(s));
	
//	particular value present in the list or not
		boolean value=newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
	//	System.out.println(value);
		Assert.assertTrue(value);
	
	}
	
	@Test
	public void streamCollect()
	{
		//list
		//modify
		//prepare  new list
		List<String> list1=Stream.of("ABhijeet","Adam","DON","Alekhya","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());

	//	System.out.println(list1.get(0));
		
		List<Integer> names1=Arrays.asList(3,2,2,7,5,1,9,7);
		//print unique number from this
		//sort the array -->3rd index
		List<Integer> modifiedList=names1.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(modifiedList.get(2));
	}
}

