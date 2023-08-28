import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
            ArrayList<Hero> heroes = new ArrayList<>();
        // TODO 2 : Add those heroes to the list
        // name: Black Widow, age: 34
        // name: Captain America, age: 100
        // name: Vision, age: 3
        // name: Iron Man, age: 48
        // name: Scarlet Witch, age: 29
        // name: Thor, age: 1500
        // name: Hulk, age: 49
        // name: Doctor Strange, age: 42
            Hero BlackWidow = new Hero ("Black Widow", 34);
            Hero CaptainAmerica = new Hero ("Captain America", 100);
            Hero Vision = new Hero ("Vision", 3);
            Hero IronMan = new Hero ("Iron Man", 48);
            Hero ScarletWitch = new Hero ("Scarlet Witch", 29);
            Hero Thor = new Hero ("Thor", 1500);
            Hero Hulk = new Hero ("Hulk", 49);
            Hero DoctorStrange = new Hero ("Doctor Strange", 42);

            heroes.add(BlackWidow);
            heroes.add(CaptainAmerica);
            heroes.add(Vision);
            heroes.add(IronMan);
            heroes.add(ScarletWitch);
            heroes.add(Thor);
            heroes.add(Hulk);
            heroes.add(DoctorStrange);

        // TODO 3 : It's Thor birthday, now he's 1501
            Thor.setAge(1501);
        // TODO 4 : Shuffle the heroes list
            Collections.shuffle(heroes);
        // TODO 5 : Keep only the half of the list
            List<Hero> heroes2 = heroes.subList(0, 4);
        // TODO 6 : Loop through the list and display the name of the remaining heroes


            System.out.println("list of heroes : ");
            for (Hero hero : heroes) {
                    System.out.println(hero.getName() + " " + hero.getAge());
            }

            System.out.println("\nsublist of heroes :");
            for (Hero hero : heroes2)
                    System.out.println(hero.getName() + " " + hero.getAge());
    }

}


