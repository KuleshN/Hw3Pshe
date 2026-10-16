public class LibraryTest {
   static {
        Library lib1 = new Library();
        lib1.setBookTitle("1984");
        lib1.getBookTitle();
        System.out.println(lib1.getBookTitle());

        lib1.setAuthor("Ourell");
        lib1.getAuthor();
        System.out.println(lib1.getAuthor());

        lib1.setYear(1984);
        System.out.println(lib1.year);

        lib1.category = "Roman";
        System.out.println(lib1.category);
    }

}
