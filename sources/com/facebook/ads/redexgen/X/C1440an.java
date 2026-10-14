package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.an, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1440an implements C0S {
    public static byte[] A08;
    public static String[] A09 = {"nHMpSWMsnsV7ze4k7TMdpo8w7eAhh5yl", "NZIGXtqvLJqJvnsqDFZQPtZx", "Ad1TvQCscaWcF7stMWLl9lRlqQAvL", "Ujq4dS9mEeqxvShJwD8UISSMYbM", "6D9", "oL3lqgBhSNj2gXyheQdgS3kbnnn96fNg", "3X2AVVUyUAfxSvaFg1Rh03BQkiDduKF9", "x5OfLFoNyht1tsSSgvPC5bYcCNR"};
    public final C1438al A00;
    public final AtomicReference<String> A06 = new AtomicReference<>();
    public final AtomicReference<String> A05 = new AtomicReference<>();
    public final AtomicReference<String> A04 = new AtomicReference<>();
    public final AtomicReference<EnumC05070d> A07 = new AtomicReference<>();
    public final AtomicInteger A02 = new AtomicInteger(-1);
    public final UUID A01 = UUID.randomUUID();
    public final AtomicInteger A03 = new AtomicInteger(1);

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 95);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{5, 22, 13, 13, 6, 15, 60, 109, 126, 101, 101, 110, 103, 84, 120, 110, 122};
        String[] strArr = A09;
        if (strArr[7].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        A09[2] = "yQ17NavN7ZSoq7zHySEgN4tR7loqT";
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final void A03(JSONObject jSONObject) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            try {
                jSONObject.put(A00(7, 10, 84), this.A03.getAndIncrement());
            } catch (Throwable th) {
                C0979Jw.A00(th, this);
                return;
            }
        } catch (JSONException unused) {
        }
        C0Y.A0E.A04(this.A01).A02(jSONObject);
        String str = this.A06.get();
        if (!TextUtils.isEmpty(str)) {
            C0Y.A0S.A04(str).A02(jSONObject);
        }
        String str2 = this.A05.get();
        if (!TextUtils.isEmpty(str2)) {
            C0Y.A0R.A04(str2).A02(jSONObject);
        }
        String str3 = this.A04.get();
        if (!TextUtils.isEmpty(str3)) {
            C0Y.A0Q.A04(str3).A02(jSONObject);
        }
        EnumC05070d enumC05070d = this.A07.get();
        if (enumC05070d != null) {
            C0Y.A0D.A04(enumC05070d).A02(jSONObject);
        }
        int i10 = this.A02.get();
        if (i10 != -1) {
            C0Y.A0F.A04(Integer.valueOf(i10)).A02(jSONObject);
        }
    }

    static {
        A01();
    }

    public C1440an(C1438al c1438al) {
        this.A00 = c1438al;
    }

    private void A02(int i10, String str) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A00(0, 7, 60) + C0Y.A0P.getName(), str);
            } catch (JSONException unused) {
            }
            A03(jSONObject);
            this.A00.A00().A9Y(i10, jSONObject);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    public final void A04(C0U type, C0X... params) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (C0X c0x : params) {
                c0x.A02(jSONObject);
            }
            A03(jSONObject);
            this.A00.A00().A9M(type, jSONObject);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2X(String str, int reason) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0X, C0Y.A0I.A04(Integer.valueOf(reason)));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2Y(String objectHash) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0Y, C0Y.A0M.A04(objectHash));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2Z(String objectHash) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0Z, C0Y.A0M.A04(objectHash));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2a(String objectHash) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0a, C0Y.A0M.A04(objectHash));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2b(String objectHash) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0b, C0Y.A0M.A04(objectHash));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2c(String objectHash) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0c, C0Y.A0M.A04(objectHash));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2d(String objectHash) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0d, C0Y.A0M.A04(objectHash));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2e() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0o, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2f() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A11, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2g(boolean listenerSet) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0f, C0Y.A01.A04(Boolean.valueOf(listenerSet)));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2h(long loadTimeMs, int errorCode, String errorMessage) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A13, C0Y.A0G.A04(Integer.valueOf(errorCode)), C0Y.A0N.A04(errorMessage), C0Y.A0L.A04(Long.valueOf(loadTimeMs)));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2i() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A15, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2j() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A14, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2k() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A16, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2l(long loadTimeMs) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A17, C0Y.A0L.A04(Long.valueOf(loadTimeMs)));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2m(C0Q reason) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2C, C0Y.A00.A04(reason));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2n(String placementType, String placementId) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A05.set(placementType);
            this.A04.set(placementId);
            A04(C0U.A0g, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2o() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0h, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2p() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0i, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2q(long loadTimeMs, int errorCode, String errorMessage, boolean isPublic) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0j, C0Y.A0L.A04(Long.valueOf(loadTimeMs)), C0Y.A0G.A04(Integer.valueOf(errorCode)), C0Y.A0N.A04(errorMessage), C0Y.A09.A04(Boolean.valueOf(isPublic)));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2r(long loadTimeMs) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0k, C0Y.A0L.A04(Long.valueOf(loadTimeMs)));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2s(boolean result) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1E, C0Y.A0C.A04(Boolean.valueOf(result)));
        } catch (Throwable th) {
            String[] strArr = A09;
            if (strArr[7].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            A09[6] = "gK8mXYwR0ckPpFtcTSNh6868pPwacmBZ";
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2t() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1F, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2u(String errorMessage) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1K, C0Y.A0N.A04(errorMessage));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2v() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1L, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2w() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1M, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2x() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1N, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2y(int funnelVideoPauseReason) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1O, C0Y.A0I.A04(Integer.valueOf(funnelVideoPauseReason)));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2z() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1P, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A30() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1S, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A31() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1Q, new C0X[0]);
        } catch (Throwable th) {
            if (A09[6].charAt(19) != 'h') {
                throw new RuntimeException();
            }
            A09[6] = "TXE2cMU86vxtF7wI18ThzZXaU0uTRMLS";
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A32(int reason) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1R, C0Y.A0I.A04(Integer.valueOf(reason)));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A33() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1T, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A34(String uri) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1U, C0Y.A0P.A04(uri));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A35() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1V, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A36() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1W, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A37() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1X, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A38() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1Y, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A39(int funnelVideoStartReason) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1Z, C0Y.A0I.A04(Integer.valueOf(funnelVideoStartReason)));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A3A() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1a, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A3B(int reason) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1b, C0Y.A0I.A04(Integer.valueOf(reason)));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A3C() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2E, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
            if (A09[4].length() != 3) {
                throw new RuntimeException();
            }
            A09[6] = "VZoNBueTz9dHgRCK2oHhqd2tucTd08Xg";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A3D() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2F, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A3E(C0Q reason) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2B, C0Y.A00.A04(reason));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A3F(int reason) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2D, C0Y.A0J.A04(Integer.valueOf(reason)));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A3G() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2G, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A41(long loadTimeMs) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0m, C0Y.A0L.A04(Long.valueOf(loadTimeMs)));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
            if (A09[0].charAt(15) != 'k') {
                throw new RuntimeException();
            }
            A09[1] = "iGvSb1Hz3BIwYRP6JXvlZVW4";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A42(long loadTimeMs, int chainedAdIndex) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0m, C0Y.A0L.A04(Long.valueOf(loadTimeMs)), C0Y.A0F.A04(Integer.valueOf(chainedAdIndex)));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A43(long loadTimeMs) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0n, C0Y.A0L.A04(Long.valueOf(loadTimeMs)));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A44(long loadTimeMs, int chainedAdIndex) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0n, C0Y.A0L.A04(Long.valueOf(loadTimeMs)), C0Y.A0F.A04(Integer.valueOf(chainedAdIndex)));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A47(int reason) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0R, C0Y.A0I.A04(Integer.valueOf(reason)));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
            if (A09[2].length() != 29) {
                throw new RuntimeException();
            }
            A09[6] = "as8OMIQESYoL9XAyTG1hWJch2Dcqj1Tr";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A48() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0S, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A49() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0T, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4A() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0U, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4B() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0V, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4C() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0W, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4G() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0p, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4l() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0q, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4m() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0u, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4n(boolean isInvalidated) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0l, C0Y.A08.A04(Boolean.valueOf(isInvalidated)));
        } catch (Throwable th) {
            if (A09[1].length() == 19) {
                throw new RuntimeException();
            }
            A09[5] = "sws4bQbg9GprWoTPEe05ZlT1gMn94mHS";
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4o(int errorCode, String errorMessage) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0v, C0Y.A0G.A04(Integer.valueOf(errorCode)), C0Y.A0N.A04(errorMessage));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4p(boolean hasBid) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0t, C0Y.A03.A04(Boolean.valueOf(hasBid)));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4q() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0x, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4r() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0y, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4s() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0z, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4t() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A10, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A59() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1f, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A5A(String message) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1g, C0Y.A0P.A04(message));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A5B() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1h, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A5C() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1i, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A5D() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1j, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A5E(String errorMessage) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1k, C0Y.A0N.A04(errorMessage));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A5F(String errorMessage) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1l, C0Y.A0N.A04(errorMessage));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A5G(String message) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1m, C0Y.A0P.A04(message));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A5H(String errorMessage) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1o, C0Y.A0N.A04(errorMessage));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A5I() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1p, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A5J(String errorMessage) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1q, C0Y.A0N.A04(errorMessage));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A5K(long loadTimeMs) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1r, C0Y.A0L.A04(Long.valueOf(loadTimeMs)));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A5L(String errorMessage) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1s, C0Y.A0N.A04(errorMessage));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A8T() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1t, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A8U(boolean isDisabledByGK) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1u, C0Y.A07.A04(Boolean.valueOf(isDisabledByGK)));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A8V() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1v, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A8W(String error) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1w, C0Y.A0N.A04(error));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A8X() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1x, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A8Y() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1y, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A8Z(String exception) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1z, C0Y.A0O.A04(exception));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A9I(int code, String message) throws Throwable {
        if (C0979Jw.A02(this) || code < 11000 || code > 11099) {
            return;
        }
        try {
            A02(code, message);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A9w(String errorMessage) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A18, C0Y.A0N.A04(errorMessage));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A9x(int reason) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A19, C0Y.A0J.A04(Integer.valueOf(reason)));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
            if (A09[4].length() != 3) {
                throw new RuntimeException();
            }
            A09[1] = "n4mJfQKCjkVGyNTXc44lq1NfZCr";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A9y() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A22, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A9z() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A23, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AA0() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A24, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AA2() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1A, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
            if (A09[5].charAt(28) == 'u') {
                throw new RuntimeException();
            }
            A09[0] = "A3lONLTCXWx4KhpkbRCT5RNlo5C8otzX";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ACz(int actionMode) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1G, C0Y.A0H.A04(Integer.valueOf(actionMode)));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AEB(String errorMessage) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1C, C0Y.A0N.A04(errorMessage));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AEC() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1D, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AF0(int index) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A02.set(index);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AFH(String requestId) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A06.set(requestId);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AFK(EnumC05070d viewType) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A07.set(viewType);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AFx() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1I, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AFy() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1c, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AG2() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2H, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AG3(int code, String message) throws Throwable {
        if (C0979Jw.A02(this) || code < 12000 || code > 12099) {
            return;
        }
        try {
            A02(code, message);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AG4() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2I, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AG5() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2J, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AG6() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2K, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AG7(boolean callIgnored) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2L, C0Y.A02.A04(Boolean.valueOf(callIgnored)));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AG8() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2M, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AG9() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2N, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AGA(int errorCode, String message) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2O, C0Y.A0G.A04(Integer.valueOf(errorCode)), C0Y.A0N.A04(message));
        } catch (Throwable th) {
            if (A09[0].charAt(15) != 'k') {
                throw new RuntimeException();
            }
            A09[2] = "2PKYVe8Qgwv7j3CDJ6bxblARvZgyh";
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AGB(boolean hasWebview) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2P, C0Y.A06.A04(Boolean.valueOf(hasWebview)));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AGC() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2Q, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AGD(String error) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2R, C0Y.A0N.A04(error));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AGE(int i10, String error) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2S, C0Y.A0N.A04(error));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
            if (A09[6].charAt(19) != 'h') {
                throw new RuntimeException();
            }
            String[] strArr = A09;
            strArr[7] = "5qwGvT3tjlGxlYjcZrXYRuOycIv";
            strArr[3] = "UEyDz1QZjBltnQnS2IeC3S3ns7y";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AGF() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2T, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AGG(int visibility) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2U, C0Y.A0K.A04(Integer.valueOf(visibility)));
        } catch (Throwable th) {
            String[] strArr = A09;
            if (strArr[7].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            A09[2] = "bm6dbMytZvpqzg8D3QKVLEJHQj3Ec";
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AGL(String errorMessage) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1d, C0Y.A0N.A04(errorMessage));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AGM(String errorMessage) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1e, C0Y.A0N.A04(errorMessage));
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
            if (A09[1].length() == 19) {
                throw new RuntimeException();
            }
            A09[5] = "ivuB5Sydf2jbsPKu7So7nbx7xRGWOHbH";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final String getId() throws Throwable {
        if (C0979Jw.A02(this)) {
            return null;
        }
        try {
            return this.A01.toString();
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
            return null;
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void unregisterView() throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1H, new C0X[0]);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
