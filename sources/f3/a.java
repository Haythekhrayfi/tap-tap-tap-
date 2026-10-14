package f3;

import a3.g;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import e3.d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class a implements d<InputStream> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f29215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f29216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InputStream f29217e;

    /* JADX INFO: renamed from: f3.a$a, reason: collision with other inner class name */
    public static class C0255a implements f3.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String[] f29218b = {"_data"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentResolver f29219a;

        public C0255a(ContentResolver contentResolver) {
            this.f29219a = contentResolver;
        }

        @Override // f3.b
        public Cursor a(Uri uri) {
            return this.f29219a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f29218b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    public static class b implements f3.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String[] f29220b = {"_data"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentResolver f29221a;

        public b(ContentResolver contentResolver) {
            this.f29221a = contentResolver;
        }

        @Override // f3.b
        public Cursor a(Uri uri) {
            return this.f29221a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f29220b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    public a(Uri uri, c cVar) {
        this.f29215c = uri;
        this.f29216d = cVar;
    }

    public static a c(Context context, Uri uri, f3.b bVar) {
        return new a(uri, new c(a3.c.b(context).f16f.e(), bVar, a3.c.b(context).f17g, context.getContentResolver()));
    }

    @Override // e3.d
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // e3.d
    public void b() {
        InputStream inputStream = this.f29217e;
        if (inputStream != null) {
            try {
                inputStream.close();
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

    @Override // e3.d
    public void e(g gVar, d.a<? super InputStream> aVar) {
        try {
            InputStream inputStreamF = f();
            this.f29217e = inputStreamF;
            aVar.f(inputStreamF);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e10);
            }
            aVar.c(e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x0023  */
    /* JADX WARN: Code duplicated, block: B:16:0x002d  */
    public final InputStream f() throws FileNotFoundException {
        String string;
        InputStream inputStreamOpenInputStream;
        int iA;
        c cVar = this.f29216d;
        Uri uri = this.f29215c;
        Cursor cursorA = cVar.f29224b.a(uri);
        boolean z10 = false;
        InputStream inputStreamOpenInputStream2 = null;
        if (cursorA != null) {
            try {
                if (cursorA.moveToFirst()) {
                    string = cursorA.getString(0);
                    cursorA.close();
                } else {
                    if (cursorA != null) {
                        cursorA.close();
                    }
                    string = null;
                }
            } catch (Throwable th) {
                cursorA.close();
                throw th;
            }
        } else {
            if (cursorA != null) {
                cursorA.close();
            }
            string = null;
        }
        if (TextUtils.isEmpty(string)) {
            inputStreamOpenInputStream = null;
        } else {
            Objects.requireNonNull(cVar.f29223a);
            File file = new File(string);
            Objects.requireNonNull(cVar.f29223a);
            if (file.exists()) {
                Objects.requireNonNull(cVar.f29223a);
                if (0 < file.length()) {
                    z10 = true;
                }
            }
            if (z10) {
                Uri uriFromFile = Uri.fromFile(file);
                try {
                    inputStreamOpenInputStream = cVar.f29226d.openInputStream(uriFromFile);
                } catch (NullPointerException e10) {
                    throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e10));
                }
            } else {
                inputStreamOpenInputStream = null;
            }
        }
        if (inputStreamOpenInputStream != null) {
            c cVar2 = this.f29216d;
            Uri uri2 = this.f29215c;
            Objects.requireNonNull(cVar2);
            try {
                try {
                    inputStreamOpenInputStream2 = cVar2.f29226d.openInputStream(uri2);
                    iA = com.bumptech.glide.load.d.a(cVar2.f29227e, inputStreamOpenInputStream2, cVar2.f29225c);
                    if (inputStreamOpenInputStream2 != null) {
                        try {
                            inputStreamOpenInputStream2.close();
                        } catch (IOException unused) {
                        }
                    }
                } catch (Throwable th2) {
                    if (0 != 0) {
                        try {
                            inputStreamOpenInputStream2.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th2;
                }
            } catch (IOException | NullPointerException e11) {
                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                    Log.d("ThumbStreamOpener", "Failed to open uri: " + uri2, e11);
                }
                if (inputStreamOpenInputStream2 != null) {
                    try {
                        inputStreamOpenInputStream2.close();
                    } catch (IOException unused3) {
                    }
                }
                iA = -1;
            }
        } else {
            iA = -1;
        }
        return iA != -1 ? new e3.g(inputStreamOpenInputStream, iA) : inputStreamOpenInputStream;
    }
}
