package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class vh1 extends r71<wh1, rh1> {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final uh1 f25982u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final ei1 f25983v;

    public vh1(Context context, String str, gi1.b bVar, wh1 wh1Var, ai1 ai1Var) {
        super(context, 0, str, bVar, wh1Var, ai1Var);
        this.f25982u = new uh1();
        this.f25983v = vm0.a();
        x60.e("Loading data ... url: %s", str);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0014  */
    @Override // com.yandex.mobile.ads.impl.r71
    public final gx0<rh1> a(wm0 wm0Var, int i10) {
        boolean z10;
        bi1 bi1Var;
        if (200 == i10) {
            byte[] bArr = wm0Var.f26320b;
            z10 = bArr == null || bArr.length == 0 ? false : true;
        }
        if (z10) {
            String strA = this.f25983v.a(wm0Var);
            if (TextUtils.isEmpty(strA)) {
                return gx0.a(new op0("Can't parse VMAP response"));
            }
            try {
                return gx0.a(this.f25982u.a(strA), null);
            } catch (Exception e10) {
                bi1Var = new op0(e10);
            }
        } else {
            int i11 = p2.f23954c;
            bi1Var = new bi1(u2.a(null, p2.a.a(wm0Var).a()).b());
        }
        return gx0.a(bi1Var);
    }
}
