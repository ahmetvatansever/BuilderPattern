package BuilderUser;

public class Run {

    public static void main(String[] args) {

        User user = new User.UserBuilder("avatansever")
                .setAge(29)
                .setEmail("asdfassss@hotmail.com")
                .setActive(true)
                .build();

        System.out.println(user.getUsername());
        System.out.println(user.getEmail());
        System.out.println(user.getAge());
        System.out.println(user.isActive());

        User user2 = new User.UserBuilder("yastesi")
                .setAge(17)
                .setEmail("yastesi@hotmail.com")
                .setActive(true)
                .build();

        System.out.println(user.getUsername());
        System.out.println(user.getEmail());
        System.out.println(user.getAge());
        System.out.println(user.isActive());
    }
}