package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.mediation.base.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class id0<T extends com.yandex.mobile.ads.mediation.base.a, L> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k2 f21693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w3 f21694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ld0<T, L> f21695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final qd0 f21696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final jd0<T> f21697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.yandex.mobile.ads.mediation.base.b f21698f = new com.yandex.mobile.ads.mediation.base.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final tp0 f21699g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private hd0<T> f21700h;

    public id0(k2 k2Var, w3 w3Var, ld0<T, L> ld0Var, qd0 qd0Var, jd0<T> jd0Var, tp0 tp0Var) {
        this.f21693a = k2Var;
        this.f21694b = w3Var;
        this.f21695c = ld0Var;
        this.f21699g = tp0Var;
        this.f21697e = jd0Var;
        this.f21696d = qd0Var;
    }

    public final hd0 a() {
        return this.f21700h;
    }

    public final void a(Context context) {
        hd0<T> hd0Var = this.f21700h;
        if (hd0Var != null) {
            try {
                this.f21695c.a(hd0Var.a());
            } catch (Throwable th) {
                ce0 ce0VarB = this.f21700h.b();
                x60.a(th, th.toString(), new Object[0]);
                HashMap map = new HashMap();
                map.put("exception_in_adapter", th.toString());
                HashMap map2 = new HashMap();
                map2.put("reason", map);
                this.f21696d.a(context, ce0VarB, map2);
            }
        }
    }

    public final void a(Context context, AdResponse<String> adResponse) {
        hd0<T> hd0Var = this.f21700h;
        if (hd0Var != null) {
            this.f21696d.a(context, hd0Var.b(), adResponse);
        }
    }

    public final void a(Context context, t2 t2Var, L l10) {
        if (this.f21700h != null) {
            HashMap mapA = com.applovin.impl.mediation.b.a.c.a("status", "error");
            mapA.put("error_code", Integer.valueOf(t2Var.a()));
            this.f21696d.d(context, this.f21700h.b(), mapA);
        }
        a(context);
        a(context, l10);
    }

    public final void a(Context context, L l10) {
        hd0<T> hd0VarA = this.f21697e.a(context);
        this.f21700h = hd0VarA;
        if (hd0VarA == null) {
            this.f21699g.a();
            return;
        }
        this.f21694b.b(v3.f25798a);
        ce0 ce0VarB = this.f21700h.b();
        this.f21696d.b(context, ce0VarB);
        try {
            this.f21695c.a(context, this.f21700h.a(), l10, this.f21700h.a(context), this.f21700h.c());
        } catch (Throwable th) {
            x60.a(th, th.toString(), new Object[0]);
            HashMap map = new HashMap();
            map.put("exception_in_adapter", th.toString());
            HashMap map2 = new HashMap();
            map2.put("reason", map);
            this.f21696d.a(context, ce0VarB, map2);
            hd0<T> hd0Var = this.f21700h;
            this.f21694b.a(new a7(fw0.c.f20902c, hd0Var != null ? hd0Var.b().c() : null));
            a(context, l10);
        }
    }

    public final void a(Context context, HashMap map) {
        hd0<T> hd0Var = this.f21700h;
        if (hd0Var != null) {
            ce0 ce0VarB = hd0Var.b();
            List<String> listE = ce0VarB.e();
            if (listE != null) {
                Iterator<String> it = listE.iterator();
                while (it.hasNext()) {
                    new k6(context, this.f21693a).a(it.next());
                }
            }
            HashMap map2 = new HashMap(map);
            map2.put("click_type", "default");
            this.f21696d.b(context, ce0VarB, map2);
        }
    }

    public final void a(Context context, Map<String, Object> map) {
        hd0<T> hd0Var = this.f21700h;
        if (hd0Var != null) {
            this.f21696d.b(context, hd0Var.b(), map);
        }
    }

    public final void b(Context context) {
        if (this.f21700h != null) {
            HashMap mapA = com.applovin.impl.mediation.b.a.c.a("status", "success");
            this.f21696d.d(context, this.f21700h.b(), mapA);
        }
    }

    public final void b(Context context, t2 t2Var, L l10) {
        hd0<T> hd0Var = this.f21700h;
        this.f21694b.a(new a7(fw0.c.f20902c, hd0Var != null ? hd0Var.b().c() : null));
        HashMap map = new HashMap();
        map.put("status", "error");
        map.put("error_code", Integer.valueOf(t2Var.a()));
        map.put("error_description", t2Var.b());
        hd0<T> hd0Var2 = this.f21700h;
        if (hd0Var2 != null) {
            com.yandex.mobile.ads.mediation.base.a aVarA = hd0Var2.a();
            Objects.requireNonNull(this.f21698f);
            map.putAll(com.yandex.mobile.ads.mediation.base.b.a(aVarA));
            this.f21696d.e(context, this.f21700h.b(), map);
        }
        a(context);
        a(context, l10);
    }

    public final void b(Context context, HashMap map) {
        hd0<T> hd0Var = this.f21700h;
        if (hd0Var != null) {
            ce0 ce0VarB = hd0Var.b();
            List<String> listF = ce0VarB.f();
            if (listF != null) {
                Iterator<String> it = listF.iterator();
                while (it.hasNext()) {
                    new k6(context, this.f21693a).a(it.next());
                }
            }
            this.f21696d.c(context, ce0VarB, map);
        }
    }

    public final void b(Context context, Map<String, Object> map) {
        hd0<T> hd0Var = this.f21700h;
        if (hd0Var != null) {
            this.f21696d.a(context, hd0Var.b(), map);
        }
    }

    public final boolean b() {
        hd0<T> hd0Var = this.f21700h;
        if (hd0Var != null) {
            return hd0Var.a().shouldTrackImpressionAutomatically();
        }
        return true;
    }

    public final void c(Context context) {
        hd0<T> hd0Var = this.f21700h;
        if (hd0Var != null) {
            this.f21696d.a(context, hd0Var.b());
        }
    }

    public final void c(Context context, HashMap map) {
        hd0<T> hd0Var = this.f21700h;
        if (hd0Var != null) {
            List<String> listB = hd0Var.b().b();
            k6 k6Var = new k6(context, this.f21693a);
            if (listB != null) {
                Iterator<String> it = listB.iterator();
                while (it.hasNext()) {
                    k6Var.a(it.next());
                }
            }
        }
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.put("status", "success");
        hd0<T> hd0Var2 = this.f21700h;
        if (hd0Var2 != null) {
            com.yandex.mobile.ads.mediation.base.a aVarA = hd0Var2.a();
            Objects.requireNonNull(this.f21698f);
            map2.putAll(com.yandex.mobile.ads.mediation.base.b.a(aVarA));
            this.f21696d.e(context, this.f21700h.b(), map2);
        }
    }
}
