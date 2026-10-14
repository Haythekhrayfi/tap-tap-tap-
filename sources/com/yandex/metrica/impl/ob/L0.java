package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.developer.filepicker.model.DialogConfigs;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class L0 {
    public File a(Context context) {
        File parentFile;
        if (U2.a(24)) {
            parentFile = context.getDataDir();
        } else {
            File filesDir = context.getFilesDir();
            parentFile = filesDir == null ? null : filesDir.getParentFile();
        }
        if (parentFile == null) {
            return null;
        }
        File file = new File(parentFile, "lib");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public File a(Context context, String str) {
        File noBackupFilesDir = U2.a(21) ? context.getNoBackupFilesDir() : context.getFilesDir();
        if (noBackupFilesDir == null) {
            return null;
        }
        return new File(noBackupFilesDir, str);
    }

    public File a(File file, String str) {
        if (file == null) {
            return null;
        }
        return b(file.getAbsoluteFile(), str);
    }

    public File b(Context context) {
        return a(context, "YandexMetricaNativeCrashes");
    }

    public File b(File file, String str) {
        if (file == null) {
            return null;
        }
        return new File(file, str);
    }

    public String b(Context context, String str) {
        File noBackupFilesDir = U2.a(21) ? context.getNoBackupFilesDir() : context.getFilesDir();
        if (noBackupFilesDir == null) {
            return null;
        }
        return noBackupFilesDir.getAbsolutePath() + DialogConfigs.DIRECTORY_SEPERATOR + str;
    }
}
