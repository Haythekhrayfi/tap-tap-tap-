package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import android.util.Pair;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.al0;
import com.yandex.mobile.ads.impl.g11;
import com.yandex.mobile.ads.impl.i01;
import com.yandex.mobile.ads.impl.la1;
import com.yandex.mobile.ads.impl.lm0;
import com.yandex.mobile.ads.impl.nz0;
import com.yandex.mobile.ads.impl.o21;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class p0 extends v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j0 f27808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i01 f27809g;

    public p0(j0 j0Var, n0 n0Var, i01 i01Var, AdResponse adResponse) {
        super(n0Var, adResponse);
        this.f27808f = j0Var;
        this.f27809g = i01Var;
    }

    @Override // com.yandex.mobile.ads.nativeads.v
    public final Pair<la1.a, String> a(Context context, int i10, boolean z10, boolean z11) {
        nz0 nz0VarA = this.f27809g.a(context);
        return !(nz0VarA == null || nz0VarA.J()) ? new Pair<>(la1.a.f22656b, null) : super.a(context, i10, z10, z11);
    }

    @Override // com.yandex.mobile.ads.nativeads.v
    public final la1 a(Context context, la1.a aVar, boolean z10, int i10) {
        boolean z11;
        int iC;
        v vVar;
        if (aVar == la1.a.f22656b) {
            Iterator<u> it = this.f27808f.d().iterator();
            while (true) {
                z11 = true;
                boolean z12 = false;
                if (!it.hasNext()) {
                    z11 = false;
                    break;
                }
                Object obj = (u) it.next();
                if (obj instanceof l0) {
                    l0 l0Var = (l0) obj;
                    al0 al0VarD = l0Var.d();
                    lm0 lm0VarE = l0Var.e();
                    nz0 nz0VarA = this.f27809g.a(context);
                    boolean z13 = nz0VarA == null || nz0VarA.J();
                    Iterator<g11> it2 = lm0VarE.e().iterator();
                    do {
                        if (!it2.hasNext()) {
                            z12 = true;
                            break;
                        }
                        iC = z13 ? it2.next().c() : i10;
                        vVar = (v) al0VarD;
                    } while ((z10 ? vVar.b(context, iC) : vVar.a(context, iC)).e() == la1.a.f22656b);
                    if (z12) {
                        break;
                    }
                }
            }
            if (!z11) {
                aVar = la1.a.f22660f;
            }
        }
        return new la1(aVar, new o21());
    }
}
