package e2;

import android.content.Context;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static g f28992e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f28993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f28994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f28995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f28996d;

    public g(Context context, j2.a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f28993a = new a(applicationContext, aVar);
        this.f28994b = new b(applicationContext, aVar);
        this.f28995c = new e(applicationContext, aVar);
        this.f28996d = new f(applicationContext, aVar);
    }

    public static synchronized g a(Context context, j2.a aVar) {
        if (f28992e == null) {
            f28992e = new g(context, aVar);
        }
        return f28992e;
    }

    public g(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView, TextView textView2) {
        this.f28993a = constraintLayout;
        this.f28994b = constraintLayout2;
        this.f28995c = textView;
        this.f28996d = textView2;
    }
}
