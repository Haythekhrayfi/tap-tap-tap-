package g3;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class p<Z> implements u<Z> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f29927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f29928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u<Z> f29929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f29930f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d3.c f29931g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f29932h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f29933i;

    public interface a {
    }

    public p(u<Z> uVar, boolean z10, boolean z11) {
        Objects.requireNonNull(uVar, "Argument must not be null");
        this.f29929e = uVar;
        this.f29927c = z10;
        this.f29928d = z11;
    }

    @Override // g3.u
    public synchronized void a() {
        if (this.f29932h > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f29933i) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f29933i = true;
        if (this.f29928d) {
            this.f29929e.a();
        }
    }

    @Override // g3.u
    public Class<Z> b() {
        return this.f29929e.b();
    }

    public synchronized void c() {
        if (this.f29933i) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f29932h++;
    }

    public void d() {
        synchronized (this.f29930f) {
            synchronized (this) {
                int i10 = this.f29932h;
                if (i10 <= 0) {
                    throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
                }
                int i11 = i10 - 1;
                this.f29932h = i11;
                if (i11 == 0) {
                    ((l) this.f29930f).e(this.f29931g, this);
                }
            }
        }
    }

    @Override // g3.u
    public Z get() {
        return this.f29929e.get();
    }

    @Override // g3.u
    public int getSize() {
        return this.f29929e.getSize();
    }

    public synchronized String toString() {
        return "EngineResource{isCacheable=" + this.f29927c + ", listener=" + this.f29930f + ", key=" + this.f29931g + ", acquired=" + this.f29932h + ", isRecycled=" + this.f29933i + ", resource=" + this.f29929e + '}';
    }
}
