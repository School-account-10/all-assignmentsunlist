public class O4LaboratoryExercise2 {
    public static void main(String[] args) {
        int[] myArr = { 18, 26, 33 };
        int sum_to_product = 1;
        
        for (int x = 0; x < myArr.length; x++) {
            sum_to_product *= myArr[x];
        }
        System.out.println("The product is " + sum_to_product);

    }

}
