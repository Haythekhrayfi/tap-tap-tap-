package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class z1 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<v> f33000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<z7.d> f33001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic.a<i8.z> f33002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ic.a<q8.e> f33003d;

    public z1(ic.a<v> aVar, ic.a<z7.d> aVar2, ic.a<i8.z> aVar3, ic.a<q8.e> aVar4) {
        this.f33000a = aVar;
        this.f33001b = aVar2;
        this.f33002c = aVar3;
        this.f33003d = aVar4;
    }

    @Override // ic.a
    public Object get() {
        return new com.yandex.div.core.view2.divs.a(this.f33000a.get(), this.f33001b.get(), this.f33002c.get(), this.f33003d.get());
    }
}
