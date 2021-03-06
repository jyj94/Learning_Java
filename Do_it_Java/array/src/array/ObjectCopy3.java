package array;

public class ObjectCopy3 {
	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥 ", "조정래 ");
		bookArray1[1] = new Book("데미안 ", "헤르만헤세 ");
		bookArray1[2] = new Book("어떻게 살 것인", "유시민 ");
		
		for (int i = 0; i < bookArray2.length; i++) bookArray2[i] = new Book();
		
		for (int i = 0; i < bookArray1.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		bookArray1[0].setAuthor("박완서");
		bookArray1[0].setBookName("나목");

		System.out.println("---book array 1---");
		for (int i = 0; i < bookArray1.length; i++) bookArray1[i].showBookInfo();
		System.out.println("---book array 2---");
		for (int i = 0; i < bookArray2.length; i++) bookArray2[i].showBookInfo();
	}
}
