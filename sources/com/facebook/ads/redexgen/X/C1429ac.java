package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ac, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1429ac extends K4 {
    public static byte[] A02;
    public static String[] A03 = {"CdCLIQRd", "Gozok8EGiq89CC7S8QZsNr", "pl5lQHAXyLio1ost", "M44cRouQCRL7K0vypo2P04DU", "Y2GzUIW8g3L", "Bs9wehYqNd3BdGUVOwkaAN", "ajmsB695tQiR2xtfKUGvlSwazulcZzs7", "Sy9bhDNhoUd7kDt0yrvFBLns12VVbk64"};
    public final /* synthetic */ C05240v A00;
    public final /* synthetic */ String A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = (bArrCopyOfRange[i13] - i12) - 47;
            if (A03[6].charAt(27) != 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[5] = "CuQnTMvQt2iEBPylhK7T15";
            strArr[1] = "FSZFy24WJ9CShZHmahty6u";
            bArrCopyOfRange[i13] = (byte) i14;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        if (A03[6].charAt(27) != 'c') {
            throw new RuntimeException();
        }
        A03[3] = "LuOw";
        A02 = new byte[]{-99, -87, -100, -88, -84, -100, -91, -102, -80, -106, -102, -104, -89, -89, -96, -91, -98};
    }

    static {
        A02();
    }

    public C1429ac(C05240v c05240v, String str) {
        this.A00 = c05240v;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.X.K4
    public final void A06() {
        try {
            this.A00.A06.await();
            synchronized (this.A00.A02) {
                try {
                    Iterator<String> itKeys = this.A00.A02.A05().keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (this.A00.A0J(this.A01)) {
                            C05240v c05240v = this.A00;
                            c05240v.A0E((C1Q) c05240v.A02.A05().get(next), next, next.equals(this.A01));
                        }
                    }
                    this.A00.A02.A06();
                    this.A00.A08();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (InterruptedException e10) {
            InterfaceC06927u interfaceC06927uA07 = this.A00.A03.A07();
            String encryptedId = A00(0, 17, 8);
            interfaceC06927uA07.A9K(encryptedId, C06937v.A1B, new C06947w(e10));
        } catch (JSONException e11) {
            this.A00.A0M();
            InterfaceC06927u interfaceC06927uA08 = this.A00.A03.A07();
            String encryptedId2 = A00(0, 17, 8);
            interfaceC06927uA08.A9K(encryptedId2, C06937v.A1A, new C06947w(e11));
        }
    }
}
