package Enums;

public enum Adjective {
    LIGHT("легкий"), NEW("новая"), LOUD("громкий"),FURIOUSLY("яростно"),WHISTLING("свистящий"),SWEET("сладкое"),INFINITELY_LONG("бесконечно длинная"), UPLIFTING("вздымающаяся"),STRONG("сильный"), BIG("большая");
    private String translation;
    Adjective(String translation){
        this.translation=translation;
    }
    @Override
    public String toString(){
        return this.translation;
    }

}
