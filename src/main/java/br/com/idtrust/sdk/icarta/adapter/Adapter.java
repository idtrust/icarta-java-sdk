package br.com.idtrust.sdk.icarta.adapter;

public interface Adapter<S, T> {
    T adapt(S from);
}
