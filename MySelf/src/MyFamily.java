
public class MyFamily {
String fname;
String lname;
String profession;
int age;
String type;
String religion;
 
MyFamily(String firstName,String lastName,String personProfession,int personAge,String familyType,String personReligion){
	fname = firstName;
	lname = lastName;
	profession = personProfession;
	age = personAge;
	type = familyType;
	religion = personReligion;
    
}
void showDetails() {
	System.out.println("============================================================================================");
	System.out.println("My name is " +fname+" "+lname);
	System.out.println("I am a " + profession);
	System.out.println("I am " + age + " years old");
	System.out.println("I am a " + religion);
	System.out.println("I am the  " + type +" " +"of Ofoe Hadjor");
	System.out.println("============================================================================================");
	System.out.println("\n");
	
	
}
}
