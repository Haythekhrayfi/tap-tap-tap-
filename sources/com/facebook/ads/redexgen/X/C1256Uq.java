package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1256Uq implements InterfaceC0885Ga {
    public static byte[] A07;
    public static String[] A08 = {"CpiOlZ", "ukFexlYSIMwQqH0UvFPWGqG0YthdqpHq", "2yw2Gs2GC2jxZI0Hgcr1UjVZgWf7BNvx", "7SwPVGS0jIrCQlvIcpAA6U9bhm4jPR5r", "7pQ8HXcSNS6Xqd33VYljkiTEbCcLAkDq", "kKrkJSZnynA87WgMdnYScFfJH7qszUrQ", "lo5", "kH5jcAc5XMYXCXQVRoC"};
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public InputStream A03;
    public boolean A04;
    public final Resources A05;
    public final InterfaceC0905Gw<? super C1256Uq> A06;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 71);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{-9, 10, Ascii.CAN, 20, Ascii.SUB, 23, 8, 10, -59, 14, 9, 10, 19, Ascii.EM, 14, 11, 14, 10, 23, -59, 18, Ascii.SUB, Ascii.CAN, Ascii.EM, -59, 7, 10, -59, 6, 19, -59, 14, 19, Ascii.EM, 10, 12, 10, 23, -45, 5, 2, -7, -48, Ascii.GS, 37, 35, 36, -48, 37, 35, 21, -48, 35, 19, Ascii.CAN, 21, Ascii.GS, 21, -48, 34, 17, 39, 34, 21, 35, Ascii.US, 37, 34, 19, 21, 36, 19, 41, 36, 23, 37, 33, 39, 36, 21, 23};
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gw != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.RawResourceDataSource> */
    public C1256Uq(Context context, InterfaceC0905Gw<? super C1256Uq> interfaceC0905Gw) {
        this.A05 = context.getResources();
        this.A06 = interfaceC0905Gw;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0885Ga
    public final Uri A84() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0885Ga
    public final long ADQ(C0889Ge c0889Ge) throws IOException {
        try {
            Uri uri = c0889Ge.A04;
            this.A02 = uri;
            if (TextUtils.equals(A00(70, 11, 107), uri.getScheme())) {
                try {
                    this.A01 = this.A05.openRawResourceFd(Integer.parseInt(this.A02.getLastPathSegment()));
                    FileInputStream fileInputStream = new FileInputStream(this.A01.getFileDescriptor());
                    this.A03 = fileInputStream;
                    fileInputStream.skip(this.A01.getStartOffset());
                    long jSkip = this.A03.skip(c0889Ge.A03);
                    long skipped = c0889Ge.A03;
                    if (jSkip >= skipped) {
                        if (c0889Ge.A02 != -1) {
                            this.A00 = c0889Ge.A02;
                        } else {
                            long length = this.A01.getLength();
                            if (A08[7].length() != 19) {
                                throw new RuntimeException();
                            }
                            A08[0] = "nEQCtk";
                            this.A00 = length != -1 ? length - c0889Ge.A03 : -1L;
                        }
                        this.A04 = true;
                        InterfaceC0905Gw<? super C1256Uq> interfaceC0905Gw = this.A06;
                        if (interfaceC0905Gw != null) {
                            interfaceC0905Gw.AD4(this, c0889Ge);
                        }
                        return this.A00;
                    }
                    throw new EOFException();
                } catch (NumberFormatException unused) {
                    throw new C0904Gv(A00(0, 39, 94));
                }
            }
            throw new C0904Gv(A00(39, 31, 105));
        } catch (IOException e10) {
            throw new C0904Gv(e10);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x002b */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0885Ga
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() throws com.facebook.ads.redexgen.X.C0904Gv {
        /*
            r4 = this;
            r3 = 0
            r4.A02 = r3
            r2 = 0
            java.io.InputStream r0 = r4.A03     // Catch: java.io.IOException -> L3c java.lang.Throwable -> L43
            if (r0 == 0) goto Lb
            r0.close()     // Catch: java.io.IOException -> L3c java.lang.Throwable -> L43
        Lb:
            r4.A03 = r3
            android.content.res.AssetFileDescriptor r0 = r4.A01     // Catch: java.io.IOException -> L24 java.lang.Throwable -> L2b
            if (r0 == 0) goto L14
            r0.close()     // Catch: java.io.IOException -> L24 java.lang.Throwable -> L2b
        L14:
            r4.A01 = r3
            boolean r0 = r4.A04
            if (r0 == 0) goto L23
            r4.A04 = r2
            com.facebook.ads.redexgen.X.Gw<? super com.facebook.ads.redexgen.X.Uq> r0 = r4.A06
            if (r0 == 0) goto L23
            r0.AD3(r4)
        L23:
            return
        L24:
            r1 = move-exception
            com.facebook.ads.redexgen.X.Gv r0 = new com.facebook.ads.redexgen.X.Gv     // Catch: java.lang.Throwable -> L2b
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2b
            throw r0     // Catch: java.lang.Throwable -> L2b
        L2b:
            r1 = move-exception
            r4.A01 = r3
            boolean r0 = r4.A04
            if (r0 == 0) goto L3b
            r4.A04 = r2
            com.facebook.ads.redexgen.X.Gw<? super com.facebook.ads.redexgen.X.Uq> r0 = r4.A06
            if (r0 == 0) goto L3b
            r0.AD3(r4)
        L3b:
            throw r1
        L3c:
            r1 = move-exception
            com.facebook.ads.redexgen.X.Gv r0 = new com.facebook.ads.redexgen.X.Gv     // Catch: java.lang.Throwable -> L43
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L43
            throw r0     // Catch: java.lang.Throwable -> L43
        L43:
            r1 = move-exception
            r4.A03 = r3
            android.content.res.AssetFileDescriptor r0 = r4.A01     // Catch: java.io.IOException -> L5d java.lang.Throwable -> L64
            if (r0 == 0) goto L4d
            r0.close()     // Catch: java.io.IOException -> L5d java.lang.Throwable -> L64
        L4d:
            r4.A01 = r3
            boolean r0 = r4.A04
            if (r0 == 0) goto L5c
            r4.A04 = r2
            com.facebook.ads.redexgen.X.Gw<? super com.facebook.ads.redexgen.X.Uq> r0 = r4.A06
            if (r0 == 0) goto L5c
            r0.AD3(r4)
        L5c:
            throw r1
        L5d:
            r1 = move-exception
            com.facebook.ads.redexgen.X.Gv r0 = new com.facebook.ads.redexgen.X.Gv     // Catch: java.lang.Throwable -> L64
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L64
            throw r0     // Catch: java.lang.Throwable -> L64
        L64:
            r1 = move-exception
            r4.A01 = r3
            boolean r0 = r4.A04
            if (r0 == 0) goto L74
            r4.A04 = r2
            com.facebook.ads.redexgen.X.Gw<? super com.facebook.ads.redexgen.X.Uq> r0 = r4.A06
            if (r0 == 0) goto L74
            r0.AD3(r4)
        L74:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1256Uq.close():void");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0885Ga
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.A00;
        if (A08[3].charAt(24) == 'w') {
            throw new RuntimeException();
        }
        A08[0] = "oumASG";
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new C0904Gv(e10);
            }
        }
        int i12 = this.A03.read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.A00 == -1) {
                return -1;
            }
            throw new C0904Gv(new EOFException());
        }
        long j11 = this.A00;
        if (j11 != -1) {
            this.A00 = j11 - ((long) i12);
        }
        InterfaceC0905Gw<? super C1256Uq> interfaceC0905Gw = this.A06;
        if (interfaceC0905Gw != null) {
            interfaceC0905Gw.AAb(this, i12);
        }
        return i12;
    }
}
