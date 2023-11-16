package list;

public class PilhaDavid{
    ListaArray Lista = null;
    public boolean isEmpty(){
        if(Lista != null){
            return true;
        }else{
            return false;
        }
    }
     
    public void push(int item){
        Lista.insereFim(item);
    }
  
    public int pop(){
        int v = Lista.array[indice_fim];
        Lista.removeFim();
        return v;
    }
}
