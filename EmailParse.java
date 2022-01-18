import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.util.List;
import java.util.Collections;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class EmailParse{

public static void main(String[]args) throws Exception {

  File f = new File("attendance.txt");
  Scanner scan = new Scanner(f);
  File out = new File("attendance_out.txt");
  BufferedWriter output = null;
  output = new BufferedWriter(new FileWriter(out));

  Map<String,ArrayList<String>> mp = new TreeMap<String,ArrayList<String>>();

  while (scan.hasNextLine()) {


    String s= scan.nextLine();
    Email email = new Email(s);
    String name = email.parseEmailName();
    String company = email.parseCompanyName();

    //System.out.println("name = "+ name + ", company = " + company );

    if(mp.containsKey(company)) {

    ArrayList<String> al_value;
    al_value = mp.get(company);
    al_value.add(name);
    Collections.sort(al_value);
    mp.put(company,al_value);



    }else {

    ArrayList <String> al = new ArrayList<String>();

    al.add(name);
    mp.put(company,al);
    }

/*
    Iterator itbill = mp.entrySet().iterator();
    while(itbill.hasNext()){
    Map.Entry<String,ArrayList<String>> entry1 = (Map.Entry)itbill.next();
    String key1 = entry1.getKey();
    ArrayList<String> value1 = entry1.getValue();

        if(value1.contains("bill.gates"))
        System.out.println("\n bill was here! ");
  }
*/
}
  Iterator it = mp.entrySet().iterator();
  while(it.hasNext()){
  Map.Entry<String,ArrayList<String>> entry = (Map.Entry)it.next();
  String key = entry.getKey();
  ArrayList<String> value = entry.getValue();
  	for (String str: value)
  	System.out.println(key + "\t" + str);

  }
  //bills attendance

  Iterator itbill = mp.entrySet().iterator();
  while(itbill.hasNext()){
  Map.Entry<String,ArrayList<String>> entry1 = (Map.Entry)itbill.next();
  String key1 = entry1.getKey();
  ArrayList<String> value1 = entry1.getValue();

      if(value1.contains("bill.gates"))
      System.out.println("\n Bill Gates was here! ");

}

//histogram

Iterator ithisto = mp.entrySet().iterator();
while(ithisto.hasNext()){
Map.Entry<String,ArrayList<String>> entry1 = (Map.Entry)ithisto.next();
String key1 = entry1.getKey();
ArrayList<String> value1 = entry1.getValue();

  System.out.println( "\n" + key1 + "|");
    for(int x =0; x<value1.size() ; x++)
    System.out.print(  " * " );



}
if ( output != null )
           output.close();
}
}
