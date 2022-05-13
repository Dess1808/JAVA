class MultiDimArrayDemo{
    public static void main(String[] args){

        //array creating multidimensional 
        String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
        };

        //output Mr. Smith
        System.out.println(names[0][0] + names[1][0]);

        //output Ms. Jones
        System.out.println(names[0][2] + names[1][1]);

        //legnth array names
        System.out.println(names.length);
    }
}