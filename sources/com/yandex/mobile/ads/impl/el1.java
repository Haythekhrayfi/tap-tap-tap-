package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class el1 implements fl1<dl1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f20272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k2 f20273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private dl1 f20274c;

    public final class a implements zk {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final dl1 f20275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final hl1<dl1> f20276b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ el1 f20277c;

        public a(el1 el1Var, dl1 dl1Var, hl1<dl1> hl1Var) {
            fd.j0.i(dl1Var, "fullscreenHtmlAd");
            fd.j0.i(hl1Var, "creationListener");
            this.f20277c = el1Var;
            this.f20275a = dl1Var;
            this.f20276b = hl1Var;
        }

        @Override // com.yandex.mobile.ads.impl.zk
        public final void a() {
            el1.a(this.f20277c);
            this.f20276b.a(this.f20275a);
        }

        @Override // com.yandex.mobile.ads.impl.zk
        public final void a(t2 t2Var) {
            fd.j0.i(t2Var, "adFetchRequestError");
            el1.a(this.f20277c);
            this.f20276b.a(t2Var);
        }
    }

    public el1(Context context, k2 k2Var) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(k2Var, "adConfiguration");
        this.f20272a = context;
        this.f20273b = k2Var;
    }

    public static final void a(el1 el1Var) {
        dl1 dl1Var = el1Var.f20274c;
        if (dl1Var != null) {
            dl1Var.a((zk) null);
        }
        el1Var.f20274c = null;
    }

    @Override // com.yandex.mobile.ads.impl.fl1
    public final void a() {
        dl1 dl1Var = this.f20274c;
        if (dl1Var != null) {
            dl1Var.d();
        }
        dl1 dl1Var2 = this.f20274c;
        if (dl1Var2 != null) {
            dl1Var2.a((zk) null);
        }
        this.f20274c = null;
    }

    @Override // com.yandex.mobile.ads.impl.fl1
    public final void a(AdResponse<String> adResponse, SizeInfo sizeInfo, String str, hl1<dl1> hl1Var) throws xi1 {
        fd.j0.i(adResponse, "adResponse");
        fd.j0.i(sizeInfo, "sizeInfo");
        fd.j0.i(str, "htmlResponse");
        fd.j0.i(hl1Var, "creationListener");
        dl1 dl1Var = new dl1(this.f20272a, this.f20273b, adResponse, str);
        this.f20274c = dl1Var;
        dl1Var.a(new a(this, dl1Var, hl1Var));
        dl1Var.g();
    }
}
