package com.iab.omid.library.applovin.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.applovin.utils.f;
import com.iab.omid.library.applovin.utils.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class TreeWalker implements com.iab.omid.library.applovin.processor.a.InterfaceC0165a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f12986i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f12987j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f12988k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f12989l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f12990m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f12992b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f12998h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f12991a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f12993c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.applovin.weakreference.a> f12994d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.applovin.walking.a f12996f = new com.iab.omid.library.applovin.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.applovin.processor.b f12995e = new com.iab.omid.library.applovin.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.applovin.walking.b f12997g = new com.iab.omid.library.applovin.walking.b(new com.iab.omid.library.applovin.walking.async.c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i10, long j10);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i10, long j10);
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.this.f12997g.b();
        }
    }

    public class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.getInstance().l();
        }
    }

    public class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f12988k != null) {
                TreeWalker.f12988k.post(TreeWalker.f12989l);
                TreeWalker.f12988k.postDelayed(TreeWalker.f12990m, 200L);
            }
        }
    }

    private void a(long j10) {
        if (this.f12991a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f12991a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f12992b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f12992b, j10);
                }
            }
        }
    }

    private void a(View view, com.iab.omid.library.applovin.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.applovin.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.applovin.walking.c.PARENT_VIEW, z10);
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.applovin.processor.a aVarB = this.f12995e.b();
        String strB = this.f12996f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.applovin.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.applovin.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.applovin.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        com.iab.omid.library.applovin.walking.a.C0166a c0166aC = this.f12996f.c(view);
        if (c0166aC == null) {
            return false;
        }
        com.iab.omid.library.applovin.utils.c.a(jSONObject, c0166aC);
        return true;
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strD = this.f12996f.d(view);
        if (strD == null) {
            return false;
        }
        com.iab.omid.library.applovin.utils.c.a(jSONObject, strD);
        com.iab.omid.library.applovin.utils.c.a(jSONObject, Boolean.valueOf(this.f12996f.f(view)));
        this.f12996f.d();
        return true;
    }

    private void d() {
        a(f.b() - this.f12998h);
    }

    private void e() {
        this.f12992b = 0;
        this.f12994d.clear();
        this.f12993c = false;
        Iterator<com.iab.omid.library.applovin.adsession.a> it = com.iab.omid.library.applovin.internal.c.c().a().iterator();
        while (it.hasNext()) {
            if (it.next().e()) {
                this.f12993c = true;
                break;
            }
        }
        this.f12998h = f.b();
    }

    public static TreeWalker getInstance() {
        return f12986i;
    }

    private void i() {
        if (f12988k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f12988k = handler;
            handler.post(f12989l);
            f12988k.postDelayed(f12990m, 200L);
        }
    }

    private void k() {
        Handler handler = f12988k;
        if (handler != null) {
            handler.removeCallbacks(f12990m);
            f12988k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
    }

    @Override // com.iab.omid.library.applovin.processor.a.InterfaceC0165a
    public void a(View view, com.iab.omid.library.applovin.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.applovin.walking.c cVarE;
        if (h.d(view) && (cVarE = this.f12996f.e(view)) != com.iab.omid.library.applovin.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.applovin.utils.c.a(jSONObject, jSONObjectA);
            if (!b(view, jSONObjectA)) {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f12993c && cVarE == com.iab.omid.library.applovin.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f12994d.add(new com.iab.omid.library.applovin.weakreference.a(view));
                }
                a(view, aVar, jSONObjectA, cVarE, z11);
            }
            this.f12992b++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f12991a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f12991a.add(treeWalkerTimeLogger);
    }

    public void f() {
        this.f12996f.e();
        long jB = f.b();
        com.iab.omid.library.applovin.processor.a aVarA = this.f12995e.a();
        if (this.f12996f.b().size() > 0) {
            for (String str : this.f12996f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f12996f.a(str), jSONObjectA);
                com.iab.omid.library.applovin.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f12997g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f12996f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            a(null, aVarA, jSONObjectA2, com.iab.omid.library.applovin.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.applovin.utils.c.b(jSONObjectA2);
            this.f12997g.b(jSONObjectA2, this.f12996f.c(), jB);
            if (this.f12993c) {
                Iterator<com.iab.omid.library.applovin.adsession.a> it = com.iab.omid.library.applovin.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(this.f12994d);
                }
            }
        } else {
            this.f12997g.b();
        }
        this.f12996f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f12991a.clear();
        f12987j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f12991a.contains(treeWalkerTimeLogger)) {
            this.f12991a.remove(treeWalkerTimeLogger);
        }
    }
}
