
public class StenSaxP�se {

	public static void main(String[] args) {
		
		var dator = Math.random();
		dator = dator * 2;
		dator =Math.round(dator);
		console.log(dator);
		
		
		var user = prompt("v�lj sten, sax eller p�se").toLowerCase();
	
			while ((user == "sten") && (user != "sax") && (user!="p�se"))

			{
				user= prompt("v�lj sten, sax eller p�se").toLowerCase();
			}
