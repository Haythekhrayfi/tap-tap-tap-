package com.facebook.ads.redexgen.X;

import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WO implements BY, InterfaceC0779Bh {
    public static byte[] A0J;
    public static String[] A0K = {"NMENm2VVY4CjFU7qkzTmTxviYk7AnS7Z", "JBVFfjWytxpjUnZZ6lInsU7tzfFzOPaX", "YaevPinMBRqhVFzNm59vwI8bFO4cI8AD", "52TqclTutshaaFkrwJ4nyJTeA2xWvRpu", "JGseDZtum4mqdbq3nSxMUnsGXrSMUYmk", "xuKwDkc3QqvJvTm3i1k9vAbPWWVSjov2", "2GdyUNwnHd6eSNq3THJOdF5Wjs3u7UdX", "VVA8bJ0ju0kVaqoWpNH4VPWsYewebzZE"};
    public static final InterfaceC0775Bb A0L;
    public static final int A0M;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public InterfaceC0774Ba A09;
    public C0914Hf A0A;
    public boolean A0B;
    public CE[] A0C;
    public long[][] A0D;
    public final int A0E;
    public final C0914Hf A0F;
    public final C0914Hf A0G;
    public final C0914Hf A0H;
    public final ArrayDeque<WW> A0I;

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0J, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A0J = new byte[]{107, 94, 69, 71, 10, 89, 67, 80, 79, 10, 70, 79, 89, 89, 10, 94, 66, 75, 68, 10, 66, 79, 75, 78, 79, 88, 10, 70, 79, 68, 77, 94, 66, 10, 2, 95, 68, 89, 95, 90, 90, 69, 88, 94, 79, 78, 3, 4, 104, 109, 57, 57};
    }

    static {
        A07();
        A0L = new WP();
        A0M = C0930Hv.A08(A04(48, 4, 57));
    }

    public WO() {
        this(0);
    }

    public WO(int i10) {
        this.A0E = i10;
        this.A0F = new C0914Hf(16);
        this.A0I = new ArrayDeque<>();
        this.A0H = new C0914Hf(C0910Hb.A03);
        this.A0G = new C0914Hf(4);
        this.A06 = -1;
    }

    private int A00(long j10) {
        long sampleAccumulatedBytes = RecyclerView.FOREVER_NS;
        int i10 = 1;
        int i11 = -1;
        long j11 = RecyclerView.FOREVER_NS;
        long j12 = RecyclerView.FOREVER_NS;
        int trackIndex = 1;
        int minAccumulatedBytesTrackIndex = -1;
        int i12 = 0;
        while (true) {
            CE[] ceArr = this.A0C;
            if (i12 >= ceArr.length) {
                if (j12 == RecyclerView.FOREVER_NS || trackIndex == 0) {
                    return i11;
                }
                long preferredSkipAmount = SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE + j12;
                if (j11 < preferredSkipAmount) {
                    return i11;
                }
                return minAccumulatedBytesTrackIndex;
            }
            CE ce2 = ceArr[i12];
            int i13 = ce2.A00;
            if (i13 != ce2.A03.A01) {
                long j13 = ce2.A03.A06[i13];
                String[] strArr = A0K;
                if (strArr[2].charAt(0) == strArr[4].charAt(0)) {
                    throw new RuntimeException();
                }
                A0K[7] = "SNUxNBsUQVazn7VwiZNUPsjETt3vlrb9";
                long j14 = this.A0D[i12][i13];
                long j15 = j13 - j10;
                int i14 = (j15 < 0 || j15 >= 262144) ? 1 : 0;
                if ((i14 == 0 && i10 != 0) || (i14 == i10 && j15 < sampleAccumulatedBytes)) {
                    i10 = i14;
                    sampleAccumulatedBytes = j15;
                    i11 = i12;
                    j11 = j14;
                }
                if (j14 < j12) {
                    j12 = j14;
                    trackIndex = i14;
                    minAccumulatedBytesTrackIndex = i12;
                }
            }
            i12++;
        }
    }

    private int A01(BZ bz, C0777Bf c0777Bf) throws InterruptedException, IOException {
        int i10;
        long jA7Z = bz.A7Z();
        if (this.A06 == -1) {
            int iA00 = A00(jA7Z);
            this.A06 = iA00;
            if (iA00 == -1) {
                return -1;
            }
        }
        CE ce2 = this.A0C[this.A06];
        InterfaceC0782Bk trackOutput = ce2.A01;
        int i11 = ce2.A00;
        long j10 = ce2.A03.A06[i11];
        int i12 = ce2.A03.A05[i11];
        long j11 = (j10 - jA7Z) + ((long) this.A04);
        if (j11 < 0 || j11 >= 262144) {
            c0777Bf.A00 = j10;
            return 1;
        }
        if (ce2.A02.A02 == 1) {
            j11 += 8;
            i12 -= 8;
        }
        bz.AFT((int) j11);
        int sampleSize = ce2.A02.A01;
        String[] strArr = A0K;
        if (strArr[5].charAt(6) == strArr[3].charAt(6)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0K;
        strArr2[2] = "Kr0RNkXRcq3MKFcdyeDViEL730qvS1Or";
        strArr2[4] = "dsHpYadjIesMKkl8nKWo5Xy2zI1EHMvq";
        if (sampleSize != 0) {
            byte[] bArr = this.A0G.A00;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int nalUnitLengthFieldLength = ce2.A02.A01;
            int i13 = 4 - ce2.A02.A01;
            while (this.A04 < i12) {
                int i14 = this.A05;
                if (i14 == 0) {
                    bz.readFully(this.A0G.A00, i13, nalUnitLengthFieldLength);
                    this.A0G.A0Y(0);
                    this.A05 = this.A0G.A0H();
                    this.A0H.A0Y(0);
                    trackOutput.AEg(this.A0H, 4);
                    this.A04 += 4;
                    i12 += i13;
                } else {
                    int iAEf = trackOutput.AEf(bz, i14, false);
                    this.A04 += iAEf;
                    this.A05 -= iAEf;
                }
            }
            i10 = 0;
        } else {
            while (true) {
                int i15 = this.A04;
                if (i15 >= i12) {
                    break;
                }
                int iAEf2 = trackOutput.AEf(bz, i12 - i15, false);
                this.A04 += iAEf2;
                this.A05 -= iAEf2;
            }
            i10 = 0;
        }
        long[] jArr = ce2.A03.A07;
        String[] strArr3 = A0K;
        if (strArr3[0].charAt(11) != strArr3[1].charAt(11)) {
            A0K[6] = "rOKgrdqhHdXOkXubOIefZGVtdh7cvyNY";
            trackOutput.AEh(jArr[i11], ce2.A03.A04[i11], i12, 0, null);
            ce2.A00 += 0;
            this.A06 = -1;
            this.A04 = i10;
            this.A05 = i10;
            return i10;
        }
        A0K[6] = "wHchi0wLq1ErSeSpKTFcZRDvkUCQV0RS";
        trackOutput.AEh(jArr[i11], ce2.A03.A04[i11], i12, 0, null);
        ce2.A00++;
        this.A06 = -1;
        this.A04 = i10;
        this.A05 = i10;
        return i10;
    }

    public static int A02(CN cn, long j10) {
        int iA00 = cn.A00(j10);
        if (iA00 == -1) {
            return cn.A01(j10);
        }
        return iA00;
    }

    public static long A03(CN cn, long j10, long j11) {
        int iA02 = A02(cn, j10);
        if (iA02 == -1) {
            return j11;
        }
        long jMin = Math.min(cn.A06[iA02], j11);
        if (A0K[6].charAt(20) == 'b') {
            throw new RuntimeException();
        }
        String[] strArr = A0K;
        strArr[5] = "p3vbyKglgBhvg6ga7RihuDYjPakbSwaT";
        strArr[3] = "aiiDKqFmbgCXZZv8uVJN0mXFbRvDRlE6";
        return jMin;
    }

    private ArrayList<CN> A05(WW ww, C0776Bc c0776Bc, boolean z10) throws C07249b {
        CK ckA0C;
        ArrayList<CN> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < ww.A01.size(); i10++) {
            WW ww2 = ww.A01.get(i10);
            int i11 = ((AbstractC0790Bz) ww2).A00;
            if (i11 == AbstractC0790Bz.A1M && (ckA0C = C4.A0C(ww2, ww.A07(AbstractC0790Bz.A0o), -9223372036854775807L, null, z10, this.A0B)) != null) {
                CN cnA0E = C4.A0E(ckA0C, ww2.A06(AbstractC0790Bz.A0e).A06(AbstractC0790Bz.A0i).A06(AbstractC0790Bz.A17), c0776Bc);
                if (cnA0E.A01 != 0) {
                    arrayList.add(cnA0E);
                }
            }
        }
        return arrayList;
    }

    private void A06() {
        this.A03 = 0;
        this.A00 = 0;
    }

    private void A08(long j10) throws C07249b {
        while (true) {
            boolean zIsEmpty = this.A0I.isEmpty();
            if (A0K[7].charAt(14) == 'r') {
                throw new RuntimeException();
            }
            String[] strArr = A0K;
            strArr[0] = "xKK31fned0mjTVppOAxzoNj9viNrlryO";
            strArr[1] = "3HkC7zoZl6jjTlZPcBHC3lXiUTtQlSXh";
            if (!zIsEmpty && this.A0I.peek().A00 == j10) {
                WW wwPop = this.A0I.pop();
                if (((AbstractC0790Bz) wwPop).A00 == AbstractC0790Bz.A0k) {
                    A0A(wwPop);
                    this.A0I.clear();
                    this.A03 = 2;
                } else if (!this.A0I.isEmpty()) {
                    WW containerAtom = this.A0I.peek();
                    containerAtom.A08(wwPop);
                }
            } else {
                if (this.A03 != 2) {
                    A06();
                    return;
                }
                return;
            }
        }
    }

    private void A09(long j10) {
        for (CE ce2 : this.A0C) {
            CN cn = ce2.A03;
            int iA00 = cn.A00(j10);
            if (iA00 == -1) {
                iA00 = cn.A01(j10);
            }
            ce2.A00 = iA00;
            if (A0K[6].charAt(20) == 'b') {
                throw new RuntimeException();
            }
            String[] strArr = A0K;
            strArr[5] = "MNnvCsSYuz9FkO9KQczdYnABN7zTLwyu";
            strArr[3] = "oflUn1lXrJVPIzwz3GYNJmaWxDOTuoWv";
        }
    }

    private void A0A(WW ww) throws C07249b {
        ArrayList<CN> arrayListA05;
        int trackCount = -1;
        long jMax = -9223372036854775807L;
        ArrayList arrayList = new ArrayList();
        Metadata metadataA0F = null;
        C0776Bc c0776Bc = new C0776Bc();
        WV wvA07 = ww.A07(AbstractC0790Bz.A1Q);
        if (wvA07 != null && (metadataA0F = C4.A0F(wvA07, this.A0B)) != null) {
            c0776Bc.A05(metadataA0F);
        }
        try {
            arrayListA05 = A05(ww, c0776Bc, (this.A0E & 1) != 0);
        } catch (WS unused) {
            c0776Bc = new C0776Bc();
            arrayListA05 = A05(ww, c0776Bc, true);
        }
        int size = arrayListA05.size();
        for (int i10 = 0; i10 < size; i10++) {
            CN cn = arrayListA05.get(i10);
            CK ck = cn.A03;
            CE ce2 = new CE(ck, cn, this.A09.AFm(i10, ck.A03));
            Format formatA0F = ck.A07.A0F(cn.A00 + 30);
            if (ck.A03 == 1) {
                if (c0776Bc.A03()) {
                    formatA0F = formatA0F.A0G(c0776Bc.A00, c0776Bc.A01);
                }
                if (metadataA0F != null) {
                    formatA0F = formatA0F.A0J(metadataA0F);
                }
            }
            ce2.A01.A5i(formatA0F);
            jMax = Math.max(jMax, ck.A04 != -9223372036854775807L ? ck.A04 : cn.A02);
            if (ck.A03 == 2 && trackCount == -1) {
                trackCount = arrayList.size();
            }
            arrayList.add(ce2);
        }
        this.A02 = trackCount;
        this.A08 = jMax;
        CE[] ceArr = (CE[]) arrayList.toArray(new CE[arrayList.size()]);
        this.A0C = ceArr;
        this.A0D = A0G(ceArr);
        this.A09.A5S();
        this.A09.AEm(this);
    }

    public static boolean A0B(int i10) {
        return i10 == AbstractC0790Bz.A0k || i10 == AbstractC0790Bz.A1M || i10 == AbstractC0790Bz.A0e || i10 == AbstractC0790Bz.A0i || i10 == AbstractC0790Bz.A17 || i10 == AbstractC0790Bz.A0O;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    public static boolean A0C(int i10) {
        if (i10 != AbstractC0790Bz.A0d && i10 != AbstractC0790Bz.A0o) {
            int i11 = AbstractC0790Bz.A0W;
            String[] strArr = A0K;
            if (strArr[2].charAt(0) == strArr[4].charAt(0)) {
                throw new RuntimeException();
            }
            A0K[7] = "Lbfp0NvNFR61AEm901fhAiQEZdUAojSN";
            if (i10 != i11 && i10 != AbstractC0790Bz.A1B && i10 != AbstractC0790Bz.A1E && i10 != AbstractC0790Bz.A1C) {
                int i12 = AbstractC0790Bz.A0D;
                String[] strArr2 = A0K;
                if (strArr2[0].charAt(11) != strArr2[1].charAt(11)) {
                    String[] strArr3 = A0K;
                    strArr3[2] = "AcWpjtb96ZMDu8ZbPmw7y3S9ldwHNTMG";
                    strArr3[4] = "liNDCAzQcSMqwn5YpITrjlM20opaDBZf";
                    if (i10 != i12) {
                        if (i10 == AbstractC0790Bz.A0P && i10 != AbstractC0790Bz.A1A && i10 != AbstractC0790Bz.A1D && i10 != AbstractC0790Bz.A1F && i10 != AbstractC0790Bz.A18 && i10 != AbstractC0790Bz.A0C && i10 != AbstractC0790Bz.A1K && i10 != AbstractC0790Bz.A0V && i10 != AbstractC0790Bz.A1Q) {
                            return false;
                        }
                    }
                } else {
                    A0K[6] = "Et4fiiNPrE1ktHaAFcacRxoSMiMckR7G";
                    if (i10 != i12) {
                        if (i10 == AbstractC0790Bz.A0P) {
                        }
                    }
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x012c  */
    private boolean A0D(BZ bz) throws InterruptedException, IOException {
        if (this.A00 == 0) {
            if (!bz.AE3(this.A0F.A00, 0, 8, true)) {
                return false;
            }
            this.A00 = 8;
            this.A0F.A0Y(0);
            this.A07 = this.A0F.A0M();
            this.A01 = this.A0F.A08();
        }
        long endPosition = this.A07;
        if (endPosition == 1) {
            bz.readFully(this.A0F.A00, 8, 8);
            int headerBytesRemaining = this.A00;
            this.A00 = headerBytesRemaining + 8;
            this.A07 = this.A0F.A0N();
        } else if (endPosition == 0) {
            long jA7A = bz.A7A();
            if (jA7A == -1 && !this.A0I.isEmpty()) {
                WW wwPeek = this.A0I.peek();
                String[] strArr = A0K;
                if (strArr[0].charAt(11) != strArr[1].charAt(11)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0K;
                strArr2[2] = "Y6YGZv93ZuaTG8VKRMqoKTcHxa4CyU5s";
                strArr2[4] = "FFKbnBThmWx8ffVkKuWdFuDu950VBi9q";
                jA7A = wwPeek.A00;
            }
            String[] strArr3 = A0K;
            if (strArr3[0].charAt(11) != strArr3[1].charAt(11)) {
                String[] strArr4 = A0K;
                strArr4[2] = "ugTmpqu3zmSn1kJoBPr5aOxqvcpaMzJE";
                strArr4[4] = "H3dhpZSJ1Chdl4exfdGGuKA1AJd0x5s1";
                if (jA7A != -1) {
                    this.A07 = (jA7A - bz.A7Z()) + ((long) this.A00);
                }
            } else {
                String[] strArr5 = A0K;
                strArr5[5] = "kSEId9swLLOilCfe7rS6ohoMdmP2xe9n";
                strArr5[3] = "aRADAydnlpBl2XluL5U3tUuHw5s08YEm";
                if (jA7A != -1) {
                    this.A07 = (jA7A - bz.A7Z()) + ((long) this.A00);
                }
            }
        }
        if (this.A07 >= this.A00) {
            if (A0B(this.A01)) {
                long jA7Z = (bz.A7Z() + this.A07) - ((long) this.A00);
                this.A0I.push(new WW(this.A01, jA7Z));
                if (this.A07 == this.A00) {
                    A08(jA7Z);
                } else {
                    A06();
                }
            } else if (A0C(this.A01)) {
                HG.A04(this.A00 == 8);
                HG.A04(this.A07 <= 2147483647L);
                this.A0A = new C0914Hf((int) this.A07);
                System.arraycopy(this.A0F.A00, 0, this.A0A.A00, 0, 8);
                this.A03 = 1;
            } else {
                this.A0A = null;
                this.A03 = 1;
            }
            return true;
        }
        throw new C07249b(A04(0, 48, 10));
    }

    private boolean A0E(BZ bz, C0777Bf c0777Bf) throws InterruptedException, IOException {
        long j10 = this.A07 - ((long) this.A00);
        long atomEndPosition = bz.A7Z() + j10;
        boolean z10 = false;
        C0914Hf c0914Hf = this.A0A;
        if (c0914Hf != null) {
            bz.readFully(c0914Hf.A00, this.A00, (int) j10);
            if (this.A01 == AbstractC0790Bz.A0V) {
                this.A0B = A0F(this.A0A);
            } else if (!this.A0I.isEmpty()) {
                this.A0I.peek().A09(new WV(this.A01, this.A0A));
            }
        } else if (j10 < 262144) {
            bz.AFT((int) j10);
        } else {
            long atomPayloadSize = bz.A7Z();
            c0777Bf.A00 = atomPayloadSize + j10;
            z10 = true;
        }
        A08(atomEndPosition);
        return z10 && this.A03 != 2;
    }

    public static boolean A0F(C0914Hf c0914Hf) {
        int iA08;
        int majorBrand;
        c0914Hf.A0Y(8);
        int iA09 = c0914Hf.A08();
        int majorBrand2 = A0M;
        if (iA09 == majorBrand2) {
            return true;
        }
        c0914Hf.A0Z(4);
        do {
            int iA04 = c0914Hf.A04();
            String[] strArr = A0K;
            String str = strArr[0];
            String str2 = strArr[1];
            int iCharAt = str.charAt(11);
            int majorBrand3 = str2.charAt(11);
            if (iCharAt != majorBrand3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[5] = "HZNBHqeXKlwJLRyY4R1ZazClo3jLxgS8";
            strArr2[3] = "ULnGw1bPzwMM6OF7GcjqoSbIBNnkFp5Y";
            if (iA04 > 0) {
                iA08 = c0914Hf.A08();
                majorBrand = A0M;
            } else {
                return false;
            }
        } while (iA08 != majorBrand);
        return true;
    }

    public static long[][] A0G(CE[] ceArr) {
        long[][] jArr = new long[ceArr.length][];
        int[] iArr = new int[ceArr.length];
        long[] jArr2 = new long[ceArr.length];
        boolean[] tracksFinished = new boolean[ceArr.length];
        for (int i10 = 0; i10 < ceArr.length; i10++) {
            jArr[i10] = new long[ceArr[i10].A03.A01];
            jArr2[i10] = ceArr[i10].A03.A07[0];
        }
        long j10 = 0;
        int i11 = 0;
        while (true) {
            int length = ceArr.length;
            String[] strArr = A0K;
            if (strArr[0].charAt(11) != strArr[1].charAt(11)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[5] = "yJ2jD62HfH2jQTY3DSfm8DixkPqWTM6R";
            strArr2[3] = "ERCQlGdy7dAXpXma9fK0CLCiAFSx2az3";
            if (i11 < length) {
                long j11 = RecyclerView.FOREVER_NS;
                int minTimeTrackIndex = -1;
                for (int i12 = 0; i12 < ceArr.length; i12++) {
                    if (!tracksFinished[i12]) {
                        long minTimeUs = jArr2[i12];
                        if (minTimeUs <= j11) {
                            minTimeTrackIndex = i12;
                            j11 = jArr2[i12];
                        }
                    }
                }
                int i13 = iArr[minTimeTrackIndex];
                jArr[minTimeTrackIndex][i13] = j10;
                j10 += (long) ceArr[minTimeTrackIndex].A03.A05[i13];
                int i14 = i13 + 1;
                iArr[minTimeTrackIndex] = i14;
                if (i14 < jArr[minTimeTrackIndex].length) {
                    jArr2[minTimeTrackIndex] = ceArr[minTimeTrackIndex].A03.A07[i14];
                } else {
                    tracksFinished[minTimeTrackIndex] = true;
                    i11++;
                }
            } else {
                return jArr;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0779Bh
    public final long A6j() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0779Bh
    public final C0778Bg A7k(long j10) {
        long j11;
        long jA03;
        int iA01;
        CE[] ceArr = this.A0C;
        if (ceArr.length == 0) {
            return new C0778Bg(C0780Bi.A03);
        }
        long j12 = -9223372036854775807L;
        long jA04 = -1;
        int i10 = this.A02;
        if (i10 != -1) {
            CN cn = ceArr[i10].A03;
            int iA02 = A02(cn, j10);
            if (iA02 == -1) {
                return new C0778Bg(C0780Bi.A03);
            }
            j11 = cn.A07[iA02];
            jA03 = cn.A06[iA02];
            if (j11 < j10 && iA02 < cn.A01 - 1 && (iA01 = cn.A01(j10)) != -1 && iA01 != iA02) {
                j12 = cn.A07[iA01];
                jA04 = cn.A06[iA01];
            }
        } else {
            j11 = j10;
            jA03 = RecyclerView.FOREVER_NS;
        }
        int secondSampleIndex = 0;
        while (true) {
            CE[] ceArr2 = this.A0C;
            if (secondSampleIndex >= ceArr2.length) {
                break;
            }
            if (secondSampleIndex != this.A02) {
                CN cn2 = ceArr2[secondSampleIndex].A03;
                jA03 = A03(cn2, j11, jA03);
                if (j12 != -9223372036854775807L) {
                    jA04 = A03(cn2, j12, jA04);
                }
            }
            secondSampleIndex++;
        }
        C0780Bi c0780Bi = new C0780Bi(j11, jA03);
        if (j12 == -9223372036854775807L) {
            return new C0778Bg(c0780Bi);
        }
        return new C0778Bg(c0780Bi, new C0780Bi(j12, jA04));
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A8d(InterfaceC0774Ba interfaceC0774Ba) {
        this.A09 = interfaceC0774Ba;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0779Bh
    public final boolean A93() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final int ADy(BZ bz, C0777Bf c0777Bf) throws InterruptedException, IOException {
        while (true) {
            switch (this.A03) {
                case 0:
                    if (!A0D(bz)) {
                        return -1;
                    }
                    break;
                    break;
                case 1:
                    if (A0E(bz, c0777Bf)) {
                        return 1;
                    }
                    break;
                case 2:
                    return A01(bz, c0777Bf);
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void AEl(long j10, long j11) {
        this.A0I.clear();
        this.A00 = 0;
        this.A06 = -1;
        this.A04 = 0;
        this.A05 = 0;
        if (j10 == 0) {
            A06();
        } else {
            if (this.A0C == null) {
                return;
            }
            A09(j11);
        }
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final boolean AFV(BZ bz) throws InterruptedException, IOException {
        return CI.A04(bz);
    }
}
