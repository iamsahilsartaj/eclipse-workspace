
import java.lang.*;
import java.io.*;
import java.util.*;

// Class of ReverseString
class Reverse {
	public static void main(String[] args)
	{
		String input = "abcde";

		char[] try1 = input.toCharArray();

		for (int i = try1.length - 1; i >= 0; i--)
			System.out.print(try1[i]);
	}
}
