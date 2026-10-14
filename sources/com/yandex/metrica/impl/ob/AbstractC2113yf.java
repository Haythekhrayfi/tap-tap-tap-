package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.yf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2113yf implements Hf, InterfaceC1859of {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f17910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f17911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final uo<String> f17912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AbstractC1909qf f17913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Im f17914e = AbstractC2145zm.a();

    public AbstractC2113yf(int i10, String str, uo<String> uoVar, AbstractC1909qf abstractC1909qf) {
        this.f17911b = i10;
        this.f17910a = str;
        this.f17912c = uoVar;
        this.f17913d = abstractC1909qf;
    }

    public final C1511ag.a a() {
        C1511ag.a aVar = new C1511ag.a();
        aVar.f15752c = this.f17911b;
        aVar.f15751b = this.f17910a.getBytes();
        aVar.f15754e = new C1511ag.c();
        aVar.f15753d = new C1511ag.b();
        return aVar;
    }

    public void a(Im im) {
        this.f17914e = im;
    }

    public AbstractC1909qf b() {
        return this.f17913d;
    }

    public String c() {
        return this.f17910a;
    }

    public int d() {
        return this.f17911b;
    }

    public boolean e() {
        so soVarA = this.f17912c.a(this.f17910a);
        if (soVarA.b()) {
            return true;
        }
        if (!this.f17914e.c()) {
            return false;
        }
        Im im = this.f17914e;
        StringBuilder sbA = defpackage.a.a("Attribute ");
        sbA.append(this.f17910a);
        sbA.append(" of type ");
        sbA.append(Ff.a(this.f17911b));
        sbA.append(" is skipped because ");
        sbA.append(soVarA.a());
        im.c(sbA.toString());
        return false;
    }
}
