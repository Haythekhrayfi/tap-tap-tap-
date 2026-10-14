package g3;

import android.os.SystemClock;
import android.util.Log;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class y implements g, e3.d.a<Object>, g.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h<?> f29971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g.a f29972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29973e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f29974f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f29975g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile l3.n.a<?> f29976h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e f29977i;

    public y(h<?> hVar, g.a aVar) {
        this.f29971c = hVar;
        this.f29972d = aVar;
    }

    @Override // g3.g.a
    public void a(d3.c cVar, Object obj, e3.d<?> dVar, com.bumptech.glide.load.a aVar, d3.c cVar2) {
        this.f29972d.a(cVar, obj, dVar, this.f29976h.f32168c.d(), cVar);
    }

    @Override // g3.g
    public boolean b() {
        Object obj = this.f29975g;
        if (obj != null) {
            this.f29975g = null;
            int i10 = b4.f.f3299b;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            try {
                d3.a<X> aVarE = this.f29971c.e(obj);
                f fVar = new f(aVarE, obj, this.f29971c.f29809i);
                d3.c cVar = this.f29976h.f32166a;
                h<?> hVar = this.f29971c;
                this.f29977i = new e(cVar, hVar.f29814n);
                hVar.b().a(this.f29977i, fVar);
                if (Log.isLoggable("SourceGenerator", 2)) {
                    Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.f29977i + ", data: " + obj + ", encoder: " + aVarE + ", duration: " + b4.f.a(jElapsedRealtimeNanos));
                }
                this.f29976h.f32168c.b();
                this.f29974f = new d(Collections.singletonList(this.f29976h.f32166a), this.f29971c, this);
            } catch (Throwable th) {
                this.f29976h.f32168c.b();
                throw th;
            }
        }
        d dVar = this.f29974f;
        if (dVar != null && dVar.b()) {
            return true;
        }
        this.f29974f = null;
        this.f29976h = null;
        boolean z10 = false;
        while (!z10) {
            if (!(this.f29973e < this.f29971c.c().size())) {
                break;
            }
            List<l3.n.a<?>> listC = this.f29971c.c();
            int i11 = this.f29973e;
            this.f29973e = i11 + 1;
            this.f29976h = listC.get(i11);
            if (this.f29976h != null && (this.f29971c.f29816p.c(this.f29976h.f32168c.d()) || this.f29971c.g(this.f29976h.f32168c.a()))) {
                this.f29976h.f32168c.e(this.f29971c.f29815o, this);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // e3.d.a
    public void c(Exception exc) {
        this.f29972d.e(this.f29977i, exc, this.f29976h.f32168c, this.f29976h.f32168c.d());
    }

    @Override // g3.g
    public void cancel() {
        l3.n.a<?> aVar = this.f29976h;
        if (aVar != null) {
            aVar.f32168c.cancel();
        }
    }

    @Override // g3.g.a
    public void d() {
        throw new UnsupportedOperationException();
    }

    @Override // g3.g.a
    public void e(d3.c cVar, Exception exc, e3.d<?> dVar, com.bumptech.glide.load.a aVar) {
        this.f29972d.e(cVar, exc, dVar, this.f29976h.f32168c.d());
    }

    @Override // e3.d.a
    public void f(Object obj) {
        k kVar = this.f29971c.f29816p;
        if (obj == null || !kVar.c(this.f29976h.f32168c.d())) {
            this.f29972d.a(this.f29976h.f32166a, obj, this.f29976h.f32168c, this.f29976h.f32168c.d(), this.f29977i);
        } else {
            this.f29975g = obj;
            this.f29972d.d();
        }
    }
}
