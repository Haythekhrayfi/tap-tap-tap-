package d0;

import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class g implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f28520d;

    public g(Object obj, Object obj2) {
        this.f28519c = obj;
        this.f28520d = obj2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Method method = h.f28525d;
            if (method != null) {
                method.invoke(this.f28519c, this.f28520d, Boolean.FALSE, "AppCompat recreation");
            } else {
                h.f28526e.invoke(this.f28519c, this.f28520d, Boolean.FALSE);
            }
        } catch (RuntimeException e10) {
            if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                throw e10;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}
