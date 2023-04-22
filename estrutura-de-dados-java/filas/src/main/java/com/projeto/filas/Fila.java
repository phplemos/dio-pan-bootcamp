package com.projeto.filas;

public class Fila<T> {

    private No<T> refNoEntrada;

    public Fila() {
        this.refNoEntrada = null;
    }

    public void enqueue(T object) {
        No<T> novoNo = new No<T>(object);
        novoNo.setRefNo(refNoEntrada);
        refNoEntrada = novoNo;
    }

    public T dequeue() {
        if (!this.isEmpty()) {

            No<T> primeiroNo = refNoEntrada;
            No<T> noAuxiliar = refNoEntrada;

            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public T first() {
        if (!this.isEmpty()) {
            No<T> primeiroNo = refNoEntrada;
            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public boolean isEmpty() {
        return refNoEntrada == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No<T> noAuxiliar = refNoEntrada;

        if (refNoEntrada != null) {
            while (true) {
                stringRetorno += "[No {objeto=" + noAuxiliar.getObject() + "}]--->";
                if (noAuxiliar.getRefNo() != null) {
                    noAuxiliar = noAuxiliar.getRefNo();
                } else {
                    stringRetorno += "null";
                    break;
                }
            }
        } else {
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}
