package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.NativeAd;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class uk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f25677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final tk0 f25678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final gi0 f25679c;

    public class a implements mx0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AdResponse<String> f25680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f25681b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final mx0 f25682c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ol1 f25683d = new ol1();

        public a(AdResponse<String> adResponse, b bVar, mx0 mx0Var) {
            this.f25680a = adResponse;
            this.f25681b = bVar;
            this.f25682c = mx0Var;
        }

        @Override // com.yandex.mobile.ads.impl.mx0
        public final void a() {
            t2 t2Var = v4.f25821d;
            this.f25682c.a();
            this.f25681b.a(t2Var);
        }

        @Override // com.yandex.mobile.ads.impl.mx0
        public final void a(cj0 cj0Var) {
            this.f25682c.a(cj0Var);
            AdResponse<String> adResponse = this.f25680a;
            b bVar = this.f25681b;
            Objects.requireNonNull(this.f25683d);
            com.yandex.mobile.ads.nativeads.s0 s0Var = new com.yandex.mobile.ads.nativeads.s0();
            uk0.this.f25679c.a(uk0.this.f25677a, adResponse, cj0Var, new pi0(new kk1(adResponse), new jk1(), s0Var, new jl1(adResponse), new yl1()), new tj0(bVar));
        }
    }

    public interface b {
        void a(t2 t2Var);

        void a(NativeAd nativeAd);
    }

    public uk0(Context context, k2 k2Var, w3 w3Var) {
        Context applicationContext = context.getApplicationContext();
        this.f25677a = applicationContext;
        k2Var.a(wk0.f26300b);
        this.f25678b = new tk0(context);
        this.f25679c = new gi0(applicationContext, k2Var, w3Var);
    }

    public final void a() {
        this.f25679c.a();
    }

    public final void a(AdResponse<String> adResponse, b bVar, mx0 mx0Var) {
        this.f25678b.a(adResponse, new a(adResponse, bVar, mx0Var));
    }
}
