package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1285Vw implements InterfaceC0805Ct {
    public static String[] A06 = {"f3ASEvE0MACuH7PXtcW6SQzpVLuDWBs6", "UAkl7YLcJ73MhJIfOQ7gtBxP58V39hXf", "sKTt9gGYn0qCOxzPnchEZBW", "TIj2tKxLfGdHgu1Q1GnzrxOOh9OPKkUY", "NlS114awdnJt6ePSWIiXVyR", "Ttbg6FQm3oQML", "hnRFaN1D1NI4WPLkXSYbmAvKq8H9o2zk", "6DjXFLFEMVHWeegs6rtlgiLmiwpKRWRw"};
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final InterfaceC0799Cm A04;
    public final C0914Hf A05 = new C0914Hf(32);

    public C1285Vw(InterfaceC0799Cm interfaceC0799Cm) {
        this.A04 = interfaceC0799Cm;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0805Ct
    public final void A4O(C0914Hf c0914Hf, boolean z10) {
        int i10 = -1;
        if (z10) {
            int iA0E = c0914Hf.A0E();
            int iA06 = c0914Hf.A06();
            String[] strArr = A06;
            String str = strArr[4];
            String str2 = strArr[2];
            int payloadStartOffset = str.length();
            if (payloadStartOffset != str2.length()) {
                throw new RuntimeException();
            }
            A06[5] = "fX8Qw0M3arh1i";
            i10 = iA06 + iA0E;
        }
        if (this.A03) {
            if (!z10) {
                return;
            }
            this.A03 = false;
            c0914Hf.A0Y(i10);
            this.A00 = 0;
        }
        while (c0914Hf.A04() > 0) {
            int payloadStartPosition = this.A00;
            if (payloadStartPosition < 3) {
                if (payloadStartPosition == 0) {
                    int tableId = c0914Hf.A0E();
                    c0914Hf.A0Y(c0914Hf.A06() - 1);
                    if (tableId == 255) {
                        this.A03 = true;
                        return;
                    }
                }
                int tableId2 = c0914Hf.A04();
                int iMin = Math.min(tableId2, 3 - this.A00);
                c0914Hf.A0c(this.A05.A00, this.A00, iMin);
                int payloadStartPosition2 = this.A00 + iMin;
                this.A00 = payloadStartPosition2;
                if (payloadStartPosition2 == 3) {
                    this.A05.A0W(3);
                    this.A05.A0Z(1);
                    int iA0E2 = this.A05.A0E();
                    int headerBytesToRead = this.A05.A0E();
                    this.A02 = (iA0E2 & 128) != 0;
                    this.A01 = (((iA0E2 & 15) << 8) | headerBytesToRead) + 3;
                    int headerBytesToRead2 = this.A05.A05();
                    if (headerBytesToRead2 < this.A01) {
                        byte[] bArr = this.A05.A00;
                        C0914Hf c0914Hf2 = this.A05;
                        int headerBytesToRead3 = this.A01;
                        c0914Hf2.A0W(Math.min(4098, Math.max(headerBytesToRead3, bArr.length * 2)));
                        System.arraycopy(bArr, 0, this.A05.A00, 0, 3);
                    }
                }
            } else {
                int iA04 = c0914Hf.A04();
                int headerBytesToRead4 = this.A01;
                int iMin2 = Math.min(iA04, headerBytesToRead4 - this.A00);
                c0914Hf.A0c(this.A05.A00, this.A00, iMin2);
                int payloadStartPosition3 = this.A00 + iMin2;
                this.A00 = payloadStartPosition3;
                int bodyBytesToRead = this.A01;
                if (payloadStartPosition3 != bodyBytesToRead) {
                    continue;
                } else {
                    if (this.A02) {
                        if (C0930Hv.A09(this.A05.A00, 0, this.A01, -1) != 0) {
                            this.A03 = true;
                            return;
                        }
                        this.A05.A0W(this.A01 - 4);
                    } else {
                        this.A05.A0W(bodyBytesToRead);
                    }
                    this.A04.A4N(this.A05);
                    this.A00 = 0;
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0805Ct
    public final void A8f(C0926Hr c0926Hr, InterfaceC0774Ba interfaceC0774Ba, C0804Cs c0804Cs) {
        this.A04.A8f(c0926Hr, interfaceC0774Ba, c0804Cs);
        this.A03 = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0805Ct
    public final void AEk() {
        this.A03 = true;
    }
}
