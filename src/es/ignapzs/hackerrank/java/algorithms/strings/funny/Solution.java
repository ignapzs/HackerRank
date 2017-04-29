package es.ignapzs.hackerrank.java.algorithms.strings.funny;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws IOException {
		StringBuffer sb = new StringBuffer();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// For each one of the test cases...
		for (byte T = Byte.parseByte(br.readLine()); T > 0; --T) {
			// We check if the given input is funny
			sb.append(isFunny(br.readLine().toCharArray()) ? "Funny\n" : "Not Funny\n");
		}
		System.out.print(sb);
	}

	private static boolean isFunny(final char[] S) {
		for (int i = 0, n = S.length - 2; i < n; ++i, --n) {
			if (Math.abs(S[i] - S[i + 1]) != Math.abs(S[n] - S[n + 1])) {
				return false;
			}
		}
		return true;
	}
}