package com.ouya.zr;

public class Test {

	public static void main(String[] args) {
		Book book = new Book("˫������",100);
		Book book1 = new Book("�Ϸ���",100);
		
		Book []books = {book,book1};//�̵�����е��鶼�ڷ���
		Store<Book> bookshop = new Store<Book>();
		bookshop.setRoom(books);
		bookshop.show();
		
		Computer com = new Computer("����",5000);
		Computer com1 = new Computer("����",200);
		Computer com2 = new Computer("����",5500);
		
		Computer []comm = {com,com1,com2};
		Store<Computer> comshop = new Store<Computer>();
		comshop.setRoom(comm);
		comshop.show();
	}
}