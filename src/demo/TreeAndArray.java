package demo;

public class TreeAndArray {

    //�����������
    public static void preOrder(int array[],int i){
        if(i >= array.length) return;
        System.out.print(array[i]+" ");
        preOrder(array, i*2+1);
        preOrder(array, i*2+2);
    }

    //�����������
    public static void inOrder(int array[],int i){
        if(i >= array.length) return;
        inOrder(array, i*2+1);
        System.out.print(array[i]+" ");
        inOrder(array,i*2+2 );
    }

    //���ĺ������
    public static void aftOrder(int array[],int i){
        if(i >= array.length)return;
        aftOrder(array, i*2+1);
        aftOrder(array, i*2+2);
        System.out.print(array[i]+" ");
    }

    public static void main(String[] args) {
        int[] array = {78,56,34,43,4,1,15,2,23};
        preOrder(array, 0);
        System.out.println();
        inOrder(array, 0);
        System.out.println();
        aftOrder(array, 0);
    }


}
