package com.core.tutorial.io;

import java.io.File;
import java.util.*;
import java.text.SimpleDateFormat;
import java.nio.file.Paths;

class FileTest {
	
static void p(String s) {
System.out.println(s);
}

public static void main(String args[]) {
	
	
//String path = Paths.get("").toAbsolutePath().toString();
//String path1 = System.getProperty("user.dir");
//File f1 = new File(".\\src\\com\\core\\tutorial\\io");
	
File f1 = new File("./src/com/core/tutorial/io");
p("File Name: " + f1.getName());
p("Path: " + f1.getPath());
p("Abs Path: " + f1.getAbsolutePath());
p("Parent: " + f1.getParent());
p(f1.exists() ? "exists" : "does not exist");
p(f1.canWrite() ? "is writeable" : "is not writeable");
p(f1.canRead() ? "is readable" : "is not readable");
p("is " + (f1.isDirectory() ? " a directory " : "not" + " a directory"));
p(f1.isFile() ? "is normal file" : "might be a named pipe");
p(f1.isAbsolute() ? "is absolute" : "is not absolute");
p("File last modified: " + f1.lastModified());
p("File size: " + f1.length() + " Bytes");

String lists[] = f1.list();
for (String list : lists) p(list);

p("****************************************");
File f2 = new File(f1, "TestFile1.txt");
p("File Name: " + f2.getName());
p("Path: " + f2.getPath());
p("Abs Path: " + f2.getAbsolutePath());
p("Parent: " + f2.getParent());
p(f2.exists() ? "exists" : "does not exist");
p(f2.canWrite() ? "is writeable" : "is not writeable");
p(f2.canRead() ? "is readable" : "is not readable");
p("is " + (f2.isDirectory() ? " a directory " : "not" + " a directory"));
p(f2.isFile() ? "is normal file" : "might be a named pipe");
p(f2.isAbsolute() ? "is absolute" : "is not absolute");
p("File last modified: " + f2.lastModified());
p("File size: " + f2.length() + " Bytes");

Date dd = new Date(f2.lastModified());
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
p("File Last Modified : " + sdf.format(dd));
} 
}
