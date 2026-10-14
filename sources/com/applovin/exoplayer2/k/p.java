package com.applovin.exoplayer2.k;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class p implements i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f7463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final aa f7464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i.a f7465c;

    public p(Context context, aa aaVar, i.a aVar) {
        this.f7463a = context.getApplicationContext();
        this.f7464b = aaVar;
        this.f7465c = aVar;
    }

    public p(Context context, String str) {
        this(context, str, (aa) null);
    }

    public p(Context context, String str, aa aaVar) {
        this(context, aaVar, new q.a().a(str));
    }

    @Override // com.applovin.exoplayer2.k.i.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public o a() {
        o oVar = new o(this.f7463a, this.f7465c.a());
        aa aaVar = this.f7464b;
        if (aaVar != null) {
            oVar.a(aaVar);
        }
        return oVar;
    }
}
