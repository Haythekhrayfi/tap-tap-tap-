package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.impl.i01;
import com.yandex.mobile.ads.impl.la1;
import com.yandex.mobile.ads.impl.nz0;
import com.yandex.mobile.ads.impl.oj0;
import com.yandex.mobile.ads.impl.x6;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class d0 implements x6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h0 f27731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final oj0 f27732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i01 f27733c = i01.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f27734d;

    public d0(Context context, g gVar, oj0 oj0Var) {
        this.f27731a = gVar;
        this.f27732b = oj0Var;
        this.f27734d = context;
    }

    @Override // com.yandex.mobile.ads.impl.x6
    public final boolean a() {
        Objects.requireNonNull(this.f27732b);
        nz0 nz0VarA = this.f27733c.a(this.f27734d);
        return !(nz0VarA != null && nz0VarA.V()) || ((g0) this.f27731a.a(false)).b() == la1.a.f22656b;
    }
}
