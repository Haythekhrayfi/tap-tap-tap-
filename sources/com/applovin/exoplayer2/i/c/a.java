package com.applovin.exoplayer2.i.c;

import android.graphics.Bitmap;
import com.applovin.exoplayer2.i.d;
import com.applovin.exoplayer2.i.f;
import com.applovin.exoplayer2.i.h;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f6929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f6930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0100a f6931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Inflater f6932d;

    /* JADX INFO: renamed from: com.applovin.exoplayer2.i.c.a$a, reason: collision with other inner class name */
    public static final class C0100a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final y f6933a = new y();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f6934b = new int[256];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f6935c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f6936d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f6937e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f6938f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f6939g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f6940h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f6941i;

        /* JADX INFO: Access modifiers changed from: private */
        public void a(y yVar, int i10) {
            if (i10 % 5 != 2) {
                return;
            }
            yVar.e(2);
            Arrays.fill(this.f6934b, 0);
            int i11 = i10 / 5;
            int i12 = 0;
            while (i12 < i11) {
                int iH = yVar.h();
                int iH2 = yVar.h();
                int iH3 = yVar.h();
                int iH4 = yVar.h();
                int iH5 = yVar.h();
                double d10 = iH2;
                double d11 = iH3 - 128;
                int i13 = (int) ((1.402d * d11) + d10);
                int i14 = i12;
                double d12 = iH4 - 128;
                this.f6934b[iH] = ai.a((int) ((d12 * 1.772d) + d10), 0, 255) | (ai.a((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255) << 8) | (iH5 << 24) | (ai.a(i13, 0, 255) << 16);
                i12 = i14 + 1;
            }
            this.f6935c = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(y yVar, int i10) {
            int iM;
            if (i10 < 4) {
                return;
            }
            yVar.e(3);
            int i11 = i10 - 4;
            if ((yVar.h() & 128) != 0) {
                if (i11 < 7 || (iM = yVar.m()) < 4) {
                    return;
                }
                this.f6940h = yVar.i();
                this.f6941i = yVar.i();
                this.f6933a.a(iM - 4);
                i11 -= 7;
            }
            int iC = this.f6933a.c();
            int iB = this.f6933a.b();
            if (iC >= iB || i11 <= 0) {
                return;
            }
            int iMin = Math.min(i11, iB - iC);
            yVar.a(this.f6933a.d(), iC, iMin);
            this.f6933a.d(iC + iMin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(y yVar, int i10) {
            if (i10 < 19) {
                return;
            }
            this.f6936d = yVar.i();
            this.f6937e = yVar.i();
            yVar.e(11);
            this.f6938f = yVar.i();
            this.f6939g = yVar.i();
        }

        public com.applovin.exoplayer2.i.a a() {
            int iH;
            if (this.f6936d == 0 || this.f6937e == 0 || this.f6940h == 0 || this.f6941i == 0 || this.f6933a.b() == 0 || this.f6933a.c() != this.f6933a.b() || !this.f6935c) {
                return null;
            }
            this.f6933a.d(0);
            int i10 = this.f6940h * this.f6941i;
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int iH2 = this.f6933a.h();
                if (iH2 != 0) {
                    iH = i11 + 1;
                    iArr[i11] = this.f6934b[iH2];
                } else {
                    int iH3 = this.f6933a.h();
                    if (iH3 != 0) {
                        iH = ((iH3 & 64) == 0 ? iH3 & 63 : ((iH3 & 63) << 8) | this.f6933a.h()) + i11;
                        Arrays.fill(iArr, i11, iH, (iH3 & 128) == 0 ? 0 : this.f6934b[this.f6933a.h()]);
                    }
                }
                i11 = iH;
            }
            return new com.applovin.exoplayer2.i.a.C0095a().a(Bitmap.createBitmap(iArr, this.f6940h, this.f6941i, Bitmap.Config.ARGB_8888)).a(this.f6938f / this.f6936d).b(0).a(this.f6939g / this.f6937e, 0).a(0).b(this.f6940h / this.f6936d).c(this.f6941i / this.f6937e).e();
        }

        public void b() {
            this.f6936d = 0;
            this.f6937e = 0;
            this.f6938f = 0;
            this.f6939g = 0;
            this.f6940h = 0;
            this.f6941i = 0;
            this.f6933a.a(0);
            this.f6935c = false;
        }
    }

    public a() {
        super("PgsDecoder");
        this.f6929a = new y();
        this.f6930b = new y();
        this.f6931c = new C0100a();
    }

    private static com.applovin.exoplayer2.i.a a(y yVar, C0100a c0100a) {
        int iB = yVar.b();
        int iH = yVar.h();
        int i10 = yVar.i();
        int iC = yVar.c() + i10;
        com.applovin.exoplayer2.i.a aVarA = null;
        if (iC > iB) {
            yVar.d(iB);
            return null;
        }
        if (iH != 128) {
            switch (iH) {
                case 20:
                    c0100a.a(yVar, i10);
                    break;
                case 21:
                    c0100a.b(yVar, i10);
                    break;
                case 22:
                    c0100a.c(yVar, i10);
                    break;
            }
        } else {
            aVarA = c0100a.a();
            c0100a.b();
        }
        yVar.d(iC);
        return aVarA;
    }

    private void a(y yVar) {
        if (yVar.a() <= 0 || yVar.f() != 120) {
            return;
        }
        if (this.f6932d == null) {
            this.f6932d = new Inflater();
        }
        if (ai.a(yVar, this.f6930b, this.f6932d)) {
            yVar.a(this.f6930b.d(), this.f6930b.b());
        }
    }

    @Override // com.applovin.exoplayer2.i.d
    public f a(byte[] bArr, int i10, boolean z10) throws h {
        this.f6929a.a(bArr, i10);
        a(this.f6929a);
        this.f6931c.b();
        ArrayList arrayList = new ArrayList();
        while (this.f6929a.a() >= 3) {
            com.applovin.exoplayer2.i.a aVarA = a(this.f6929a, this.f6931c);
            if (aVarA != null) {
                arrayList.add(aVarA);
            }
        }
        return new b(Collections.unmodifiableList(arrayList));
    }
}
