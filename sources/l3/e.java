package l3;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class e<Model, Data> implements n<Model, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a<Data> f32133a;

    public interface a<Data> {
    }

    public static final class b<Data> implements e3.d<Data> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f32134c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final a<Data> f32135d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Data f32136e;

        public b(String str, a<Data> aVar) {
            this.f32134c = str;
            this.f32135d = aVar;
        }

        @Override // e3.d
        public Class<Data> a() {
            Objects.requireNonNull((c.a) this.f32135d);
            return InputStream.class;
        }

        @Override // e3.d
        public void b() {
            try {
                a<Data> aVar = this.f32135d;
                Data data = this.f32136e;
                Objects.requireNonNull((c.a) aVar);
                ((InputStream) data).close();
            } catch (IOException unused) {
            }
        }

        @Override // e3.d
        public void cancel() {
        }

        @Override // e3.d
        public com.bumptech.glide.load.a d() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [Data, java.lang.Object] */
        @Override // e3.d
        public void e(a3.g gVar, e3.d.a<? super Data> aVar) {
            try {
                ?? r10 = (Data) ((c.a) this.f32135d).a(this.f32134c);
                this.f32136e = r10;
                aVar.f(r10);
            } catch (IllegalArgumentException e10) {
                aVar.c(e10);
            }
        }
    }

    public static final class c<Model> implements o<Model, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a<InputStream> f32137a = new a(this);

        public class a implements a<InputStream> {
            public a(c cVar) {
            }

            public Object a(String str) throws IllegalArgumentException {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, iIndexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // l3.o
        public n<Model, InputStream> a(r rVar) {
            return new e(this.f32137a);
        }
    }

    public e(a<Data> aVar) {
        this.f32133a = aVar;
    }

    @Override // l3.n
    public boolean a(Model model) {
        return model.toString().startsWith("data:image");
    }

    @Override // l3.n
    public n.a<Data> b(Model model, int i10, int i11, d3.e eVar) {
        return new n.a<>(new a4.c(model), new b(model.toString(), this.f32133a));
    }
}
