package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class i81 implements gm1.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static i81 f21623h = new i81();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static Handler f21624i = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f21625j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Runnable f21626k = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f21627l = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21629b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f21634g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList f21628a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f21630c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private km1 f21632e = new km1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private qm1 f21631d = new qm1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private tm1 f21633f = new tm1(new zm1());

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            i81.this.f21633f.a();
        }
    }

    public static class b implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            i81.b(i81.g());
        }
    }

    public static class c implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            if (i81.f21625j != null) {
                i81.f21625j.post(i81.f21626k);
                i81.f21625j.postDelayed(i81.f21627l, 200L);
            }
        }
    }

    public interface d extends e {
        void a();
    }

    public interface e {
        void b();
    }

    public static void a() {
        if (f21625j == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f21625j = handler;
            handler.post(f21626k);
            f21625j.postDelayed(f21627l, 200L);
        }
    }

    public static void b(i81 i81Var) {
        i81Var.f21629b = 0;
        i81Var.f21630c.clear();
        Iterator<em1> it = fm1.a().c().iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
        }
        i81Var.f21634g = System.nanoTime();
        i81Var.f21632e.c();
        long jNanoTime = System.nanoTime();
        xm1 xm1VarA = i81Var.f21631d.a();
        if (i81Var.f21632e.b().size() > 0) {
            for (String str : i81Var.f21632e.b()) {
                JSONObject jSONObjectA = xm1VarA.a(null);
                View viewB = i81Var.f21632e.b(str);
                cn1 cn1VarB = i81Var.f21631d.b();
                String strA = i81Var.f21632e.a(str);
                if (strA != null) {
                    JSONObject jSONObjectA2 = cn1VarB.a(viewB);
                    try {
                        jSONObjectA2.put("adSessionId", str);
                    } catch (JSONException e10) {
                        ym1.a("Error with setting ad session id", e10);
                    }
                    try {
                        jSONObjectA2.put("notVisibleReason", strA);
                    } catch (JSONException e11) {
                        ym1.a("Error with setting not visible reason", e11);
                    }
                    try {
                        JSONArray jSONArrayOptJSONArray = jSONObjectA.optJSONArray("childViews");
                        if (jSONArrayOptJSONArray == null) {
                            jSONArrayOptJSONArray = new JSONArray();
                            jSONObjectA.put("childViews", jSONArrayOptJSONArray);
                        }
                        jSONArrayOptJSONArray.put(jSONObjectA2);
                    } catch (JSONException unused) {
                    }
                }
                rm1.a(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                i81Var.f21633f.b(jSONObjectA, hashSet, jNanoTime);
            }
        }
        if (i81Var.f21632e.a().size() > 0) {
            JSONObject jSONObjectA3 = xm1VarA.a(null);
            xm1VarA.a(null, jSONObjectA3, i81Var, true, false);
            rm1.a(jSONObjectA3);
            i81Var.f21633f.a(jSONObjectA3, i81Var.f21632e.a(), jNanoTime);
        } else {
            i81Var.f21633f.a();
        }
        i81Var.f21632e.d();
        long jNanoTime2 = System.nanoTime() - i81Var.f21634g;
        if (i81Var.f21628a.size() > 0) {
            for (e eVar : i81Var.f21628a) {
                TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                eVar.b();
                if (eVar instanceof d) {
                    ((d) eVar).a();
                }
            }
        }
    }

    public static void c() {
        Handler handler = f21625j;
        if (handler != null) {
            handler.removeCallbacks(f21627l);
            f21625j = null;
        }
    }

    public static i81 g() {
        return f21623h;
    }

    public final void a(View view, gm1 gm1Var, JSONObject jSONObject, boolean z10) {
        int iC;
        boolean z11;
        boolean z12;
        if ((ln1.c(view) == null) && (iC = this.f21632e.c(view)) != 3) {
            JSONObject jSONObjectA = gm1Var.a(view);
            int i10 = rm1.f24795d;
            try {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                    jSONObject.put("childViews", jSONArrayOptJSONArray);
                }
                jSONArrayOptJSONArray.put(jSONObjectA);
            } catch (JSONException unused) {
            }
            Object objA = this.f21632e.a(view);
            if (objA != null) {
                try {
                    jSONObjectA.put("adSessionId", objA);
                } catch (JSONException e10) {
                    ym1.a("Error with setting ad session id", e10);
                }
                try {
                    jSONObjectA.put("hasWindowFocus", Boolean.valueOf(this.f21632e.d(view)));
                } catch (JSONException e11) {
                    ym1.a("Error with setting not visible reason", e11);
                }
                this.f21632e.e();
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                km1.a aVarB = this.f21632e.b(view);
                if (aVarB != null) {
                    int i11 = rm1.f24795d;
                    wm1 wm1VarA = aVarB.a();
                    JSONArray jSONArray = new JSONArray();
                    Iterator<String> it = aVarB.b().iterator();
                    while (it.hasNext()) {
                        jSONArray.put(it.next());
                    }
                    try {
                        jSONObjectA.put("isFriendlyObstructionFor", jSONArray);
                        jSONObjectA.put("friendlyObstructionClass", wm1VarA.b());
                        jSONObjectA.put("friendlyObstructionPurpose", wm1VarA.c());
                        jSONObjectA.put("friendlyObstructionReason", wm1VarA.d());
                    } catch (JSONException e12) {
                        ym1.a("Error with setting friendly obstruction", e12);
                    }
                    z12 = true;
                } else {
                    z12 = false;
                }
                gm1Var.a(view, jSONObjectA, this, iC == 1, z10 || z12);
            }
            this.f21629b++;
        }
    }

    public final void b() {
        c();
        this.f21628a.clear();
        f21624i.post(new a());
    }
}
