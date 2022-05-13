class ArrayCopyOfDemo{
    public static void main(String[] args){
        //create base array
        String [] copyFrom = {
            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
            "Marocchino", "Ristretto"
        };

        //criando o array de copia
        //retornado array copia com java.util.Arrays.copyOfRage
        String [] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);

        //output
        for(String coffe : copyTo) {
            System.out.println(coffe);
        }

    }
}
