package l3;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class t implements d3.a<InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h3.b f32197a;

    public t(h3.b bVar) {
        this.f32197a = bVar;
    }

    @Override // d3.a
    public boolean b(InputStream inputStream, File file, d3.e eVar) throws Throwable {
        FileOutputStream fileOutputStream;
        InputStream inputStream2 = inputStream;
        byte[] bArr = (byte[]) this.f32197a.d(65536, byte[].class);
        boolean z10 = false;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                    while (true) {
                        try {
                            int i10 = inputStream2.read(bArr);
                            if (i10 == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, i10);
                        } catch (IOException e10) {
                            e = e10;
                            fileOutputStream2 = fileOutputStream;
                            if (Log.isLoggable("StreamEncoder", 3)) {
                                Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                            }
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                            this.f32197a.put(bArr);
                            return z10;
                        } catch (Throwable th) {
                            th = th;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused) {
                                }
                            }
                            this.f32197a.put(bArr);
                            throw th;
                        }
                    }
                    fileOutputStream.close();
                    z10 = true;
                    fileOutputStream.close();
                } catch (IOException unused2) {
                }
            } catch (IOException e11) {
                e = e11;
            }
            this.f32197a.put(bArr);
            return z10;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = fileOutputStream2;
        }
    }
}
