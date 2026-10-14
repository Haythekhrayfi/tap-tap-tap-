package e3;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class l<T> implements d<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f29020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ContentResolver f29021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public T f29022e;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f29021d = contentResolver;
        this.f29020c = uri;
    }

    @Override // e3.d
    public void b() {
        T t10 = this.f29022e;
        if (t10 != null) {
            try {
                c(t10);
            } catch (IOException unused) {
            }
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
    public final void e(a3.g gVar, d.a<? super T> aVar) {
        try {
            T tF = f(this.f29020c, this.f29021d);
            this.f29022e = tF;
            aVar.f(tF);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e10);
            }
            aVar.c(e10);
        }
    }

    public abstract T f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;
}
