package Enums;

public enum Adverb {
    IMPOSSIBLE("невозможно"), FABULOUS("великолепно"), SMOOTHLY("плавно"),GRACEFULLY("изящно"),LUCKILY("К счастью"),SUDDENLY("Внезапно"),ABSOLUTELY("обязательно");
    private String translation;
    Adverb(String translation){
        this.translation=translation;
    }
    @Override
    public String toString(){
        return this.translation;
    }
}
