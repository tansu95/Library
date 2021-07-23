public class Test {
    public static void main(String[] args) {
        UserAdministrator userAdministrator = new UserAdministrator("Mike");
        SupplierReader supplierReader = new SupplierReader("Robert");
        LibrarianAdministrator librarianAdministrator = new LibrarianAdministrator("Tom");
        userAdministrator.overdueNotification(supplierReader);
        supplierReader.takeBook(userAdministrator);
        supplierReader.returnBook(userAdministrator);
        librarianAdministrator.orderBook(supplierReader);
    }
}