public class Runner {

    public static void main(String[] args){
        // Anonymous class
        MySampleInterface someVariable = new MySampleInterface() {

                            public void tryThis() {
                                String message = "I'm glad you tried this!";
                                System.out.println(message);
                            }

                            public int tryThat(int number) {
                                return number % 2;
                            }

                        };



        (new Another()).iDoStuff(someVariable);

        (new Another()).iDoStuff(new MySampleInterface() {

                            public void tryThis() {
                                String message = "I'm glad you tried this!";
                                System.out.println(message);
                            }

                            public int tryThat(int number) {
                                return number % 2;
                            }

                        });
    }

}