package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import com.facebook.ads.redexgen.X.BJ;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ww, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1311Ww<T extends BJ> implements BI<T>, InterfaceC0773Az<T> {
    public static byte[] A0D;
    public static String[] A0E = {"ANYLgz", "oJggquXjFajkvVakw", "NhfBTMehdsUwmjJG25", "fCdIhqwNOTcaInr5tUyGNlroBtV", "OEWoY1V4f4faBwRg332bHxVOSHWwx21M", "QEXYlj0kmMt4ztT6jdLWJjem", "2UI8DlmhQXrJ84vyuAUmahlNAt", "mJ2nqf9sK7no"};
    public int A00;
    public Looper A01;
    public byte[] A02;
    public final int A03;
    public final B5 A04;
    public final BP<T> A05;
    public final BT A06;
    public final HashMap<String, String> A07;
    public final List<C1312Wx<T>> A08;
    public final List<C1312Wx<T>> A09;
    public final UUID A0A;
    public final boolean A0B;

    /* JADX WARN: Incorrect inner types in field signature: Lcom/facebook/ads/redexgen/X/Ww<TT;>.MediaDrmHandler; */
    public volatile B8 A0C;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = bArrCopyOfRange[i13] ^ i12;
            String[] strArr = A0E;
            if (strArr[1].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A0E[4] = "NBGjCtubpQRAXyW4McbyIV8QsblEY4y1";
            bArrCopyOfRange[i13] = (byte) (i14 ^ 105);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A0D = new byte[]{105, 72, 75, 76, 88, 65, 89, 105, 95, 64, 126, 72, 94, 94, 68, 66, 67, 96, 74, 95, 53, 3, Ascii.FS, 56, Ascii.US, Ascii.CAN, 5, 53, 16, 5, 16, 81, Ascii.RS, Ascii.US, Ascii.GS, 8, 81, 18, Ascii.RS, Ascii.US, 5, 16, Ascii.CAN, Ascii.US, 2, 81, 18, Ascii.RS, Ascii.FS, Ascii.FS, Ascii.RS, Ascii.US, 81, 33, 34, 34, 57, 81, 34, 18, Ascii.EM, 20, Ascii.FS, 20, 53, 16, 5, 16, 95, 81, 48, 2, 2, 4, Ascii.FS, Ascii.CAN, Ascii.US, 22, 81, 2, 4, 1, 1, Ascii.RS, 3, 5, 81, 23, Ascii.RS, 3, 75, 81, Ascii.US, Ascii.RS, Ascii.US, 77, 119, 118, 119, 103, 48, 54, 61, 48, 98, 100, 111, 114};
    }

    static {
        A03();
    }

    public static DrmInitData.SchemeData A00(DrmInitData drmInitData, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(drmInitData.A01);
        int i10 = 0;
        while (true) {
            boolean z11 = false;
            if (i10 >= drmInitData.A01) {
                break;
            }
            DrmInitData.SchemeData schemeDataA01 = drmInitData.A01(i10);
            if (schemeDataA01.A02(uuid) || (C9C.A01.equals(uuid) && schemeDataA01.A02(C9C.A02))) {
                z11 = true;
            }
            if (z11 && (schemeDataA01.A04 != null || z10)) {
                arrayList.add(schemeDataA01);
            }
            i10++;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (C9C.A05.equals(uuid)) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                DrmInitData.SchemeData schemeData = (DrmInitData.SchemeData) arrayList.get(i11);
                int iA00 = schemeData.A01() ? CH.A00(schemeData.A04) : -1;
                if (C0930Hv.A02 < 23 && iA00 == 0) {
                    return schemeData;
                }
                if (C0930Hv.A02 >= 23 && iA00 == 1) {
                    return schemeData;
                }
            }
        }
        return (DrmInitData.SchemeData) arrayList.get(0);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ww != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.BJ> */
    public final void A04(Handler handler, B6 b10) {
        this.A04.A03(handler, b10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ww != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.BJ> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wx != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.BJ> */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.facebook.ads.redexgen.X.BI
    public final BH<T> A2W(Looper looper, DrmInitData drmInitData) {
        Looper looper2 = this.A01;
        HG.A04(looper2 == null || looper2 == looper);
        if (this.A09.isEmpty()) {
            this.A01 = looper;
            if (this.A0C == null) {
                this.A0C = new B8(this, looper);
            }
        }
        DrmInitData.SchemeData schemeDataA00 = null;
        C1312Wx<T> c1312Wx = null;
        if (this.A02 == null && (schemeDataA00 = A00(drmInitData, this.A0A, false)) == null) {
            B9 b10 = new B9(this.A0A);
            this.A04.A04(b10);
            return new C1310Wv(new BF(b10));
        }
        if (!this.A0B) {
            if (!this.A09.isEmpty()) {
                c1312Wx = this.A09.get(0);
            }
        } else {
            byte[] bArr = schemeDataA00 != null ? schemeDataA00.A04 : null;
            if (A0E[7].length() == 0) {
                throw new RuntimeException();
            }
            A0E[7] = "zebyso9QALf6mFi2tznux8P";
            Iterator<C1312Wx<T>> it = this.A09.iterator();
            while (true) {
                if (it.hasNext()) {
                    C1312Wx<T> next = it.next();
                    if (next.A0M(bArr)) {
                        c1312Wx = next;
                        break;
                    }
                } else {
                    c1312Wx = null;
                    break;
                }
            }
        }
        if (c1312Wx == null) {
            c1312Wx = new C1312Wx<>(this.A0A, this.A05, this, schemeDataA00, this.A00, this.A02, this.A07, this.A06, looper, this.A04, this.A03);
            this.A09.add(c1312Wx);
        }
        c1312Wx.A0G();
        return c1312Wx;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b8, code lost:
    
        if (r4.equals(r5) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c7, code lost:
    
        if (r4.equals(r5) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ca, code lost:
    
        return true;
     */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ww != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.BJ> */
    @Override // com.facebook.ads.redexgen.X.BI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A45(com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData r7) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1311Ww.A45(com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData):boolean");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ww != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.BJ> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wx != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.BJ> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0773Az
    public final void ACQ() {
        for (C1312Wx<T> c1312Wx : this.A08) {
            String[] strArr = A0E;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            A0E[4] = "E3b0MKGlV7Qlh8NFsi3ziriRt4u9XqXm";
            c1312Wx.A0H();
        }
        this.A08.clear();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ww != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.BJ> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wx != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.BJ> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0773Az
    public final void ACR(Exception exc) {
        Iterator<C1312Wx<T>> it = this.A08.iterator();
        while (it.hasNext()) {
            it.next().A0K(exc);
        }
        this.A08.clear();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ww != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.BJ> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wx != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.BJ> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0773Az
    public final void ADt(C1312Wx<T> c1312Wx) {
        this.A08.add(c1312Wx);
        if (this.A08.size() == 1) {
            c1312Wx.A0I();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BH != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSession<T extends com.facebook.ads.redexgen.X.BJ> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ww != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSessionManager<T extends com.facebook.ads.redexgen.X.BJ> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wx != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DefaultDrmSession<T extends com.facebook.ads.redexgen.X.BJ> */
    @Override // com.facebook.ads.redexgen.X.BI
    public final void AEJ(BH<T> bh) {
        if (bh instanceof C1310Wv) {
            return;
        }
        C1312Wx<T> c1312Wx = (C1312Wx) bh;
        if (c1312Wx.A0L()) {
            this.A09.remove(c1312Wx);
            if (this.A08.size() > 1 && this.A08.get(0) == c1312Wx) {
                List<C1312Wx<T>> list = this.A08;
                if (A0E[7].length() == 0) {
                    throw new RuntimeException();
                }
                String[] strArr = A0E;
                strArr[1] = "8HEKS9j6P5APhESSR";
                strArr[3] = "SFo7ZRHt72jFDiQQTk8v57UjUPr";
                list.get(1).A0I();
            }
            this.A08.remove(c1312Wx);
        }
    }
}
