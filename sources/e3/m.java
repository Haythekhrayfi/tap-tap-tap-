package e3;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class m extends b<InputStream> {
    public m(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // e3.d
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // e3.b
    public void c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // e3.b
    public InputStream f(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}
