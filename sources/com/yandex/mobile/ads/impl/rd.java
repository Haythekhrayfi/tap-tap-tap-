package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
public final class rd extends uz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SizeInfo f24668n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private SizeInfo f24669o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f24670p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f24671q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f24672r;

    public rd(Context context, AdResponse adResponse, k2 k2Var, SizeInfo sizeInfo) throws Throwable {
        int iD;
        super(context, adResponse, k2Var);
        this.f24670p = true;
        this.f24668n = sizeInfo;
        if (l()) {
            this.f24671q = sizeInfo.c(context);
            iD = sizeInfo.a(context);
        } else {
            this.f24671q = adResponse.r() == 0 ? sizeInfo.c(context) : adResponse.r();
            iD = adResponse.d();
        }
        this.f24672r = iD;
        a(this.f24671q, this.f24672r);
    }

    private void a(int i10, int i11) {
        this.f24669o = new SizeInfo(i10, i11, this.f24668n.d());
    }

    @Override // com.yandex.mobile.ads.impl.uz
    public final void b(int i10, String str) {
        if (this.f25761k.d() != 0) {
            i10 = this.f25761k.d();
        }
        this.f24672r = i10;
        super.b(i10, str);
    }

    @Override // com.yandex.mobile.ads.impl.uz, com.yandex.mobile.ads.impl.kp0, com.yandex.mobile.ads.impl.oe
    public final String c() {
        String strA;
        StringBuilder sb2 = new StringBuilder();
        String strA2 = "";
        if (this.f25761k.N()) {
            int i10 = this.f24671q;
            String str = wi1.f26291a;
            strA = android.support.v4.media.j.a("<body style='width:", i10, "px;'>");
        } else {
            strA = "";
        }
        sb2.append(strA);
        Context context = getContext();
        int iC = this.f24668n.c(context);
        int iA = this.f24668n.a(context);
        if (l()) {
            String str2 = wi1.f26291a;
            strA2 = j1.e.a("\n<style>ytag.container { width:", iC, "px; height:", iA, "px; }</style>\n");
        }
        sb2.append(strA2);
        sb2.append(super.c());
        return sb2.toString();
    }

    @Override // com.yandex.mobile.ads.impl.uz
    @SuppressLint({"AddJavascriptInterface"})
    public final void c(Context context) {
        addJavascriptInterface(new uz.a(context), "AdPerformActionsJSI");
    }

    @Override // com.yandex.mobile.ads.impl.kp0
    public final void h() {
        if (this.f24670p) {
            a(this.f24671q, this.f24672r);
            boolean z10 = v6.a(getContext(), this.f24669o, this.f24668n) || this.f25761k.H();
            b00 b00Var = this.f22485f;
            if (b00Var != null) {
                if (z10) {
                    b00Var.a(this, i());
                } else {
                    Context context = getContext();
                    int iC = this.f24668n.c(context);
                    int iA = this.f24668n.a(context);
                    SizeInfo sizeInfo = this.f24669o;
                    int iE = sizeInfo != null ? sizeInfo.e() : 0;
                    SizeInfo sizeInfo2 = this.f24669o;
                    t2 t2VarA = v4.a(iC, iA, iE, sizeInfo2 != null ? sizeInfo2.c() : 0, eh1.c(context), eh1.b(context));
                    o60.a(t2VarA.b(), new Object[0]);
                    this.f22485f.a(t2VarA);
                }
            }
            this.f24670p = false;
        }
    }

    public final SizeInfo k() {
        return this.f24669o;
    }

    public final boolean l() {
        Context context = getContext();
        return j() && this.f25761k.r() == 0 && this.f25761k.d() == 0 && this.f24668n.c(context) > 0 && this.f24668n.a(context) > 0;
    }
}
