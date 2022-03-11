package br.edu.ifpb.domain;

public class CPF {

    // 11122233344
    private static final int TAMANHOCPF = 11;
    private String numeroCPF;

    public CPF() {
    }

    public CPF(String numero) {
        this.numeroCPF = numero;
    }

    public boolean valido() {
        return this.numeroCPF.length() == TAMANHOCPF;
    }

    // 111.222.333-44
    public String cpfFormatado() {
        return String.format(
            "%s.%s.%s-%s",
            this.numeroCPF.substring(0,3), // 111222
            this.numeroCPF.substring(3,6),
            this.numeroCPF.substring(6,9),
            this.numeroCPF.substring(9,11)
        );
    }

    @Override
    public String toString() {
        return cpfFormatado();
    }

    public String valor() {
        return this.numeroCPF;
    }
}
