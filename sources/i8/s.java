package i8;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a<Boolean> f31433a;

    public s(ic.a<Boolean> aVar) {
        this.f31433a = aVar;
    }

    @Override // ic.a
    public Object get() {
        return new r(this.f31433a.get().booleanValue());
    }
}
