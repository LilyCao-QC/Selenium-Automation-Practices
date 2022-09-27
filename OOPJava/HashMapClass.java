package OOPJava;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapClass {

    public static void main(String[] args) {

        // 1. using HashMap for simple object - student ID and name
        Map<Integer,String> myStudentLiat = new HashMap<>();
        // Add new student to myStudentList
        myStudentLiat.put(100, "A");
        myStudentLiat.put(101, "B");
        myStudentLiat.put(102, "C");
        System.out.println("Student Name with id is:" + myStudentLiat.get(100));
        System.out.println("Check size of Hashmap: " + myStudentLiat.size());
        // Replace B to newB
        myStudentLiat.replace(101,"B", "newB");
        System.out.println("Student B is change to: " + myStudentLiat.get(101));

        //Remove C
        myStudentLiat.remove(102);
        System.out.println("Check size of Hashmap after remove: " + myStudentLiat.size());

        //get set Key, value from Map list
        Set<Integer> keySet = myStudentLiat.keySet();
        for (int studentID : keySet ) {
            System.out.println("ID student " + studentID + " have name: " + myStudentLiat.get(studentID));    // print list student ID and ID
        }

        // 2. Using Hashmap for complex object - student ID, <name and address>
        Map<Integer,Map<String,String>> complexStudentList = new HashMap<>();   // Map<Interger, StringObject>

        Map<String,String> s1 =  new HashMap<>();
        Map<String,String> s2 =  new HashMap<>();

        s1.put("name","Ken");
        s1.put("address","HCM");

        s2.put("name","Kenji");
        s2.put("address","Da Lat");

        complexStudentList.put(001, s1);
        complexStudentList.put(002, s2);

        String s1Name = complexStudentList.get(001).get("name");
        String s1Addr = complexStudentList.get(001).get("address");

        System.out.println(s1Name + " " + s1Addr);  // print Name and Address

        //Usign lamda expression to print list
        complexStudentList.forEach((key,value)-> {
            System.out.print(complexStudentList.get(key).get("name"));
            System.out.print(" live in ");
            System.out.println(complexStudentList.get(key).get("address"));
        });
    }
}
