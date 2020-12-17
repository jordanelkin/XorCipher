
public class XorCipher {

	private char key;

	private String secretKey = "pJ8jXa2qtzLOetGgt03i\n" + 
			"TngfRpuK92SnFmcYMBzy\n" + 
			"cDPk02tXGJ09tp2vEWFV\n" + 
			"gjlnmMEpZ5t56IR0KkLg\n" + 
			"iMAmRTACTiAJKfSQQIk6\n" + 
			"3ESWuWYsCoToDJpu1JNx\n" + 
			"i0zlQMUCQWS4x1RlKO2X\n" + 
			"wVfyOA5QIQ6D5x8k6Beh\n" + 
			"yMveHNtiAayTbJ4wZYmi\n" + 
			"ZrJAqofaRXyIQUog1Mf7\n" + 
			"677N9NtDhMkp5ulZerpm\n" + 
			"Ao6fcueoZog6vxvpVplA\n" + 
			"B1NIEb8DxaPVF8DqtRwL\n" + 
			"YgVLiBdLs98KTQRvlyL1\n" + 
			"tIXPOdxYno6n1y4A1uaf\n" + 
			"sjL1Gi71I30fW5RaiPR3\n" + 
			"OC9Zrssnyx6Lh82Q8xxc\n" + 
			"hF2wHe5ek17srKr00XbT\n" + 
			"vnWHQHTDX00aRYpkdtKD\n" + 
			"PlSKI6CIIHu9gGek9p0o\n" + 
			"5IhaAhADmgGU6NF8f32f\n" + 
			"lfIieePxEHZNq4ltzFtC\n" + 
			"FytI8FYCwN1MD98sWxbS\n" + 
			"7AGUXwkfgtOf09m6yxSc\n" + 
			"mFegtYlkV3abP3bikabW\n" + 
			"Dc0oyVajkipuLack6dW8\n" + 
			"TsqVaoFudd8OTNTaxcLl\n" + 
			"ocq4wulKS3R4AZqIPT5v\n" + 
			"lf0F5kPKef5v7RWwYN4I\n" + 
			"PU5LzLPrv0ld6YbXnnlm\n" + 
			"jneLk1m1o70pFu1tdBiX\n" + 
			"9ldNz6ULqX7XQd9BPG6G\n" + 
			"vC1IfnjEI83yZtL4kjjL\n" + 
			"P4hMoYPK2f8oMkz2I2fX\n" + 
			"VAdOUyCyebu2NQGyRVLl\n" + 
			"EwnEguPbqCyUpYIbBbBP\n" + 
			"vkBG05vwTqmyFBh7Gbpi\n" + 
			"R9qHQicsbbVfPyvGrIti\n" + 
			"lAkXh98WX3c6nU2GbA3J\n" + 
			"b2whsHpBlMoGoKzlbwJU\n" + 
			"0sHTbq7TVIPBFRf7yhbU\n" + 
			"LZievHk3hjwMXrAztmDe\n" + 
			"RoYAKUZuYfO5jOHfRebn\n" + 
			"8GIXrPzgZaFhQqOGb6qk\n" + 
			"QlOMAbn1bRdePEM2Kbux\n" + 
			"XBNzKGCvzm4XVDTLQnYx\n" + 
			"u3keGj4EeuKbTlIAYe1Q\n" + 
			"4ZG3bzn50nKDWo9x1qmi\n" + 
			"15CcQ8djIU5lENp3SmaR\n" + 
			"HFdvgUVkL9KiUitCqwnQ\n" + 
			"uAiPlAcyQXjDsNAoztxw\n" + 
			"0ixwvtL4C8bgHZ03JUZZ\n" + 
			"a9YbfksFf5EopxMNbCht\n" + 
			"fthauoNSlG5fWMcOY73L\n" + 
			"dnyCgvvwDjuRf13riYt5\n" + 
			"5q1vO2PlWgv6uqt6elLw\n" + 
			"DHks9gwpls703jlhUBPd\n" + 
			"a7m8qd2akfSaw7Sn7EmN\n" + 
			"GBflLIs4bqwP73pBkyqk\n" + 
			"4DUHQLCZESCF0SOC74GH\n" + 
			"0tjRyI0PSUgxmmjWmb0t\n" + 
			"FkKcqXEwWeeuLxC1aHDp\n" + 
			"iu9LQU7F5VXfgItclBpa\n" + 
			"f0svIC4Wu5k4H1PWF6AO\n" + 
			"UhXJzp2NS9NIBS9Lq0ip\n" + 
			"6XpHKv0XiecqyYPxH7BB\n" + 
			"GzyTSk6xgbbWr1lCqNcx\n" + 
			"qmW51risSvWmGQq0vDIA\n" + 
			"pxLrJm386Bwc0kSTnwUh\n" + 
			"5tLKoavUQaWDOR5I7GI7\n" + 
			"o8UsEeLrTVvUygGbER3W\n" + 
			"zWN19QWvzCDNYJxZzRWa\n" + 
			"3LFu8A1B19AMkOeIOU1p\n" + 
			"USXR7oa5MXOM7Xgoo2Gr\n" + 
			"rQwC3MOeCSFeTix6ir25\n" + 
			"A2m3rpTakKZcTu51hSQM\n" + 
			"I0nRog46v9No9XPbtYRY\n" + 
			"1aLwHuCNiMO23kBzw8Pu\n" + 
			"GH8pTySzhfUPBAQ2eM3x\n" + 
			"YfhaME5WSIVBabOBncz4\n" + 
			"XE3rV7e8mM1HSenrrNOl\n" + 
			"PXH33qL9u5B5Wa25c6dh\n" + 
			"WVyLfbeniFK1RRcUDe98\n" + 
			"ozoSl2EQcJqTSqo0sqbv\n" + 
			"MwCuY41S3I9exC6BqPfi\n" + 
			"6kL0ptvf6BW3gp7wetaW\n" + 
			"esVYdsc7SgtU4hSC6Bzx\n" + 
			"KWc3sJUKmmk85okCrhhz\n" + 
			"RlnjJsLmgKzT7PzUpS4g\n" + 
			"Tkafbka8QAS3x0yafXde\n" + 
			"DoRjLqX4dD275CMulkSV\n" + 
			"GKb3kElCnOJA17vbbNQk\n" + 
			"mBJPhg8CEu72xzmxHiGP\n" + 
			"rYve2APtnmHq3ZX3MCjq\n" + 
			"qjW7vGz5LSzoNeHzenlX\n" + 
			"ZgW2nWDsUJwBJ7AZ343f\n" + 
			"XOQhb9LfarJc8mNPoJuB\n" + 
			"119Yl3EaOAQVx9pC9hcW\n" + 
			"ejJP1OoodLq2x1xXUU5z\n" + 
			"bpxFOYpHmQNX7enan5Wj";

	private String message;

	public XorCipher(char key, String message) {

		this.key = key;
		this.message = message;

	};

	public String getMessage() {

		return this.message;
	}

	public String getSecretKey() {

		return this.secretKey;
	}

	public int[] encrypt(String message) {

		
		int o;
		int output[] = new int[message.length()];

		for (int i = 0; i < message.length(); i++) {

			o = (Integer.valueOf(message.charAt(i)) ^ (Integer.valueOf(key) * (Integer.valueOf(secretKey.charAt(i)))));

			output[i] = o;

		}

		return output;
	}

	public int[] decrypt(char key, int[] message) {

		int output[] = new int[message.length];

		for (int i = 0; i < message.length; i++) {

			output[i] = message[i] ^ (Integer.valueOf(key) * (Integer.valueOf(secretKey.charAt(i))));
		}

		return output;
	}

	
	/*
	public static void main(String args[]) {

		String message = "Katherine Smells";
		char key = 'a';
		
		
		int[] dec = new int[message.length()];

		XorCipher xc = new XorCipher(key, message);

		int[] result = new int[message.length()];

		result = xc.encrypt(xc.getMessage());
		for (int i = 0; i < result.length; i++) {

			System.out.println(Integer.toBinaryString(result[i]));
		}

		dec = xc.decrypt(key, result);

		for (int i = 0; i < result.length; i++) {

			System.out.print(Character.toChars(dec[i]));
		}

	}*/

}
