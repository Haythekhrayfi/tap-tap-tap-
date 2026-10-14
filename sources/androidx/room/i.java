package androidx.room;

import android.content.Context;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

/* JADX INFO: loaded from: classes.dex */
public class i implements n1.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f2881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f2883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2884f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n1.d f2885g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f2886h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2887i;

    public final void a(File file) throws IOException {
        ReadableByteChannel channel;
        if (this.f2882d != null) {
            channel = Channels.newChannel(this.f2881c.getAssets().open(this.f2882d));
        } else {
            if (this.f2883e == null) {
                throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
            }
            channel = new FileInputStream(this.f2883e).getChannel();
        }
        File fileCreateTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f2881c.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        FileChannel channel2 = new FileOutputStream(fileCreateTempFile).getChannel();
        try {
            channel2.transferFrom(channel, 0L, RecyclerView.FOREVER_NS);
            channel2.force(false);
            channel.close();
            channel2.close();
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                StringBuilder sbA = defpackage.a.a("Failed to create directories for ");
                sbA.append(file.getAbsolutePath());
                throw new IOException(sbA.toString());
            }
            if (fileCreateTempFile.renameTo(file)) {
                return;
            }
            StringBuilder sbA2 = defpackage.a.a("Failed to move intermediate file (");
            sbA2.append(fileCreateTempFile.getAbsolutePath());
            sbA2.append(") to destination (");
            sbA2.append(file.getAbsolutePath());
            sbA2.append(").");
            throw new IOException(sbA2.toString());
        } catch (Throwable th) {
            channel.close();
            channel2.close();
            throw th;
        }
    }

    public final void b() {
        String databaseName = this.f2885g.getDatabaseName();
        File databasePath = this.f2881c.getDatabasePath(databaseName);
        a aVar = this.f2886h;
        l1.a aVar2 = new l1.a(databaseName, this.f2881c.getFilesDir(), aVar == null || aVar.f2815j);
        try {
            aVar2.f32099b.lock();
            if (aVar2.f32100c) {
                try {
                    FileChannel channel = new FileOutputStream(aVar2.f32098a).getChannel();
                    aVar2.f32101d = channel;
                    channel.lock();
                } catch (IOException e10) {
                    throw new IllegalStateException("Unable to grab copy lock.", e10);
                }
            }
            if (!databasePath.exists()) {
                try {
                    a(databasePath);
                    aVar2.a();
                    return;
                } catch (IOException e11) {
                    throw new RuntimeException("Unable to copy database file.", e11);
                }
            }
            if (this.f2886h == null) {
                aVar2.a();
                return;
            }
            try {
                int iD = l1.b.d(databasePath);
                int i10 = this.f2884f;
                if (iD == i10) {
                    aVar2.a();
                    return;
                }
                if (this.f2886h.a(iD, i10)) {
                    aVar2.a();
                    return;
                }
                if (this.f2881c.deleteDatabase(databaseName)) {
                    try {
                        a(databasePath);
                    } catch (IOException e12) {
                        Log.w("ROOM", "Unable to copy database file.", e12);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                aVar2.a();
                return;
            } catch (IOException e13) {
                Log.w("ROOM", "Unable to read database version.", e13);
                aVar2.a();
                return;
            }
        } catch (Throwable th) {
            aVar2.a();
            throw th;
        }
        aVar2.a();
        throw th;
    }

    @Override // n1.d, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f2885g.close();
        this.f2887i = false;
    }

    @Override // n1.d
    public String getDatabaseName() {
        return this.f2885g.getDatabaseName();
    }

    @Override // n1.d
    public synchronized n1.b getWritableDatabase() {
        if (!this.f2887i) {
            b();
            this.f2887i = true;
        }
        return this.f2885g.getWritableDatabase();
    }

    @Override // n1.d
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.f2885g.setWriteAheadLoggingEnabled(z10);
    }
}
