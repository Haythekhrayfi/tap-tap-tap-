package com.yandex.mobile.ads.impl;

import java.io.IOException;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements ut {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f21884a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mp0 f21885b = new mp0(Http2.INITIAL_MAX_FRAME_SIZE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21886c;

    static {
        dp1 dp1Var = dp1.f19957p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ut[] a() {
        return new ut[]{new j()};
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final int a(vt vtVar, cs0 cs0Var) throws IOException {
        int i10 = ((xn) vtVar).read(this.f21885b.c(), 0, Http2.INITIAL_MAX_FRAME_SIZE);
        if (i10 == -1) {
            return -1;
        }
        this.f21885b.e(0);
        this.f21885b.d(i10);
        if (!this.f21886c) {
            this.f21884a.a(4, 0L);
            this.f21886c = true;
        }
        this.f21884a.a(this.f21885b);
        return 0;
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void a(long j10, long j11) {
        this.f21886c = false;
        this.f21884a.a();
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void a(wt wtVar) {
        this.f21884a.a(wtVar, new r81.d(Integer.MIN_VALUE, 0, 1));
        wtVar.a();
        wtVar.a(new p01.b(-9223372036854775807L, 0L));
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final boolean a(vt vtVar) throws IOException {
        xn xnVar;
        int i10;
        mp0 mp0Var = new mp0(10);
        int i11 = 0;
        while (true) {
            xnVar = (xn) vtVar;
            xnVar.b(mp0Var.c(), 0, 10, false);
            mp0Var.e(0);
            if (mp0Var.w() != 4801587) {
                break;
            }
            mp0Var.f(3);
            int iS = mp0Var.s();
            i11 += iS + 10;
            xnVar.a(false, iS);
        }
        xnVar.c();
        xnVar.a(false, i11);
        int i12 = 0;
        int i13 = i11;
        while (true) {
            int i14 = 7;
            xnVar.b(mp0Var.c(), 0, 7, false);
            mp0Var.e(0);
            int iZ = mp0Var.z();
            if (iZ == 44096 || iZ == 44097) {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] bArrC = mp0Var.c();
                if (bArrC.length < 7) {
                    i10 = -1;
                } else {
                    int i15 = ((bArrC[2] & 255) << 8) | (bArrC[3] & 255);
                    if (i15 == 65535) {
                        i15 = ((bArrC[4] & 255) << 16) | ((bArrC[5] & 255) << 8) | (bArrC[6] & 255);
                    } else {
                        i14 = 4;
                    }
                    if (iZ == 44097) {
                        i14 += 2;
                    }
                    i10 = i15 + i14;
                }
                if (i10 == -1) {
                    return false;
                }
                xnVar.a(false, i10 - 7);
            } else {
                xnVar.c();
                i13++;
                if (i13 - i11 >= 8192) {
                    return false;
                }
                xnVar.a(false, i13);
                i12 = 0;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ut
    public final void release() {
    }
}
