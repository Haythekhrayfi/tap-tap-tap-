package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public class f implements Closeable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final URL f12641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Future<?> f12642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Task<Bitmap> f12643e;

    public f(URL url) {
        this.f12641c = url;
    }

    public Bitmap a() throws IOException {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            StringBuilder sbA = defpackage.a.a("Starting download of: ");
            sbA.append(this.f12641c);
            Log.i("FirebaseMessaging", sbA.toString());
        }
        URLConnection uRLConnectionOpenConnection = this.f12641c.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            byte[] bArrB = d.b(new d.a(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                StringBuilder sbA2 = defpackage.a.a("Downloaded ");
                sbA2.append(bArrB.length);
                sbA2.append(" bytes from ");
                sbA2.append(this.f12641c);
                Log.v("FirebaseMessaging", sbA2.toString());
            }
            if (bArrB.length > 1048576) {
                throw new IOException("Image exceeds max size of 1048576");
            }
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrB, 0, bArrB.length);
            if (bitmapDecodeByteArray == null) {
                StringBuilder sbA3 = defpackage.a.a("Failed to decode image: ");
                sbA3.append(this.f12641c);
                throw new IOException(sbA3.toString());
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                StringBuilder sbA4 = defpackage.a.a("Successfully downloaded image: ");
                sbA4.append(this.f12641c);
                Log.d("FirebaseMessaging", sbA4.toString());
            }
            return bitmapDecodeByteArray;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f12642d.cancel(true);
    }
}
