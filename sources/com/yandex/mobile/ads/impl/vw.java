package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.banner.AdSize;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.impl.nx;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vw<T extends nx<T>> extends mz {
    private T A;
    private final ex<T> B;
    private final pz C;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final rw f26093w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private pw<T> f26094x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private pw<T> f26095y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final ww<T> f26096z;

    public vw(Context context, l6 l6Var, ww<T> wwVar, w3 w3Var, ex<T> exVar, pz pzVar) {
        super(context, l6Var, w3Var);
        this.C = pzVar;
        this.B = exVar;
        this.f26096z = wwVar;
        this.f26093w = new rw();
        a(com.yandex.mobile.ads.banner.a.a(AdSize.FULL_SCREEN));
    }

    public abstract pw<T> a(qw qwVar);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.ae
    public void a(AdResponse<String> adResponse) {
        super.a((AdResponse<T>) adResponse);
        this.C.a(adResponse);
        Objects.requireNonNull(this.f26093w);
        pw<T> pwVarA = a(rw.a(adResponse));
        pwVarA.a(this.f18884b, adResponse);
        this.f26095y = this.f26094x;
        this.f26094x = pwVarA;
        this.A = (T) this.B.a(adResponse, d(), pwVarA);
    }

    @Override // com.yandex.mobile.ads.impl.ae
    public final void a(t2 t2Var) {
        this.f26096z.a(t2Var);
    }

    @Override // com.yandex.mobile.ads.impl.ae
    public final void b(AdRequest adRequest) {
        super.b(adRequest);
    }

    @Override // com.yandex.mobile.ads.impl.ae
    public final void m() {
        this.f26096z.a(v4.f25829l);
    }

    @Override // com.yandex.mobile.ads.impl.ae
    public final void n() {
        T t10 = this.A;
        if (t10 != null) {
            this.f26096z.a(t10);
        } else {
            this.f26096z.a(v4.f25820c);
        }
    }

    public final void u() {
        if (t6.a((vh) this)) {
            return;
        }
        Context context = this.f18884b;
        for (pw pwVar : new HashSet(Arrays.asList(this.f26095y, this.f26094x))) {
            if (pwVar != null) {
                pwVar.a(context);
            }
        }
        c();
        x60.d("onDestroy(), clazz = " + getClass(), new Object[0]);
    }
}
