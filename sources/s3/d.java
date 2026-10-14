package s3;

import android.util.Log;
import g3.u;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class d implements d3.f<c> {
    @Override // d3.f
    public com.bumptech.glide.load.c a(d3.e eVar) {
        return com.bumptech.glide.load.c.SOURCE;
    }

    @Override // d3.a
    public boolean b(Object obj, File file, d3.e eVar) throws Throwable {
        try {
            b4.a.b(((c) ((u) obj).get()).f35413c.f35423a.f35425a.e().asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e10);
            }
            return false;
        }
    }
}
