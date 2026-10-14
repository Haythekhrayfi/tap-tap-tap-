package i3;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class f extends d {

    public class a implements d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f31227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f31228b;

        public a(Context context, String str) {
            this.f31227a = context;
            this.f31228b = str;
        }

        @Override // i3.d.c
        public File a() {
            File cacheDir = this.f31227a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f31228b != null ? new File(cacheDir, this.f31228b) : cacheDir;
        }
    }

    public f(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public f(Context context, long j10) {
        this(context, "image_manager_disk_cache", j10);
    }

    public f(Context context, String str, long j10) {
        super(new a(context, str), j10);
    }
}
