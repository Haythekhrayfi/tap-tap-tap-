package o3;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class c implements d3.f<Bitmap> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d3.d<Integer> f33891b = d3.d.a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d3.d<Bitmap.CompressFormat> f33892c = new d3.d<>("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, d3.d.f28633e);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h3.b f33893a;

    @Deprecated
    public c() {
        this.f33893a = null;
    }

    public c(h3.b bVar) {
        this.f33893a = bVar;
    }

    @Override // d3.f
    public com.bumptech.glide.load.c a(d3.e eVar) {
        return com.bumptech.glide.load.c.TRANSFORMED;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0075 A[Catch: all -> 0x00c3, TRY_LEAVE, TryCatch #1 {, blocks: (B:10:0x0026, B:32:0x006b, B:34:0x006f, B:36:0x0075, B:40:0x00bf, B:41:0x00c2), top: B:46:0x0026 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:36:0x0075, please report this as an issue */
    @Override // d3.a
    public boolean b(Object obj, File file, d3.e eVar) {
        FileOutputStream fileOutputStream;
        Bitmap bitmap = (Bitmap) ((g3.u) obj).get();
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) eVar.c(f33892c);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i10 = b4.f.f3299b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) eVar.c(f33891b)).intValue();
        boolean z10 = false;
        OutputStream cVar = null;
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        cVar = this.f33893a != null ? new e3.c(fileOutputStream, this.f33893a) : fileOutputStream;
                        bitmap.compress(compressFormat, iIntValue, cVar);
                        cVar.close();
                        z10 = true;
                    } catch (IOException e10) {
                        e = e10;
                        cVar = fileOutputStream;
                        if (Log.isLoggable("BitmapEncoder", 3)) {
                            Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                        }
                        if (cVar != null) {
                        }
                        if (Log.isLoggable("BitmapEncoder", 2)) {
                            Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + b4.j.d(bitmap) + " in " + b4.f.a(jElapsedRealtimeNanos) + ", options format: " + eVar.c(f33892c) + ", hasAlpha: " + bitmap.hasAlpha());
                        }
                        return z10;
                    } catch (Throwable th) {
                        th = th;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = null;
                }
            } catch (IOException e11) {
                e = e11;
            }
            cVar.close();
        } catch (IOException unused2) {
        }
        if (Log.isLoggable("BitmapEncoder", 2)) {
            Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + b4.j.d(bitmap) + " in " + b4.f.a(jElapsedRealtimeNanos) + ", options format: " + eVar.c(f33892c) + ", hasAlpha: " + bitmap.hasAlpha());
        }
        return z10;
    }
}
