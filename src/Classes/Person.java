package Classes;

import Enums.Adjective;
import Enums.Adverb;
import Enums.Conjunction;
import Exceptions.InabilityToRaiseUpHandsException;
import Exceptions.TinySizeException;
import Interfaces.AbleToBend;
import Interfaces.LooksLike;
import Interfaces.Reasonable;

import java.util.Objects;

public class Person extends Animal implements Reasonable, LooksLike{
    private Neck neck;
    private Hands hands;
    class Neck implements AbleToBend, LooksLike {
        private Person owner;
        private long length;

        public Neck(Person owner, long length) {
            this.owner = owner;
            this.length = length;
        }
        @Override
        public String looksLike(){
            if(this.length>50) {
                return "мачта";
            }
            return "обычная шея";
        }
        @Override
        public String toString() {
            return this.owner.toString().substring(0, this.owner.toString().length() - 1) + "ина шея";
        }

        @Override
        public void toBend() {
            System.out.println(Adverb.LUCKILY + ", оказалось, что " + Adjective.NEW.toString() + " " + this.toString() + " " + Adverb.FABULOUS.toString() + " гнется в любом направлении");
        }

        @Override
        public void toBendZigzag() {
            System.out.println(Conjunction.HEREUPON.toString() + " " + this.owner + " " + Adverb.SMOOTHLY + " и " + Adverb.GRACEFULLY.toString() + " изогнула свою шею зигзагом");
        }
    }
    public Person(String name) {
        this.name = name;
        this.neck = new Neck(this,11);
        this.hands=new Hands(this);
        this.length=this.neck.length+160;
        this.weight=Animal.BMI.getWeight(this.length);
    }
    class Hands {
        public Hands(Person owner){
            this.owner=owner;
        }
        private Person owner;
        private static final boolean POSSIBILITY=false;
        public void raiseUp() throws InabilityToRaiseUpHandsException {
            if(POSSIBILITY){
                System.out.println("Ну где же ручки, где же ваши ручки?.. "+this.owner.toString()+" "+ Adverb.SMOOTHLY.toString()+" поднял(-а/о) руки вверх.");
            } else{
                throw new InabilityToRaiseUpHandsException("Ну что ж, если поднять руки к голове было "+ Adverb.IMPOSSIBLE.toString()+" можно попробовать наклонить к ним голову");
            }
        };
        public void move(){
            System.out.println(this.owner.toString()+" шевелит руками");
        }
    }
    public Hands getHands(){
        return this.hands;
    }
    public Neck getNeck(){
        return this.neck;
    }
    @Override
    public String looksLike() {
        if (this.length > 171) {
            return "Змея";
        }
        if (this.length < 15) {
            return "аппетитная крошка-картошка";
        }
        return "среднестатический, ничем не выдающийся человек";
    }
    @Override
    public void eat(Object meal){
        System.out.println("Диеты не работают, поэтому "+this.toString()+" решила съесть "+meal.toString());
    }
    @Override
    public void move() {
        System.out.println(this.toString() + " прогуливалась в " + this.location);
    }
    @Override
    public void realize(){
        System.out.println(Conjunction.BUT+" "+this.toString()+" уже поняла, что это просто листва на верхушках деревьев, под которыми она только что гуляла");
    }
    @Override
    public void imagine(LooksLike something){
        System.out.println(Conjunction.AFTER.toString()+" "+this.toString()+" собиралась нырнуть в "+something.looksLike());
        this.realize();
    }
    @Override
    public void speak(){
        System.out.println(Conjunction.AFTER_ALL.toString()+" "+this.toString()+" молвила - я "+ Adverb.ABSOLUTELY.toString()+" выживу..");
    }
    @Override
    public void reconsider() {
        System.out.println(Conjunction.THEREFORE.toString() + " " + this.toString() + " передумала и решила отпрянуть");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(neck, person.neck) && Objects.equals(hands, person.hands);
    }

    @Override
    public int hashCode() {
        return Objects.hash(neck, hands);
    }
    public void decrease(){
        double multiplier=Math.random();
        this.length=Math.round(this.length*Math.pow(multiplier,2));
        this.neck.length=Math.round(this.neck.length*Math.pow(multiplier,2));
        this.weight=Animal.BMI.getWeight(this.length);
        System.out.println((this.neck.length<3)?Conjunction.RIGHT_NOW+" "+this.toString()+" почувствовала "+Adjective.STRONG+" удар в подбородок: он стукнулся об ее собственные ботинки!":"");
        System.out.println((this.neck.length<1.5)?"Это было "+Adverb.AWFUL+": подбородок "+Adverb.INCREDIBLY+" сильно прижало к ногам":"");
        this.getSurroundingAnimal(0).killAndEat(this);
        throw new TinySizeException("Кое-кто стал слишком маленьким, чтобы исправить ситуацию, все-таки крошки со стола стряхивают\n"+Conjunction.THEREFORE+" сказке конец, а кто слушал - молодец!");
    }

    public void growNewNeck() {
        this.neck.length = Math.round(this.neck.length * (Math.random() +1) * 10);
        this.length=this.neck.length+160;
        System.out.println(Adverb.SUDDENLY+" "+this.neck.toString()+" выросла в несколько раз, значит чудеса случаются не только под Новый год..");
        System.out.println(this.toString()+" глядела во все глаза, но внизу была видна "+Conjunction.ONLY+" "+((this.neck.length>70)?Adjective.INFINITELY_LONG+" ":"")+this.neck.toString()+", "+Adjective.UPLIFTING+" "+Conjunction.LIKE+ " "+this.neck.looksLike());
        if(this.neck.length>90){
            this.hands=null;
            System.out.println(this.toString()+": "+"ой, ручки мои дорогие, и вы пропали! где вы, ау-у!");
            try {
                this.hands.move();
            } catch (NullPointerException e){
                System.out.println("Тут "+this.toString()+" попробовала пошевелить руками, но "+Adverb.INEFFECTUALLY);
            }
        }
        System.out.print(Conjunction.SO_NOW.toString()+" для "+this.toString().substring(0,this.toString().length()-1)+"ы"+" где-то там, далеко внизу, ");
    }
    public void toBend(AbleToBend thing) {
        if (thing == this.getNeck()) {
            thing.toBend();
        }
    }
    public void toBendZigzag(AbleToBend thing){
        if (thing==this.getNeck()){thing.toBendZigzag();}
    }
}

