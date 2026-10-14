package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class s<E> extends p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Activity f2108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f2109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f2110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FragmentManager f2111f;

    public s(Activity activity, Context context, Handler handler, int i10) {
        this.f2111f = new x();
        this.f2108c = activity;
        androidx.activity.i.f(context, "context == null");
        this.f2109d = context;
        androidx.activity.i.f(handler, "handler == null");
        this.f2110e = handler;
    }

    public s(Context context, Handler handler, int i10) {
        this(context instanceof Activity ? (Activity) context : null, context, handler, i10);
    }

    @Override // androidx.fragment.app.p
    public View b(int i10) {
        return null;
    }

    @Override // androidx.fragment.app.p
    public boolean c() {
        return true;
    }

    public void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public abstract E e();

    public LayoutInflater f() {
        return LayoutInflater.from(this.f2109d);
    }

    public boolean g(String str) {
        return false;
    }

    public void h() {
    }
}
