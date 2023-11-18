package BuilderUser;

public class User {
    private final String username;
    private final int age;
    private final String email;
    private final boolean active;


    public User(UserBuilder userBuilder) {
        this.username = userBuilder.username;
        this.age = userBuilder.age;
        this.email = userBuilder.email;
        this.active = userBuilder.active;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public boolean isActive() {
        return active;
    }

    public static class UserBuilder {
        private final String username;
        private int age;
        private String email;
        private boolean active;

        //constructerda final olarak tanımlanan degiskenler yer almalı
        public UserBuilder(String username) {
            this.username = username;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setActive(boolean active) {
            this.active = active;
            return this;
        }

        public User build() {
            User user = new User(this);
            if (user.getAge() < 18) {
                throw new IllegalArgumentException("Yaş bilgisi 18 yaşın altında olamaz."
                );
            }

            return user;
        }
    }
}