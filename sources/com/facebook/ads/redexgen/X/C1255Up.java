package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Up, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1255Up implements InterfaceC0885Ga {
    public static String[] A04 = {"X6WlBdbGeBIUy9RcgyD1kPyvMH5gl65h", "mWixtdhRvEEOtO49Z6LrUITCnd", "19dVuEeyHaOsnSLi", "Fh0FDziHvuuc46M8RjDn", "TMNOdV", "BntQd7XboiQ5Pp5LCDj1cbVKSXS32D1x", "NrlP0Z8V9f9J6rKzzcCufZh8yiDjfbRh", "BOidXQkRBMfwkg7VYmAkrOpgeHcKVKv0"};
    public long A00;
    public boolean A01;
    public final GY A02;
    public final InterfaceC0885Ga A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0885Ga
    public final long ADQ(C0889Ge c0889Ge) throws IOException {
        long jADQ = this.A03.ADQ(c0889Ge);
        this.A00 = jADQ;
        if (jADQ == 0) {
            return 0L;
        }
        if (c0889Ge.A02 == -1 && this.A00 != -1) {
            c0889Ge = new C0889Ge(c0889Ge.A04, c0889Ge.A01, c0889Ge.A03, this.A00, c0889Ge.A05, c0889Ge.A00);
        }
        this.A01 = true;
        this.A02.ADS(c0889Ge);
        return this.A00;
    }

    public C1255Up(InterfaceC0885Ga interfaceC0885Ga, GY gy) {
        this.A03 = (InterfaceC0885Ga) HG.A01(interfaceC0885Ga);
        this.A02 = (GY) HG.A01(gy);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0885Ga
    public final Uri A84() {
        return this.A03.A84();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0885Ga
    public final void close() throws IOException {
        try {
            this.A03.close();
            if (this.A01) {
                this.A01 = false;
                this.A02.close();
            }
        } catch (Throwable th) {
            boolean z10 = this.A01;
            if (A04[5].charAt(29) != 'a') {
                A04[1] = "CXpRjqYaQVmivrsYVOmY1oz";
                if (z10) {
                    this.A01 = false;
                    GY gy = this.A02;
                    if (A04[1].length() != 2) {
                        A04[5] = "FmRI3fMemMJaQGBcEYhbAky7hUfnuUR1";
                        gy.close();
                    }
                }
                throw th;
            }
            throw new RuntimeException();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0885Ga
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.A00 == 0) {
            return -1;
        }
        int i12 = this.A03.read(bArr, i10, i11);
        if (i12 > 0) {
            this.A02.write(bArr, i10, i12);
            long j10 = this.A00;
            if (j10 != -1) {
                this.A00 = j10 - ((long) i12);
            }
        }
        return i12;
    }
}
