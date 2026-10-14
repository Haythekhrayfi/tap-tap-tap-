package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements ut {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f20920a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mp0 f20921b = new mp0(2786);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f20922c;

    static {
        yn1 yn1Var = yn1.f26954n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ut[] a() {
        return new ut[]{new g()};
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final int a(vt vtVar, cs0 cs0Var) throws IOException {
        int i10 = ((xn) vtVar).read(this.f20921b.c(), 0, 2786);
        if (i10 == -1) {
            return -1;
        }
        this.f20921b.e(0);
        this.f20921b.d(i10);
        if (!this.f20922c) {
            this.f20920a.a(4, 0L);
            this.f20922c = true;
        }
        this.f20920a.a(this.f20921b);
        return 0;
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void a(long j10, long j11) {
        this.f20922c = false;
        this.f20920a.a();
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void a(wt wtVar) {
        this.f20920a.a(wtVar, new r81.d(Integer.MIN_VALUE, 0, 1));
        wtVar.a();
        wtVar.a(new p01.b(-9223372036854775807L, 0L));
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final boolean a(vt vtVar) throws IOException {
        xn xnVar;
        mp0 mp0Var = new mp0(10);
        int i10 = 0;
        while (true) {
            xnVar = (xn) vtVar;
            xnVar.b(mp0Var.c(), 0, 10, false);
            mp0Var.e(0);
            if (mp0Var.w() != 4801587) {
                break;
            }
            mp0Var.f(3);
            int iS = mp0Var.s();
            i10 += iS + 10;
            xnVar.a(false, iS);
        }
        xnVar.c();
        xnVar.a(false, i10);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            xnVar.b(mp0Var.c(), 0, 6, false);
            mp0Var.e(0);
            if (mp0Var.z() != 2935) {
                xnVar.c();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                xnVar.a(false, i12);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int iA = i.a(mp0Var.c());
                if (iA == -1) {
                    return false;
                }
                xnVar.a(false, iA - 6);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void release() {
    }
}
