package com.streamassignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class News {
	int newsId;
	String postedByUser;
	String commentByUser;
	String comment;

	public News(int newsId, String postedByUser, String commentByUser, String comment) {
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}

	public int getNewsId() {
		return newsId;
	}

	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}

	public String getPostedByUser() {
		return postedByUser;
	}

	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}

	public String getCommentByUser() {
		return commentByUser;
	}

	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", postedByUser=" + postedByUser + ", commentByUser=" + commentByUser
				+ ", comment=" + comment + "]";
	}
}
public class NewsAssign {
	public static int maxComments(List<News> news) {
		List<News>news1 = news;
		List<News> list=new ArrayList<>();
		int mx=0;
		list= news.stream()
		.filter(news2->news1.stream()
		.anyMatch(one->one.getNewsId()==news2.getNewsId() && one!=news2)).collect(Collectors.toCollection(ArrayList::new));
		//System.out.println(mx);
		Map<Integer,Integer>mp=new HashMap<>();
		for(News news2:list){
		if(mp.containsKey(news2.getNewsId())){
		mp.put(news2.getNewsId(),mp.get(news2.getNewsId())+1);
		}
		else{
		mp.put(news2.getNewsId(),1);
		}
		}

		Set s1 = mp.entrySet();
		Iterator itr = s1.iterator();

		int id=0;
		while(itr.hasNext()){
		Map.Entry m1 = (Map.Entry)itr.next();
		System.out.println(m1.getKey()+" "+m1.getValue());
		if(mx<(int)m1.getValue()) {
		mx = (int) m1.getValue();
		id = (int)m1.getKey();
		}

		}
		System.out.println(mx);
		return id;

		}


		public static int budgetCount (List < News > news) {
		String budget="budget";
		long budgtC=news.stream()
		.filter(p->p.getComment().contains(budget)).count();
		System.out.println(budgtC);
		return (int)budgtC;
		}

		public static String maxCommentsByUser (List < News > news) {
		List<News>news1 = news;
		List<News> list=new ArrayList<>();
		list= news.stream()
		.filter(news2->news1.stream()
		.anyMatch(one->one.getCommentByUser()==news2.getCommentByUser() && one!=news2)).collect(Collectors.toCollection(ArrayList::new));

		Map<String,Integer>mp=new HashMap<>();
		for(News news2:list){
		if(mp.containsKey(news2.getCommentByUser())){
		mp.put(news2.getCommentByUser(),mp.get(news2.getCommentByUser())+1);
		}
		else{
		mp.put(news2.getCommentByUser(),1);
		}
		}

		Set s1 = mp.entrySet();
		Iterator itr = s1.iterator();

		String id="";
		int mx=0;
		while(itr.hasNext()){
		Map.Entry m1 = (Map.Entry)itr.next();
		System.out.println(m1.getKey()+" "+m1.getValue());
		if(mx<(int)m1.getValue()) {
		mx = (int) m1.getValue();
		id = (String)m1.getKey();
		}

		}
		System.out.println(id);

		return id;
		}


		public static Map<String, Integer> sortMaxCommentsByUser (List < News > news) {

		Map<String,Long>mp1=new HashMap<>();
		mp1=news.stream().collect(Collectors.groupingBy(News::getCommentByUser,Collectors.counting()));


		List<Map.Entry<String, Long> > list =
		new LinkedList<Map.Entry<String, Long> >(mp1.entrySet());

		// Sort the list
		Collections.sort(list, new Comparator<Map.Entry<String, Long> >() {
		public int compare(Map.Entry<String, Long> o1,
		Map.Entry<String, Long> o2)
		{
		return -(o1.getValue()).compareTo(o2.getValue());
		}
		});

		HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Long> aa : list) {
		temp.put(aa.getKey(), (int) (long)aa.getValue());
		}
		return temp;

		}

	public static void main(String[] args) {
		News news1 = new News(1, "Nikki", "Sam", "comment");
		News news2 =new News(2, "Nikki1", "Sam1", "budget");
		News news3 = new News(1, "Nikki2", "Sam2", "comment");
		News news4 = new News(3, "Nikki3", "Sami", "budget");
		News news5 = new News(1, "Nikki4", "Sam2", "comment");
		News news6 = new News(3, "Nikki5", "Sam", "budget");
		News news7 = new News(1, "Nikki6", "Sam6" ,"comment");

		List<News> news = new ArrayList<>();
		news.add(news1);
		news.add(news2);
		news.add(news3);
		news.add(news4);
		news.add(news5);
		news.add(news6);
		news.add(news7);
		maxComments(news);
		budgetCount(news);
		maxCommentsByUser(news);
		System.out.println( sortMaxCommentsByUser(news));

	}

}
