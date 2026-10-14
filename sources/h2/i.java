package h2;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f30505a = x1.m.e("ProcessUtils");

    public static boolean a(Context context, androidx.work.b bVar) {
        String processName;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (Build.VERSION.SDK_INT >= 28) {
            processName = Application.getProcessName();
        } else {
            processName = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, i.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(null, new Object[0]);
                if (!(objInvoke instanceof String)) {
                    int iMyPid = Process.myPid();
                    ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                    if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && !runningAppProcesses.isEmpty()) {
                        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                            if (runningAppProcessInfo.pid == iMyPid) {
                                processName = runningAppProcessInfo.processName;
                                break;
                            }
                        }
                    }
                } else {
                    processName = (String) objInvoke;
                }
            } catch (Throwable th) {
                x1.m.c().a(f30505a, "Unable to check ActivityThread for processName", th);
            }
        }
        return !TextUtils.isEmpty(bVar.f3101g) ? TextUtils.equals(processName, bVar.f3101g) : TextUtils.equals(processName, context.getApplicationInfo().processName);
    }
}
