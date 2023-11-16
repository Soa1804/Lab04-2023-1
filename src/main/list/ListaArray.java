package array;

import list.EstruturaElementar;

public class ListaArray implements EstruturaElementar{

    private int[] array;
    private int indice_fim;

    public ListaArray() {

    }

    @Override
    public boolean buscaElemento(int valor) {
        if(this.array != null){
            for(int i =0; i<=this.indice_fim;i++){
                if(this.array[i]==valor){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int buscaIndice(int valor) {
        return array[valor];
    }

    @Override
    public int minimo() {
        if(array.length == 0){
            return Integer.MIN_VALUE;
        }
        int valormin= array[0];
        for(int i = 0; i<array.length;i++){
            int atual = array[i];
            if(atual<valormin){
                valormin = atual;
            }
        }
        return valormin;
    }

    @Override
    public int maximo() {
        if(array.length == 0){
            return Integer.MAX_VALUE;
        }
        int valormax= array[0];
        for(int i = 0; i<array.length;i++){
            int atual = array[i];
            if(atual>valormax){
                valormax = atual;
            }
        }
        return valormax;
    }


    @Override
    public int predecessor(int valor) {
        if(array.length==0){
            return Integer.MIN_VALUE;
        }
        for(int i= 0;i<array.length-1;i++){
            if(array[i]==valor){
                return array[i-1];
            }
        }
        return valor;
    }

    @Override
    public int sucessor(int valor) {
        if(array.length==0){
            return Integer.MAX_VALUE;
        }
        for(int i= 0; i<array.length-1;i++){
            if(array[i]==valor){
                return array[i+1];
            }
        }
        return valor;
    }

    @Override
    public void insereElemento(int valor) {
        if (this.array != null) {
            if(this.indice_fim == this.array.length-1){

                int[] objeto = new int[this.array.length *2];
                for (int i = 0; i < this.array.length; i++) {
                    objeto[i] = this.array[i];
            }
            this.array = objeto;
             }
             this.indice_fim++;
             this.array[this.indice_fim] = valor;
         } else {
             this.array = new int[1];
             this.array[0] = valor;
             this.indice_fim = 0;
         }
     }

 public void insereElementoPosicao(int valor, int buscaIndice) {
        if (this.array != null && buscaIndice >= 0 && buscaIndice <= this.indice_fim + 1) {
            
            if (this.indice_fim == this.array.length - 1) {
                int[] array3 = new int[this.array.length * 2]; 
                for (int i = 0; i < buscaIndice; i++) {
                    array3[i] = this.array[i];
                }
                array3[buscaIndice] = valor;
                for (int i = buscaIndice; i <= this.indice_fim; i++) {
                    array3[i + 1] = this.array[i];
                }
                this.array = array3;
                this.indice_fim++;
            } else {
                for (int i = this.indice_fim + 1; i > buscaIndice; i--) {
                    this.array[i] = this.array[i - 1];
                }
                this.array[buscaIndice] = valor;
                this.indice_fim++;
            }
        } else {
            this.array = new int[1];
            this.array[0] = valor;
            this.indice_fim = 0;
        }
    }
    @Override
    public void insereInicio(int valor) {
        if (this.array != null) {
            
            if (this.indice_fim == this.array.length - 1) {
                
                int[] lista = new int[this.array.length * 2]; 
                lista[0] = valor;
                
                for (int i = 0; i <= this.indice_fim; i++) {
                    lista[i + 1] = this.array[i];
                }
                this.array = lista;
                this.indice_fim++;
            
            } else {
                
                for (int i = this.indice_fim + 1; i > 0; i--) {
                    this.array[i] = this.array[i - 1];
                }
                this.array[0] = valor;
                this.indice_fim++;
            }
        
        } else {
            this.array = new int[1];
            this.array[0] = valor;
            this.indice_fim = 0;
        }
    }

    @Override
    public void insereFim(int valor) {
        if (this.array != null) {
            
            if (this.indice_fim == this.array.length - 1) {
                int[] lista1 = new int[this.array.length * 2]; 
                
                for (int i = 0; i <= this.indice_fim; i++) {
                    lista1[i] = this.array[i];
                }
                lista1[this.indice_fim + 1] = valor;
                this.array = lista1;
                this.indice_fim++;
            
            } else {
                this.indice_fim++;
                this.array[this.indice_fim] = valor;
            }
        } else {
            this.array = new int[1];
            this.array[0] = valor;
            this.indice_fim = 0;
        }
    }

    @Override
    public void remove(int valor) {
        if (this.array != null && valor >= 0 && valor <= this.indice_fim) {
            int tamanho2 = this.indice_fim;
            int[] array1 = new int[tamanho2];
    
            for (int i = 0, j = 0; i <= this.indice_fim; i++) {
                if (i != valor) {
                    array1[j++] = this.array[i];
                }
            }
    
            this.array = array1;
            this.indice_fim--;
        }
    }
    

    @Override
    public void removeIndice(int indice) {
    if (this.array != null && indice >= 0 && indice <= this.indice_fim) {
        int tamanho4 = this.indice_fim;
        int[] array4 = new int[tamanho4];

        for (int i = 0, j = 0; i <= this.indice_fim; i++) {
            if (i != indice) {
                array4[j++] = this.array[i];
            }
        }

        this.array = array4;
        this.indice_fim--;
    }
}

    

    @Override
    public void removeInicio() {
        if(this.array!= null && this.indice_fim>=0){
            int[] novo_array = new int[this.array.length-1];
            for(int i = 0; i<this.indice_fim; i++){
                novo_array[i] = this.array[i+1];
            }
            this.array = novo_array;
            this.indice_fim--;
        }
    }

    @Override
    public void removeFim() {
        if(this.array != null && this.indice_fim>=0){
            int tamanho = this.array.length -1;
            int[] arrayNovo = new int[tamanho];

            for(int i =0; i<tamanho; i++){
                arrayNovo[i] = this.array[i];
            }
            this.array = arrayNovo;
            this.indice_fim--;
        }
    }}