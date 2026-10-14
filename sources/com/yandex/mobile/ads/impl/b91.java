package com.yandex.mobile.ads.impl;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class b91 extends t11 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final mp0 f19146m = new mp0();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f19147n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f19148o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f19149p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f19150q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final float f19151r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f19152s;

    public b91(List<byte[]> list) {
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f19148o = 0;
            this.f19149p = -1;
            this.f19150q = "sans-serif";
            this.f19147n = false;
            this.f19151r = 0.85f;
            this.f19152s = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f19148o = bArr[24];
        this.f19149p = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f19150q = "Serif".equals(da1.a(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i10 = bArr[25] * 20;
        this.f19152s = i10;
        boolean z10 = (bArr[0] & 32) != 0;
        this.f19147n = z10;
        if (z10) {
            this.f19151r = da1.a(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10);
        } else {
            this.f19151r = 0.85f;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0033  */
    /* JADX WARN: Code duplicated, block: B:24:0x0036  */
    private static void a(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        StyleSpan styleSpan;
        boolean z10;
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z11 = (i10 & 1) != 0;
            boolean z12 = (i10 & 2) != 0;
            if (!z11) {
                if (z12) {
                    styleSpan = new StyleSpan(2);
                }
                z10 = (i10 & 4) != 0;
                if (z10) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
                }
                if (!z10 || z11 || z12) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
                return;
            }
            styleSpan = z12 ? new StyleSpan(3) : new StyleSpan(1);
            spannableStringBuilder.setSpan(styleSpan, i12, i13, i15);
            if ((i10 & 4) != 0) {
            }
            if (z10) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (z10) {
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.t11
    public final h51 a(byte[] bArr, int i10, boolean z10) throws j51 {
        char cF;
        int i11;
        this.f19146m.a(i10, bArr);
        mp0 mp0Var = this.f19146m;
        int i12 = 2;
        int i13 = 1;
        int i14 = 0;
        if (!(mp0Var.a() >= 2)) {
            throw new j51("Unexpected subtitle format.");
        }
        int iZ = mp0Var.z();
        String strA = iZ == 0 ? "" : mp0Var.a(iZ, (mp0Var.a() < 2 || !((cF = mp0Var.f()) == 65279 || cF == 65534)) ? qh.f24496c : qh.f24498e);
        if (strA.isEmpty()) {
            return c91.f19428b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strA);
        a(spannableStringBuilder, this.f19148o, 0, 0, spannableStringBuilder.length(), 16711680);
        int i15 = this.f19149p;
        int length = spannableStringBuilder.length();
        if (i15 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i15 >>> 8) | ((i15 & 255) << 24)), 0, length, 16711713);
        }
        String str = this.f19150q;
        int length2 = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length2, 16711713);
        }
        float fMax = this.f19151r;
        for (int i16 = 8; this.f19146m.a() >= i16; i16 = 8) {
            int iD = this.f19146m.d();
            int iH = this.f19146m.h();
            int iH2 = this.f19146m.h();
            if (iH2 == 1937013100) {
                if ((this.f19146m.a() >= i12 ? i13 : i14) == 0) {
                    throw new j51("Unexpected subtitle format.");
                }
                int iZ2 = this.f19146m.z();
                int i17 = i14;
                while (i14 < iZ2) {
                    mp0 mp0Var2 = this.f19146m;
                    if (mp0Var2.a() >= 12) {
                        i17 = i13;
                    }
                    if (i17 == 0) {
                        throw new j51("Unexpected subtitle format.");
                    }
                    int iZ3 = mp0Var2.z();
                    int iZ4 = mp0Var2.z();
                    mp0Var2.f(i12);
                    int iT = mp0Var2.t();
                    mp0Var2.f(i13);
                    int iH3 = mp0Var2.h();
                    if (iZ4 > spannableStringBuilder.length()) {
                        StringBuilder sbA = androidx.appcompat.widget.r0.a("Truncating styl end (", iZ4, ") to cueText.length() (");
                        sbA.append(spannableStringBuilder.length());
                        sbA.append(").");
                        p90.d("Tx3gDecoder", sbA.toString());
                        iZ4 = spannableStringBuilder.length();
                    }
                    int i18 = iZ4;
                    if (iZ3 >= i18) {
                        p90.d("Tx3gDecoder", j1.e.a("Ignoring styl with start (", iZ3, ") >= end (", i18, ")."));
                        i11 = iZ2;
                    } else {
                        i11 = iZ2;
                        a(spannableStringBuilder, iT, this.f19148o, iZ3, i18, 0);
                        if (iH3 != this.f19149p) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan((iH3 >>> 8) | ((iH3 & 255) << 24)), iZ3, i18, 33);
                        }
                    }
                    i14++;
                    i12 = 2;
                    i13 = 1;
                    i17 = 0;
                    iZ2 = i11;
                }
            } else if (iH2 == 1952608120 && this.f19147n) {
                i12 = 2;
                if (!(this.f19146m.a() >= 2)) {
                    throw new j51("Unexpected subtitle format.");
                }
                float fZ = this.f19146m.z() / this.f19152s;
                int i19 = da1.f19803a;
                fMax = Math.max(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, Math.min(fZ, 0.95f));
            } else {
                i12 = 2;
            }
            this.f19146m.e(iD + iH);
            i13 = 1;
            i14 = 0;
        }
        return new c91(new am.a().a(spannableStringBuilder).a(0, fMax).a(0).a());
    }
}
