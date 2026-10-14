package l3;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class s<Data> implements n<Integer, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n<Uri, Data> f32191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f32192b;

    public static final class a implements o<Integer, AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Resources f32193a;

        public a(Resources resources) {
            this.f32193a = resources;
        }

        @Override // l3.o
        public n<Integer, AssetFileDescriptor> a(r rVar) {
            return new s(this.f32193a, rVar.b(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements o<Integer, ParcelFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Resources f32194a;

        public b(Resources resources) {
            this.f32194a = resources;
        }

        @Override // l3.o
        public n<Integer, ParcelFileDescriptor> a(r rVar) {
            return new s(this.f32194a, rVar.b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class c implements o<Integer, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Resources f32195a;

        public c(Resources resources) {
            this.f32195a = resources;
        }

        @Override // l3.o
        public n<Integer, InputStream> a(r rVar) {
            return new s(this.f32195a, rVar.b(Uri.class, InputStream.class));
        }
    }

    public static class d implements o<Integer, Uri> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Resources f32196a;

        public d(Resources resources) {
            this.f32196a = resources;
        }

        @Override // l3.o
        public n<Integer, Uri> a(r rVar) {
            return new s(this.f32196a, v.f32199a);
        }
    }

    public s(Resources resources, n<Uri, Data> nVar) {
        this.f32192b = resources;
        this.f32191a = nVar;
    }

    @Override // l3.n
    public /* bridge */ /* synthetic */ boolean a(Integer num) {
        return true;
    }

    @Override // l3.n
    public n.a b(Integer num, int i10, int i11, d3.e eVar) {
        Uri uri;
        Integer num2 = num;
        try {
            uri = Uri.parse("android.resource://" + this.f32192b.getResourcePackageName(num2.intValue()) + '/' + this.f32192b.getResourceTypeName(num2.intValue()) + '/' + this.f32192b.getResourceEntryName(num2.intValue()));
        } catch (Resources.NotFoundException e10) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num2, e10);
            }
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.f32191a.b(uri, i10, i11, eVar);
    }
}
