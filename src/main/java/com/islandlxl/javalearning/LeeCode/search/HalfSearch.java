//package com.islandlxl.javalearning.LeeCode.search;
//
///**
// * 二分查找
// */
//public class HalfSearch {
//
//    public static void main(String[] args) {
//
//    }
//    public int firstBadVersion(int n) {
//        int left=1;
//        int right=n;
//        while (left<=right){
//            int mid=left+(right-left)/2;
//            if (isBadVersion(mid)){
//                right=mid;
//            }else{
//                left=mid+1;
//            }
//        }
//        return left;
//
//    }
//}
