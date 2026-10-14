package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import ch.qos.logback.core.net.SyslogConstants;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XG implements InterfaceC07419s {
    public static byte[] A04;
    public final int A00;
    public final long A01;
    public final Context A02;
    public final BI<C1307Ws> A03;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 84);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{113, 80, 83, 84, 64, 89, 65, 103, 80, 91, 81, 80, 71, 80, 71, 70, 115, 84, 86, 65, 90, 71, 76, Ascii.DEL, 72, 72, 85, 72, Ascii.SUB, 83, 84, 73, 78, 91, 84, 78, 83, 91, 78, 83, 84, 93, Ascii.SUB, 124, 124, 87, 74, 95, 93, Ascii.SUB, 95, 66, 78, 95, 84, 73, 83, 85, 84, 60, 11, 11, 22, 11, 89, 16, 23, 10, 13, Ascii.CAN, 23, 13, 16, Ascii.CAN, 13, 16, 23, Ascii.RS, 89, 63, 53, 56, 58, 89, Ascii.FS, 1, 13, Ascii.FS, 23, 10, 16, 22, 23, 59, 12, 12, 17, 12, 94, 23, 16, 13, 10, Ascii.US, 16, 10, 23, Ascii.US, 10, 23, 16, Ascii.EM, 94, 49, 14, 11, 13, 94, Ascii.ESC, 6, 10, Ascii.ESC, 16, 13, 23, 17, 16, Ascii.CAN, 47, 47, 50, 47, 125, 52, 51, 46, 41, 60, 51, 41, 52, 60, 41, 52, 51, 58, 125, 11, 13, 100, 125, 56, 37, 41, 56, 51, 46, 52, 50, 51, 93, 126, 112, 117, 116, 117, 49, 87, 119, 124, 97, 116, 118, 80, 100, 117, 120, 126, 67, 116, Ascii.DEL, 117, 116, 99, 116, 99, 63, 81, 114, 124, 121, 120, 121, 61, 81, 116, Ascii.DEL, 123, 113, 124, 126, 92, 104, 121, 116, 114, 79, 120, 115, 121, 120, 111, 120, 111, 51, 45, 14, 0, 5, 4, 5, 65, 45, 8, 3, 14, 17, 20, 18, 32, 20, 5, 8, 14, 51, 4, 15, 5, 4, 19, 4, 19, 79, 54, 21, Ascii.ESC, Ascii.RS, Ascii.US, Ascii.RS, 90, 54, 19, Ascii.CAN, 12, 10, 2, 44, 19, Ascii.RS, Ascii.US, 21, 40, Ascii.US, 20, Ascii.RS, Ascii.US, 8, Ascii.US, 8, 84, 75, 71, 69, 6, 78, 73, 75, 77, 74, 71, 71, 67, 6, 73, 76, 91, 6, 65, 70, 92, 77, 90, 70, 73, 68, 6, 77, 80, 71, 88, 68, 73, 81, 77, 90, Ascii.SUB, 6, 77, 80, 92, 6, 78, 78, 69, 88, 77, 79, 6, 110, 78, 69, 88, 77, 79, 105, 93, 76, 65, 71, 122, 77, 70, 76, 77, 90, 77, 90, 84, 88, 90, Ascii.EM, 81, 86, 84, 82, 85, 88, 88, 92, Ascii.EM, 86, 83, 68, Ascii.EM, 94, 89, 67, 82, 69, 89, 86, 91, Ascii.EM, 82, 79, 88, 71, 91, 86, 78, 82, 69, 5, Ascii.EM, 82, 79, 67, Ascii.EM, 81, 91, 86, 84, Ascii.EM, 123, 94, 85, 81, 91, 86, 84, 118, 66, 83, 94, 88, 101, 82, 89, 83, 82, 69, 82, 69, 87, 91, 89, Ascii.SUB, 82, 85, 87, 81, 86, 91, 91, 95, Ascii.SUB, 85, 80, 71, Ascii.SUB, 93, 90, 64, 81, 70, 90, 85, 88, Ascii.SUB, 81, 76, 91, 68, 88, 85, 77, 81, 70, 6, Ascii.SUB, 81, 76, 64, Ascii.SUB, 91, 68, 65, 71, Ascii.SUB, 120, 93, 86, 91, 68, 65, 71, 117, 65, 80, 93, 91, 102, 81, 90, 80, 81, 70, 81, 70, 60, 48, 50, 113, 57, 62, 60, 58, 61, 48, 48, 52, 113, 62, 59, 44, 113, 54, 49, 43, 58, 45, 49, 62, 51, 113, 58, 39, 48, 47, 51, 62, 38, 58, 45, 109, 113, 58, 39, 43, 113, 41, 47, 102, 113, 19, 54, 61, 41, 47, 39, 9, 54, 59, 58, 48, 13, 58, 49, 59, 58, 45, 58, 45};
    }

    public XG(Context context) {
        this(context, 0);
    }

    public XG(Context context, int i10) {
        this(context, null, i10, 5000L);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BI != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    @Deprecated
    public XG(Context context, BI<C1307Ws> bi, int i10, long j10) {
        this.A02 = context;
        this.A00 = i10;
        this.A01 = j10;
        this.A03 = bi;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BI != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    private final void A02(Context context, BI<C1307Ws> bi, long j10, Handler handler, IJ ij, int extensionRendererIndex, ArrayList<XE> arrayList) throws Exception {
        arrayList.add(new C1A(context, D2.A00, j10, bi, false, handler, ij, 50));
        if (extensionRendererIndex == 0) {
            return;
        }
        int size = arrayList.size();
        if (extensionRendererIndex == 2) {
            size--;
        }
        try {
            try {
                Class<?> cls = Class.forName(A00(469, 64, 11));
                Class<?> clazz = Boolean.TYPE;
                Class<?> clazz2 = Long.TYPE;
                Class<?> clazz3 = Integer.TYPE;
                try {
                    arrayList.add(size, (XE) cls.getConstructor(clazz, clazz2, Handler.class, IJ.class, clazz3).newInstance(true, Long.valueOf(j10), handler, ij, 50));
                    Log.i(A00(0, 23, 97), A00(243, 27, 46));
                } catch (Exception e10) {
                    e = e10;
                    throw new RuntimeException(A00(127, 33, 9), e);
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (ClassNotFoundException unused) {
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BI != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    private final void A03(Context context, BI<C1307Ws> bi, AH[] ahArr, Handler handler, AP ap, int i10, ArrayList<XE> arrayList) throws Exception {
        int extensionRendererIndex;
        int i11;
        String strA00 = A00(0, 23, 97);
        arrayList.add(new C1B(context, D2.A00, bi, false, handler, ap, AA.A00(context), ahArr));
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            extensionRendererIndex = size + 1;
            try {
                arrayList.add(size, (XE) Class.forName(A00(403, 66, 96)).getConstructor(Handler.class, AP.class, AH[].class).newInstance(handler, ap, ahArr));
                Log.i(strA00, A00(215, 28, 53));
            } catch (ClassNotFoundException unused) {
                size = extensionRendererIndex;
                extensionRendererIndex = size;
            } catch (Exception e10) {
                e = e10;
                throw new RuntimeException(A00(93, 34, 42), e);
            }
        } catch (ClassNotFoundException unused2) {
        } catch (Exception e11) {
            e = e11;
        }
        try {
            i11 = extensionRendererIndex + 1;
            try {
                arrayList.add(extensionRendererIndex, (XE) Class.forName(A00(337, 66, 99)).getConstructor(Handler.class, AP.class, AH[].class).newInstance(handler, ap, ahArr));
                Log.i(strA00, A00(187, 28, 73));
            } catch (ClassNotFoundException unused3) {
                extensionRendererIndex = i11;
                i11 = extensionRendererIndex;
            } catch (Exception e12) {
                e = e12;
                throw new RuntimeException(A00(59, 34, 45), e);
            }
        } catch (ClassNotFoundException unused4) {
        } catch (Exception e13) {
            e = e13;
        }
        try {
            try {
                try {
                    arrayList.add(i11, (XE) Class.forName(A00(270, 67, 124)).getConstructor(Handler.class, AP.class, AH[].class).newInstance(handler, ap, ahArr));
                    Log.i(strA00, A00(SyslogConstants.LOG_LOCAL4, 27, 69));
                } catch (Exception e14) {
                    e = e14;
                    throw new RuntimeException(A00(23, 36, 110), e);
                }
            } catch (Exception e15) {
                e = e15;
            }
        } catch (ClassNotFoundException unused5) {
        }
    }

    private final void A04(Context context, DF df, Looper looper, int i10, ArrayList<XE> arrayList) {
        arrayList.add(new C3B(df, looper));
    }

    private final void A05(Context context, FX fx, Looper looper, int i10, ArrayList<XE> arrayList) {
        arrayList.add(new AnonymousClass39(fx, looper));
    }

    private final AH[] A06() {
        return new AH[0];
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BI != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC07419s
    public final XE[] A4g(Handler handler, IJ ij, AP ap, FX fx, DF df, BI<C1307Ws> bi) throws Exception {
        BI<C1307Ws> bi2 = bi;
        if (bi2 == null) {
            bi2 = this.A03;
        }
        ArrayList<XE> arrayList = new ArrayList<>();
        A02(this.A02, bi2, this.A01, handler, ij, this.A00, arrayList);
        A03(this.A02, bi2, A06(), handler, ap, this.A00, arrayList);
        A05(this.A02, fx, handler.getLooper(), this.A00, arrayList);
        A04(this.A02, df, handler.getLooper(), this.A00, arrayList);
        return (XE[]) arrayList.toArray(new XE[arrayList.size()]);
    }
}
