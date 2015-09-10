package roulette;

import util.ConsoleReader;

public class RedBlackBet extends Bet {
	public RedBlackBet(String description, int odds){
		super(description, odds);
	}

	@Override
	public String placeBet() {
		// TODO Auto-generated method stub
		return ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
	}

	@Override
	public boolean betIsMade(String betChoice, Wheel myWheel) {
		// TODO Auto-generated method stub
		return myWheel.getColor().equals(betChoice);
	}

}
