package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class NR extends RelativeLayout {
    public static String[] A06 = {"GfXFZtEZk1NZfob7Kzf1xTq0EESlD7si", "ewzI1iE8tF5Z2B86REyPWWZDw7DKLBH9", "kOyZSgqEibXIKTIW7tLvn8rBuxcmsyDd", "XpDxTY", "v6DhXkGtrQWw75h", "XA27k4WXBENWs2k6KViFhCSGxV0pMN8g", "cLUj8uWE8C4NOcjwK2waVMiWyPuWQVsm", ""};
    public final int A00;
    public final LinearLayout A01;
    public final C1402aB A02;
    public final C1337Xw A03;
    public final InterfaceC0937Id A04;
    public final InterfaceC1019Lm A05;

    public NR(C1337Xw c1337Xw, C1402aB c1402aB, InterfaceC0937Id interfaceC0937Id, InterfaceC1019Lm interfaceC1019Lm, int i10, int i11) {
        super(c1337Xw);
        this.A03 = c1337Xw;
        this.A02 = c1402aB;
        this.A04 = interfaceC0937Id;
        this.A05 = interfaceC1019Lm;
        this.A00 = i10;
        LinearLayout linearLayout = new LinearLayout(c1337Xw);
        this.A01 = linearLayout;
        A00();
        addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        setLayoutOrientation(i11);
    }

    private void A00() {
        int i10 = 0;
        while (true) {
            C1402aB c1402aB = this.A02;
            if (A06[4].length() != 15) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[6] = "6kBjYVyQvbEVjVKJKeawSG2VEKMXDcJL";
            strArr[5] = "aQimcOJmMOk7TFcbK4Cqi1kaRliNN4Qj";
            int i11 = c1402aB.A0i();
            if (i10 < i11) {
                C1211Sw c1211Sw = new C1211Sw(this.A03, this.A02.A0l(i10), this.A04, this.A05);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                layoutParams.weight = 1.0f;
                int i12 = C1211Sw.A0B;
                int i13 = C1211Sw.A0B;
                int i14 = C1211Sw.A0B;
                int i15 = C1211Sw.A0B;
                layoutParams.setMargins(i12, i13, i14, i15);
                c1211Sw.setLayoutParams(layoutParams);
                this.A01.addView(c1211Sw);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setLayoutOrientation(configuration.orientation);
    }

    private void setLayoutOrientation(int i10) {
        if (i10 == 1) {
            this.A01.setOrientation(1);
            LinearLayout linearLayout = this.A01;
            int i11 = this.A00;
            linearLayout.setPadding(0, (int) (((double) i11) * 1.5d), 0, i11);
            return;
        }
        this.A01.setOrientation(0);
        LinearLayout linearLayout2 = this.A01;
        int i12 = this.A00;
        linearLayout2.setPadding(0, i12, 0, (int) (((double) i12) * 0.25d));
    }
}
