package com.song.service.parser;

import com.song.entity.po.Company;
import com.song.utils.JsoupUtils;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 * @ description:
 * @ author: swg
 * @ created: 2018/2/12
 */
public class WuBaHtmlParser implements HtmlParser {

    public Company parserOne(String url) {
        Document doc = JsoupUtils.get(url);
        if (doc != null){
            Elements elements = doc.select("li");
            while (elements.hasText()){
                Elements next = elements.next();
                if (next.hasText()) {
                    if ("商家名称：".equals(next.text())) {

                    }else if ("联&nbsp;&nbsp;系&nbsp;&nbsp;人：".equals(next.text())){

                    }
                }
            }
        }
        return null;
    }
}
