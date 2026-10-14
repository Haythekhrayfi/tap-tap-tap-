package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.common.AdImpressionData;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w20 implements a30, gf0, ze1, tv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f26137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y20 f26138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m3 f26139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f26140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<g11> f26141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AdImpressionData f26142f;

    public interface a {
        void a(AdImpressionData adImpressionData);
    }

    public w20(Context context, a aVar, z20 z20Var, m3 m3Var) {
        this.f26140d = context.getApplicationContext();
        this.f26137a = aVar;
        this.f26139c = m3Var;
        this.f26138b = new y20(z20Var);
    }

    private boolean a() {
        List<g11> list = this.f26141e;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public final void a(List<g11> list, AdImpressionData adImpressionData) {
        this.f26141e = list;
        this.f26142f = adImpressionData;
        this.f26138b.a();
    }

    @Override // com.yandex.mobile.ads.impl.gf0
    public final void b() {
        if (a()) {
            return;
        }
        this.f26138b.c();
        nz0 nz0VarA = i01.b().a(this.f26140d);
        if (nz0VarA == null || nz0VarA.y()) {
            this.f26139c.a();
            this.f26137a.a(this.f26142f);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ze1
    public final void c() {
        if (a()) {
            return;
        }
        this.f26138b.b();
        nz0 nz0VarA = i01.b().a(this.f26140d);
        if (nz0VarA == null || nz0VarA.y()) {
            return;
        }
        this.f26139c.a();
        this.f26137a.a(this.f26142f);
    }

    @Override // com.yandex.mobile.ads.impl.gf0
    public final void d() {
        if (a()) {
            return;
        }
        this.f26138b.b();
        nz0 nz0VarA = i01.b().a(this.f26140d);
        if (nz0VarA == null || nz0VarA.y()) {
            return;
        }
        this.f26139c.a();
        this.f26137a.a(this.f26142f);
    }

    @Override // com.yandex.mobile.ads.impl.tv0
    public final void e() {
        if (a()) {
            nz0 nz0VarA = i01.b().a(this.f26140d);
            if (nz0VarA == null || nz0VarA.y()) {
                return;
            }
            this.f26139c.a();
            this.f26137a.a(this.f26142f);
        }
    }

    @Override // com.yandex.mobile.ads.impl.a30
    public final void f() {
        if (a()) {
            nz0 nz0VarA = i01.b().a(this.f26140d);
            if (nz0VarA == null || nz0VarA.y()) {
                this.f26139c.a();
                this.f26137a.a(this.f26142f);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ze1
    public final void g() {
        if (a()) {
            return;
        }
        this.f26138b.c();
        nz0 nz0VarA = i01.b().a(this.f26140d);
        if (nz0VarA == null || nz0VarA.y()) {
            this.f26139c.a();
            this.f26137a.a(this.f26142f);
        }
    }
}
