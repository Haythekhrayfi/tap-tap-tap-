package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.BuildConfigFieldProvider;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class we0 extends df0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f26263b = new wb1(BuildConfigFieldProvider.getDivKitVersion()).a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f26264a;

    public we0(boolean z10) {
        this.f26264a = z10;
    }

    @Override // com.yandex.mobile.ads.impl.df0
    public final void a(uc.l<? super n60, jc.w> lVar) {
        fd.j0.i(lVar, "onValidationFailed");
        try {
            Objects.requireNonNull(p7.q0.f34583b);
            wb1 wb1Var = new wb1("25.2.0");
            if (this.f26264a) {
                return;
            }
            int iA = wb1Var.a();
            int i10 = f26263b;
            if (iA == i10) {
                return;
            }
            String str = String.format("Unsupported DivKit major version. Expected: %s. Actual: %s", Arrays.copyOf(new Object[]{Integer.valueOf(i10), Integer.valueOf(wb1Var.a())}, 2));
            fd.j0.h(str, "format(this, *args)");
            lVar.invoke(new n60(str));
            throw null;
        } catch (NoClassDefFoundError unused) {
            String str2 = String.format("DivKit is unavailable. Please check your buildscripts for exclusion rules for 'com.yandex.div:div'", Arrays.copyOf(new Object[0], 0));
            fd.j0.h(str2, "format(this, *args)");
            lVar.invoke(new n60(str2));
            throw null;
        }
    }
}
