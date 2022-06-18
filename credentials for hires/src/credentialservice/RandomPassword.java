package credentialservice;

public class RandomPassword {

	public int generatrePassword()
		{
			int randomPASS = 0;

			randomPASS = (int) (Math.random() * 9000 + 1000);
			
			return randomPASS;
		}

	}

