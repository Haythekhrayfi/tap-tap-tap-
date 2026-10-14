package com.facebook.ads.redexgen.X;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AsyncTaskC1154Qr extends AsyncTask<String, Void, C1155Qs> {
    public static byte[] A05;
    public static String[] A06 = {"iMGBqiSHm2uYyOurEO", "JHkNge3qKUrOixxb", "Efd0ZU7p6XsOViiGEn9FTnCEMV0phXsZ", "Qqux8MYyckh5CceEy", "ksejtLtP", "6qwv67", "yXEFufBpuo", "JuPO8KFa"};
    public static final String A07;
    public static final Set<String> A08;
    public C7Q A00;
    public QW A01;
    public InterfaceC1153Qq A02;
    public Map<String, String> A03;
    public Map<String, String> A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final C1155Qs A00(String... strArr) throws Throwable {
        if (C0979Jw.A02(this)) {
            return null;
        }
        try {
            String str = strArr[0];
            if (!TextUtils.isEmpty(str) && !A08.contains(str)) {
                String strA02 = A02(str);
                Map<String, String> map = this.A03;
                if (map != null && !map.isEmpty()) {
                    for (Map.Entry<String, String> entry : this.A03.entrySet()) {
                        strA02 = A03(strA02, entry.getKey(), entry.getValue());
                    }
                }
                int i10 = 1;
                while (true) {
                    int i11 = i10 + 1;
                    if (i10 > 2) {
                        return null;
                    }
                    if (A06(strA02)) {
                        return new C1155Qs(this.A01);
                    }
                    i10 = i11;
                }
            }
            return null;
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
            return null;
        }
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 90);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{48, 0, 3, 57, 33, 22, 22, 11, 22, 68, 11, 20, 1, 10, 13, 10, 3, 68, 17, 22, 8, 94, 68, 122, 117, 122, 119, 116, 124, 44, 55, 46, 46};
    }

    static {
        A04();
        A07 = AsyncTaskC1154Qr.class.getSimpleName();
        HashSet hashSet = new HashSet();
        A08 = hashSet;
        hashSet.add(A01(0, 1, 73));
        hashSet.add(A01(29, 4, 24));
    }

    public AsyncTaskC1154Qr(C7Q c7q) {
        this(c7q, null, null);
    }

    public AsyncTaskC1154Qr(C7Q c7q, Map<String, String> extraData) {
        this(c7q, extraData, null);
    }

    public AsyncTaskC1154Qr(C7Q c7q, Map<String, String> extraData, Map<String, String> postData) {
        this.A00 = c7q;
        this.A03 = extraData != null ? new HashMap(extraData) : null;
        this.A04 = postData != null ? new HashMap(postData) : null;
    }

    private String A02(String str) {
        try {
            return A03(str, A01(23, 6, 65), C1000Kt.A01(this.A00.A03().A5v()));
        } catch (Exception unused) {
            return str;
        }
    }

    private String A03(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return str;
        }
        String strA01 = A01(3, 1, 92);
        if (str.contains(strA01)) {
            strA01 = A01(1, 1, 124);
        }
        StringBuilder sbAppend = new StringBuilder().append(str).append(strA01).append(str2);
        String prepend = A01(2, 1, 100);
        StringBuilder sbAppend2 = sbAppend.append(prepend);
        String prepend2 = URLEncoder.encode(str3);
        return sbAppend2.append(prepend2).toString();
    }

    private final void A05(C1155Qs response) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            InterfaceC1153Qq interfaceC1153Qq = this.A02;
            if (interfaceC1153Qq != null) {
                interfaceC1153Qq.ADr(response);
            }
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    private boolean A06(String str) {
        QW qwADd;
        QX qxA00 = C1152Qp.A00(this.A00);
        try {
            Map<String, String> map = this.A04;
            if (map == null || map.size() == 0) {
                qwADd = qxA00.ADd(str, new C1148Ql());
            } else {
                C1148Ql params = new C1148Ql();
                params.A05(this.A04);
                qwADd = qxA00.ADe(str, params.A08());
            }
            this.A01 = qwADd;
        } catch (Exception e10) {
            Log.e(A07, A01(4, 19, 62) + str, e10);
        }
        QW qw = this.A01;
        String[] strArr = A06;
        if (strArr[4].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A06[2] = "iiLT70HajwBiOF9fGWlLisdNhF1wiwwV";
        return qw != null && qw.A7u() == 200;
    }

    public final void A07(InterfaceC1153Qq interfaceC1153Qq) {
        this.A02 = interfaceC1153Qq;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ C1155Qs doInBackground(String[] strArr) throws Throwable {
        if (C0979Jw.A02(this)) {
            return null;
        }
        try {
            return A00(strArr);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        InterfaceC1153Qq interfaceC1153Qq = this.A02;
        if (interfaceC1153Qq != null) {
            interfaceC1153Qq.ADp();
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(C1155Qs c1155Qs) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A05(c1155Qs);
        } catch (Throwable th) {
            if (A06[3].length() != 17) {
                throw new RuntimeException();
            }
            A06[2] = "KahWFkeddZk466vYoInqTxrEqXEaISmf";
            C0979Jw.A00(th, this);
        }
    }
}
