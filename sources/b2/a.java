package b2;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.f;
import androidx.work.impl.background.systemjob.SystemJobService;
import x1.m;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f3240b = m.e("SystemJobInfoConverter");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentName f3241a;

    /* JADX INFO: renamed from: b2.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0052a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3242a;

        static {
            int[] iArr = new int[f.values().length];
            f3242a = iArr;
            try {
                iArr[f.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3242a[f.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3242a[f.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3242a[f.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3242a[f.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public a(Context context) {
        this.f3241a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
