package m8;

import i8.j0;
import i8.u;
import l8.v;
import s7.g;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<v> f33301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<j0> f33302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic.a<u> f33303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ic.a<g> f33304d;

    public d(ic.a<v> aVar, ic.a<j0> aVar2, ic.a<u> aVar3, ic.a<g> aVar4) {
        this.f33301a = aVar;
        this.f33302b = aVar2;
        this.f33303c = aVar3;
        this.f33304d = aVar4;
    }

    @Override // ic.a
    public Object get() {
        return new a(this.f33301a.get(), this.f33302b.get(), this.f33303c, this.f33304d.get());
    }
}
