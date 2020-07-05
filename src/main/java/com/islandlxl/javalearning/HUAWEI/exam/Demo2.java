package com.islandlxl.javalearning.HUAWEI.exam;

import java.util.*;

/*
@project:com.islandlxl.javalearning.HUAWEI.exam
@Title:Demo2
@Auther:lxl
@create:2020/7/4,18:08
*/public class Demo2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num1 = Integer.valueOf(scanner.nextLine());

            List<Integer> data = new ArrayList<>();
            List<Integer> data2 = new ArrayList<>();
            List<Node> tree = new ArrayList<>();
            while (num1 > 0) {
                String[] s = scanner.nextLine().split(" ");
                Node node1;
                Node node2;
                if (s.length == 2) {
                    if (!data.contains(Integer.valueOf(s[0]))) {
                        node1 = new Node(Integer.valueOf(s[0]));
                        data.add(Integer.valueOf(s[0]));
                        tree.add(node1);
                    }
                    if (!data.contains(Integer.valueOf(s[1]))) {
                        node2 = new Node(Integer.valueOf(s[1]));
                        data.add(Integer.valueOf(s[1]));
                        tree.add(node2);
                    }
                    for (int i = 0; i < tree.size(); i++) {

                        if (tree.get(i).val == Integer.valueOf(s[1])) {
                            for (int j = 0; j < tree.size(); j++) {

                                if (tree.get(j).val == Integer.valueOf(s[0])) {
                                    if (tree.get(i).left != null) {
                                        tree.get(i).right = tree.get(j);
                                    } else {
                                        tree.get(i).left = tree.get(j);
                                    }
                                }
                            }
                        }
                    }
                }
                num1--;
            }
            int target = Integer.valueOf(scanner.nextLine());


            Set<Integer> set = new TreeSet<>();
            for (int i = 0; i < tree.size(); i++) {
                if (tree.get(i).val == target) {
                    Node left;
                    Node right;
                    if (tree.get(i).left != null) {
                        left = tree.get(i).left;
                        data2.add(left.val);
                    }
                    if (tree.get(i).right != null) {
                        right = tree.get(i).right;
                        data2.add(right.val);
                    }
                    data2.add(target);
                }

            }
            for (int i = 0; i <data.size() ; i++) {
                boolean has=false;
                for(int j=0;j<data2.size();j++){
                    if (data.get(i)==data2.get(j)){
                        has=true;
                        break;
                    }
                }
                if (!has){
                    set.add(data.get(i));
                }

            }
            for (Integer s:set){

                if (s.equals(0))
                    continue;
                System.out.print(s+" ");
            }

        }
    }

    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public Node(int val) {
            this.val = val;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }
}
