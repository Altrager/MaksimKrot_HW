package hw2;

public class randomArray {
    public static void main(String[] args) {
        //не разобрался, как сделать рандомное кол-во эллементов. буду разбираться
       int [] randomArray = new int[15];
       for(int i=0; i<randomArray.length; i++)
       {
            randomArray[i] = (int) (Math.random());
       }
        System.out.println(randomArray);
//окончательно запутался. почему-то выводятся буквы в перемешку с цифрами
    }
}
