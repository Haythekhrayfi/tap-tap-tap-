package com.yandex.mobile.ads.impl;

import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class bb0 implements eb<vc0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y10 f19157a = new y10();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final uc0 f19158b = new uc0();

    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    @Override // com.yandex.mobile.ads.impl.eb
    public final boolean a(vc0 vc0Var) {
        boolean z10;
        List<j20> listA = vc0Var.a();
        wa0 wa0VarB = vc0Var.b();
        boolean z11 = listA != null;
        if (listA != null) {
            Iterator<j20> it = listA.iterator();
            while (it.hasNext()) {
                z11 = z11 && this.f19157a.a(it.next());
            }
        }
        if (wa0VarB != null) {
            Objects.requireNonNull(this.f19158b);
            if (wa0VarB.a() > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (listA == null || wa0VarB == null) {
            if (listA != null) {
                return z11;
            }
            if (wa0VarB != null) {
                return z10;
            }
        } else if (z10 && z11) {
            return true;
        }
        return false;
    }
}
