package com.google.android.play.core.splitinstall.testing;

import android.content.Context;
import com.google.android.play.core.common.LocalTestingException;
import com.google.android.play.core.splitcompat.SplitCompat;
import com.google.android.play.core.splitinstall.p;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class FakeSplitInstallManagerFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static FakeSplitInstallManager f12477a;

    public static FakeSplitInstallManager create(Context context) {
        try {
            File fileB = com.google.android.play.core.splitinstall.k.a(context).b();
            if (fileB == null) {
                throw new LocalTestingException("Failed to retrieve local testing directory path");
            }
            if (fileB.exists()) {
                return create(context, fileB);
            }
            throw new LocalTestingException(String.format("Local testing directory not found: %s", fileB));
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public static synchronized FakeSplitInstallManager create(Context context, File file) {
        FakeSplitInstallManager fakeSplitInstallManager = f12477a;
        if (fakeSplitInstallManager == null) {
            f12477a = createNewInstance(context, file);
        } else if (!fakeSplitInstallManager.a().getAbsolutePath().equals(file.getAbsolutePath())) {
            throw new RuntimeException(String.format("Different module directories used to initialize FakeSplitInstallManager: '%s' and '%s'", f12477a.a().getAbsolutePath(), file.getAbsolutePath()));
        }
        return f12477a;
    }

    public static FakeSplitInstallManager createNewInstance(Context context, File file) {
        SplitCompat.install(context);
        return new FakeSplitInstallManager(context, file, new p(context, context.getPackageName()));
    }
}
