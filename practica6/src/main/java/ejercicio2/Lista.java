package ejercicio2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Lista<T> {

    private T[] elementos;
    private int numElementos = 0;

    public Lista(int tamañoMaximo) {
        this.elementos = (T[]) new Object[tamañoMaximo];
    }

    public void añadir(T elem) {
        if (this.numElementos == elementos.length) {
            throw new IllegalArgumentException("Lista llena");
        }
        this.elementos[numElementos++] = elem;
    }

    public T obtener(int pos) {
        validarPosicion(pos);

        return this.elementos[pos];
    }

    public void eliminar(int pos) {
        validarPosicion(pos);

        for (int i = pos; i < this.numElementos - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.numElementos--;
    }

    private void validarPosicion(int pos) throws IllegalArgumentException {
        if (pos < 0 || pos >= this.numElementos) {
            throw new IllegalArgumentException("eliminar: posicion no valida: " + pos);
        }
    }

    public void paraCada(Consumer<? super T>accion) {
        for (int i = 0; i < this.numElementos; i++) {
            accion.accept(this.elementos[i]);
        }
    }

    public Boolean existe(Predicate<? super T> comprobacion) {
        for (int i = 0; i < this.numElementos; i++) {
            if (comprobacion.test(this.elementos[i])) return true;
        }
        return false;
    }

    public Lista<T> soloLosQue(Predicate<T> condicion) {
        Lista<T> resultado = new Lista<>(numElementos);
        
        for (int i = 0; i < numElementos; i++) {
            T elem = elementos[i];
            if(condicion.test(elem)) {
                resultado.añadir(elem);
            }
        }

        return resultado;
    }

    public <R> Lista<R> transformar(Function<? super T,? extends R> transformacion) {
        Lista<R> resutlado = new Lista<>(numElementos);
        for (int i = 0; i < numElementos; i++) {
            resutlado.añadir(transformacion.apply(this.elementos[i]));
        }
        return resutlado;
    }

    @Override
    public String toString() {
        StringBuilder toString = new StringBuilder();
        toString.append("[");
        for (int i = 0; i < this.numElementos; i++) {
            if (i > 0) {
                toString.append(", ");
            }
            toString.append(this.elementos[i].toString());
        }
        toString.append("]");
        return toString.toString();
    }

}