package com.facebook.ads.redexgen.X;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.util.common.Preconditions;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XM implements InterfaceC07008c {
    public static byte[] A03;
    public static final String A04;
    public final C1336Xv A00;
    public final InterfaceC07108n<C0934Ia> A01;
    public final InterfaceC07108n<C0934Ia> A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 70);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{102, 100, 43, 34, 100, 48, 61, 52, 33, 126, 100, Ascii.CAN, 61, Ascii.FS, 47, 60, 55, 45, 10, 45, 54, 43, 56, 62, 60, 11, 60, 58, 54, 43, 61, Ascii.GS, 56, 45, 56, 59, 56, 42, 60, 105, 72, 65, 72, 89, 72, 73, 13, 72, 91, 72, 67, 89, 23, 13, 15, 66, 101, 109, 104, 97, 96, 36, 112, 107, 36, 103, 104, 97, 101, 118, 36, 97, 114, 97, 106, 112, 119, 36, 119, 112, 107, 118, 101, 99, 97, 97, 70, 78, 75, 66, 67, 7, 83, 72, 7, 67, 66, 84, 66, 85, 78, 70, 75, 78, 93, 66, 7, 70, 73, 7, 66, 81, 66, 73, 83, 7, 65, 85, 72, 74, 7, 67, 70, 83, 70, 69, 70, 84, 66, 7, 107, 76, 68, 65, 72, 73, 13, 89, 66, 13, 64, 66, 91, 72, 13, 72, 91, 72, 67, 89, 94, 13, 75, 95, 66, 64, 13, 68, 67, 0, 75, 65, 68, 74, 69, 89, 13, 94, 89, 66, 95, 76, 74, 72, 13, 79, 76, 78, 70, 13, 89, 66, 13, 72, 91, 72, 67, 89, 94, 13, 73, 76, 89, 76, 79, 76, 94, 72, 118, 81, 89, 92, 85, 84, 16, 68, 95, 16, 64, 81, 66, 67, 85, 16, 81, 94, 16, 85, 70, 85, 94, 68, 16, 86, 66, 95, 93, 16, 89, 94, Ascii.GS, 86, 92, 89, 87, 88, 68, 16, 67, 68, 95, 66, 81, 87, 85, 123, 92, 84, 81, 88, 89, Ascii.GS, 73, 82, Ascii.GS, 79, 88, 92, 89, Ascii.GS, 73, 85, 88, Ascii.GS, 83, 72, 80, 95, 88, 79, Ascii.GS, 82, 91, Ascii.GS, 88, 75, 88, 83, 73, 78, Ascii.GS, 91, 79, 82, 80, Ascii.GS, 89, 92, 73, 92, 95, 92, 78, 88, 12, 43, 35, 38, 47, 46, 106, 62, 37, 106, 57, 47, 56, 35, 43, 38, 35, 48, 47, 106, 43, 46, 106, 47, 60, 47, 36, 62, 105, 78, 70, 76, 73, 71, 72, 84, 13, 97, 68, 101, 86, 69, 78, 84, 115, 84, 79, 82, 65, 71, 69, 114, 69, 67, 79, 82, 68, 100, 65, 84, 65, 66, 65, 83, 69, 56, 15, 9, 5, Ascii.CAN, 14, 74, 14, 11, Ascii.RS, 11, 8, 11, Ascii.EM, 15, 74, 12, 11, 3, 6, Ascii.US, Ascii.CAN, 15, 74, 5, 9, 9, Ascii.US, Ascii.CAN, Ascii.CAN, 15, 14, 74, Ascii.GS, 2, 15, 4, 74, Ascii.CAN, 15, 11, 14, 3, 4, 13, 74, 15, Ascii.FS, 15, 4, Ascii.RS, Ascii.EM, 68, 61, 40, 40, 57, 49, 44, 40, Ascii.FS, Ascii.EM, 12, Ascii.EM, 47, 34, 95, 72, 78, 66, 95, 73, 114, 73, 76, 89, 76, 79, 76, 94, 72, 65, 87, 65, 65, 91, 93, 92, 109, 91, 86, 46, 56, 46, 46, 52, 50, 51, 2, 41, 52, 48, 56, 100, 121, 125, 117, 49, 42, 46, 32, 43, 88, 85, 92, 73, 12, 23, 18, 23, 22, 14, 23};
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00f0 A[Catch: 8w -> 0x0136, TryCatch #6 {8w -> 0x0136, blocks: (B:33:0x00e4, B:35:0x00f0, B:36:0x00ff, B:22:0x0088, B:24:0x008e, B:26:0x009a, B:27:0x00da, B:39:0x0108, B:40:0x010c, B:42:0x0112, B:43:0x0122, B:44:0x0126, B:46:0x012c), top: B:63:0x00e4 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0147  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final int A0B(int i10, Set<String> set, Set<String> set2) {
        String strA00 = A00(412, 7, 26);
        int i11 = 0;
        int[] iArr = new int[30];
        byte[] bArr = new byte[30000];
        LinkedList linkedList = new LinkedList();
        try {
            linkedList.add(this.A02.A5Z(bArr, iArr));
            List<JSONObject> listA01 = A01(new LinkedList(), bArr, iArr);
            while (((InterfaceC07098m) linkedList.getLast()).A9p()) {
                Arrays.fill(iArr, 0);
                linkedList.add(this.A02.A5Z(bArr, iArr));
                listA01 = A01(listA01, bArr, iArr);
            }
            Iterator<JSONObject> it = listA01.iterator();
            while (it.hasNext()) {
                JSONObject next = it.next();
                try {
                    String string = next.getString(A00(423, 2, 0));
                    try {
                        if (set.contains(string)) {
                            int i12 = next.getInt(strA00) + 1;
                            if (i12 < i10) {
                                try {
                                    next.put(strA00, i12);
                                    this.A01.AFf(A09(next));
                                } catch (C07198w e10) {
                                    e = e10;
                                    if (this.A00.A04().A8n()) {
                                        Log.e(A04, A00(130, 68, 107), e);
                                    }
                                    A05(C06937v.A2K, e);
                                    return i11;
                                } catch (JSONException e11) {
                                    e = e11;
                                    try {
                                        if (this.A00.A04().A8n()) {
                                            Log.e(A04, A00(198, 47, 118), e);
                                        }
                                        A05(C06937v.A2O, e);
                                    } catch (C07198w e12) {
                                        e = e12;
                                        if (this.A00.A04().A8n()) {
                                            Log.e(A04, A00(130, 68, 107), e);
                                        }
                                        A05(C06937v.A2K, e);
                                        return i11;
                                    }
                                }
                            } else {
                                i11++;
                            }
                            it.remove();
                        } else {
                            try {
                                if (set2.contains(string)) {
                                    if (this.A00.A04().A8n()) {
                                        String str = A00(39, 16, 107) + string + A00(0, 11, 2) + next.optString(A00(471, 4, 106), A00(475, 7, 63));
                                    }
                                    it.remove();
                                }
                            } catch (JSONException e13) {
                                e = e13;
                                if (this.A00.A04().A8n()) {
                                    Log.e(A04, A00(198, 47, 118), e);
                                }
                                A05(C06937v.A2O, e);
                            }
                        }
                    } catch (C07198w e14) {
                        e = e14;
                    } catch (JSONException e15) {
                        e = e15;
                    }
                } catch (JSONException e16) {
                    e = e16;
                }
            }
            Iterator<JSONObject> it2 = listA01.iterator();
            while (it2.hasNext()) {
                this.A02.AFf(A09(it2.next()));
            }
            Iterator it3 = linkedList.iterator();
            while (it3.hasNext()) {
                ((InterfaceC07098m) it3.next()).A4x();
            }
        } catch (C07198w e17) {
            e = e17;
        }
        return i11;
    }

    static {
        A03();
        A04 = XM.class.getSimpleName();
    }

    public XM(C1336Xv c1336Xv) throws IOException {
        this.A00 = c1336Xv;
        this.A01 = new XJ(C07078k.A00(A00(11, 28, 31), c1336Xv), new XO(this));
        this.A02 = new XJ(C07078k.A00(A00(322, 37, 102), c1336Xv), new XN(this));
    }

    private List<JSONObject> A01(List<JSONObject> list, byte[] bArr, int[] iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            if (i11 == 0) {
                break;
            }
            try {
                list.add(A02(bArr, i10, i11));
            } catch (JSONException jsone) {
                if (this.A00.A04().A8n()) {
                    Log.e(A04, A00(85, 45, 97), jsone);
                }
                int start = C06937v.A2O;
                A05(start, jsone);
            }
            i10 += i11;
        }
        return list;
    }

    public static JSONObject A02(byte[] bArr, int i10, int i11) throws JSONException {
        return new JSONObject(new String(Arrays.copyOfRange(bArr, i10, i10 + i11)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(int i10, String str) {
        C06947w c06947w = new C06947w(str);
        c06947w.A03(1);
        this.A00.A07().A9L(A00(425, 15, 107), i10, c06947w);
    }

    private void A05(int i10, Throwable th) {
        this.A00.A07().A9K(A00(425, 15, 107), i10, new C06947w(th));
    }

    public static byte[] A07(C7Q c7q, String str, C0934Ia c0934Ia) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(423, 2, 0), str);
            jSONObject.put(A00(466, 5, 3), c0934Ia.A08());
            jSONObject.put(A00(471, 4, 106), c0934Ia.A06().toString());
            jSONObject.put(A00(462, 4, 86), LF.A02(c0934Ia.A04()));
            jSONObject.put(A00(450, 12, 27), LF.A02(c0934Ia.A03()));
            jSONObject.put(A00(440, 10, 116), c0934Ia.A07());
            String strA00 = A00(419, 4, 62);
            JSONObject eventJson = new JSONObject(c0934Ia.A09());
            jSONObject.put(strA00, eventJson);
            jSONObject.put(A00(412, 7, 26), 0);
        } catch (JSONException e10) {
            if (c7q.A04().A8n()) {
                Log.e(A04, A00(294, 28, 12), e10);
            }
        }
        return jSONObject.toString().getBytes();
    }

    public static byte[] A09(JSONObject jSONObject) {
        return jSONObject.toString().getBytes();
    }

    public final int A0A() {
        try {
            return this.A01.A7e();
        } catch (C07198w e10) {
            if (this.A00.A04().A8n()) {
                Log.e(A04, A00(245, 49, 123), e10);
                return 0;
            }
            return 0;
        }
    }

    public final List<JSONObject> A0C(int i10) {
        int totalFetched = 0;
        if (i10 == -1) {
            totalFetched = 1;
            i10 = 30;
        }
        int[] eventSizes = new int[i10];
        byte[] bArr = new byte[i10 * 1000];
        List<JSONObject> linkedList = new LinkedList<>();
        LinkedList linkedList2 = new LinkedList();
        try {
            InterfaceC07098m interfaceC07098mA5Z = this.A01.A5Z(bArr, eventSizes);
            linkedList2.add(interfaceC07098mA5Z);
            int iA5a = interfaceC07098mA5Z.A5a();
            linkedList = A01(linkedList, bArr, eventSizes);
            while (noLimit && (iA5a < i10 || totalFetched != 0)) {
                if (totalFetched == 0) {
                    eventSizes = new int[i10 - iA5a];
                } else {
                    Arrays.fill(eventSizes, 0);
                }
                interfaceC07098mA5Z = this.A01.A5Z(bArr, eventSizes);
                linkedList2.add(interfaceC07098mA5Z);
                linkedList = A01(linkedList, bArr, eventSizes);
            }
            Iterator<JSONObject> it = linkedList.iterator();
            while (noLimit) {
                this.A02.AFf(A09(it.next()));
            }
            Iterator it2 = linkedList2.iterator();
            while (noLimit) {
                ((InterfaceC07098m) it2.next()).A4x();
            }
        } catch (C07198w e10) {
            boolean noLimit = this.A00.A04().A8n();
            if (noLimit) {
                Log.e(A04, A00(359, 53, 44), e10);
            }
            A05(C06937v.A2L, e10);
        }
        return linkedList;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07008c
    public final void A4F() {
        try {
            this.A01.clear();
            this.A02.clear();
        } catch (C07198w e10) {
            if (this.A00.A04().A8n()) {
                Log.e(A04, A00(55, 30, 66), e10);
            }
            A05(C06937v.A2I, e10);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8Z != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC07008c
    public final void AGI(final C0934Ia c0934Ia, final C8Z<String> c8z) {
        Executor executor = LT.A07;
        final InterfaceC07108n<C0934Ia> interfaceC07108n = this.A01;
        final C1336Xv c1336Xv = this.A00;
        LQ.A00(executor, new AsyncTask<Void, Void, String>(c0934Ia, c8z, interfaceC07108n, c1336Xv) { // from class: com.facebook.ads.redexgen.X.8d
            public static byte[] A05;
            public static String[] A06 = {"eZRg0", "9V6E8W", "xj5QhV", "OA95VIvTvwhgOpg1JzD5APn5ld4Fxl09", "KVXKxw3vFVm2nsonOqXLQ2M9", "1wiEXg5TWKy6aTJl", "hr3sX5JQ1zlqribj", "Vt9t5ut5ZgjhHbMTByjzA5y3IT5Rov5"};
            public C07198w A00;
            public final C7Q A01;
            public final C8Z<String> A02;
            public final InterfaceC07108n<C0934Ia> A03;
            public final C0934Ia A04;

            public static String A00(int i10, int i11, int i12) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
                for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
                    bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 55);
                }
                return new String(bArrCopyOfRange);
            }

            public static void A02() {
                A05 = new byte[]{Ascii.SUB, 40, Ascii.US, Ascii.US, 2, Ascii.US, 77, 0, 8, Ascii.RS, Ascii.RS, 12, 10, 8, 77, 14, 12, 3, 3, 2, Ascii.EM, 77, 15, 8, 77, 3, Ascii.CAN, 1, 1, 13, 46, 38, 38, 40, 47, 38, 97, 36, 55, 36, 47, 53, 123, 97, 9, Ascii.RS, Ascii.CAN, 20, 9, Ascii.US, 36, Ascii.US, Ascii.SUB, 15, Ascii.SUB, Ascii.EM, Ascii.SUB, 8, Ascii.RS};
            }

            static {
                A02();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8Z != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8n != com.facebook.ads.internal.eventstorage.record.RecordDatabase<com.facebook.ads.internal.logging.AdEvent> */
            {
                this.A04 = c0934Ia;
                this.A03 = interfaceC07108n;
                this.A02 = c8z;
                this.A01 = c1336Xv;
            }

            private final String A01(Void... voidArr) throws Throwable {
                if (C0979Jw.A02(this)) {
                    return null;
                }
                String string = null;
                try {
                    try {
                        string = UUID.randomUUID().toString();
                        this.A01.A07().A8a(this.A04.A06().toString());
                        if (TextUtils.isEmpty(this.A04.A08())) {
                            return null;
                        }
                        if (this.A01.A04().A8n()) {
                            String str = A00(29, 15, 118) + this.A04.A06().toString() + A00(0, 1, 13) + this.A04.A09().toString();
                        }
                        this.A03.AFf(XM.A07(this.A01, string, this.A04));
                        return string;
                    } catch (C07198w e10) {
                        this.A00 = e10;
                        InterfaceC06927u interfaceC06927uA07 = this.A01.A07();
                        String eventId = A00(44, 15, 76);
                        interfaceC06927uA07.A9K(eventId, C06937v.A2M, new C06947w(e10));
                    }
                } catch (Throwable th) {
                    C0979Jw.A00(th, this);
                    return null;
                }
            }

            private final void A03(String str) throws Throwable {
                if (C0979Jw.A02(this)) {
                    return;
                }
                try {
                    C07198w c07198w = this.A00;
                    if (c07198w == null) {
                        this.A02.A02(str);
                    } else {
                        this.A02.A01(0, (String) Preconditions.checkNotNull(c07198w.getMessage(), A00(1, 28, 90)));
                    }
                } catch (Throwable th) {
                    C0979Jw.A00(th, this);
                    String[] strArr = A06;
                    if (strArr[5].length() != strArr[6].length()) {
                        throw new RuntimeException();
                    }
                    A06[1] = "UcJj";
                }
            }

            @Override // android.os.AsyncTask
            public final /* bridge */ /* synthetic */ String doInBackground(Void[] voidArr) throws Throwable {
                if (C0979Jw.A02(this)) {
                    return null;
                }
                try {
                    return A01(voidArr);
                } catch (Throwable th) {
                    C0979Jw.A00(th, this);
                    if (A06[7].length() != 31) {
                        throw new RuntimeException();
                    }
                    A06[1] = "V";
                    return null;
                }
            }

            @Override // android.os.AsyncTask
            public final /* bridge */ /* synthetic */ void onPostExecute(String str) throws Throwable {
                if (C0979Jw.A02(this)) {
                    return;
                }
                try {
                    A03(str);
                } catch (Throwable th) {
                    C0979Jw.A00(th, this);
                }
            }
        }, new Void[0]);
    }
}
