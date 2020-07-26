package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TinyURL {
	
	  /*private static final String SEED = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	    private static final String BASE = "http://tinyurl.com/";

	    private static Map<String, String> keyToURL = new HashMap<>();
	    private static Map<String, String> urlToKey = new HashMap<>();

	    public static void main(String[] args) {
	        String tinyURL = encode("http://thisislongurl.com/abcd/123");
	        String longURL = decode(tinyURL);

	        System.out.println("tinyURL = " + tinyURL);
	        System.out.println("longURL = " + longURL);
	    }

	    public static String encode(String longUrl) {
	        if (longUrl == null || longUrl.isEmpty()) {
	            return null;
	        }
	        if (urlToKey.containsKey(longUrl)) {
	            return BASE + urlToKey.get(longUrl);
	        }

	        StringBuilder key = null;

	        // keep generating keys until a unique one is found
	        do {
	            key = new StringBuilder();
	            for (int i = 0; i < 6; i++) {
	                int r = (int)(Math.random() * SEED.length());
	                key.append(SEED.charAt(r));
	            }
	        } while (keyToURL.containsKey(key));

	        keyToURL.put(key.toString(), longUrl);
	        urlToKey.put(longUrl, key.toString());

	        return BASE + key;
	    }

	    public static String decode(String shortUrl) {
	        if (shortUrl == null || shortUrl.isEmpty()) {
	            return "";
	        }
	        String[] shortUrlSplits = shortUrl.split("/");
	        return keyToURL.get(shortUrlSplits[shortUrlSplits.length - 1]);
	    }*/
	
	Map<String, String> index = new HashMap<String, String>();
    Map<String, String> revIndex = new HashMap<String, String>();
    static String BASE_HOST = "http://tinyurl.com/";
    
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if (revIndex.containsKey(longUrl)) return BASE_HOST + revIndex.get(longUrl);
        String charSet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String key = null;
        do {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                int r = (int) (Math.random() * charSet.length());
                sb.append(charSet.charAt(r));
            }
            key = sb.toString();
        } while (index.containsKey(key));
        index.put(key, longUrl);
        revIndex.put(longUrl, key);
        return BASE_HOST + key;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return index.get(shortUrl.replace(BASE_HOST, ""));
    }
    
    public static void main(String[] ar) {
    	
    	TinyURL ty = new TinyURL();
    	String longUrl = "www.youtube.com/akash";
    	String encode = ty.encode(longUrl);
    	String decode = ty.decode(encode);
    	System.out.println(encode);
    	System.out.println(decode);
    	
    }
}
