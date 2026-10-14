package l3;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class f<Data> implements n<File, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d<Data> f32138a;

    public static class a<Data> implements o<File, Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d<Data> f32139a;

        public a(d<Data> dVar) {
            this.f32139a = dVar;
        }

        @Override // l3.o
        public final n<File, Data> a(r rVar) {
            return new f(this.f32139a);
        }
    }

    public static class b extends a<ParcelFileDescriptor> {

        public class a implements d<ParcelFileDescriptor> {
            @Override // l3.f.d
            public Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            @Override // l3.f.d
            public ParcelFileDescriptor b(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }

            @Override // l3.f.d
            public void c(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }
        }

        public b() {
            super(new a());
        }
    }

    public static final class c<Data> implements e3.d<Data> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final File f32140c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final d<Data> f32141d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Data f32142e;

        public c(File file, d<Data> dVar) {
            this.f32140c = file;
            this.f32141d = dVar;
        }

        @Override // e3.d
        public Class<Data> a() {
            return this.f32141d.a();
        }

        @Override // e3.d
        public void b() {
            Data data = this.f32142e;
            if (data != null) {
                try {
                    this.f32141d.c(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // e3.d
        public void cancel() {
        }

        @Override // e3.d
        public com.bumptech.glide.load.a d() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [Data, java.lang.Object] */
        @Override // e3.d
        public void e(a3.g gVar, e3.d.a<? super Data> aVar) {
            try {
                Data dataB = this.f32141d.b(this.f32140c);
                this.f32142e = dataB;
                aVar.f(dataB);
            } catch (FileNotFoundException e10) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e10);
                }
                aVar.c(e10);
            }
        }
    }

    public interface d<Data> {
        Class<Data> a();

        Data b(File file) throws FileNotFoundException;

        void c(Data data) throws IOException;
    }

    public static class e extends a<InputStream> {

        public class a implements d<InputStream> {
            @Override // l3.f.d
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // l3.f.d
            public InputStream b(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }

            @Override // l3.f.d
            public void c(InputStream inputStream) throws IOException {
                inputStream.close();
            }
        }

        public e() {
            super(new a());
        }
    }

    public f(d<Data> dVar) {
        this.f32138a = dVar;
    }

    @Override // l3.n
    public /* bridge */ /* synthetic */ boolean a(File file) {
        return true;
    }

    @Override // l3.n
    public n.a b(File file, int i10, int i11, d3.e eVar) {
        File file2 = file;
        return new n.a(new a4.c(file2), new c(file2, this.f32138a));
    }
}
