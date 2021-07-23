public class UserAdministrator extends User implements Administrator, Reader {

    public UserAdministrator(String name) {
        super(name);
    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.println("Администратор " + name + " обнаружил просрочку возврата книги у пользователя " + reader);
    }

    @Override
    public void takeBook(Administrator administrator) {
        System.out.println("Читатель " + name + " взял почитать книгу у админа " + administrator);
    }

    @Override
    public void returnBook(Administrator administrator) {
        System.out.println("Читатель " + name + " вернул книгу админу " + administrator);
    }
}