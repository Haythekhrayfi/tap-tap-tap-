package e3;

import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class b<T> implements d<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AssetManager f28998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public T f28999e;

    public b(AssetManager assetManager, String str) {
        this.f28998d = assetManager;
        this.f28997c = str;
    }

    @Override // e3.d
    public void b() {
        T t10 = this.f28999e;
        if (t10 == null) {
            return;
        }
        try {
            c(t10);
        } catch (IOException unused) {
        }
    }

    public abstract void c(T t10) throws IOException;

    @Override // e3.d
    public void cancel() {
    }

    @Override // e3.d
    public com.bumptech.glide.load.a d() {
        return com.bumptech.glide.load.a.LOCAL;
    }

    @Override // e3.d
    public void e(a3.g gVar, d.a<? super T> aVar) {
        try {
            T tF = f(this.f28998d, this.f28997c);
            this.f28999e = tF;
            aVar.f(tF);
        } catch (IOException e10) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e10);
            }
            aVar.c(e10);
        }
    }

    public abstract T f(AssetManager assetManager, String str) throws IOException;
}
