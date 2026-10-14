package com.yandex.metrica.impl.ob;

import android.app.Activity;
import java.util.Collections;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.zl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C2144zl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1815ml f18041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lk f18042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F9 f18043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Il f18044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C1667gm f18045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Hk.b f18046f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Ik f18047g;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.zl$a */
    public class a implements InterfaceC1815ml {
        public a(C2144zl c2144zl) {
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC1815ml
        public void onError(String str) {
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC1815ml
        public void onResult(JSONObject jSONObject) {
        }
    }

    public C2144zl(Il il, Lk lk, F9 f10, C1667gm c1667gm, Ik ik) {
        this(il, lk, f10, c1667gm, ik, new Hk.b());
    }

    public C2144zl(Il il, Lk lk, F9 f10, C1667gm c1667gm, Ik ik, Hk.b bVar) {
        this.f18041a = new a(this);
        this.f18044d = il;
        this.f18042b = lk;
        this.f18043c = f10;
        this.f18045e = c1667gm;
        this.f18046f = bVar;
        this.f18047g = ik;
    }

    private void a(Activity activity, long j10, Il il, C1542bm c1542bm) {
        C1667gm c1667gm = this.f18045e;
        Hk.b bVar = this.f18046f;
        Lk lk = this.f18042b;
        F9 f10 = this.f18043c;
        InterfaceC1815ml interfaceC1815ml = this.f18041a;
        Objects.requireNonNull(bVar);
        c1667gm.a(activity, j10, il, c1542bm, Collections.singletonList(new Hk(lk, f10, false, interfaceC1815ml, new Hk.a())));
    }

    public void a(Activity activity) {
        Il il = this.f18044d;
        if (this.f18047g.a(activity, il) == EnumC2119yl.OK) {
            C1542bm c1542bm = il.f14236e;
            a(activity, c1542bm.f15849d, il, c1542bm);
        }
    }

    public void a(Il il) {
        this.f18044d = il;
    }

    public void b(Activity activity) {
        Il il = this.f18044d;
        if (this.f18047g.a(activity, il) == EnumC2119yl.OK) {
            a(activity, 0L, il, il.f14236e);
        }
    }
}
