package com;

import java.util.HashMap;
import java.util.Map;

public class Codec {

	String str = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String prex = "http://tinyurl.com/";
	Map<String, String> cache = new HashMap<String, String>();
	int count = 1;

	// Encodes a URL to a shortened URL.
	public String encode(String longUrl) {
		String key = getUrl();
		cache.put(key, longUrl);
		count++;
		return prex + key;
	}

	// Decodes a shortened URL to its original URL.
	public String decode(String shortUrl) {
		return cache.get(shortUrl.replace(prex, ""));
	}

	public String getUrl() {
		int c = count;
		StringBuffer sb = new StringBuffer();
		while (c > 0) {
			sb.append(str.charAt((c % 62)));
			c /= 62;
		}
		return sb.toString();
	}
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
