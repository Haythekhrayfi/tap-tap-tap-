package d6;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static WeakReference<b0> f28654d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f28655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z f28656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f28657c;

    public b0(SharedPreferences sharedPreferences, Executor executor) {
        this.f28657c = executor;
        this.f28655a = sharedPreferences;
    }

    public synchronized a0 a() {
        String strPeek;
        a0 a0Var;
        z zVar = this.f28656b;
        synchronized (zVar.f28751d) {
            strPeek = zVar.f28751d.peek();
        }
        Pattern pattern = a0.f28649d;
        a0Var = null;
        if (!TextUtils.isEmpty(strPeek)) {
            String[] strArrSplit = strPeek.split("!", -1);
            if (strArrSplit.length == 2) {
                a0Var = new a0(strArrSplit[0], strArrSplit[1]);
            }
        }
        return a0Var;
    }
}
