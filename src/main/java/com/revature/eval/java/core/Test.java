package com.revature.eval.java.core;


public class Test {
	
	public static String changeWord(String word) { // applied to each word in the String[]
		String vowels = "aeiou";
		String changed = "";

		for(int i = 0, j = 1; j < word.length(); j++) {
			String chr = word.substring(i, j);

			if(vowels.contains(chr)) { // checks to see if there vowels at beginning of word
				return word.substring(i) + word.substring(0, i) + "ay";
			}else {
				i++;
			}
		}
		return changed;
	}
	public static String toPigLatin(String string) {
		String answer = "";
		String[] arr = string.split(" "); // splits string into separate words ...to loop through
		int i =0;
		// loop through each word and change it with changeWord() method above ^
		for(String s : arr) {
			if(i == arr.length -1) {
				answer += changeWord(s); 
			}else {
				answer += changeWord(s) + " ";
			}
			i++;
		}
		
		return answer;
	}

//	public static class AtbashCipher {
//
//		/**
//		 * Question 13
//		 * 
//		 * @param string
//		 * @return
//		 */
//		public static String encode(String string) {
//			// TODO Write an implementation for this method declaration
//			return null;
//		}
//
//		/**
//		 * Question 14
//		 * 
//		 * @param string
//		 * @return
//		 */// first join together, then 
//		public static String decode(String string) {
//			String decodedString = "";
//			string = string.replaceAll(" ", "");
//			for(int i=0; i<string.length(); i++) {
//				char ch = string.charAt(i);
//				if(Character.isLowerCase(ch)) {
//					// using ASCII Dec number of char to check if in or out of bounds -- 25pt. differenc.
//					if(ch <= 'm') {
//						char newLetter = (char) ('z' - (ch - 'a'));
//						decodedString += newLetter;
//					} else {
//						char newLetter = (char) ('a' + ('z' - ch));
//						decodedString += newLetter;
//					}
//				} else if(Character.isUpperCase(ch)) {
//					if(ch <= 'M') {
//						char newLetter = (char) ('Z' - (ch - 'A'));
//						decodedString += newLetter;
//					} else {
//						char newLetter = (char) ('A' + ('Z' - ch));
//						decodedString += newLetter;
//					}
//				} else {
//					decodedString += ch;
//				}
//			}
//			return  decodedString;
//		}
//}
	
	
	public static void main(String[] args) {
		
		System.out.println(toPigLatin("hello the the the brown owl says goodbye"));
//		public void testDecodeASentence() {
//			assertEquals("anobstacleisoftenasteppingstone",
//					EvaluationService.AtbashCipher.decode("zmlyh gzxov rhlug vmzhg vkkrm thglm v"));
		}
		
	}
	
//	static class RotationalCipher {
//		private int key;
//		
//
//		public int getKey() {
//			return key;
//		}
//
//		public RotationalCipher(int key) {
//			super();
//			this.key = key;
//		}
//
//		public String rotate(String string) {
//			String encryptedMsg = "";
//			for(int i=0; i<string.length(); i++) {
//				char ch = string.charAt(i);
//				if(Character.isLetter(ch)) {
//					if(Character.isLowerCase(ch)) {
//						char codeLetter = (char) (ch + this.getKey());
//						// checking if 'codeLetter' is out of bounds so that it goes back to 'z' re: ASCII Char #
//						if(codeLetter>'z') {
//							encryptedMsg += (char) (ch - (26 - this.getKey())); // CHECK
//						} else {
//							encryptedMsg += codeLetter; // if codeLetter < 'z', within bounds, fine.
//						}
//						// copied code for UpperCase letter...
//					} else if (Character.isUpperCase(ch)) {
//						char codeLetter = (char) (ch + this.getKey());
//					
//						if(codeLetter>'Z') { 
//							encryptedMsg += (char) (ch - (26 - this.getKey()));
//						} else {
//							encryptedMsg += codeLetter;
//						}
//					}
//				} else {
//					encryptedMsg += ch;
//				}
//			}
//			return encryptedMsg;
//		}
//		
//	}
