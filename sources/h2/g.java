package h2;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f30503a = x1.m.e("PackageManagerHelper");

    public static void a(Context context, Class<?> cls, boolean z10) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z10 ? 1 : 2, 1);
            x1.m mVarC = x1.m.c();
            String str = f30503a;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = z10 ? "enabled" : "disabled";
            mVarC.a(str, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e10) {
            x1.m mVarC2 = x1.m.c();
            String str2 = f30503a;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            objArr2[1] = z10 ? "enabled" : "disabled";
            mVarC2.a(str2, String.format("%s could not be %s", objArr2), e10);
        }
    }
}
