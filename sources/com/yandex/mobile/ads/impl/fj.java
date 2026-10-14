package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class fj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sw0 f20720a;

    public fj(sw0 sw0Var) {
        fd.j0.i(sw0Var, "requestHelper");
        this.f20720a = sw0Var;
    }

    public final void a(Context context, Uri.Builder builder) {
        Integer numValueOf;
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(builder, "builder");
        Objects.requireNonNull(gj.f21079a);
        gj gjVarA = gj.a.a(context);
        sw0 sw0Var = this.f20720a;
        ij ijVar = (ij) gjVarA;
        String strC = ijVar.c();
        Objects.requireNonNull(sw0Var);
        sw0.a(builder, "gdpr", strC);
        sw0 sw0Var2 = this.f20720a;
        String strB = ijVar.b();
        Objects.requireNonNull(sw0Var2);
        sw0.a(builder, "gdpr_consent", strB);
        sw0 sw0Var3 = this.f20720a;
        String strD = ijVar.d();
        Objects.requireNonNull(sw0Var3);
        sw0.a(builder, "parsed_purpose_consents", strD);
        sw0 sw0Var4 = this.f20720a;
        String strE = ijVar.e();
        Objects.requireNonNull(sw0Var4);
        sw0.a(builder, "parsed_vendor_consents", strE);
        sw0 sw0Var5 = this.f20720a;
        Boolean boolValueOf = Boolean.valueOf(ijVar.a());
        if (boolValueOf != null) {
            boolValueOf.booleanValue();
            numValueOf = Integer.valueOf(boolValueOf.booleanValue() ? 1 : 0);
        } else {
            numValueOf = null;
        }
        Objects.requireNonNull(sw0Var5);
        sw0.a(builder, numValueOf);
    }
}
