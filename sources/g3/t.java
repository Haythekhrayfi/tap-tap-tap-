package g3;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class t<Z> implements u<Z>, c4.a.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final o0.e<t<?>> f29945g = c4.a.a(20, new a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c4.d f29946c = new c4.d.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u<Z> f29947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f29948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f29949f;

    public class a implements c4.a.b<t<?>> {
        @Override // c4.a.b
        public t<?> a() {
            return new t<>();
        }
    }

    public static <Z> t<Z> c(u<Z> uVar) {
        t<Z> tVar = (t) ((c4.a.c) f29945g).b();
        Objects.requireNonNull(tVar, "Argument must not be null");
        tVar.f29949f = false;
        tVar.f29948e = true;
        tVar.f29947d = uVar;
        return tVar;
    }

    @Override // g3.u
    public synchronized void a() {
        this.f29946c.a();
        this.f29949f = true;
        if (!this.f29948e) {
            this.f29947d.a();
            this.f29947d = null;
            ((c4.a.c) f29945g).a(this);
        }
    }

    @Override // g3.u
    public Class<Z> b() {
        return this.f29947d.b();
    }

    public synchronized void d() {
        this.f29946c.a();
        if (!this.f29948e) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f29948e = false;
        if (this.f29949f) {
            a();
        }
    }

    @Override // c4.a.d
    public c4.d f() {
        return this.f29946c;
    }

    @Override // g3.u
    public Z get() {
        return this.f29947d.get();
    }

    @Override // g3.u
    public int getSize() {
        return this.f29947d.getSize();
    }
}
