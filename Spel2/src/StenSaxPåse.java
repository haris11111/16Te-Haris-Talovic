
public class StenSaxPåse {

	public static void main(String[] args) {
		
		var dator = Math.random();
		dator = dator * 2;
		dator =Math.round(dator);
		console.log(dator);
		
		
		var user = prompt("välj sten, sax eller påse").toLowerCase();
	
			while ((user == "sten") && (user != "sax") && (user!="påse"))

			{
				user= prompt("välj sten, sax eller påse").toLowerCase();
			}
