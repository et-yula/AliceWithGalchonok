package Enums;

public enum Conjunction {
    AFTER("После этого"),HEREUPON("Вследствие чего"), SO_NOW("Поэтому теперь"), THEREFORE("Поэтому"),BUT("Однако"), THEN("Затем"),AFTER_ALL("Напоследок"),ONLY("только"), LIKE("словно"), RIGHT_NOW("И в ту же секунду");
    private String translation;
    Conjunction(String translation){
        this.translation=translation;
    }
    @Override
    public String toString(){
        return this.translation;
    }
}
