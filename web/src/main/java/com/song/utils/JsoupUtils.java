package com.song.utils;

import com.google.common.collect.Maps;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Map;

/**
 * @ description:
 * @ author: swg
 * @ created: 2018/2/12
 */
public class JsoupUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsoupUtils.class);

    public static Document get(String url){
        Map<String, String> headers = Maps.newHashMap();
        headers.put("Connection", "Keep-Alive");
        headers.put("Accept", "text/html, application/xhtml+xml, */*");
        headers.put("Accept-Language", "en-US,en;q=0.8,zh-Hans-CN;q=0.5,zh-Hans;q=0.3");
        headers.put("User-Agent", "Mozilla/5.0 (Windows NT 6.3; WOW64; Trident/7.0; rv:11.0) like Gecko");
        try {
            return Jsoup.connect(url).headers(headers).timeout(5000).followRedirects(true).get();
        } catch (IOException e) {
            LOGGER.error("Jsoup.get出现异常：url: {}, \n 异常：{}", url, e);
            return null;
        }
    }

    public static void main(String[] args) {
        String[] split = get("http://t5846132961286913.5858.com/contactus/").select("li > span").text().split(" ");
        for (String str : split){
            System.out.println(str);
        }
    }

}
