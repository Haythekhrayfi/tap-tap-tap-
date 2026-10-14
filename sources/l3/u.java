package l3;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class u<Data> implements n<String, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n<Uri, Data> f32198a;

    public static final class a implements o<String, AssetFileDescriptor> {
        @Override // l3.o
        public n<String, AssetFileDescriptor> a(r rVar) {
            return new u(rVar.b(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements o<String, ParcelFileDescriptor> {
        @Override // l3.o
        public n<String, ParcelFileDescriptor> a(r rVar) {
            return new u(rVar.b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class c implements o<String, InputStream> {
        @Override // l3.o
        public n<String, InputStream> a(r rVar) {
            return new u(rVar.b(Uri.class, InputStream.class));
        }
    }

    public u(n<Uri, Data> nVar) {
        this.f32198a = nVar;
    }

    @Override // l3.n
    public /* bridge */ /* synthetic */ boolean a(String str) {
        return true;
    }

    @Override // l3.n
    public n.a b(String str, int i10, int i11, d3.e eVar) {
        Uri uriFromFile;
        File file;
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            uriFromFile = null;
        } else {
            if (str2.charAt(0) == '/') {
                file = new File(str2);
            } else {
                uriFromFile = Uri.parse(str2);
                if (uriFromFile.getScheme() == null) {
                    file = new File(str2);
                }
            }
            uriFromFile = Uri.fromFile(file);
        }
        if (uriFromFile == null || !this.f32198a.a(uriFromFile)) {
            return null;
        }
        return this.f32198a.b(uriFromFile, i10, i11, eVar);
    }
}
