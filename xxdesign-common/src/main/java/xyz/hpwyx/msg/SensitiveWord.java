package xyz.hpwyx.msg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.*;

/** 
 *  敏感词过滤 工具类
 *
 * @author tid
 * @version 0.1 
 * @CreateDate 2019年5月10日 15:28:32
 */  
public class SensitiveWord {
    private StringBuilder replaceAll;//初始化
    private String encoding = "UTF-8";  
    private String replceStr = "*";  
    private int replceSize = 500;  
    private String fileName = "CensorWords.txt";
    private static List<String> arrayList;
    public static Set<String> sensitiveWordSet;//包含的敏感词列表，过滤掉重复项
    private static List<String> sensitiveWordList;//包含的敏感词列表，包括重复项，统计次数
    
    /** 
     * 文件要求路径在src或resource下，默认文件名为CensorWords.txt 
     * @param fileName 词库文件名(含后缀) 
     */  
    public SensitiveWord(String fileName)  
    {  
        this.fileName = fileName;  
    }  
      
    /** 
     * @param replceStr 敏感词被转换的字符 
     * @param replceSize 初始转义容量 
     */  
    public SensitiveWord(String replceStr, int replceSize)
    {  
        this.replceStr = fileName;  
        this.replceSize = replceSize;  
    }  
      
    public SensitiveWord()  
    {  
    }  
    
    /** 
     * @param str 将要被过滤信息 
     * @return 过滤后的信息 
     */  
    public String filterInfo(String str)  
    {  	sensitiveWordSet = new HashSet<String>();
    	sensitiveWordList= new ArrayList<>();
        StringBuilder buffer = new StringBuilder(str);  
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>(arrayList.size());  
        String temp;  
        for(int x = 0; x < arrayList.size();x++)  
        {  
            temp = arrayList.get(x);  
            int findIndexSize = 0;
            /**
             * 1：遍历敏感词库，采用indexOf()来循环查询信息中是否含有此敏感数据
             * 2：利用hashMap的来记录敏感在信息的key(起始位置)和最大的value(结束位置)
             * 3：然后再遍历hashMap，得到每一组的start,end  再使用StringBuilder.replace(start,end,str)来替换敏感信息
             */
            for(int start = -1;(start=buffer.indexOf(temp,findIndexSize)) > -1;)  
            {  
            	//System.out.println("###replace="+temp);
                findIndexSize = start+temp.length();//从已找到的后面开始找  
                Integer mapStart = hash.get(start);//起始位置  
                if(mapStart == null || (mapStart != null && findIndexSize > mapStart))//满足1个，即可更新map  
                {  
                    hash.put(start, findIndexSize); 
                    //System.out.println("###敏感词："+buffer.substring(start, findIndexSize));
                }  
            }  
        }  
        Collection<Integer> values = hash.keySet();  
        for(Integer startIndex : values)  
        {  
            Integer endIndex = hash.get(startIndex);  
            //获取敏感词，并加入列表，用来统计数量
            String sensitive = buffer.substring(startIndex, endIndex);
            //System.out.println("###敏感词："+sensitive);
            if (!sensitive.contains("*")) {//添加敏感词到集合
            	sensitiveWordSet.add(sensitive);
            	sensitiveWordList.add(sensitive);
			}
            buffer.replace(startIndex, endIndex, replaceAll.substring(0,endIndex-startIndex));
        }  
        hash.clear();  
        return buffer.toString();  
    }  
    /** 
     *   初始化敏感词库 
     */  
    public void InitializationWork()  
    {  
        replaceAll = new StringBuilder(replceSize);  
        for(int x=0;x < replceSize;x++)  
        {  
            replaceAll.append(replceStr);  
        }  
        //加载词库  
        arrayList = new ArrayList<String>();  
        InputStreamReader read = null;  
        BufferedReader bufferedReader = null;  
        try {  
            read = new InputStreamReader(SensitiveWord.class.getClassLoader().getResourceAsStream(fileName),encoding);
            bufferedReader = new BufferedReader(read);  
            for(String txt = null;(txt = bufferedReader.readLine()) != null;){  
                if(!arrayList.contains(txt))  
                    arrayList.add(txt);  
            }  
        } catch (UnsupportedEncodingException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }finally{  
            try {  
                if(null != bufferedReader)  
                bufferedReader.close();  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
            try {  
                if(null != read)  
                read.close();  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
    }  
    
    public StringBuilder getReplaceAll() {  
        return replaceAll;  
    }  
    public void setReplaceAll(StringBuilder replaceAll) {  
        this.replaceAll = replaceAll;  
    }  
    public String getReplceStr() {  
        return replceStr;  
    }  
    public void setReplceStr(String replceStr) {  
        this.replceStr = replceStr;  
    }  
    public int getReplceSize() {  
        return replceSize;  
    }  
    public void setReplceSize(int replceSize) {  
        this.replceSize = replceSize;  
    }  
    public String getFileName() {  
        return fileName;  
    }  
    public void setFileName(String fileName) {  
        this.fileName = fileName;  
    }  
    public List<String> getArrayList() {  
        return arrayList;  
    }  
    public void setArrayList(List<String> arrayList) {  
        this.arrayList = arrayList;  
    }  
    public String getEncoding() {  
        return encoding;  
    }  
    public void setEncoding(String encoding) {  
        this.encoding = encoding;  
    }  
    
    public static void main(String[] args){
    	long startNumer = System.currentTimeMillis();
		SensitiveWord sw = new SensitiveWord("CensorWords.txt");  
	    sw.InitializationWork();  
	    System.out.println("敏感词的数量：" + arrayList.size());
	    String str = "冰毒";
	    System.out.println("被检测字符串长度:"+str.length());  
	    str = sw.filterInfo(str);  
	    long endNumber = System.currentTimeMillis();  
	    System.out.println("语句中包含敏感词的个数为：" + SensitiveWord.sensitiveWordSet.size() + "。包含：");
	    System.out.println("语句中包含敏感词的个数为：" + sensitiveWordList.size() + "。包含：" + sensitiveWordList);
	    System.out.println("总共耗时:"+(endNumber-startNumer)+"ms");
	    System.out.println("替换后的字符串为:\n"+str);  
	}
}  

