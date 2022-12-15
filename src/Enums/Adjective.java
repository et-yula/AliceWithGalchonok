package Enums;

public enum Adjective {
    LIGHT("легкий"), NEW("новая"), LOUD("громкий"),WHISTLING("свистящий"),SWEET("сладкое");
    private String translation;
    Adjective(String translation){
        this.translation=translation;
    }
    @Override
    public String toString(){
        return this.translation;
    }

}
