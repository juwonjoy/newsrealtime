package com.cos.naverrealtime.batch;

import java.util.List;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.cos.naverrealtime.domain.News;
import com.cos.naverrealtime.domain.NewsRepository;
import com.cos.naverrealtime.util.NaverCraw;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class NewsBatch {
	private final NewsRepository newsRepository;
	private final NaverCraw naverCraw;
	
	
	@Scheduled(cron="0 0 1 * * ?")
	public void newsCrawStart() {
		List<News> newsList;
	
		//System.out.println("성공");
		
	}
}
