package com.yandex.metrica.impl.ob;

import android.os.FileObserver;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class G7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FileObserver f14069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f14070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final U6 f14071c;

    public G7(FileObserver fileObserver, File file, U6 u10) {
        this.f14069a = fileObserver;
        this.f14070b = file;
        this.f14071c = u10;
    }

    public G7(File file, Um<File> um) {
        this(new T6(file, um), file, new U6());
    }

    public void a() {
        this.f14071c.a(this.f14070b);
        this.f14069a.startWatching();
    }
}
