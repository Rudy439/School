package sk.kosickaakademia.mato.school;

public class Animal {

    private String nickname;

    public Animal (String name){
        super(name);
    }

    public String getNickname() {
        return nickname;
    }

    public Animal(String name, String nickname) {
        super(name);
        this.nickname = nickname;
    }
}

