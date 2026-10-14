package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1268Vc extends DownloadAction.Deserializer {
    public C1268Vc(String str, int i10) {
        super(str, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction.Deserializer
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C1267Vb A01(int i10, DataInputStream dataInputStream) throws IOException {
        Uri uri = Uri.parse(dataInputStream.readUTF());
        boolean z10 = dataInputStream.readBoolean();
        byte[] bArr = new byte[dataInputStream.readInt()];
        dataInputStream.readFully(bArr);
        return new C1267Vb(uri, z10, bArr, dataInputStream.readBoolean() ? dataInputStream.readUTF() : null);
    }
}
