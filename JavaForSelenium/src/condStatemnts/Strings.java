package condStatemnts;

public class Strings {

	public static void main(String[] args) {
		String browser="Chrome";
		String newbrowser="IE Browser";
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.out.println("TC is Chrome");
		}
		if (newbrowser.equals("ie Browser"))
		{
			System.out.println("TC is not IE");
		}
		else 
		{
			System.out.println("TC is IE");
		}
	}

}
