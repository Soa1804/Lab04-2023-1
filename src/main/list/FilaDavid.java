package list;

public interface FilaDavid{
    ListaArray arrayList = null;
    public void	enqueue(int item){
        arrayList.insereFim(item);
    }
    public int	dequeue(){
        int d = Lista.array[indice_fim];
        arrayList.removeFim();
        return d;
    }
    public boolean isEmpty(){
        if(arrayList== null){
            return false;
        }else{
            return true;
        }
    }
    public int	size(){
        int s= arrayList.indice_fim;
        return s;
    }
}