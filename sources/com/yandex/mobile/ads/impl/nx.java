package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.common.AdImpressionData;
import com.yandex.mobile.ads.impl.nx;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nx<T extends nx<T>> extends q71 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AdResponse<String> f23574m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final yw f23575n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final w3 f23576o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final pw<T> f23577p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final zw f23578q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final e51 f23579r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final s4 f23580s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final iw f23581t;

    public nx(Context context, AdResponse<String> adResponse, k2 k2Var, yw ywVar, iw iwVar, pw<T> pwVar) {
        super(context, iwVar, adResponse, k2Var);
        this.f23574m = adResponse;
        w3 w3Var = new w3();
        this.f23576o = w3Var;
        this.f23581t = iwVar;
        this.f23577p = pwVar;
        this.f23575n = ywVar;
        this.f23578q = new zw();
        this.f23579r = e51.a();
        n0.a().a("window_type_fullscreen", new t0());
        pz pzVar = new pz();
        pzVar.a(adResponse);
        this.f23580s = new s4(context, adResponse, k2Var, w3Var, pzVar);
    }

    @Override // com.yandex.mobile.ads.impl.w20.a
    public final void a(AdImpressionData adImpressionData) {
        this.f23575n.onImpression(adImpressionData);
    }

    @Override // com.yandex.mobile.ads.impl.q71
    public final boolean a(int i10) {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.q71
    public final boolean j() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.q71
    public final boolean k() {
        return true;
    }

    public final void m() {
        if (t6.a((vh) this)) {
            return;
        }
        this.f23579r.a(s70.f24995b, this);
        this.f23577p.a(c());
        g();
        x60.d("onDestroy(), clazz = " + getClass(), new Object[0]);
    }

    public abstract T n();

    public final void o() {
        f();
        this.f23579r.a(s70.f24995b, this);
        this.f23575n.onAdDismissed();
    }

    @Override // com.yandex.mobile.ads.impl.b0
    public final void onLeftApplication() {
        this.f23575n.onAdClicked();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.yandex.mobile.ads.impl.q71, com.yandex.mobile.ads.impl.o2
    public void onReceiveResult(int i10, Bundle bundle) {
        boolean z10;
        StringBuilder sbA = androidx.appcompat.widget.r0.a("onReceiveResult(), resultCode = ", i10, ", clazz = ");
        sbA.append(getClass());
        x60.d(sbA.toString(), new Object[0]);
        adImpressionData = null;
        AdImpressionData adImpressionData = null;
        if (i10 == 0) {
            Map<String, String> map = bundle != null ? (Map) bundle.getSerializable("extra_tracking_parameters") : null;
            this.f23576o.a(v3.f25801d);
            this.f23580s.a();
            this.f23575n.onAdShown();
            zw zwVar = this.f23578q;
            AdResponse<String> adResponse = this.f23574m;
            Objects.requireNonNull(zwVar);
            if (adResponse != null) {
                z10 = (adResponse.v() == cl.f19542b) == true ? false : true;
            }
            if (z10) {
                a(map);
            }
            return;
        }
        if (i10 == 2) {
            this.f23581t.a(0);
            b(0);
            return;
        }
        if (i10 == 3) {
            this.f23581t.a(8);
            b(8);
            return;
        }
        if (i10 == 4) {
            o();
            return;
        }
        if (i10 != 5) {
            switch (i10) {
                case 16:
                    if (bundle != null) {
                        Parcelable parcelable = bundle.getParcelable("impression_data_key");
                        if (parcelable instanceof AdImpressionData) {
                            adImpressionData = (AdImpressionData) parcelable;
                        }
                    }
                    this.f23575n.onImpression(adImpressionData);
                    break;
                case 17:
                    this.f23575n.onAdClicked();
                    break;
                case 18:
                    this.f23575n.a();
                    break;
                default:
                    super.onReceiveResult(i10, bundle);
                    break;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.b0
    public final void onReturnedToApplication() {
        this.f23575n.a();
    }

    public final void p() {
        this.f23575n.onAdShown();
    }

    public final void q() {
        e();
        synchronized (this) {
        }
        this.f23576o.b(v3.f25801d);
        this.f23579r.b(s70.f24995b, this);
        this.f23577p.a(n());
    }
}
