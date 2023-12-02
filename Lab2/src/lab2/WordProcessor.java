package lab2;

public class WordProcessor implements Counter {
	private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
	@Override
	public int countWords(String sentence) {
		{
			if (sentence == text) {
				sentence = text;
			}
		}
		String[] words = sentence.split(" ");
			return words.length;
	    }

	@Override
	public int countLetters(String sentence) {
		{
			if (sentence == text) {
				sentence = text;
			}
		}
		int letters =0;
		for(int i = 1;i < sentence.length();i++) {
			if (Character.isLetter(sentence.charAt(i))) {
				letters++;
			}	
		}
		return letters;
	}

	@Override
	public int getLength(String sentence) {
		{
			if (sentence == text) {
				sentence = text;
			}
		}
		return sentence.length();
	}
}
	