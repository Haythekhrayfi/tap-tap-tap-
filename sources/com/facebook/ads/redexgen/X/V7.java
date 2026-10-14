package com.facebook.ads.redexgen.X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class V7 implements InterfaceC0885Ga {
    public static byte[] A07;
    public static String[] A08 = {"LByWpbEPJA", "7zBd1gTQe", "KuygTrv8nulqhNSWOngA1uKtSEuZHgRN", "Njgdt1gsnhQwK4o", "BeNPg2roj36bAWsP0", "RQRmVWofVgKwOSOG8v2k1lAFTXU782LE", "P3wGsXlJvJ2cmEHDxz1oaqJg", "cQN91p4HTGgxD32"};
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public FileInputStream A03;
    public boolean A04;
    public final ContentResolver A05;
    public final InterfaceC0905Gw<? super V7> A06;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 104);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{77, 97, 123, 98, 106, 46, 96, 97, 122, 46, 97, 126, 107, 96, 46, 104, 103, 98, 107, 46, 106, 107, 125, 109, 124, 103, 126, 122, 97, 124, 46, 104, 97, 124, 52, 46, 88};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0885Ga
    public final long ADQ(C0889Ge c0889Ge) throws GW {
        try {
            Uri uri = c0889Ge.A04;
            this.A02 = uri;
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.A05.openAssetFileDescriptor(uri, A00(36, 1, 66));
            this.A01 = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new FileNotFoundException(A00(0, 36, 102) + this.A02);
            }
            this.A03 = new FileInputStream(this.A01.getFileDescriptor());
            long startOffset = this.A01.getStartOffset();
            long jSkip = this.A03.skip(c0889Ge.A03 + startOffset) - startOffset;
            if (jSkip != c0889Ge.A03) {
                throw new EOFException();
            }
            if (c0889Ge.A02 != -1) {
                this.A00 = c0889Ge.A02;
            } else {
                long length = this.A01.getLength();
                if (length == -1) {
                    FileChannel channel = this.A03.getChannel();
                    long size = channel.size();
                    this.A00 = size != 0 ? size - channel.position() : -1L;
                } else {
                    this.A00 = length - jSkip;
                }
            }
            this.A04 = true;
            InterfaceC0905Gw<? super V7> interfaceC0905Gw = this.A06;
            if (interfaceC0905Gw != null) {
                interfaceC0905Gw.AD4(this, c0889Ge);
            }
            return this.A00;
        } catch (IOException e10) {
            throw new GW(e10);
        }
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gw != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.ContentDataSource> */
    public V7(Context context, InterfaceC0905Gw<? super V7> interfaceC0905Gw) {
        this.A05 = context.getContentResolver();
        this.A06 = interfaceC0905Gw;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0885Ga
    public final Uri A84() {
        return this.A02;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x002b */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0885Ga
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() throws com.facebook.ads.redexgen.X.GW {
        /*
            r4 = this;
            r3 = 0
            r4.A02 = r3
            r2 = 0
            java.io.FileInputStream r0 = r4.A03     // Catch: java.io.IOException -> L3c java.lang.Throwable -> L43
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
            com.facebook.ads.redexgen.X.Gw<? super com.facebook.ads.redexgen.X.V7> r0 = r4.A06
            if (r0 == 0) goto L23
            r0.AD3(r4)
        L23:
            return
        L24:
            r1 = move-exception
            com.facebook.ads.redexgen.X.GW r0 = new com.facebook.ads.redexgen.X.GW     // Catch: java.lang.Throwable -> L2b
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2b
            throw r0     // Catch: java.lang.Throwable -> L2b
        L2b:
            r1 = move-exception
            r4.A01 = r3
            boolean r0 = r4.A04
            if (r0 == 0) goto L3b
            r4.A04 = r2
            com.facebook.ads.redexgen.X.Gw<? super com.facebook.ads.redexgen.X.V7> r0 = r4.A06
            if (r0 == 0) goto L3b
            r0.AD3(r4)
        L3b:
            throw r1
        L3c:
            r1 = move-exception
            com.facebook.ads.redexgen.X.GW r0 = new com.facebook.ads.redexgen.X.GW     // Catch: java.lang.Throwable -> L43
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
            com.facebook.ads.redexgen.X.Gw<? super com.facebook.ads.redexgen.X.V7> r0 = r4.A06
            if (r0 == 0) goto L5c
            r0.AD3(r4)
        L5c:
            throw r1
        L5d:
            r1 = move-exception
            com.facebook.ads.redexgen.X.GW r0 = new com.facebook.ads.redexgen.X.GW     // Catch: java.lang.Throwable -> L64
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L64
            throw r0     // Catch: java.lang.Throwable -> L64
        L64:
            r1 = move-exception
            r4.A01 = r3
            boolean r0 = r4.A04
            if (r0 == 0) goto L74
            r4.A04 = r2
            com.facebook.ads.redexgen.X.Gw<? super com.facebook.ads.redexgen.X.V7> r0 = r4.A06
            if (r0 == 0) goto L74
            r0.AD3(r4)
        L74:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.V7.close():void");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0089  */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0885Ga
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.A00;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new GW(e10);
            }
        }
        int i12 = this.A03.read(bArr, i10, i11);
        if (i12 == -1) {
            long j11 = this.A00;
            String[] strArr = A08;
            String str = strArr[3];
            String str2 = strArr[7];
            int length = str.length();
            int bytesRead = str2.length();
            if (length != bytesRead) {
                throw new RuntimeException();
            }
            A08[0] = "iixlGiSV2y9Sj4FhSzJ8n8KndyylS";
            if (j11 == -1) {
                return -1;
            }
            throw new GW(new EOFException());
        }
        long j12 = this.A00;
        if (A08[0].length() != 5) {
            A08[0] = "YPxf1aEs9O2Lc7g4LGclNCu";
            if (j12 != -1) {
                this.A00 = j12 - ((long) i12);
            }
        } else if (j12 != -1) {
            this.A00 = j12 - ((long) i12);
        }
        InterfaceC0905Gw<? super V7> interfaceC0905Gw = this.A06;
        if (A08[4].length() != 17) {
            A08[0] = "Oz3XLfSc2A979xkKdF0NMgeVRm8";
            if (interfaceC0905Gw != null) {
                interfaceC0905Gw.AAb(this, i12);
            }
        } else {
            String[] strArr2 = A08;
            strArr2[1] = "uqZ1tM2xm";
            strArr2[6] = "4bkl7P4p23vj4jNsoeIfag2n";
            if (interfaceC0905Gw != null) {
                interfaceC0905Gw.AAb(this, i12);
            }
        }
        return i12;
    }
}
