package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.HashMap;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes.dex */
public final class Bn {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final HashMap<String, Bn> f13737g = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f13738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FileLock f13739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FileChannel f13740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final File f13741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RandomAccessFile f13742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Semaphore f13743f = new Semaphore(1, true);

    private Bn(Context context, String str) {
        String strA = i.f.a(str, ".lock");
        this.f13738a = strA;
        File cacheDir = context.getCacheDir();
        File file = cacheDir == null ? null : new File(cacheDir, "appmetrica_locks");
        if (file != null) {
            file.mkdirs();
        }
        this.f13741d = file != null ? new File(file, strA) : null;
    }

    public static synchronized Bn a(Context context, String str) {
        Bn bn;
        HashMap<String, Bn> map = f13737g;
        bn = map.get(str);
        if (bn == null) {
            bn = new Bn(context, str);
            map.put(str, bn);
        }
        return bn;
    }

    public synchronized void a() throws Throwable {
        this.f13743f.acquire();
        if (this.f13741d == null) {
            throw new IllegalStateException("Lock file is null");
        }
        if (this.f13740c == null) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.f13741d, "rw");
            this.f13742e = randomAccessFile;
            this.f13740c = randomAccessFile.getChannel();
        }
        this.f13739b = this.f13740c.lock();
    }

    public synchronized void b() {
        this.f13743f.release();
        if (this.f13743f.availablePermits() > 0) {
            V0.a(this.f13739b);
            U2.a((Closeable) this.f13740c);
            U2.a((Closeable) this.f13742e);
            this.f13740c = null;
            this.f13742e = null;
        }
    }
}
