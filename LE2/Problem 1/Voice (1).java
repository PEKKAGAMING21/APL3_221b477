public class Voice{
    Animal[] arr = new Animal[5];
    void prepareVoice(){
      
        arr[0]=new Cow();
        arr[1]=new Goat();
        arr[2]=new Lion();
        arr[3]=new Dog();
        arr[4]=new Pig();
       
        }
        
        public void hear(){
            prepareVoice();
            for(int i=0;i<5;i++){
                arr[i].makeVoice();
            }
        }
}