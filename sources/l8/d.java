package l8;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<m7.d> f32313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<Boolean> f32314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic.a<Boolean> f32315c;

    public d(ic.a<m7.d> aVar, ic.a<Boolean> aVar2, ic.a<Boolean> aVar3) {
        this.f32313a = aVar;
        this.f32314b = aVar2;
        this.f32315c = aVar3;
    }

    @Override // ic.a
    public Object get() {
        hb.a bVar;
        ic.a<m7.d> aVar = this.f32313a;
        Object obj = ib.b.f31544c;
        if (aVar instanceof hb.a) {
            bVar = (hb.a) aVar;
        } else {
            Objects.requireNonNull(aVar);
            bVar = new ib.b(aVar);
        }
        return new c(bVar, this.f32314b.get().booleanValue(), this.f32315c.get().booleanValue());
    }
}
