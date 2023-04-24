package com.projeto.arvores;

public class ArvoreBinaria<T extends Comparable<T>> {

    private BinNo<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(T conteudo) {
        BinNo<T> novoNo = new BinNo<>(conteudo);
        this.raiz = inserir(raiz, novoNo);
    }

    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo) {
        if (atual == null) {
            return novoNo;
        } else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        } else {
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }
        return atual;
    }

    public void remover(T conteudo) {
        try {
            BinNo<T> atual = this.raiz;
            BinNo<T> pai = null;
            BinNo<T> filho = null;
            BinNo<T> temp = null;

            while (atual != null && !atual.getConteudo().equals(conteudo)) {
                pai = atual;
                if (conteudo.compareTo(atual.getConteudo()) < 0) {
                    atual = atual.getNoEsq();
                } else {
                    atual = atual.getNoDir();
                }
            }

            if (atual == null) {
                System.out.println("Conteudo não enconteado. Bloco Try");
            }

            if (pai == null) {
                if (atual.getNoDir() == null) {
                    this.raiz = atual.getNoEsq();
                } else if (atual.getNoEsq() == null) {
                    this.raiz = atual.getNoDir();
                } else {
                    for (temp = atual, filho = atual.getNoEsq(); filho.getNoDir() != null; temp = filho, filho = filho
                            .getNoEsq()) {
                        if (filho != atual.getNoEsq()) {
                            temp.setNoDir(filho.getNoEsq());
                            filho.setNoEsq(raiz.getNoEsq());
                        }
                    }
                    filho.setNoDir(raiz.getNoDir());
                    raiz = filho;
                }
            } else if (atual.getNoDir() == null) {
                if (pai.getNoEsq() == atual) {
                    pai.setNoEsq(atual.getNoEsq());
                } else {
                    pai.setNoDir(atual.getNoEsq());
                }
            } else if (atual.getNoEsq() == null) {
                if (pai.getNoEsq() == atual) {
                    pai.setNoEsq(atual.getNoDir());
                } else {
                    pai.setNoEsq(atual.getNoDir());
                }

            } else {
                for (temp = atual, filho = atual.getNoEsq(); filho.getNoDir() != null; temp = filho, filho = filho
                        .getNoDir()) {
                    if (filho != atual.getNoEsq()) {
                        temp.setNoDir(filho.getNoEsq());
                        filho.setNoEsq(atual.getNoEsq());
                    }
                    filho.setNoDir(atual.getNoDir());
                    if (pai.getNoEsq() == atual) {
                        pai.setNoEsq(filho);
                    } else {
                        pai.setNoDir(filho);
                    }
                }

            }

        } catch (NullPointerException error) {
            System.out.println("Conteudo não enconteado. Bloco catch");
        }
    }

    public void exibirInOrder() {
        System.out.print("\n Exibindo InOrder");
        exibirInOrder(this.raiz);
    }

    private void exibirInOrder(BinNo<T> atual) {
        if (atual != null) {
            exibirInOrder(atual.getNoEsq());
            System.out.print(atual.getConteudo() + ". ");
            exibirInOrder(atual.getNoDir());
        }
    }

    public void exibirPosOrder() {
        System.out.print("\n Exibindo InOrder");
        exibirPosOrder(this.raiz);
    }

    private void exibirPosOrder(BinNo<T> atual) {
        if (atual != null) {
            exibirPosOrder(atual.getNoEsq());
            exibirPosOrder(atual.getNoDir());
            System.out.print(atual.getConteudo() + ". ");
        }
    }

    public void exibirPreOrder() {
        System.out.print("\n Exibindo InOrder");
        exibirPreOrder(this.raiz);
    }

    private void exibirPreOrder(BinNo<T> atual) {
        if (atual != null) {
            System.out.print(atual.getConteudo() + ". ");
            exibirPreOrder(atual.getNoEsq());
            exibirPreOrder(atual.getNoDir());
        }
    }
}
