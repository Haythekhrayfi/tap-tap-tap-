package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.animation.AlphaAnimation;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4T, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C4T extends AbstractC1221Tg<QR> implements C7N {
    public static String[] A02 = {"iVby5wy6H7l4dzY0Hld0xs9tuHtnGk", "Nr0U5YnFPaRVMsCPPiWFbDdqiRS3TX59", "NmHEOi9mcJk9OQjZmIqLk3AYwOx5ICK3", "j6OxXppfxNxejmkkIb10P2S2ED13bfax", "YxA", "okdCTGqDBxOQkU", "XAA3rxsPdfTGxXL8JCFSxOB2RupP9g", "Mu"};
    public C1337Xw A00;
    public boolean A01;

    public C4T(QR qr, C1337Xw c1337Xw) {
        super(qr);
        this.A00 = c1337Xw;
        this.A01 = false;
    }

    private void A00(int i10) {
        if (!this.A01) {
            this.A00.A0E().A3F(i10);
        }
        String[] strArr = A02;
        if (strArr[0].length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        A02[1] = "k6Oe58jhR2JQ133LIP7LsY5lW6eco9l5";
        this.A01 = true;
    }

    @Override // com.facebook.ads.redexgen.X.K4
    public final void A06() {
        QR qrA07 = A07();
        int iIntValue = 0;
        if (qrA07 == null) {
            A00(0);
            return;
        }
        View view = qrA07.A0C;
        QQ qq = (QQ) qrA07.A0E.get();
        int i10 = 1;
        boolean z10 = view == null;
        if (!z10 && qq != null) {
            QS qsA0E = QR.A0E(view, qrA07.A0A, this.A00);
            if (qsA0E.A04()) {
                QR.A05(qrA07);
            } else {
                qrA07.A00 = 0;
            }
            boolean z11 = qrA07.A00 > qrA07.A09;
            boolean wasViewable = qrA07.A05 != null && qrA07.A05.A04();
            if (z11 || !qsA0E.A04()) {
                qrA07.A05 = qsA0E;
            }
            String strValueOf = String.valueOf(qsA0E.A01());
            synchronized (qrA07) {
                if (qrA07.A06.containsKey(strValueOf)) {
                    iIntValue = ((Integer) qrA07.A06.get(strValueOf)).intValue();
                }
                qrA07.A06.put(strValueOf, Integer.valueOf(iIntValue + 1));
            }
            if (z11 && !wasViewable) {
                this.A01 = true;
                qrA07.A03 = System.currentTimeMillis();
                if (qrA07.A07) {
                    this.A00.A0E().A3G();
                }
                qq.A03();
                if (BuildConfigApi.isDebug() && AdInternalSettings.isVisibleAnimation()) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                    alphaAnimation.setDuration(500L);
                    view.startAnimation(alphaAnimation);
                }
                if (!qrA07.A0F) {
                    return;
                }
            } else if (!z11 && wasViewable) {
                this.A01 = true;
                if (qrA07.A07) {
                    this.A00.A0E().A2m(qsA0E.A02());
                }
                qq.A00();
            } else {
                qq.A02();
                if (!this.A01 && qrA07.A07) {
                    this.A00.A0E().A3E(qsA0E.A02());
                }
                this.A01 = true;
            }
            if (!qrA07.A08 && qrA07.A04 != null) {
                qrA07.A0B.postDelayed(qrA07.A04, qrA07.A02);
                return;
            }
            return;
        }
        if (qrA07.A07) {
            if (!z10) {
                i10 = 2;
            }
            A00(i10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C7N
    public final C1337Xw A5o() {
        return this.A00;
    }
}
