package application;

import CardTypes.*;

public class Player {
	private Card highCard;
	private Card[] hand = new Card[1];
	private boolean turn = false;
	private boolean uno = false;
	private boolean valid = false;
	private boolean drewCard = false;

	public boolean isDrewCard() {
		return drewCard;
	}

	public void setDrewCard(boolean drewCard) {
		this.drewCard = drewCard;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public Player() {

	}

	public Card getHighCard() {
		return highCard;
	}

	public void setHighCard(Card highCard) {
		this.highCard = highCard;
	}

	public boolean getTurn() {
		return turn;
	}

	public void setTurn(boolean turn) {
		this.turn = turn;
	}

	public boolean getUno() {
		return uno;
	}

	public void setUno(boolean a) {
		uno = a;
	}

	public Card[] getHand() {
		return hand;
	}

	public void addCard(Card card) {
		if (hand[0] == null) {
			add(card);
		} else {
			// extend and add to it
			extend();
			add(card);
		}
	}

	public void discard(int index) {
		hand[index] = null;
		resize();
	}

	public void resize() {
		Card[] temp = new Card[hand.length - 1];
		for (int i = 0, j = 0; i < hand.length; i++) {
			if (hand[i] != null) {
				temp[j] = hand[i];
				j++;
			}
		}

		hand = temp;
	}

	private void extend() {
		Card[] temp = new Card[hand.length + 1];
		for (int i = 0; i < hand.length; i++) {
			temp[i] = hand[i];
		}
		hand = temp;
	}

	private void add(Card card) {
		hand[hand.length - 1] = card;
	}

}
