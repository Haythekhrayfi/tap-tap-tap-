package com.yandex.metrica.impl.ob;

import android.os.FileObserver;
import android.text.TextUtils;
import java.io.File;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class T6 extends FileObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Um<File> f15070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f15071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final L0 f15072c;

    public T6(File file, Um<File> um) {
        this(file, um, new L0());
    }

    public T6(File file, Um<File> um, L0 l10) {
        super(file.getAbsolutePath(), 8);
        this.f15070a = um;
        this.f15071b = file;
        this.f15072c = l10;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i10, String str) {
        if (i10 != 8 || TextUtils.isEmpty(str)) {
            return;
        }
        Um<File> um = this.f15070a;
        L0 l10 = this.f15072c;
        File file = this.f15071b;
        Objects.requireNonNull(l10);
        um.b(new File(file, str));
    }
}
