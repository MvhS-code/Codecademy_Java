class FizzBuzz {

    public static void main(String[] args) {
      for (int i = 1; i <= 100; i++){
        //when i can be divided by 3 and 5
        if (i % 3 == 0 && i % 5 == 0){
          System.out.println("FizzBuzz");
        } 
        // when i can only be divided by 3
        else if (i % 3 == 0) {
          System.out.println("Fizz");
        } 
        //when i can only be divided by 5
        else if (i % 5 == 0) {
          System.out.println("Buzz");
            
        } else {
          System.out.println(i);
        }
      }
    }

}
