public class SimpleDotCom {
	int [] locationCells;
	int numOfHits = 0;
	
	public String checkYourself(String userGuess) {
		int guess = Integer.parseInt(userGuess);
		String result = "miss";
		for (int cell : locationCells){
			if(guess==cell){
				result = "hit";
				numOfHits++;
				break;
			}
		}
		
		if(numOfHits==3){
			result = "kill";
		}
		System.out.println(result);
		return result;
	
	}
	
	public void setLocationCells (int[] locs) {
		locationCells = locs;
	}
	
}