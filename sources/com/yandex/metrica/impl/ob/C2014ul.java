package com.yandex.metrica.impl.ob;

import android.app.Activity;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ul, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C2014ul {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Vl.a f17578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lk f17579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F9 f17580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Il f17581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C1667gm f17582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Hk.b f17583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Ik f17584g;

    public C2014ul(Il il, Lk lk, F9 f10, Vl.a aVar, C1667gm c1667gm, Ik ik, Hk.b bVar) {
        this.f17581d = il;
        this.f17579b = lk;
        this.f17580c = f10;
        this.f17578a = aVar;
        this.f17582e = c1667gm;
        this.f17584g = ik;
        this.f17583f = bVar;
    }

    public C2014ul(Il il, Lk lk, F9 f10, C1667gm c1667gm, Ik ik) {
        this(il, lk, f10, new Vl.a(), c1667gm, ik, new Hk.b());
    }

    public void a(Activity activity, Ol ol, boolean z10) {
        String str;
        Objects.requireNonNull(this.f17578a);
        Vl vl = new Vl(ol, new Ul(z10));
        Il il = this.f17581d;
        if ((!z10 && !this.f17579b.b().isEmpty()) || activity == null) {
            vl.onResult(this.f17579b.a());
            return;
        }
        vl.a(true);
        EnumC2119yl enumC2119ylA = this.f17584g.a(activity, il);
        if (enumC2119ylA != EnumC2119yl.OK) {
            int iOrdinal = enumC2119ylA.ordinal();
            if (iOrdinal == 1) {
                str = String.format("no %s_config", "ui_access");
            } else if (iOrdinal == 2) {
                str = String.format("no %s_config", "ui_parsing");
            } else if (iOrdinal == 3) {
                str = String.format("feature %s disabled", "ui_parsing");
            } else if (iOrdinal != 4) {
                str = iOrdinal != 5 ? "parsing ui context is forbidden for some reason" : "parsing ui context is forbidden by app for activity";
            } else {
                str = "parsing ui context is forbidden by app for application";
            }
        } else if (!il.f14234c) {
            str = String.format("feature %s disabled", "ui_collecting_for_bridge");
        } else {
            if (il.f14238g != null) {
                C1667gm c1667gm = this.f17582e;
                C1542bm c1542bm = il.f14236e;
                Hk.b bVar = this.f17583f;
                Lk lk = this.f17579b;
                F9 f10 = this.f17580c;
                Objects.requireNonNull(bVar);
                c1667gm.a(activity, 0L, il, c1542bm, Collections.singletonList(new Hk(lk, f10, z10, vl, new Hk.a())));
                return;
            }
            str = String.format("no %s_config", "ui_collecting_for_bridge");
        }
        ol.onError(str);
    }

    public void a(Il il) {
        this.f17581d = il;
    }
}
