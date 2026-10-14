package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.tf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1983tf<T> extends AbstractC2113yf {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final T f17471f;

    public AbstractC1983tf(int i10, String str, T t10, uo<String> uoVar, AbstractC1909qf abstractC1909qf) {
        super(i10, str, uoVar, abstractC1909qf);
        this.f17471f = t10;
    }

    @Override // com.yandex.metrica.impl.ob.Hf
    public void a(Gf gf) {
        C1511ag.a aVarA;
        if (!e() || (aVarA = b().a(gf, gf.a(d(), c()), this)) == null) {
            return;
        }
        a(aVarA);
    }

    public abstract void a(C1511ag.a aVar);

    public T f() {
        return this.f17471f;
    }
}
