package l1;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Map<String, Lock> f32097e = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f32098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lock f32099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f32100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FileChannel f32101d;

    public a(String str, File file, boolean z10) {
        Lock reentrantLock;
        File file2 = new File(file, i.f.a(str, ".lck"));
        this.f32098a = file2;
        String absolutePath = file2.getAbsolutePath();
        Map<String, Lock> map = f32097e;
        synchronized (map) {
            reentrantLock = (Lock) ((HashMap) map).get(absolutePath);
            if (reentrantLock == null) {
                reentrantLock = new ReentrantLock();
                ((HashMap) map).put(absolutePath, reentrantLock);
            }
        }
        this.f32099b = reentrantLock;
        this.f32100c = z10;
    }

    public void a() {
        FileChannel fileChannel = this.f32101d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f32099b.unlock();
    }
}
