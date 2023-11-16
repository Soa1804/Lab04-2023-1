public class Fila2 implements FilaA{
    FilaA1 = null;
    FilaA2 = null;
    public void	enqueue(int item){
        FilaA1.insereFim(item);
        FilaA2.insereFim(item);
        }
    }
    public int	dequeue(){
        int d1 = FilaA1.array[indice_fim];
        int d2 = FilaA2.array[indice_fim];
        FilaA1.removeFim();
        FilaA2.removeFim();
        return d1;
        return d2;

    }
    public boolean isEmpty(){
        if(FilaA1 == null && FilaA2 == null|| FilaA1 =! null && Fila2 == null ||FilaA1 == null && Fila2 != null ){
            return false;
        }else{
            return true;
        }

    }
    public int	size(){
        int s1 = FilaA1.indice_fim;
        int s2 = FilaA2.indice_fim;
        return s1;
        return s2;

    }
}