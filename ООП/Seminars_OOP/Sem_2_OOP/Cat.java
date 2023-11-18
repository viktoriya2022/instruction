public class Cat extends Animal {
    @Override
    public void speak(){//нельзя добавлять агрументы, всё как в абстрактном классе animal
        System.out.println("мяу мяу");
    }
}