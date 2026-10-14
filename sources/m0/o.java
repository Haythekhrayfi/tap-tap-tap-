package m0;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public class o implements ThreadFactory {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f33162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f33163d;

    public static class a extends Thread {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f33164c;

        public a(Runnable runnable, String str, int i10) {
            super(runnable, str);
            this.f33164c = i10;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(this.f33164c);
            super.run();
        }
    }

    public o(String str, int i10) {
        this.f33162c = str;
        this.f33163d = i10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new a(runnable, this.f33162c, this.f33163d);
    }
}
