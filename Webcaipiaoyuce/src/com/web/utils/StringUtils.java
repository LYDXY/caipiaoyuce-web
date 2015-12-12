package com.web.utils;

import java.io.IOException;  
import java.io.StringReader;  
import java.io.StringWriter;  
  
import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.blogspot.radialmind.html.HTMLParser;  
import com.blogspot.radialmind.html.HandlingException;  
import com.blogspot.radialmind.xss.XSSFilter;  

public class StringUtils {
	
	public static String converGb2312ToIso8859(String in){
		String out = null;
		try {
			byte[] ins = in.getBytes("gb2312");
			out = new String(ins,"iso-8859-1");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		
		return out;
	}
	
	public static String protectAgainstXSS( String html ) {  
        StringReader reader = new StringReader( html );  
        StringWriter writer = new StringWriter();  
        String text = null;  
        try {  
            // Parse incoming string from the "html" variable  
            HTMLParser.process( reader, writer, new XSSFilter(), true );   
            // Return the parsed and cleaned up string  
            text =  writer.toString();  
        } catch (HandlingException e) {  
            // Handle the error here in accordance with your coding policies...  
        }finally{  
            try {  
                writer.close();  
                reader.close();  
            } catch (IOException e) {                 
                e.printStackTrace();  
            }             
        }  
        return text;  
    }  
	
	public   static   String StringFilter(String str){     
		// 只允许字母和数字
		// String regEx = "[^a-zA-Z0-9]";
		// 清除掉所有特殊字符
		String regEx = "[`~!@#$%^&*()+=|{}':;',\\[\\]<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";
		Pattern p = Pattern.compile(regEx);
		Matcher m = p.matcher(str);
		return m.replaceAll("").trim();
	}  

}
