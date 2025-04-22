public class Template2 {
    static class Node{
        Node links[];
        int endwith;
        int countprefix;

        Node(){
            links = new Node[26];
            endwith=0;
            countprefix=0;
        }

        public void put(char ch,Node node){
            links[ch-'a'] = node;
        }

        public Node get(char ch){
            return links[ch-'a'];
        }

        public boolean containsKey(char ch){
            return links[ch-'a']!=null;
        }

        public void increaseEnd(){
            endwith++;
        }

        public void increaseprefix(){
            countprefix++;
        }

        public void deleteend(){
            endwith--;
        }

        public void reduceprefix(){
            countprefix--;
        }

        public int getend(){
            return endwith;
        }

        public int getprefix(){
            return countprefix;
        }
    }

    static class Trie{
        Node root;
        Trie(){
            root = new Node();
        }

        public void insert(String word){
            Node node = root;
            for(int i = 0;i<word.length();i++){
                char ch = word.charAt(i);
                if(!node.containsKey(ch)){
                    node.put(ch,new Node());
                }
                node = node.get(ch);
                node.increaseprefix();
            }
            node.increaseEnd();
        }

        public int countWordEqualsTo(String word){
            Node node = root;
            for(int i = 0;i<word.length();i++){
                char ch = word.charAt(i);
                if(!node.containsKey(ch)){
                    return 0;
                }
                node = node.get(ch);
            }
            return node.getend();
        }

        public int countWordsStartingWith(String word){
            Node node = root;
            for(int i = 0;i<word.length();i++){
                char ch = word.charAt(i);
                if(!node.containsKey(ch)){
                    return 0;
                }
                node = node.get(ch);
            }
            return node.getprefix();
        }

        public void erase(String word){
            Node node = root;
            for(int i = 0;i<word.length();i++){
                char ch = word.charAt(i);
                if(!node.containsKey(ch)){
                    return;
                }
                node=node.get(ch);
                node.reduceprefix();
            }
            node.deleteend();
        }
    }
}
