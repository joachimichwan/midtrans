package midtrans;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem6{
	
	public static void main(String[]args)  throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input1 = reader.readLine();
		String input2 = reader.readLine();
		
		checking(input1, input2);
	}
	
	public static void checking(String input1, String input2){
		String x = "";
		int outputLength;
		String input = input1 + input2;
		String y = "";
		String[] string1 = new String[input1.length()];
		String[] string2 = new String[input2.length()];
		
		for (int i = 0; i < input1.length(); i++){
			string1[i] = input1.charAt(i) + "";
		}
		
		for (int i = 0; i < input2.length(); i++){
			string2[i] = input2.charAt(i) + "";
		}
		
		for(int i = 0; i < string1.length; i++){
			for(int j = 0; j < string2.length; j++){
				if(string1[i].equalsIgnoreCase(string2[j])){
					if(!x.contains(string1[i])){
						x += string1[i];
					}
					if(x.contains(string2[i])){
						x += string2[i];
					}
				}
			}
		}
		
		for(int i = 0; i < x.length(); i++){
			for(int j = 0; j < input.length(); j++){
				if(!x.contains(input.charAt(j) + "")){
					if(!y.contains(input.charAt(j) + "")){
						y += input.charAt(j) + "";
						System.out.println(y);
					}
				}
			}
		}

		outputLength = y.length();
		String out = "";
		
		for (int i = 0; i < outputLength; i++){
			if(out.length() > 0){
				out += "," + y.charAt(i);				
			} else {
				out += y.charAt(i) + "";				
			}
		}
		
		String output = outputLength + "# removing " + out;
		
		System.out.println (output);
	}
}


