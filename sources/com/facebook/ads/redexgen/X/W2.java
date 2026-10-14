package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class W2 implements InterfaceC0793Ce {
    public static byte[] A06;
    public static String[] A07 = {"3GVDuA8wFVUyMgpUpbIewfrR9H99KrEk", "JlICi14zqaUcthBIG11pWTw91wh2yVCw", "SCc1nWfYKQsHAUfYf8T5wZndFViKre8j", "glAeXwJzdtWksZ9B0aFClAzpFAfPstjY", "", "MoUOfVVsEVomZ5Pq9PB", "UtG2kZW99inEJ5Gw9pPEuhVI3SuCWANI", "WpnQHVSEOc3lam6iocwMhSGypVEKzNDF"};
    public int A00;
    public int A01;
    public long A02;
    public InterfaceC0782Bk A03;
    public boolean A04;
    public final C0914Hf A05 = new C0914Hf(10);

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A07[3].charAt(3) == 'p') {
                throw new RuntimeException();
            }
            A07[3] = "8BWuaIrledIbOr1Vvmzlm7GxjPqtlOKX";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 54);
            i13++;
        }
    }

    public static void A01() {
        A06 = new byte[]{121, 84, 78, 94, 92, 79, 89, 84, 83, 90, Ascii.GS, 84, 83, 75, 92, 81, 84, 89, Ascii.GS, 116, 121, 14, Ascii.GS, 73, 92, 90, 22, 59, 108, 13, 58, 62, 59, 58, 45, 43, 58, 58, 38, 35, 41, 43, 62, 35, 37, 36, 101, 35, 46, 121};
    }

    static {
        A01();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x009e  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        if (51 != r6) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00af, code lost:
    
        if (51 != r6) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b8, code lost:
    
        r8.A05.A0Z(3);
        r8.A01 = r8.A05.A0D() + 10;
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A4N(com.facebook.ads.redexgen.X.C0914Hf r9) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.W2.A4N(com.facebook.ads.redexgen.X.Hf):void");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    public final void A4k(InterfaceC0774Ba interfaceC0774Ba, C0804Cs c0804Cs) {
        c0804Cs.A05();
        InterfaceC0782Bk interfaceC0782BkAFm = interfaceC0774Ba.AFm(c0804Cs.A03(), 4);
        this.A03 = interfaceC0782BkAFm;
        interfaceC0782BkAFm.A5i(Format.A0B(c0804Cs.A04(), A00(35, 15, 124), null, -1, null));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    public final void ADX() {
        int i10;
        if (!this.A04 || (i10 = this.A01) == 0 || this.A00 != i10) {
            return;
        }
        this.A03.AEh(this.A02, 1, i10, 0, null);
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    public final void ADY(long j10, boolean z10) {
        if (!z10) {
            return;
        }
        this.A04 = true;
        this.A02 = j10;
        this.A01 = 0;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0793Ce
    public final void AEk() {
        this.A04 = false;
    }
}
