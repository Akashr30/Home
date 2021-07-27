package tries;

public class Trie {
	
	private TrieNode head;
	
	Trie () {
		head = new TrieNode('\0');
	}
	
	class TrieNode {
		 
		public char c;
		public boolean isWord;
		public TrieNode[] node;
		
		public TrieNode(char c) {
			this.c = c;
			this.isWord = false;
			this.node = new TrieNode[26];
		}
	}
	
	public void insert(String word) {
		TrieNode current = head;
		for (int i = 0 ; i < word.length() ; i++) {
			char c = word.charAt(i);
			if(current.node[c - 'a'] == null) {
				current.node[c-'a'] = new TrieNode(c);
			}
			current = current.node[c-'a']; 
		}
		current.isWord = true;
	}
	
	public boolean findWord(String word) {
		TrieNode node = getNode(word);
		return node != null && node.isWord;
	}
	
	public boolean startsWith(String prefix) {
		TrieNode node = getNode(prefix);
		return node != null;
	}
	
	
	public TrieNode getNode(String word) {
		TrieNode current = head;
		for (int i = 0 ; i < word.length() ; i++) {
			char c = word.charAt(i);
			if (current.node[c-'a'] == null) {
				return null;
			}
			current = current.node[c-'a'];
		}
		return current;
	}
	
	public static void main(String[] args) {
		
		Trie obj = new Trie();
		String str = "string";
		String str1 = "strip";
		obj.insert(str);
		obj.insert(str1);
	}
}
