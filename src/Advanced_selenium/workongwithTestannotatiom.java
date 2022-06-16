package Advanced_selenium;

import org.testng.annotations.Test;

public class workongwithTestannotatiom {
@Test(groups="smokes")
public void food(){
	System.out.println("roti");
	System.out.println("chapati");
}
@Test(dependsOnMethods="food")
public void sports(){
	System.out.println("cricket");
	System.out.println("football");
}
@Test
public void film(){
	System.out.println("KGF");
	System.out.println("KGF-2");
}
@Test(groups="smokes")
public void anime(){
	System.out.println("demon slayer");
	System.out.println("AOT");
}
}
