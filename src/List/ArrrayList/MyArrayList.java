package List.ArrrayList;

public class MyArrayList<E> extends MyList{
int size;
private Object[] array;

    public MyArrayList() {
        this.size = 0;
        this.array =new Object[11];
    }


    @Override
    public Object get(int index) {
        if (index>=size || index<0){
            System.out.println("index "+index);
            System.out.println("size "+size);
            throw new IndexOutOfBoundsException();
        }else {
            return array[index];
        }

    }

    @Override
    public Object set(int index, Object element) {
      Object old=get(index);
      array[index]=element;
      return old;
    }

    @Override
    public int indexOf(Object o) {
        System.out.println("obj is "+o);
      for (int i=0;i<size;i++){
       //   System.out.println(array[i]);
          System.out.println(equals(o,array[i]));
          if (equals(o,array[i])){
              return i;
          }
      }
      return -1;
    }

    private boolean equals(Object target,Object element){
        System.out.println("target "+ target+ " element "+element);
        if (target ==null){
            return element==null;
        }else {
            return target.equals(element);
        }
    }
    @Override
    public int size() {
        return super.size();
    }

    @Override
    public Object remove(int index) {
        Object old=get(index);
        for (int i =size;i>= index;i--){
            array[i-1]=array[i];
        }
        size--;
        return old;
    }

    @Override
    public boolean add(Object o) {
        return super.add(o);
    }

    @Override
    public void add(int index, Object element) {
        if (index> size || index <0){
            throw new IndexOutOfBoundsException();
        }else {
            if (size>=array.length){
                System.out.println("size is "+size);
                System.out.println("array length is "+array.length);
                Object[] bigger=new Object[array.length*2];
                System.arraycopy(array,0,bigger,0,array.length);
                array=bigger;
            }
          //  size++;
            System.out.println("outside "+size);
            System.out.println("array length " + array.length);

            // System.out.println("i'll add ur element just gimme a sec  "+ size);
            for (int i =size-1;i>index;i--){
                System.out.println(i);
                System.out.println("array length inside " + array.length);
              array[i]=array[i-1];
            }
          //  System.out.println(array.length);
            array[index]=element;
          //  System.out.println(Arrays.stream(array).toList());
size++;
        }




    }
}
