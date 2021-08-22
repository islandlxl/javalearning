package com.islandlxl.javalearning.LeeCode.String;

import java.util.*;

/**
 * https://leetcode-cn.com/problems/minimum-window-substring/
 * 76. 最小覆盖子串
 */
public class MinimumSubStr {

    private static String sourceStr;
    private static String targetStr;
    private static Map<Character,Integer> sourceMap;
    private static Map<Character,Integer> targetMap;
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()){
//            String lineS = scanner.nextLine();
//            String lineT = scanner.nextLine();
//            MinimumSubStr minimumSubStr = new MinimumSubStr();
//            String minWindow = minimumSubStr.minWindow(lineS, lineT);
//            System.out.println("得到的结果为:"+minWindow);
//        }

        String s="asfasg";
        System.out.println(s.substring(3));
    }
    //自研--滑动窗口解决问题
    public String minWindow(String s, String t) {
        sourceStr=s;
        targetStr=t;
        sourceMap=new HashMap<>();
        targetMap=new HashMap<>();
        initMap(s,sourceMap);
        initMap(s,targetMap);
        int left =0;
        int right=0;
        Map<Character,Integer> currMap=new HashMap<>();
        List<String> resultList = new ArrayList<>();

        putOrRemValToMap(left,currMap,true);

        Dfs(resultList,left,right,sourceStr.substring(left,right+1).length(),currMap);
        String minLenStr = getMinLenStr(resultList);
        return minLenStr;
    }
    public String getMinLenStr(List<String> resultList){
        Map<Integer,String> staticMap=new HashMap();
        int min=100;
        for (int i = 0; i <resultList.size() ; i++) {
            String s = resultList.get(i);
            staticMap.put(s.length(),s);
             min=Math.min(s.length(),min);
        }

        return staticMap.get(min);
    }
    public void Dfs(List<String> resultList, int left, int right,int len, Map<Character,Integer> currMap){
        if (left<0||right>sourceStr.length()+1||right<left){
            return ;
        }
        if (len>=targetStr.length()&&check(left,right,currMap)){
            left+=1;
            putOrRemValToMap(left,currMap,false);
            Dfs(resultList,left,right,len,currMap);
            resultList.add(sourceStr.substring(left,right+1));
            currMap.clear();
        }else{
            right+=1;
            putOrRemValToMap(right,currMap,true);
             len=sourceStr.substring(left,right+1).length();
             Dfs(resultList,left,right,len,currMap);
        }


    }
    public void putOrRemValToMap(int num,Map<Character,Integer> currMap,boolean isAdd){
        if (num<0||num>sourceStr.length()){
            return;
        }
        char c = sourceStr.charAt(num);
        if (isAdd){
            if (!currMap.containsKey(c)){
                currMap.put(c,1);
            }else{
                currMap.put(c,currMap.get(c)+1);
            }
        }else{
            if (currMap.containsKey(c)){
                if (currMap.get(c)>1){
                    currMap.put(c,currMap.get(c)-1);
                }else{
                    currMap.remove(c);
                }
            }
        }

    }

    public boolean check(int left,int right,Map<Character,Integer> currMap){
        if (left<0||right>sourceStr.length()+1){
            return false;
        }
        String subStr= sourceStr.substring(left, right + 1);
        initMap(subStr,currMap);
        for (Character c :targetMap.keySet()){
            Integer tN = targetMap.isEmpty()?targetMap.get(c):0;
            Integer cN = currMap.isEmpty()?currMap.get(c):0;
            if (tN!=cN){
                return  false;
            }
        }
        return true;
    }

    public void initMap(String str,Map<Character,Integer> map){
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!map.containsKey(c)){
                map.put(c,1);
            }else{
                map.put(c,map.get(c)+1);
            }
        }
    }
}
