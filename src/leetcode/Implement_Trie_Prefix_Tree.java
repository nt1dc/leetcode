package leetcode;


public class Implement_Trie_Prefix_Tree {
    static class TrieNode {
        char character;
        boolean isWord;
        TrieNode[] trieNodes = new TrieNode[26];

        TrieNode(char c) {
            this.character = c;
        }

    }

    static class Trie {
        private TrieNode root;

        public Trie() {
            root = new TrieNode(' ');
        }

        public void insert(String word) {
            TrieNode currentNode = root;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (currentNode.trieNodes[c - 'a'] == null) currentNode.trieNodes[c - 'a'] = new TrieNode(c);
                currentNode = currentNode.trieNodes[c-'a'];
            }
            currentNode.isWord = true;
        }

        public boolean search(String word) {
            TrieNode currentNode = root;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (currentNode.trieNodes[c - 'a'] == null) return false;
                currentNode = currentNode.trieNodes[c - 'a'];
            }
            return currentNode.isWord;
        }

        public boolean startsWith(String prefix) {
            TrieNode currentNode = root;
            for (int i = 0; i < prefix.length(); i++) {
                char c = prefix.charAt(i);
                if (currentNode.trieNodes[c - 'a'] == null) return false;
                currentNode = currentNode.trieNodes[c - 'a'];
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Trie obj = new Trie();
        obj.insert("word");
        boolean param_2 = obj.search("wordd");
        boolean param_3 = obj.startsWith("w");
        System.out.println(param_3);
        System.out.println(param_2);

    }

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
}
