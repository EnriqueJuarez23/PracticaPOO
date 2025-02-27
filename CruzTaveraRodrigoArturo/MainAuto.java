class MainAuto{
    public static void main(String[] args) {
        Auto a1 = new Auto();
        Auto a2 = new Auto();
        Auto a3 = new Auto();
        Auto a4 = new Auto();
        Auto a5 = new Auto();
        
        a1.setMarca("Toyota");
        a1.setAño(2022);
        a1.setColor("Rojo");
        a1.setPrecio(25000);
        
        a2.setMarca("Honda");
        a2.setAño(2021);
        a2.setColor("Azul");
        a2.setPrecio(22000);
        
        a3.setMarca("Ford");
        a3.setAño(2023);
        a3.setColor("Negro");
        a3.setPrecio(27000);
        
        a4.setMarca("BMW");
        a4.setAño(2020);
        a4.setColor("Blanco");
        a4.setPrecio(35000);
        
        a5.setMarca("Nissan");
        a5.setAño(2024);
        a5.setColor("Gris");
        a5.setPrecio(23000);

        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
        System.out.println(a4.toString());
        System.out.println(a5.toString());
        


    }
}