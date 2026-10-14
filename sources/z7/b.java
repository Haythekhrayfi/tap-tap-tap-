package z7;

import android.graphics.Bitmap;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f45158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f45159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f45160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f45161d;

    public b(Bitmap bitmap, Uri uri, a aVar) {
        this(bitmap, null, uri, aVar);
    }

    public b(Bitmap bitmap, byte[] bArr, Uri uri, a aVar) {
        this.f45158a = bitmap;
        this.f45159b = uri;
        this.f45160c = bArr;
        this.f45161d = aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f45158a.equals(bVar.f45158a) || this.f45161d != bVar.f45161d) {
            return false;
        }
        Uri uri = bVar.f45159b;
        Uri uri2 = this.f45159b;
        if (uri2 != null) {
            return uri2.equals(uri);
        }
        return uri == null;
    }

    public int hashCode() {
        int iHashCode = (this.f45161d.hashCode() + (this.f45158a.hashCode() * 31)) * 31;
        Uri uri = this.f45159b;
        return iHashCode + (uri != null ? uri.hashCode() : 0);
    }
}
