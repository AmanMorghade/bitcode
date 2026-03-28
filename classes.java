class A{
    public void show(){
        System.out.println("i m in show ");
    }

    static class B{
        public void config(){
            System.out.println("i m in inner class");
        }
    }
}

class classes{
    public static void main(String[] args) {
        A obj = new A();

        obj.show();

        

    }
}