package com.facebook.ads.redexgen.X;

import android.os.Handler;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0990Kh {
    public static String[] A07 = {"AKWVUs1l0Ice5I6VX", "CXPBWDMo1Zqj2yCW5W30Ut48PEWYgYey", "QYYsUNIn7qky9LY", "uhDWqwwqE26XK4rQkizWNR4dlHqM4UZ3", "ZNpftHLPxc7R9PnANzOwdg7R2ap4pSI6", "3ke", "xa09Mpjas6OdUQMP5Qo7kdS83JfCqy78", "u6CBuCaaqyjpN4LkQhRqLLvzhKEDnG9S"};
    public float A00;
    public float A01;
    public long A02;
    public boolean A03;
    public boolean A04;
    public final Handler A05;
    public final InterfaceC0989Kg A06;

    public C0990Kh(int i10, float f10, long j10, Handler handler, InterfaceC0989Kg interfaceC0989Kg) {
        this(i10, interfaceC0989Kg, handler);
        this.A02 = j10;
        this.A01 = f10;
    }

    public C0990Kh(int i10, InterfaceC0989Kg interfaceC0989Kg) {
        this(i10, interfaceC0989Kg, new Handler());
    }

    public C0990Kh(int i10, InterfaceC0989Kg interfaceC0989Kg, Handler handler) {
        this.A04 = false;
        this.A00 = i10;
        this.A06 = interfaceC0989Kg;
        this.A05 = handler;
        this.A02 = 250L;
        this.A01 = 0.25f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        float f10 = this.A00 - this.A01;
        this.A00 = f10;
        this.A06.ACO(f10);
        if (this.A00 <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            boolean z10 = this.A03;
            if (A07[4].charAt(25) == 'L') {
                throw new RuntimeException();
            }
            A07[6] = "KuCOx1ArmKJG2Js90Y8iwcXaowa3uSzZ";
            if (!z10) {
                this.A03 = true;
                this.A06.AAk();
                this.A04 = false;
            }
        }
    }

    public final float A04() {
        return this.A00;
    }

    public final boolean A05() {
        return this.A00 <= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    }

    public final boolean A06() {
        return this.A04;
    }

    public final boolean A07() {
        if (!A06()) {
            return false;
        }
        this.A04 = false;
        return true;
    }

    public final boolean A08() {
        if (A05() && !this.A03) {
            this.A03 = true;
            this.A06.AAk();
        }
        if (!A05() && !A06()) {
            this.A04 = true;
            this.A06.ACO(this.A00);
            this.A05.postDelayed(new C1229To(this), this.A02);
            return true;
        }
        if (A07[4].charAt(25) == 'L') {
            throw new RuntimeException();
        }
        String[] strArr = A07;
        strArr[3] = "u6tCNg8GXSpiTqjQspDcQdpU9nt4kRaX";
        strArr[7] = "uRN5Zlx2bfjM01c7Y9BPyYrHFfBp2TpI";
        return false;
    }
}
