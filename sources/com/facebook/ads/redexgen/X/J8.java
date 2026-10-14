package com.facebook.ads.redexgen.X;

import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class J8 implements Runnable {
    public static byte[] A03;
    public final /* synthetic */ C7Q A00;
    public final /* synthetic */ JB A01;
    public final /* synthetic */ String A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 121);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{3, Ascii.ESC, 5, 60, 61, 39, 32, 59, 38, 45, 89, 78, 91, 68, 89, 95, 66, 69, 76, 54, 33, 53, 49, 33, 55, 48, Ascii.ESC, 45, 32};
    }

    public J8(JB jb2, String str, C7Q c7q) {
        this.A01 = jb2;
        this.A02 = str;
        this.A00 = c7q;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        ArrayList<JA> arrayList;
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            C06947w c06947w = new C06947w(A00(0, 3, 52));
            JSONObject jSONObject = new JSONObject();
            JSONArray logArray = new JSONArray();
            jSONObject.put(A00(3, 7, 45), logArray);
            jSONObject.put(A00(19, 10, 61), this.A02);
            synchronized (this.A01.A0D) {
                arrayList = new ArrayList(this.A01.A0D);
                this.A01.A0D.clear();
            }
            for (JA ja2 : arrayList) {
                logArray.put(A00(0, 0, 60) + ja2.A00 + ';' + ja2.A02 + ';' + ja2.A01);
            }
            c06947w.A05(jSONObject);
            c06947w.A03(1);
            this.A00.A07().A9L(A00(10, 9, 82), C06937v.A2Q, c06947w);
        } catch (JSONException unused) {
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }
}
