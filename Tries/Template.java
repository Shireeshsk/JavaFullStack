public class Template{
    static class Node{
        Node links[] = new Node[26];
        boolean flag;
        Node(){
            this.links = new Node[26];
            this.flag = false;
        }
        
        public boolean containsKey(char ch){
            return links[ch-'a']!=null;
        }

        public void put(char ch,Node node){
            links[ch-'a'] = node;
        }

        public Node get(char ch){
            return links[ch-'a'];
        }

        public void setEnd(){
            flag = true;
        }

        public boolean isEnd(){
            return flag;
        }
    }

    static class Trie{
        Node root;
        Trie(){
            this.root = new Node();
        }

        public void insert(String str){
            Node node = root;
            for(int i = 0;i<str.length();i++){
                if(!node.containsKey(str.charAt(i))){
                    node.put(str.charAt(i),new Node());
                }
                node = node.get(str.charAt(i));
            }
            node.setEnd();
        }

        public boolean search(String str){
            Node node = root;
            for(int i =0;i<str.length();i++){
                char ch = str.charAt(i);
                if(!node.containsKey(ch)){
                    return false;
                }
                node = node.get(ch);
            }
            return node.isEnd();
        }

        public boolean startsWith(String str){
            Node node = root;
            for(int i = 0;i<str.length();i++){
                char ch = str.charAt(i);
                if(!node.containsKey(ch)){
                    return false;
                }
                node = node.get(ch);
            }
            return true;
        }
    }

    public static void main(String[] args) {
        String arr[] = {"apple","apps","apxl","bac","bat"};
        Trie trie = new Trie();
        for(String str:arr){
            trie.insert(str);
        }
        System.out.println(trie.search("apps"));
        System.out.println(trie.startsWith(""));
    }
}