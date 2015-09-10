package roulette;

import util.ConsoleReader;

public class ThreeInARowBet extends Bet {

	public ThreeInARowBet(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String placeBet() {
		// TODO Auto-generated method stub
		return Integer.toString(ConsoleReader.promptRange("enter 3 consectutive numbers", 1, Wheel.NUM_SPOTS-1));
	}

	@Override
	public boolean betIsMade(String betChoice, Wheel myWheel) {
		// TODO Auto-generated method stub
		int start = Integer.parseInt(betChoice);
        return (start <= myWheel.getNumber() && myWheel.getNumber() < start + 3);
	}

}
