package VK;

import java.io.File;

class xc {
		  public static void main(String[] args) {

		    // creates a file object
		    File file = new File("C:\\Users\\Guest User\\Desktop\\Java File");

		    // returns an array of all files
		    String[] fileList = file.list();

		    for(String str : fileList) {
		      System.out.println(str);
		    }
		  }
		}


