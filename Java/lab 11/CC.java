interface Transport{
    void deliver();
}

abstract class Animal{
}

class Tiger extends Animal{
}

class Camel extends Animal implements Transport{
    public void deliver(){
        System.out.println("Camel delivers goods");
    }
}

class Deer extends Animal{
}

class Donkey extends Animal implements Transport{
    public void deliver(){
        System.out.println("Donkey delivers goods");
    }
}

class Test{
    public static void main(String[] args){

        Animal arr[] = new Animal[4];

        arr[0] = new Tiger();
        arr[1] = new Camel();
        arr[2] = new Deer();
        arr[3] = new Donkey();

        for(Animal a : arr){
            if(a instanceof Transport){
                Transport t = (Transport)a;
                t.deliver();
            }
        }
    }
}