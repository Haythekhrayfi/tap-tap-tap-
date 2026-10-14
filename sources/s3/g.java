package s3;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import g3.k;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c3.a f35425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f35426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<b> f35427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a3.j f35428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h3.d f35429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f35430f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f35431g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a3.i<Bitmap> f35432h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f35433i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f35434j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f35435k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Bitmap f35436l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d3.g<Bitmap> f35437m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a f35438n;

    public static class a extends y3.f<Bitmap> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Handler f35439d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f35440e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f35441f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Bitmap f35442g;

        public a(Handler handler, int i10, long j10) {
            this.f35439d = handler;
            this.f35440e = i10;
            this.f35441f = j10;
        }

        @Override // y3.h
        public void b(Object obj, z3.b bVar) {
            this.f35442g = (Bitmap) obj;
            this.f35439d.sendMessageAtTime(this.f35439d.obtainMessage(1, this), this.f35441f);
        }
    }

    public interface b {
        void a();
    }

    public class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                g.this.c((a) message.obj);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            g.this.f35428d.i((a) message.obj);
            return false;
        }
    }

    public g(a3.c cVar, c3.a aVar, int i10, int i11, d3.g<Bitmap> gVar, Bitmap bitmap) {
        h3.d dVar = cVar.f13c;
        Context baseContext = cVar.f15e.getBaseContext();
        Objects.requireNonNull(baseContext, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        a3.j jVarA = a3.c.b(baseContext).f18h.a(baseContext);
        Context baseContext2 = cVar.f15e.getBaseContext();
        Objects.requireNonNull(baseContext2, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        a3.j jVarA2 = a3.c.b(baseContext2).f18h.a(baseContext2);
        Objects.requireNonNull(jVarA2);
        a3.i<Bitmap> iVarR = new a3.i(jVarA2.f59a, jVarA2, Bitmap.class, jVarA2.f60b).b(a3.j.f58l).b(new x3.e().e(k.f29860b).q(true).n(true).h(i10, i11));
        this.f35427c = new ArrayList();
        this.f35428d = jVarA;
        Handler handler = new Handler(Looper.getMainLooper(), new c());
        this.f35429e = dVar;
        this.f35426b = handler;
        this.f35432h = iVarR;
        this.f35425a = aVar;
        d(gVar, bitmap);
    }

    public Bitmap a() {
        a aVar = this.f35433i;
        return aVar != null ? aVar.f35442g : this.f35436l;
    }

    public final void b() {
        if (!this.f35430f || this.f35431g) {
            return;
        }
        a aVar = this.f35438n;
        if (aVar != null) {
            this.f35438n = null;
            c(aVar);
            return;
        }
        this.f35431g = true;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) this.f35425a.d());
        this.f35425a.b();
        this.f35435k = new a(this.f35426b, this.f35425a.f(), jUptimeMillis);
        a3.i<Bitmap> iVarR = this.f35432h.b(new x3.e().m(new a4.c(Double.valueOf(Math.random()))));
        iVarR.H = this.f35425a;
        iVarR.J = true;
        iVarR.t(this.f35435k, null, iVarR, b4.e.f3295a);
    }

    public void c(a aVar) {
        this.f35431g = false;
        if (this.f35434j) {
            this.f35426b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f35430f) {
            this.f35438n = aVar;
            return;
        }
        if (aVar.f35442g != null) {
            Bitmap bitmap = this.f35436l;
            if (bitmap != null) {
                this.f35429e.d(bitmap);
                this.f35436l = null;
            }
            a aVar2 = this.f35433i;
            this.f35433i = aVar;
            int size = this.f35427c.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    this.f35427c.get(size).a();
                }
            }
            if (aVar2 != null) {
                this.f35426b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        b();
    }

    public void d(d3.g<Bitmap> gVar, Bitmap bitmap) {
        Objects.requireNonNull(gVar, "Argument must not be null");
        this.f35437m = gVar;
        Objects.requireNonNull(bitmap, "Argument must not be null");
        this.f35436l = bitmap;
        this.f35432h = this.f35432h.b(new x3.e().o(gVar, true));
    }
}
