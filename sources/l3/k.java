package l3;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes.dex */
public final class k implements n<Uri, File> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f32156a;

    public static final class a implements o<Uri, File> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f32157a;

        public a(Context context) {
            this.f32157a = context;
        }

        @Override // l3.o
        public n<Uri, File> a(r rVar) {
            return new k(this.f32157a);
        }
    }

    public static class b implements e3.d<File> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String[] f32158e = {"_data"};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Context f32159c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Uri f32160d;

        public b(Context context, Uri uri) {
            this.f32159c = context;
            this.f32160d = uri;
        }

        @Override // e3.d
        public Class<File> a() {
            return File.class;
        }

        @Override // e3.d
        public void b() {
        }

        @Override // e3.d
        public void cancel() {
        }

        @Override // e3.d
        public com.bumptech.glide.load.a d() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        @Override // e3.d
        public void e(a3.g gVar, e3.d.a<? super File> aVar) {
            Cursor cursorQuery = this.f32159c.getContentResolver().query(this.f32160d, f32158e, null, null, null);
            String string = null;
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                    cursorQuery.close();
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            if (!TextUtils.isEmpty(string)) {
                aVar.f(new File(string));
                return;
            }
            StringBuilder sbA = defpackage.a.a("Failed to find file path for: ");
            sbA.append(this.f32160d);
            aVar.c(new FileNotFoundException(sbA.toString()));
        }
    }

    public k(Context context) {
        this.f32156a = context;
    }

    @Override // l3.n
    public boolean a(Uri uri) {
        return u1.a.j(uri);
    }

    @Override // l3.n
    public n.a<File> b(Uri uri, int i10, int i11, d3.e eVar) {
        Uri uri2 = uri;
        return new n.a<>(new a4.c(uri2), new b(this.f32156a, uri2));
    }
}
