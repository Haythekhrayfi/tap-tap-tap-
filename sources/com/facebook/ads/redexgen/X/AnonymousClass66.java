package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.66, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass66 {
    public static String A00;
    public static byte[] A01;
    public static String[] A02 = {"o8zuart55Bmx3Pw0EGryupigSLJoPiZx", "bq35BXrVyo2MmN2pvK0AAoIbsBJXmHFn", "Ag4UQwTEuL9TJhKNxG6", "PmxOul6ExA7xevKGmIJ7", "bJjslG0QPgIDYXjJzGe0RXJuWF5PAt6I", "GLZoSVJacutm5kJ9CSmVpuybEaBnhneX", "dIwLXajRtHFv7I4e8IdUhcaSFtkhp8vw", "TtnuuoV6cihzxwpt43jVepBLS"};
    public static final String A03;

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 58);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        byte[] bArr = {112, 82, 93, 93, 92, 71, 19, 84, 86, 71, 19, 82, 87, 69, 86, 65, 71, 90, 64, 90, 93, 84, 19, 90, 93, 85, 92, 19, 92, 93, 19, 94, 82, 90, 93, 19, 71, 91, 65, 86, 82, 87, Ascii.GS, 91, 87, 85, 22, 95, 87, 87, 95, 84, 93, 22, 89, 86, 92, 74, 87, 81, 92, 22, 95, 85, 75, 82, 94, 92, Ascii.US, 86, 94, 94, 86, 93, 84, Ascii.US, 80, 95, 85, 67, 94, 88, 85, Ascii.US, 86, 92, 66, Ascii.US, 80, 85, 66, Ascii.US, 88, 85, 84, 95, 69, 88, 87, 88, 84, 67, Ascii.US, 112, 85, 71, 84, 67, 69, 88, 66, 88, 95, 86, 120, 85, 114, 93, 88, 84, 95, 69, 109, 97, 99, 32, 105, 97, 97, 105, 98, 107, 32, 111, 96, 106, 124, 97, 103, 106, 32, 105, 99, 125, 32, 111, 106, 125, 32, 103, 106, 107, 96, 122, 103, 104, 103, 107, 124, 32, 125, 107, 124, 120, 103, 109, 107, 32, 93, 90, 79, 92, 90, 18, Ascii.RS, Ascii.FS, 95, 22, Ascii.RS, Ascii.RS, 22, Ascii.GS, 20, 95, 16, Ascii.US, 21, 3, Ascii.RS, Ascii.CAN, 21, 95, 22, Ascii.FS, 2, 95, 18, Ascii.RS, Ascii.FS, Ascii.FS, Ascii.RS, Ascii.US, 95, 54, Ascii.RS, Ascii.RS, 22, Ascii.GS, 20, 33, Ascii.GS, 16, 8, 34, 20, 3, 7, Ascii.CAN, 18, 20, 2, 36, 5, Ascii.CAN, Ascii.GS, 67, 65, 74, 65, 86, 77, 71, 106, 104, 121, 76, 105, 123, 104, Ascii.DEL, 121, 100, 126, 100, 99, 106, 68, 105, 68, 99, 107, 98, 123, 121, 104, 85, 120, 33, 59, 15, 39, 39, 47, 36, 45, Ascii.CAN, 36, 41, 49, Ascii.ESC, 45, 58, 62, 33, 43, 45, 59, 9, 62, 41, 33, 36, 41, 42, 36, 45, 43, 49, 14, 43, 47, 43, 54, 3, 38, 22, 48, 35, 33, 41, 43, 44, 37, 7, 44, 35, 32, 46, 39, 38};
        if (A02[0].charAt(25) != 'L') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[7] = "5c2qL4dH8BvO0Uzn9h0t1hzuT";
        strArr[3] = "iopOujFX2mYmGwDZvEry";
        A01 = bArr;
    }

    static {
        A05();
        A03 = C06545y.class.getSimpleName();
        A00 = A04(173, 52, 75);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    public static C06545y A00(C7Q c7q) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C06545y c06545yA01 = A01(c7q);
            if (c06545yA01 != null) {
                boolean zIsEmpty = TextUtils.isEmpty(c06545yA01.A03());
                if (A02[0].charAt(25) != 'L') {
                    throw new RuntimeException();
                }
                A02[4] = "uy9l7RLQ2P1HyKRuXc5qKTdvpqbxTZwF";
                if (zIsEmpty) {
                    c06545yA01 = A02(c7q);
                }
            } else {
                c06545yA01 = A02(c7q);
            }
            if (c06545yA01 == null || TextUtils.isEmpty(c06545yA01.A03())) {
                return A03(c7q);
            }
            return c06545yA01;
        }
        throw new IllegalStateException(A04(0, 43, 9));
    }

    public static C06545y A01(C7Q c7q) {
        C7U adId = c7q.A04().A7g();
        if (adId != null) {
            return new C06545y(adId.getId(), adId.A8v(), EnumC06535x.A03);
        }
        return null;
    }

    public static C06545y A02(C7Q c7q) {
        Object objA00;
        Method methodA02;
        Object objA01;
        Method methodA03 = AnonymousClass67.A02(A00, A04(257, 29, 114), Context.class);
        if (methodA03 == null || (objA00 = AnonymousClass67.A00(null, methodA03, c7q)) == null || ((Integer) objA00).intValue() != 0 || (methodA02 = AnonymousClass67.A02(A04(65, 57, 11), A04(232, 20, 55), Context.class)) == null || (objA01 = AnonymousClass67.A00(null, methodA02, c7q)) == null) {
            return null;
        }
        Method methodA01 = AnonymousClass67.A01(objA01.getClass(), A04(252, 5, 38), new Class[0]);
        Method methodA04 = AnonymousClass67.A01(objA01.getClass(), A04(286, 24, 120), new Class[0]);
        if (methodA01 == null || methodA04 == null) {
            return null;
        }
        String str = (String) AnonymousClass67.A00(objA01, methodA01, new Object[0]);
        Boolean bool = (Boolean) AnonymousClass67.A00(objA01, methodA04, new Object[0]);
        if (str != null) {
            return new C06545y(str, bool != null && bool.booleanValue(), EnumC06535x.A07);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.facebook.ads.internal.attribution.GmsAttributionProvider$GoogleAdInfo] */
    public static C06545y A03(C7Q c7q) {
        AnonymousClass65 anonymousClass65 = new AnonymousClass65();
        Intent intent = new Intent(A04(122, 51, 52));
        intent.setPackage(A04(43, 22, 2));
        if (c7q.bindService(intent, anonymousClass65, 1)) {
            try {
                final IBinder iBinderA02 = anonymousClass65.A02();
                ?? r10 = new IInterface(iBinderA02) { // from class: com.facebook.ads.internal.attribution.GmsAttributionProvider$GoogleAdInfo
                    public static byte[] A01;
                    public static String[] A02 = {"", "dlCQJjSx2v0yIAE7uR5", "YVJONne7N3U8xm", "", "eKTK4BSI8P33PVYq98zfXeBzSnXDY", "", "Oc9p6kWmaRe51UGQv0AehnzsYEIJ", "vamZVSY5oxMc9Fm9XA4FwhL"};
                    public IBinder A00;

                    public static String A00(int i10, int i11, int i12) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
                        int i13 = 0;
                        while (true) {
                            int length = bArrCopyOfRange.length;
                            String[] strArr = A02;
                            if (strArr[5].length() != strArr[0].length()) {
                                throw new RuntimeException();
                            }
                            A02[3] = "";
                            if (i13 >= length) {
                                return new String(bArrCopyOfRange);
                            }
                            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 80);
                            i13++;
                        }
                    }

                    public static void A01() {
                        A01 = new byte[]{42, 54, 52, -11, 46, 54, 54, 46, 51, 44, -11, 40, 53, 43, 57, 54, 48, 43, -11, 46, 52, 58, -11, 40, 43, 58, -11, 48, 43, 44, 53, 59, 48, 45, 48, 44, 57, -11, 48, 53, 59, 44, 57, 53, 40, 51, -11, 16, 8, 43, 61, 44, 57, 59, 48, 58, 48, 53, 46, 16, 43, Ascii.SUB, 44, 57, 61, 48, 42, 44};
                    }

                    static {
                        A01();
                    }

                    {
                        this.A00 = iBinderA02;
                    }

                    public final String A02() throws RemoteException {
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken(A00(0, 68, 119));
                            this.A00.transact(1, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            String string = parcelObtain2.readString();
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            return string != null ? string : A00(0, 0, 88);
                        } catch (Throwable th) {
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            throw th;
                        }
                    }

                    public final boolean A03() throws RemoteException {
                        Parcel parcelObtain = Parcel.obtain();
                        Parcel parcelObtain2 = Parcel.obtain();
                        try {
                            parcelObtain.writeInterfaceToken(A00(0, 68, 119));
                            boolean z10 = true;
                            parcelObtain.writeInt(1);
                            this.A00.transact(2, parcelObtain, parcelObtain2, 0);
                            parcelObtain2.readException();
                            if (parcelObtain2.readInt() == 0) {
                                z10 = false;
                            }
                            return z10;
                        } finally {
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        }
                    }

                    @Override // android.os.IInterface
                    public final IBinder asBinder() {
                        return this.A00;
                    }
                };
                C06545y c06545y = new C06545y(r10.A02(), r10.A03(), EnumC06535x.A08);
                c7q.unbindService(anonymousClass65);
                return c06545y;
            } catch (Throwable th) {
                try {
                    c7q.A07().A9K(A04(HideBottomViewOnScrollBehavior.ENTER_ANIMATION_DURATION, 7, 30), C06937v.A1Q, new C06947w(th));
                } finally {
                    c7q.unbindService(anonymousClass65);
                }
            }
        }
        return null;
    }
}
