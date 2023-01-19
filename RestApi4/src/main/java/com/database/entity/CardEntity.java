package com.database.entity;

public class CardEntity 
{
	 private String cardName;
	 private String cardNo;
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public CardEntity(String cardName, String cardNo) {
		super();
		this.cardName = cardName;
		this.cardNo = cardNo;
	}
	@Override
	public String toString() {
		return "CardEntity [cardName=" + cardName + ", cardNo=" + cardNo + "]";
	}
	public CardEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	

}
