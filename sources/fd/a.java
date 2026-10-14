package fd;

/* JADX WARN: Unexpected interfaces in signature: [fd.g0] */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a<T> extends o1 implements j1, mc.d<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mc.f f29539d;

    public a(mc.f fVar, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            h0((j1) fVar.b(j1.b.f29580c));
        }
        this.f29539d = fVar.i(this);
    }

    @Override // fd.o1
    public String L() {
        return getClass().getSimpleName() + " was cancelled";
    }

    @Override // fd.o1, fd.j1
    public boolean a() {
        return super.a();
    }

    @Override // fd.o1
    public final void g0(Throwable th) {
        f.f(this.f29539d, th);
    }

    @Override // mc.d
    public final mc.f getContext() {
        return this.f29539d;
    }

    @Override // fd.o1
    public String k0() {
        return super.k0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fd.o1
    public final void n0(Object obj) {
        if (!(obj instanceof v)) {
            y0(obj);
        } else {
            v vVar = (v) obj;
            x0(vVar.f29629a, vVar.a());
        }
    }

    @Override // mc.d
    public final void resumeWith(Object obj) throws Throwable {
        Object objJ0 = j0(z.R(obj, null));
        if (objJ0 == p1.f29609b) {
            return;
        }
        w0(objJ0);
    }

    public mc.f w() {
        return this.f29539d;
    }

    public void w0(Object obj) {
        E(obj);
    }

    public void x0(Throwable th, boolean z10) {
    }

    public void y0(T t10) {
    }
}
