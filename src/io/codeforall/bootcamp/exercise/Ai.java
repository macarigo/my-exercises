package io.codeforall.bootcamp.exercise;

public class Ai {

    private String name;
    private String creationDate;
    public int doubleArray[];

    public Ai (String name, String creationDate) {
        this.name = name;
        this.creationDate = creationDate;
    }

        public String getName () {
            return name;
        }
        public String getCreationDate () {
            return creationDate;
        }

        public void setName (String name){
            this.name = name;
        }
        public void setCreationDate (String creationDate){
            this.creationDate = creationDate;
        }


        public static int[] doubleArray (int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                doubleArray[i] = arr[i] * 2;
            }
        int[] doubleArray = new int[arr.length];
        return doubleArray;
    }

}

