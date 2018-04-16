package certificacao.cap3;


class Test {

    public static void main(String[] args) {
        Person p = new Person();
        // instance reference access: 15
        System.out.println(p.x);

        // class reference access: 15
        System.out.println(Person.x);
    }
}
