package com.codingdojo.Trie;

import java.util.Set;

public class TrieTest {
	public static void main(String[] args) {
		Trie trie = new Trie();
		trie.insertWord("car");
		trie.insertWord("card");
		trie.insertWord("chip");
		trie.insertWord("trie");
		trie.insertWord("try");

		Set<Character> keys = trie.root.children.keySet();
		for (Character key : keys) {
			System.out.println(key);

			for (Character key1 : keys) {
				System.out.println(key1);
			}

		}
	}
}