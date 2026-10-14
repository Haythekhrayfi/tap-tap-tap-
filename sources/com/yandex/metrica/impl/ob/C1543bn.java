package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.bn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1543bn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f15854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final L0 f15856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private File f15857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private FileLock f15858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private RandomAccessFile f15859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private FileChannel f15860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f15861h;

    public C1543bn(Context context, String str) {
        this(context, str, new L0());
    }

    public C1543bn(Context context, String str, L0 l10) {
        this.f15861h = 0;
        this.f15854a = context;
        this.f15855b = i.f.a(str, ".lock");
        this.f15856c = l10;
    }

    public synchronized void a() throws Throwable {
        File fileB = this.f15856c.b(this.f15854a.getFilesDir(), this.f15855b);
        this.f15857d = fileB;
        if (fileB == null) {
            throw new IllegalStateException("Cannot create lock file");
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(this.f15857d, "rw");
        this.f15859f = randomAccessFile;
        FileChannel channel = randomAccessFile.getChannel();
        this.f15860g = channel;
        if (this.f15861h == 0) {
            this.f15858e = channel.lock();
        }
        this.f15861h++;
    }

    public synchronized void b() {
        File file = this.f15857d;
        if (file != null) {
            file.getAbsolutePath();
        }
        int i10 = this.f15861h - 1;
        this.f15861h = i10;
        if (i10 == 0) {
            V0.a(this.f15858e);
        }
        U2.a((Closeable) this.f15859f);
        U2.a((Closeable) this.f15860g);
        this.f15859f = null;
        this.f15858e = null;
        this.f15860g = null;
    }

    public synchronized void c() {
        b();
        File file = this.f15857d;
        if (file != null) {
            file.delete();
        }
    }
}
