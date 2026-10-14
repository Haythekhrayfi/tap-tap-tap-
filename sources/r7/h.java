package r7;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<Boolean> f35271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic.a<l9.h.b> f35272b;

    public h(ic.a<Boolean> aVar, ic.a<l9.h.b> aVar2) {
        this.f35271a = aVar;
        this.f35272b = aVar2;
    }

    @Override // ic.a
    public Object get() {
        boolean zBooleanValue = this.f35271a.get().booleanValue();
        l9.h.b bVar = this.f35272b.get();
        if (zBooleanValue) {
            return new l9.h(bVar);
        }
        return null;
    }
}
