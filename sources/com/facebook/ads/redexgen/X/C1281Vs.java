package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.facebook.ads.internal.exoplayer2.thirdparty.extractor.ts.TsPayloadReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1281Vs implements InterfaceC0799Cm {
    public static String[] A05 = {"ZoOhGYHP8SNfCMTpI8hB8esJvCxQNk4a", "iCY0vtQk2BMTn8YKksXnllwhxYcEMWPa", "FRJmrfeKqiG8dvU06WzW6", "wyGcQq4l", "", "l2", "ODNaIWitniiqKmZchEPotBtPtmPon6SS", "r1S7VBlY5d2QYAsiLWImTDUS2fBhu4wR"};
    public final int A00;
    public final /* synthetic */ C1280Vr A04;
    public final C0913He A03 = new C0913He(new byte[5]);
    public final SparseArray<InterfaceC0805Ct> A01 = new SparseArray<>();
    public final SparseIntArray A02 = new SparseIntArray();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0799Cm
    public final void A4N(C0914Hf c0914Hf) {
        C0926Hr c0926Hr;
        InterfaceC0805Ct interfaceC0805CtA4e;
        if (c0914Hf.A0E() != 2) {
            return;
        }
        if (this.A04.A05 == 1 || this.A04.A05 == 2 || this.A04.A01 == 1) {
            c0926Hr = (C0926Hr) this.A04.A0B.get(0);
        } else {
            c0926Hr = new C0926Hr(((C0926Hr) this.A04.A0B.get(0)).A03());
            this.A04.A0B.add(c0926Hr);
        }
        c0914Hf.A0Z(2);
        int iA0I = c0914Hf.A0I();
        int i10 = 5;
        c0914Hf.A0Z(5);
        c0914Hf.A0a(this.A03, 2);
        int i11 = 4;
        this.A03.A08(4);
        int i12 = 12;
        c0914Hf.A0Z(this.A03.A04(12));
        int i13 = 21;
        if (this.A04.A05 == 2 && this.A04.A03 == null) {
            C0802Cq c0802Cq = new C0802Cq(21, null, null, new byte[0]);
            C1280Vr c1280Vr = this.A04;
            c1280Vr.A03 = c1280Vr.A09.A4e(21, c0802Cq);
            this.A04.A03.A8f(c0926Hr, this.A04.A02, new C0804Cs(iA0I, 21, 8192));
        }
        this.A01.clear();
        this.A02.clear();
        int iA04 = c0914Hf.A04();
        while (iA04 > 0) {
            c0914Hf.A0a(this.A03, i10);
            int iA05 = this.A03.A04(8);
            this.A03.A08(3);
            int iA06 = this.A03.A04(13);
            this.A03.A08(i11);
            int iA07 = this.A03.A04(i12);
            C0802Cq c0802CqA00 = A00(c0914Hf, iA07);
            if (iA05 == 6) {
                iA05 = c0802CqA00.A00;
            }
            iA04 -= iA07 + 5;
            int i14 = this.A04.A05 == 2 ? iA05 : iA06;
            if (!this.A04.A07.get(i14)) {
                if (this.A04.A05 == 2 && iA05 == i13) {
                    C1280Vr c1280Vr2 = this.A04;
                    String[] strArr = A05;
                    if (strArr[2].length() == strArr[3].length()) {
                        throw new RuntimeException();
                    }
                    A05[0] = "McoDKrxcl9g055s4tJZatQwjzcY0TxoH";
                    interfaceC0805CtA4e = c1280Vr2.A03;
                } else {
                    interfaceC0805CtA4e = this.A04.A09.A4e(iA05, c0802CqA00);
                }
                if (this.A04.A05 != 2 || iA06 < this.A02.get(i14, 8192)) {
                    this.A02.put(i14, iA06);
                    this.A01.put(i14, interfaceC0805CtA4e);
                }
            }
            i10 = 5;
            i11 = 4;
            i12 = 12;
            i13 = 21;
        }
        int size = this.A02.size();
        for (int i15 = 0; i15 < size; i15++) {
            int iKeyAt = this.A02.keyAt(i15);
            this.A04.A07.put(iKeyAt, true);
            InterfaceC0805Ct interfaceC0805CtValueAt = this.A01.valueAt(i15);
            if (interfaceC0805CtValueAt != null) {
                C1280Vr c1280Vr3 = this.A04;
                String[] strArr2 = A05;
                if (strArr2[5].length() == strArr2[4].length()) {
                    throw new RuntimeException();
                }
                A05[0] = "prZScD3eoAfWT6wNb9RUJeZXyBQ1ma5M";
                if (interfaceC0805CtValueAt != c1280Vr3.A03) {
                    interfaceC0805CtValueAt.A8f(c0926Hr, this.A04.A02, new C0804Cs(iA0I, iKeyAt, 8192));
                }
                this.A04.A06.put(this.A02.valueAt(i15), interfaceC0805CtValueAt);
            }
        }
        if (this.A04.A05 == 2) {
            if (this.A04.A04) {
                return;
            }
            this.A04.A02.A5S();
            this.A04.A01 = 0;
            this.A04.A04 = true;
            return;
        }
        this.A04.A06.remove(this.A00);
        C1280Vr c1280Vr4 = this.A04;
        c1280Vr4.A01 = c1280Vr4.A05 != 1 ? this.A04.A01 - 1 : 0;
        if (this.A04.A01 == 0) {
            this.A04.A02.A5S();
            this.A04.A04 = true;
        }
    }

    public C1281Vs(C1280Vr c1280Vr, int i10) {
        this.A04 = c1280Vr;
        this.A00 = i10;
    }

    private C0802Cq A00(C0914Hf c0914Hf, int i10) {
        int iA06 = c0914Hf.A06();
        int i11 = iA06 + i10;
        int descriptorLength = -1;
        String strTrim = null;
        List<TsPayloadReader.DvbSubtitleInfo> dvbSubtitleInfos = null;
        while (c0914Hf.A06() < i11) {
            int descriptorsStartPosition = c0914Hf.A0E();
            int iA07 = c0914Hf.A06() + c0914Hf.A0E();
            if (descriptorsStartPosition == 5) {
                long jA0M = c0914Hf.A0M();
                if (jA0M != C1280Vr.A0F) {
                    long j10 = C1280Vr.A0G;
                    if (A05[0].charAt(13) == 108) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A05;
                    strArr[5] = "OX";
                    strArr[4] = "";
                    if (jA0M == j10) {
                        descriptorLength = 135;
                    } else if (jA0M == C1280Vr.A0H) {
                        descriptorLength = 36;
                    }
                } else {
                    descriptorLength = 129;
                }
            } else if (descriptorsStartPosition == 106) {
                descriptorLength = 129;
            } else if (descriptorsStartPosition == 122) {
                descriptorLength = 135;
            } else if (descriptorsStartPosition == 123) {
                descriptorLength = 138;
            } else if (descriptorsStartPosition == 10) {
                strTrim = c0914Hf.A0S(3).trim();
            } else if (descriptorsStartPosition == 89) {
                descriptorLength = 89;
                dvbSubtitleInfos = new ArrayList<>();
                while (c0914Hf.A06() < iA07) {
                    String language = c0914Hf.A0S(3).trim();
                    int streamType = c0914Hf.A0E();
                    byte[] bArr = new byte[4];
                    c0914Hf.A0c(bArr, 0, 4);
                    dvbSubtitleInfos.add(new C0801Cp(language, streamType, bArr));
                }
            }
            c0914Hf.A0Z(iA07 - c0914Hf.A06());
        }
        c0914Hf.A0Y(i11);
        return new C0802Cq(descriptorLength, strTrim, dvbSubtitleInfos, Arrays.copyOfRange(c0914Hf.A00, iA06, i11));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0799Cm
    public final void A8f(C0926Hr c0926Hr, InterfaceC0774Ba interfaceC0774Ba, C0804Cs c0804Cs) {
    }
}
