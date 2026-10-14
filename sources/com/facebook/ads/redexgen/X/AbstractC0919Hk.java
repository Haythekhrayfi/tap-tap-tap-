package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.util.Arrays;
import okhttp3.internal.http2.Http2;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC0919Hk implements InterfaceC1149Qm {
    public static byte[] A01;
    public static String[] A02 = {"rzjVC70O4bd9DzHjbWZgWXgUSmVLYSU4", "d5zo8W4K", "Hv98ROwnq0amXTKQof8zpMynpU6nXYzw", "m02wtPmJvn7xvEVIhgILVdsvYaekd1y1", "NwXA6aDXoJPzKJxJycW", "lujFiBBwg3lGF", "5iNla1hEs57TMoL8Mlh58N0Q757SBHKY", "iek06qmxI9TIJY"};
    public final InterfaceC1150Qn A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 14);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{89, 123, 123, 125, -120, -116, 69, 91, -128, 121, -118, -117, 125, -116, -98, -67, -49, -59, -65, -82, -63, -51, -47, -63, -49, -48, -92, -67, -54, -64, -56, -63, -50, -118, -53, -54, -95, -50, -50, -53, -50, -102, -58, -59, -53, -68, -59, -53, -124, -85, -48, -57, -68, -71, -72, -86, -111, -100};
    }

    static {
        A01();
    }

    public AbstractC0919Hk(InterfaceC1150Qn interfaceC1150Qn) {
        this.A00 = interfaceC1150Qn;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1149Qm
    public final boolean AB9(C1147Qk c1147Qk) {
        QW qwA00 = c1147Qk.A00();
        if (this.A00.A8w()) {
            Log.e(AbstractC0919Hk.class.getSimpleName(), A00(14, 27, 78), c1147Qk);
        }
        if (qwA00 != null && qwA00.A7u() > 0) {
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1149Qm
    public final HttpURLConnection ADT(String str, Proxy proxy) throws IOException {
        URL url = new URL(str);
        if (proxy == null) {
            return (HttpURLConnection) url.openConnection();
        }
        return (HttpURLConnection) url.openConnection(proxy);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1149Qm
    public final InputStream ADU(HttpURLConnection httpURLConnection) throws IOException {
        return httpURLConnection.getInputStream();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1149Qm
    public final OutputStream ADV(HttpURLConnection httpURLConnection) throws IOException {
        return httpURLConnection.getOutputStream();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1149Qm
    public final void ADl(HttpURLConnection httpURLConnection, EnumC1145Qi enumC1145Qi, String str) throws IOException {
        httpURLConnection.setRequestMethod(enumC1145Qi.A02());
        httpURLConnection.setDoOutput(enumC1145Qi.A04());
        httpURLConnection.setDoInput(enumC1145Qi.A03());
        if (str != null) {
            httpURLConnection.setRequestProperty(A00(41, 12, 73), str);
        }
        httpURLConnection.setRequestProperty(A00(0, 14, 10), A00(53, 5, 86));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1149Qm
    public final byte[] AE5(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                byteArrayOutputStream.flush();
                byte[] data = byteArrayOutputStream.toByteArray();
                return data;
            }
            if (A02[4].length() != 19) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[2] = "eO7qbggyddGiOQuVn8N8jDULGwym82oB";
            strArr[6] = "iN6CFd4LV6hdOWp44ZZbGtT2nODAuDvC";
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1149Qm
    public final void AGK(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(bArr);
    }
}
