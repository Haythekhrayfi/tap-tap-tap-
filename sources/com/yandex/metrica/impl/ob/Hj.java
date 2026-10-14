package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.io.File;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class Hj implements Dj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f14155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L0 f14156b;

    public Hj(Context context, L0 l10) {
        this.f14155a = context;
        this.f14156b = l10;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    private boolean b() {
        boolean z10;
        if (U2.a(21)) {
            L0 l10 = this.f14156b;
            Context context = this.f14155a;
            Objects.requireNonNull(l10);
            File noBackupFilesDir = context.getNoBackupFilesDir();
            File file = noBackupFilesDir == null ? null : new File(noBackupFilesDir, "metrica_data.db");
            if (file == null || !file.exists()) {
                z10 = false;
            } else {
                z10 = true;
            }
        } else {
            z10 = false;
        }
        if (z10) {
            return z10;
        }
        L0 l11 = this.f14156b;
        Context context2 = this.f14155a;
        Objects.requireNonNull(l11);
        File databasePath = context2.getDatabasePath("metrica_data.db");
        return databasePath != null && databasePath.exists();
    }

    @Override // com.yandex.metrica.impl.ob.Dj
    public boolean a() {
        return !b();
    }
}
