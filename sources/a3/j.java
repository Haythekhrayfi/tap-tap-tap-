package a3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import u3.l;
import u3.n;

/* JADX INFO: loaded from: classes.dex */
public class j implements u3.g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final x3.e f58l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f59a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f60b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u3.f f61c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f62d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u3.k f63e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f64f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Runnable f65g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Handler f66h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u3.b f67i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList<x3.d<Object>> f68j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public x3.e f69k;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j jVar = j.this;
            jVar.f61c.a(jVar);
        }
    }

    public class b implements u3.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f71a;

        public b(l lVar) {
            this.f71a = lVar;
        }
    }

    static {
        x3.e eVarD = new x3.e().d(Bitmap.class);
        eVarD.f37444v = true;
        f58l = eVarD;
        new x3.e().d(s3.c.class).f37444v = true;
        new x3.e().e(g3.k.f29861c).j(g.LOW).n(true);
    }

    public j(c cVar, u3.f fVar, u3.k kVar, Context context) {
        l lVar = new l();
        u3.c cVar2 = cVar.f19i;
        this.f64f = new n();
        a aVar = new a();
        this.f65g = aVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f66h = handler;
        this.f59a = cVar;
        this.f61c = fVar;
        this.f63e = kVar;
        this.f62d = lVar;
        this.f60b = context;
        Context applicationContext = context.getApplicationContext();
        b bVar = new b(lVar);
        Objects.requireNonNull((u3.e) cVar2);
        boolean z10 = e0.a.a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z10 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        u3.b dVar = z10 ? new u3.d(applicationContext, bVar) : new u3.h();
        this.f67i = dVar;
        if (b4.j.g()) {
            handler.post(aVar);
        } else {
            fVar.a(this);
        }
        fVar.a(dVar);
        this.f68j = new CopyOnWriteArrayList<>(cVar.f15e.f41e);
        x3.e eVar = cVar.f15e.f40d;
        synchronized (this) {
            x3.e eVarClone = eVar.clone();
            if (eVarClone.f37444v && !eVarClone.f37446x) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            eVarClone.f37446x = true;
            eVarClone.f37444v = true;
            this.f69k = eVarClone;
        }
        synchronized (cVar.f20j) {
            if (cVar.f20j.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            cVar.f20j.add(this);
        }
    }

    public synchronized void i(y3.h<?> hVar) {
        if (hVar == null) {
            return;
        }
        n(hVar);
    }

    public i<Drawable> j(String str) {
        i<Drawable> iVar = new i<>(this.f59a, this, Drawable.class, this.f60b);
        iVar.H = str;
        iVar.J = true;
        return iVar;
    }

    public synchronized void k() {
        l lVar = this.f62d;
        lVar.f35994c = true;
        for (x3.b bVar : (ArrayList) b4.j.e(lVar.f35992a)) {
            if (bVar.isRunning()) {
                bVar.clear();
                lVar.f35993b.add(bVar);
            }
        }
    }

    public synchronized void l() {
        l lVar = this.f62d;
        lVar.f35994c = false;
        for (x3.b bVar : (ArrayList) b4.j.e(lVar.f35992a)) {
            if (!bVar.e() && !bVar.isRunning()) {
                bVar.d();
            }
        }
        lVar.f35993b.clear();
    }

    public synchronized boolean m(y3.h<?> hVar) {
        x3.b bVarG = hVar.g();
        if (bVarG == null) {
            return true;
        }
        if (!this.f62d.a(bVarG, true)) {
            return false;
        }
        this.f64f.f36002a.remove(hVar);
        hVar.d(null);
        return true;
    }

    public final void n(y3.h<?> hVar) {
        boolean z10;
        if (m(hVar)) {
            return;
        }
        c cVar = this.f59a;
        synchronized (cVar.f20j) {
            Iterator<j> it = cVar.f20j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                } else if (it.next().m(hVar)) {
                    z10 = true;
                    break;
                }
            }
        }
        if (z10 || hVar.g() == null) {
            return;
        }
        x3.b bVarG = hVar.g();
        hVar.d(null);
        bVarG.clear();
    }

    @Override // u3.g
    public synchronized void onDestroy() {
        this.f64f.onDestroy();
        Iterator it = b4.j.e(this.f64f.f36002a).iterator();
        while (it.hasNext()) {
            i((y3.h) it.next());
        }
        this.f64f.f36002a.clear();
        l lVar = this.f62d;
        Iterator it2 = ((ArrayList) b4.j.e(lVar.f35992a)).iterator();
        while (it2.hasNext()) {
            lVar.a((x3.b) it2.next(), false);
        }
        lVar.f35993b.clear();
        this.f61c.b(this);
        this.f61c.b(this.f67i);
        this.f66h.removeCallbacks(this.f65g);
        c cVar = this.f59a;
        synchronized (cVar.f20j) {
            if (!cVar.f20j.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            cVar.f20j.remove(this);
        }
    }

    @Override // u3.g
    public synchronized void onStart() {
        l();
        this.f64f.onStart();
    }

    @Override // u3.g
    public synchronized void onStop() {
        k();
        this.f64f.onStop();
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f62d + ", treeNode=" + this.f63e + "}";
    }
}
