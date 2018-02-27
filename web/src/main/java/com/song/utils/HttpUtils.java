package com.song.utils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * @ description:
 * @ author: swg
 * @ created: 2018/2/12
 */
public class HttpUtils {

    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("http://cd.58.com/hunqing").get();
        System.out.println(doc.head());
        System.out.println(doc.title());
    }

}
