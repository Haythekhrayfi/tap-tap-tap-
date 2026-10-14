package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.al0;
import com.yandex.mobile.ads.impl.eh1;
import com.yandex.mobile.ads.impl.iq;
import com.yandex.mobile.ads.impl.kq0;
import com.yandex.mobile.ads.impl.la1;
import com.yandex.mobile.ads.impl.u4;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
class v implements al0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f27971a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdResponse f27973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private w f27974d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kq0 f27972b = kq0.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final iq f27975e = new iq();

    public v(g gVar, AdResponse adResponse) {
        this.f27971a = gVar;
        this.f27973c = adResponse;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0041  */
    public Pair<la1.a, String> a(Context context, int i10, boolean z10, boolean z11) {
        boolean z12;
        la1.a aVar;
        View viewE;
        View viewE2;
        String strW = this.f27973c.w();
        Objects.requireNonNull(this.f27975e);
        boolean zA = iq.a(context);
        String strA = null;
        if (z10 && !z11) {
            aVar = la1.a.f22657c;
        } else if (a()) {
            aVar = la1.a.f22666l;
        } else {
            w wVar = this.f27974d;
            boolean z13 = false;
            if (wVar == null || (viewE2 = wVar.e()) == null) {
                z12 = true;
            } else {
                int i11 = eh1.f20253b;
                int height = viewE2.getHeight();
                if (viewE2.getWidth() < 10 || height < 10) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
            if (z12) {
                aVar = la1.a.f22667m;
            } else {
                w wVar2 = this.f27974d;
                if (wVar2 == null || (viewE = wVar2.e()) == null || eh1.b(viewE) < 1) {
                    aVar = la1.a.f22668n;
                } else {
                    w wVar3 = this.f27974d;
                    if (!(wVar3 != null ? !eh1.a(wVar3.e(), i10) : true) || z11) {
                        if (zA && "divkit".equals(strW)) {
                            z13 = true;
                        }
                        if (z13) {
                            aVar = la1.a.f22656b;
                        } else {
                            g0 g0Var = (g0) this.f27971a.a(z11);
                            la1.a aVarB = g0Var.b();
                            strA = g0Var.a();
                            aVar = aVarB;
                        }
                    } else {
                        aVar = la1.a.f22663i;
                    }
                }
            }
        }
        return new Pair<>(aVar, strA);
    }

    @Override // com.yandex.mobile.ads.impl.al0
    public final la1 a(Context context, int i10) {
        Pair<la1.a, String> pairA = a(context, i10, !this.f27972b.b(context), false);
        la1 la1VarA = a(context, (la1.a) pairA.first, false, i10);
        la1VarA.a((String) pairA.second);
        return la1VarA;
    }

    public la1 a(Context context, la1.a aVar, boolean z10, int i10) {
        return new la1(aVar, new u4());
    }

    public final void a(w wVar) {
        this.f27974d = wVar;
        this.f27971a.a(wVar);
    }

    public final boolean a() {
        View viewE;
        w wVar = this.f27974d;
        if (wVar == null || (viewE = wVar.e()) == null) {
            return true;
        }
        return eh1.d(viewE);
    }

    public final la1 b(Context context, int i10) {
        Pair<la1.a, String> pairA = a(context, i10, !this.f27972b.b(context), true);
        la1 la1VarA = a(context, (la1.a) pairA.first, true, i10);
        la1VarA.a((String) pairA.second);
        return la1VarA;
    }

    public final boolean b() {
        View viewE;
        w wVar = this.f27974d;
        return (wVar == null || (viewE = wVar.e()) == null || eh1.b(viewE) < 1) ? false : true;
    }
}
