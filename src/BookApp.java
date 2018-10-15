public class BookApp {

 public static void main(String[] args) {

  Book book1 = new Book();

   book1.setAuthor("William Shakespeare");
   book1.setTitle("Romeo&Juliet");
   book1.setDescription("This a love story of a ordinary man falling in love with a woman from high class family in town");
   String author = book1.getAuthor();
   String title = book1.getTitle();
   String description = book1.getDescription();

    book1.getDisplayText();
 }

  }


