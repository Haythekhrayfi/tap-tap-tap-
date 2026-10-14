package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class JD {
    public final AdErrorType A00;
    public final String A01;

    public JD(int i10, String str) {
        this(AdErrorType.adErrorTypeFromCode(i10), str);
    }

    public JD(AdErrorType adErrorType, String str) {
        str = TextUtils.isEmpty(str) ? adErrorType.getDefaultErrorMessage() : str;
        this.A00 = adErrorType;
        this.A01 = str;
    }

    public static JD A00(AdErrorType adErrorType) {
        return new JD(adErrorType, (String) null);
    }

    public static JD A01(AdErrorType adErrorType, String str) {
        return new JD(adErrorType, str);
    }

    public static JD A02(JE je2) {
        return new JD(je2.A00(), je2.A01());
    }

    public final AdErrorType A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }
}
