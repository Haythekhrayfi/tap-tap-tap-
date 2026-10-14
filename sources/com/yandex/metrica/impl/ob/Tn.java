package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class Tn extends Sn<String> {
    public Tn(int i10, int i11) {
        this(i10, new Un(i11));
    }

    public Tn(int i10, Un un) {
        super(i10, un);
    }

    @Override // com.yandex.metrica.impl.ob.Sn
    public int b(String str) {
        return O2.c(str).length;
    }
}
