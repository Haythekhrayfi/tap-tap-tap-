package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WX implements BY {
    public static byte[] A0E;
    public static String[] A0F = {"FKupPKXcsIkycQ3l5ptAH5wluEqc6YoI", "RW", "ogqWAOna8QODFLIqijT7vOYnhApvYyU7", "UAOUtvFDqNmRNLgZ1GU6DrNnbPesxUgh", "z4WGtVpeHmr0jWMfeyoB2cmDzFByDj9w", "gdGWUcFUabEj8aTRXEAi5amp", "tmhvTid", "WDNv6R6VbALBmvSk6DCmHF7NFi0i9puO"};
    public static final InterfaceC0775Bb A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public InterfaceC0774Ba A04;
    public InterfaceC0782Bk A05;
    public WY A06;
    public Metadata A07;
    public final int A08;
    public final long A09;
    public final C0776Bc A0A;
    public final Bd A0B;
    public final Be A0C;
    public final C0914Hf A0D;

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 31);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A0E = new byte[]{-94, -57, -65, -56, -110, -92, -96, -79, -94, -89, -92, -93, 95, -77, -82, -82, 95, -84, -96, -83, -72, 95, -95, -72, -77, -92, -78, 109, -115, 121, -119, -128, -100, -83, -78, -85};
    }

    static {
        A05();
        A0G = new WZ();
        A0J = C0930Hv.A08(A04(32, 4, 37));
        A0H = C0930Hv.A08(A04(0, 4, 58));
        A0I = C0930Hv.A08(A04(28, 4, 24));
    }

    public WX() {
        this(0);
    }

    public WX(int i10) {
        this(i10, -9223372036854775807L);
    }

    public WX(int i10, long j10) {
        this.A08 = i10;
        this.A09 = j10;
        this.A0D = new C0914Hf(10);
        this.A0C = new Be();
        this.A0A = new C0776Bc();
        this.A02 = -9223372036854775807L;
        this.A0B = new Bd();
    }

    private int A00(BZ bz) throws InterruptedException, IOException {
        if (this.A00 == 0) {
            bz.AEb();
            if (!bz.ADb(this.A0D.A00, 0, 4, true)) {
                return -1;
            }
            this.A0D.A0Y(0);
            int iA08 = this.A0D.A08();
            int sampleHeaderData = this.A01;
            if (A06(iA08, sampleHeaderData)) {
                int sampleHeaderData2 = Be.A00(iA08);
                if (sampleHeaderData2 != -1) {
                    Be.A04(iA08, this.A0C);
                    if (this.A02 == -9223372036854775807L) {
                        WY wy = this.A06;
                        long jA7Z = bz.A7Z();
                        if (A0F[0].charAt(7) == '2') {
                            throw new RuntimeException();
                        }
                        A0F[5] = "uwsYCHPiCgNXlhDD9rc7dT19";
                        this.A02 = wy.A7y(jA7Z);
                        if (this.A09 != -9223372036854775807L) {
                            this.A02 += this.A09 - this.A06.A7y(0L);
                        }
                    }
                    int sampleHeaderData3 = this.A0C.A02;
                    this.A00 = sampleHeaderData3;
                }
            }
            bz.AFT(1);
            this.A01 = 0;
            return 0;
        }
        int iAEf = this.A05.AEf(bz, this.A00, true);
        if (iAEf == -1) {
            return -1;
        }
        int bytesAppended = this.A00 - iAEf;
        this.A00 = bytesAppended;
        if (bytesAppended > 0) {
            return 0;
        }
        this.A05.AEh(this.A02 + ((this.A03 * 1000000) / ((long) this.A0C.A03)), 1, this.A0C.A02, 0, null);
        this.A03 += (long) this.A0C.A04;
        this.A00 = 0;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        if (r3 == r0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A01(com.facebook.ads.redexgen.X.C0914Hf r4, int r5) {
        /*
            int r1 = r4.A07()
            int r0 = r5 + 4
            if (r1 < r0) goto L3e
            r4.A0Y(r5)
            int r3 = r4.A08()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.WX.A0F
            r0 = 4
            r1 = r2[r0]
            r0 = 3
            r2 = r2[r0]
            r0 = 21
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L38
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.WX.A0F
            java.lang.String r1 = "RZ9mFeyNnV0sPgPCsPCuasZg37Uzdp17"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "fK9CAyTZYj28knSP6u8xHPIK1qnXYcxa"
            r0 = 3
            r2[r0] = r1
            int r0 = com.facebook.ads.redexgen.X.WX.A0J
            if (r3 == r0) goto L37
            int r0 = com.facebook.ads.redexgen.X.WX.A0H
            if (r3 != r0) goto L3e
        L37:
            return r3
        L38:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L3e:
            int r1 = r4.A07()
            r0 = 40
            if (r1 < r0) goto L54
            r0 = 36
            r4.A0Y(r0)
            int r1 = r4.A08()
            int r0 = com.facebook.ads.redexgen.X.WX.A0I
            if (r1 != r0) goto L54
            return r0
        L54:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.WX.A01(com.facebook.ads.redexgen.X.Hf, int):int");
    }

    private DH A02(BZ bz) throws InterruptedException, IOException {
        bz.ADa(this.A0D.A00, 0, 4);
        this.A0D.A0Y(0);
        Be.A04(this.A0D.A08(), this.A0C);
        return new DH(bz.A7A(), bz.A7Z(), this.A0C);
    }

    private WY A03(BZ bz) throws InterruptedException, IOException {
        C0914Hf c0914Hf = new C0914Hf(this.A0C.A02);
        bz.ADa(c0914Hf.A00, 0, this.A0C.A02);
        int i10 = 21;
        if ((this.A0C.A05 & 1) != 0) {
            int i11 = this.A0C.A01;
            if (A0F[5].length() != 24) {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[6] = "1a7oiXE";
            strArr[1] = "rh";
            if (i11 != 1) {
                i10 = 36;
            }
        } else if (this.A0C.A01 == 1) {
            i10 = 13;
        }
        int xingBase = A01(c0914Hf, i10);
        if (xingBase == A0J || xingBase == A0H) {
            D0 d0A01 = D0.A01(bz.A7A(), bz.A7Z(), this.A0C, c0914Hf);
            if (d0A01 != null && !this.A0A.A03()) {
                bz.AEb();
                bz.A3R(i10 + 141);
                C0914Hf frame = this.A0D;
                bz.ADa(frame.A00, 0, 3);
                C0914Hf frame2 = this.A0D;
                frame2.A0Y(0);
                C0776Bc c0776Bc = this.A0A;
                C0914Hf frame3 = this.A0D;
                c0776Bc.A04(frame3.A0G());
            }
            bz.AFT(this.A0C.A02);
            if (d0A01 != null && !d0A01.A93() && xingBase == A0H) {
                return A02(bz);
            }
            return d0A01;
        }
        if (xingBase == A0I) {
            D1 d1A00 = D1.A00(bz.A7A(), bz.A7Z(), this.A0C, c0914Hf);
            bz.AFT(this.A0C.A02);
            return d1A00;
        }
        bz.AEb();
        return null;
    }

    public static boolean A06(int i10, long j10) {
        return ((long) ((-128000) & i10)) == ((-128000) & j10);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0090  */
    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:56:0x0105  */
    /* JADX WARN: Code duplicated, block: B:58:0x0112 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0115  */
    /* JADX WARN: Code duplicated, block: B:69:0x009d A[EDGE_INSN: B:69:0x009d->B:29:0x009d BREAK  A[LOOP:0: B:22:0x0074->B:76:0x0074], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x009d A[EDGE_INSN: B:72:0x009d->B:29:0x009d BREAK  A[LOOP:0: B:22:0x0074->B:76:0x0074], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x009d A[EDGE_INSN: B:75:0x009d->B:29:0x009d BREAK  A[LOOP:0: B:22:0x0074->B:76:0x0074], SYNTHETIC] */
    private boolean A07(BZ bz, boolean z10) throws InterruptedException, IOException {
        byte[] bArr;
        boolean z11;
        int candidateSynchronizedHeaderData;
        int validFrameCount;
        int candidateSynchronizedHeaderData2;
        int validFrameCount2;
        int iA08;
        int candidateSynchronizedHeaderData3;
        int frameSize = 0;
        int i10 = 0;
        int peekedId3Bytes = 0;
        int searchedBytes = 0;
        int headerData = z10 ? Http2.INITIAL_MAX_FRAME_SIZE : 131072;
        bz.AEb();
        if (bz.A7Z() == 0) {
            int i11 = this.A08;
            String[] strArr = A0F;
            String str = strArr[4];
            String str2 = strArr[3];
            int candidateSynchronizedHeaderData4 = str.charAt(21);
            int validFrameCount3 = str2.charAt(21);
            if (candidateSynchronizedHeaderData4 != validFrameCount3) {
                String[] strArr2 = A0F;
                strArr2[6] = "aodgJ9F";
                strArr2[1] = "Mh";
                int validFrameCount4 = i11 & 2;
                int validFrameCount5 = validFrameCount4 != 0 ? 1 : 0;
                Metadata metadataA00 = this.A0B.A00(bz, validFrameCount5 != 0 ? C0776Bc.A04 : null);
                this.A07 = metadataA00;
                if (metadataA00 != null) {
                    C0776Bc c0776Bc = this.A0A;
                    int candidateSynchronizedHeaderData5 = A0F[5].length();
                    if (candidateSynchronizedHeaderData5 != 24) {
                        String[] strArr3 = A0F;
                        strArr3[2] = "kwUpXSrSJ0NLH72x1DIQc8Fq054MCj03";
                        strArr3[7] = "uritoxjB27zl8eiC6KQaQvgdEg1vP6Ps";
                        c0776Bc.A05(metadataA00);
                    } else {
                        A0F[0] = "W2SW3glva3ohlkheP4GgDHO6E3mNlxjo";
                        c0776Bc.A05(metadataA00);
                    }
                }
                peekedId3Bytes = (int) bz.A7U();
                if (!z10) {
                    bz.AFT(peekedId3Bytes);
                }
                while (true) {
                    bArr = this.A0D.A00;
                    if (frameSize > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    String[] strArr4 = A0F;
                    String str3 = strArr4[4];
                    String str4 = strArr4[3];
                    candidateSynchronizedHeaderData = str3.charAt(21);
                    validFrameCount = str4.charAt(21);
                    if (candidateSynchronizedHeaderData != validFrameCount) {
                        A0F[0] = "F41ajW8QxYjYysO7QQhMOwz5jLXMzQYc";
                        if (!bz.ADb(bArr, 0, 4, z11)) {
                            break;
                        }
                        this.A0D.A0Y(0);
                        iA08 = this.A0D.A08();
                        if ((i10 == 0 && !A06(iA08, i10)) || (candidateSynchronizedHeaderData3 = Be.A00(iA08)) == -1) {
                            int candidateSynchronizedHeaderData6 = searchedBytes + 1;
                            if (searchedBytes == headerData) {
                                if (z10) {
                                    return false;
                                }
                                throw new C07249b(A04(4, 24, 32));
                            }
                            frameSize = 0;
                            i10 = 0;
                            if (z10) {
                                bz.AEb();
                                int validFrameCount6 = peekedId3Bytes + candidateSynchronizedHeaderData6;
                                bz.A3R(validFrameCount6);
                            } else {
                                bz.AFT(1);
                            }
                            searchedBytes = candidateSynchronizedHeaderData6;
                        } else {
                            frameSize++;
                            if (frameSize == 1) {
                                Be.A04(iA08, this.A0C);
                                i10 = iA08;
                            } else if (frameSize == 4) {
                                break;
                            }
                            int validFrameCount7 = candidateSynchronizedHeaderData3 - 4;
                            bz.A3R(validFrameCount7);
                        }
                    } else {
                        if (!bz.ADb(bArr, 0, 4, z11)) {
                            break;
                        }
                        this.A0D.A0Y(0);
                        iA08 = this.A0D.A08();
                        if (i10 == 0) {
                            frameSize++;
                            if (frameSize == 1) {
                                Be.A04(iA08, this.A0C);
                                i10 = iA08;
                            } else if (frameSize == 4) {
                                break;
                                break;
                            }
                            int validFrameCount8 = candidateSynchronizedHeaderData3 - 4;
                            bz.A3R(validFrameCount8);
                        } else {
                            frameSize++;
                            if (frameSize == 1) {
                                Be.A04(iA08, this.A0C);
                                i10 = iA08;
                            } else if (frameSize == 4) {
                                break;
                                break;
                            }
                            int validFrameCount9 = candidateSynchronizedHeaderData3 - 4;
                            bz.A3R(validFrameCount9);
                        }
                    }
                }
                if (z10) {
                    bz.AFT(peekedId3Bytes + searchedBytes);
                } else {
                    bz.AEb();
                }
                this.A01 = i10;
                String[] strArr5 = A0F;
                String str5 = strArr5[2];
                String str6 = strArr5[7];
                candidateSynchronizedHeaderData2 = str5.charAt(28);
                validFrameCount2 = str6.charAt(28);
                if (candidateSynchronizedHeaderData2 != validFrameCount2) {
                    A0F[0] = "JRrUIGwZBJczcB1fqhgNVGoVSbza2n0c";
                    return true;
                }
            }
        } else {
            while (true) {
                bArr = this.A0D.A00;
                if (frameSize > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                String[] strArr6 = A0F;
                String str7 = strArr6[4];
                String str8 = strArr6[3];
                candidateSynchronizedHeaderData = str7.charAt(21);
                validFrameCount = str8.charAt(21);
                if (candidateSynchronizedHeaderData != validFrameCount) {
                    A0F[0] = "F41ajW8QxYjYysO7QQhMOwz5jLXMzQYc";
                    if (!bz.ADb(bArr, 0, 4, z11)) {
                        break;
                        break;
                    }
                    this.A0D.A0Y(0);
                    iA08 = this.A0D.A08();
                    if (i10 == 0) {
                        frameSize++;
                        if (frameSize == 1) {
                            Be.A04(iA08, this.A0C);
                            i10 = iA08;
                        } else if (frameSize == 4) {
                            break;
                            break;
                        }
                        int validFrameCount10 = candidateSynchronizedHeaderData3 - 4;
                        bz.A3R(validFrameCount10);
                    } else {
                        frameSize++;
                        if (frameSize == 1) {
                            Be.A04(iA08, this.A0C);
                            i10 = iA08;
                        } else if (frameSize == 4) {
                            break;
                            break;
                        }
                        int validFrameCount11 = candidateSynchronizedHeaderData3 - 4;
                        bz.A3R(validFrameCount11);
                    }
                } else {
                    if (!bz.ADb(bArr, 0, 4, z11)) {
                        break;
                        break;
                    }
                    this.A0D.A0Y(0);
                    iA08 = this.A0D.A08();
                    if (i10 == 0) {
                        frameSize++;
                        if (frameSize == 1) {
                            Be.A04(iA08, this.A0C);
                            i10 = iA08;
                        } else if (frameSize == 4) {
                            break;
                            break;
                        }
                        int validFrameCount12 = candidateSynchronizedHeaderData3 - 4;
                        bz.A3R(validFrameCount12);
                    } else {
                        frameSize++;
                        if (frameSize == 1) {
                            Be.A04(iA08, this.A0C);
                            i10 = iA08;
                        } else if (frameSize == 4) {
                            break;
                            break;
                        }
                        int validFrameCount13 = candidateSynchronizedHeaderData3 - 4;
                        bz.A3R(validFrameCount13);
                    }
                }
            }
            if (z10) {
                bz.AFT(peekedId3Bytes + searchedBytes);
            } else {
                bz.AEb();
            }
            this.A01 = i10;
            String[] strArr7 = A0F;
            String str9 = strArr7[2];
            String str10 = strArr7[7];
            candidateSynchronizedHeaderData2 = str9.charAt(28);
            validFrameCount2 = str10.charAt(28);
            if (candidateSynchronizedHeaderData2 != validFrameCount2) {
                A0F[0] = "JRrUIGwZBJczcB1fqhgNVGoVSbza2n0c";
                return true;
            }
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A8d(InterfaceC0774Ba interfaceC0774Ba) {
        this.A04 = interfaceC0774Ba;
        this.A05 = interfaceC0774Ba.AFm(0, 1);
        this.A04.A5S();
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final int ADy(BZ bz, C0777Bf c0777Bf) throws InterruptedException, IOException {
        if (this.A01 == 0) {
            try {
                A07(bz, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.A06 == null) {
            WY wyA03 = A03(bz);
            this.A06 = wyA03;
            if (wyA03 == null || (!wyA03.A93() && (this.A08 & 1) != 0)) {
                this.A06 = A02(bz);
            }
            this.A04.AEm(this.A06);
            this.A05.A5i(Format.A05(null, this.A0C.A06, null, -1, 4096, this.A0C.A01, this.A0C.A03, -1, this.A0A.A00, this.A0A.A01, null, null, 0, null, (this.A08 & 2) != 0 ? null : this.A07));
        }
        return A00(bz);
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void AEl(long j10, long j11) {
        this.A01 = 0;
        this.A02 = -9223372036854775807L;
        this.A03 = 0L;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final boolean AFV(BZ bz) throws InterruptedException, IOException {
        return A07(bz, true);
    }
}
