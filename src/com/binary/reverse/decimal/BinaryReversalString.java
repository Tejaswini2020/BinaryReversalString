package com.binary.reverse.decimal;

public class BinaryReversalString {

	private static String BinaryReversal(String str) {
		 int k = Integer.parseInt(str); 
		  String out = Integer.toBinaryString(k);
		  int size = out.length();
		  int j=8;
		    StringBuilder sb = new StringBuilder();
		    if( j > size ){
		        for( int i=0; i<j-size; i++ )
		            sb.append('0');
		       sb.append( out );
		    }else
		        sb = sb.append( out.substring(size-j, size) );
		    String revbinary = sb.reverse().toString();
	    	int d =Integer.parseInt(revbinary,2);
	    	 	String revrinaryrstring = String.valueOf(d);
		    return revrinaryrstring;

	}

	public static void main(String[] args) {

	String str ="47";
	System.out.println("Revesed Binary String Decimal Value is   "+BinaryReversalString.BinaryReversal(str));
}
}
