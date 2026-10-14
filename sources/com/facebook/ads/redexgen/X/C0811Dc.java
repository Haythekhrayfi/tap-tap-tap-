package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0811Dc {
    public static byte[] A02;
    public final HI A00;
    public final File A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-101, -76, -71, -69, -74, -74, -75, -72, -70, -85, -86, 102, -89, -87, -70, -81, -75, -76, 102, -84, -81, -78, -85, 102, -68, -85, -72, -71, -81, -75, -76, -128, 102};
    }

    public C0811Dc(File file) {
        this.A01 = file;
        this.A00 = new HI(file);
    }

    public final void A02(DownloadAction... downloadActionArr) throws IOException {
        DataOutputStream dataOutputStream = null;
        try {
            dataOutputStream = new DataOutputStream(this.A00.A03());
            dataOutputStream.writeInt(0);
            dataOutputStream.writeInt(downloadActionArr.length);
            for (DownloadAction downloadAction : downloadActionArr) {
                DownloadAction.A03(downloadAction, dataOutputStream);
            }
            this.A00.A06(dataOutputStream);
            C0930Hv.A0X(null);
        } catch (Throwable th) {
            C0930Hv.A0X(dataOutputStream);
            throw th;
        }
    }

    public final DownloadAction[] A03(DownloadAction.Deserializer... deserializerArr) throws IOException {
        if (!this.A01.exists()) {
            return new DownloadAction[0];
        }
        try {
            InputStream inputStreamA04 = this.A00.A04();
            DataInputStream dataInputStream = new DataInputStream(inputStreamA04);
            int i10 = dataInputStream.readInt();
            if (i10 <= 0) {
                int actionCount = dataInputStream.readInt();
                DownloadAction[] downloadActionArr = new DownloadAction[actionCount];
                for (int i11 = 0; i11 < actionCount; i11++) {
                    downloadActionArr[i11] = DownloadAction.A00(deserializerArr, dataInputStream);
                }
                C0930Hv.A0X(inputStreamA04);
                return downloadActionArr;
            }
            throw new IOException(A00(0, 33, 26) + i10);
        } catch (Throwable th) {
            C0930Hv.A0X(null);
            throw th;
        }
    }
}
