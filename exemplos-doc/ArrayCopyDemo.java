class ArrayCopyDemo {
    public static void main(String[] args){
        //create base array
        String [] copyFrom = {
            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
            "Marocchino", "Ristretto"
        };

        
        //create copy array
        String[] copyTo = new String[7];
        
        //call arraycopy method of System
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);

        //output with for
        for (String coffe : copyTo) {
            System.out.println(coffe + " ");
        }
    }
}
