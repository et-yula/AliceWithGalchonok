package Enums;

public enum Adverb {
    IMPOSSIBLE("невозможно"),INCREDIBLY("невероятно"), FABULOUS("великолепно"),AWFUL("ужасно"), SMOOTHLY("плавно"),GRACEFULLY("изящно"),LUCKILY("К счастью"),SUDDENLY("Внезапно"),ABSOLUTELY("обязательно"), ALMOST("почти"), INEFFECTUALLY("безрезультатно");
    private String translation;
    Adverb(String translation){
        this.translation=translation;
    }
    @Override
    public String toString(){
        return this.translation;
    }
}
