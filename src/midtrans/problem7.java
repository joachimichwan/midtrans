package midtrans;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class problem7 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		Customer customer = new Customer();
		int length = Integer.parseInt(reader.readLine());

		for (int i = 0; i < length; i ++){
			String read = reader.readLine();
			String[] input = read.split(" ");
			if (input[0].equalsIgnoreCase("add")) {
				String inputTambah = input[1];
				customer.add(inputTambah);
			} else if (input[0].equals("find")) {
				String find = input[1];
				customer.find(find);
			}
		}		
	}
}

class Customer{
	private ArrayList<String> customer;
	
	public Customer(){
		this.customer = new ArrayList<String>();
	}

	public ArrayList<String> getCustomer() {
		return customer;
	}

	public void setCustomer(ArrayList<String> customer) {
		this.customer = customer;
	}
	
	public void add(String x){
		customer.add(x);
	}
	
	public void find(String x){
		int count = 0;
		for(int i = 0; i < customer.size(); i++){
			if(customer.get(i).substring(0,x.length()).equalsIgnoreCase(x)){
				count++;
			}
		}
		
		if(count > 1){
			System.out.println(count + " # because there are " + count + " names started with '" + x + "'");			
		} else {
			System.out.println(count + " # because there is " + count + " names started with '" + x + "'");
		}
	}
	
}
