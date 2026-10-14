package com.applovin.exoplayer2.i.h;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.appcompat.widget.r0;
import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.exoplayer2.i.d;
import com.applovin.exoplayer2.i.f;
import com.applovin.exoplayer2.i.h;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import j1.e;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f7064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f7065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f7066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f7067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f7068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f7069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f7070g;

    public a(List<byte[]> list) {
        super("Tx3gDecoder");
        this.f7064a = new y();
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f7066c = 0;
            this.f7067d = -1;
            this.f7068e = "sans-serif";
            this.f7065b = false;
            this.f7069f = 0.85f;
            this.f7070g = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f7066c = bArr[24];
        this.f7067d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f7068e = "Serif".equals(ai.a(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i10 = bArr[25] * 20;
        this.f7070g = i10;
        boolean z10 = (bArr[0] & 32) != 0;
        this.f7065b = z10;
        if (z10) {
            this.f7069f = ai.a(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 0.95f);
        } else {
            this.f7069f = 0.85f;
        }
    }

    private static String a(y yVar) throws h {
        char cG;
        a(yVar.a() >= 2);
        int i10 = yVar.i();
        if (i10 == 0) {
            return "";
        }
        return yVar.a(i10, (yVar.a() < 2 || !((cG = yVar.g()) == 65279 || cG == 65534)) ? Charsets.UTF_8 : Charsets.UTF_16);
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

    private static void a(SpannableStringBuilder spannableStringBuilder, String str, int i10, int i11) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i10, i11, 16711713);
        }
    }

    private void a(y yVar, SpannableStringBuilder spannableStringBuilder) throws h {
        int length;
        a(yVar.a() >= 12);
        int i10 = yVar.i();
        int i11 = yVar.i();
        yVar.e(2);
        int iH = yVar.h();
        yVar.e(1);
        int iQ = yVar.q();
        if (i11 > spannableStringBuilder.length()) {
            StringBuilder sbA = r0.a("Truncating styl end (", i11, ") to cueText.length() (");
            sbA.append(spannableStringBuilder.length());
            sbA.append(").");
            q.c("Tx3gDecoder", sbA.toString());
            length = spannableStringBuilder.length();
        } else {
            length = i11;
        }
        if (i10 >= length) {
            q.c("Tx3gDecoder", e.a("Ignoring styl with start (", i10, ") >= end (", length, ")."));
            return;
        }
        int i12 = length;
        a(spannableStringBuilder, iH, this.f7066c, i10, i12, 0);
        b(spannableStringBuilder, iQ, this.f7067d, i10, i12, 0);
    }

    private static void a(boolean z10) throws h {
        if (!z10) {
            throw new h("Unexpected subtitle format.");
        }
    }

    private static void b(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    @Override // com.applovin.exoplayer2.i.d
    public f a(byte[] bArr, int i10, boolean z10) throws h {
        this.f7064a.a(bArr, i10);
        String strA = a(this.f7064a);
        if (strA.isEmpty()) {
            return b.f7071a;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strA);
        a(spannableStringBuilder, this.f7066c, 0, 0, spannableStringBuilder.length(), 16711680);
        b(spannableStringBuilder, this.f7067d, -1, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.f7068e, 0, spannableStringBuilder.length());
        float fA = this.f7069f;
        while (this.f7064a.a() >= 8) {
            int iC = this.f7064a.c();
            int iQ = this.f7064a.q();
            int iQ2 = this.f7064a.q();
            if (iQ2 == 1937013100) {
                a(this.f7064a.a() >= 2);
                int i11 = this.f7064a.i();
                for (int i12 = 0; i12 < i11; i12++) {
                    a(this.f7064a, spannableStringBuilder);
                }
            } else if (iQ2 == 1952608120 && this.f7065b) {
                a(this.f7064a.a() >= 2);
                fA = ai.a(this.f7064a.i() / this.f7070g, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 0.95f);
            }
            this.f7064a.d(iC + iQ);
        }
        return new b(new com.applovin.exoplayer2.i.a.C0095a().a(spannableStringBuilder).a(fA, 0).a(0).e());
    }
}
