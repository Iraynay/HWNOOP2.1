public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Дим";
        post.patronymic = "Димыч";
        post.surname = "Дымов";
        post.pasport = "1234 123456";
        post.phone = "+79011234567";
        post.subscription = true;
        post.birthday = new FormDate ();
        post.birthday.day = "01";
        post.birthday.month = "01";
        post.birthday.year = "2001";
    }
}
