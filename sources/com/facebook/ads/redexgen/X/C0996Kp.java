package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0996Kp implements InvocationHandler {
    public static byte[] A03;
    public final /* synthetic */ int A00;
    public final /* synthetic */ C7Q A01;
    public final /* synthetic */ LinkedBlockingQueue A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 63);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{16, 14, 23, 14, Ascii.ESC, 18, 12, 21, 19, 34, 1, Ascii.RS, Ascii.SUB, 23, 34, -4, 15, Ascii.ESC, 19, Ascii.GS, Ascii.ESC, 42, 10, 47, 38, Ascii.ESC, -75, -77, -62, -92, -81, -70, -61, -77, 40, 39, -4, 33, Ascii.RS, Ascii.FS, 36, 44, 46, 38, 44, 11, Ascii.RS, Ascii.SUB, Ascii.GS, 50};
    }

    public C0996Kp(int i10, LinkedBlockingQueue linkedBlockingQueue, C7Q c7q) {
        this.A00 = i10;
        this.A02 = linkedBlockingQueue;
        this.A01 = c7q;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        try {
            if (method.getName().equals(A00(34, 16, 122)) && objArr.length == 1 && (objArr[0] instanceof List)) {
                for (Object c10 : (List) objArr[0]) {
                    String str = (String) c10.getClass().getMethod(A00(7, 12, 111), new Class[0]).invoke(c10, new Object[0]);
                    int iIntValue = ((Integer) c10.getClass().getMethod(A00(19, 7, 119), new Class[0]).invoke(c10, new Object[0])).intValue();
                    if (str == null && iIntValue == this.A00) {
                        byte[] value = (byte[]) c10.getClass().getMethod(A00(26, 8, 15), new Class[0]).invoke(c10, new Object[0]);
                        this.A02.put(value);
                        return null;
                    }
                }
                this.A02.put(null);
            }
        } catch (Throwable t10) {
            this.A01.A07().A9K(A00(0, 7, 106), C06937v.A1G, new C06947w(t10));
        }
        return null;
    }
}
