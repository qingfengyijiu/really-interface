package com.really.news.service;

import java.util.Map;

public interface NewsHelperService {

	@SuppressWarnings("rawtypes")
	Map fetchNews(String url);
}
