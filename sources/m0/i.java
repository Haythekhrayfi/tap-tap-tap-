package m0;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public class i implements Callable<k.a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f33144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f33145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f33146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f33147f;

    public i(String str, Context context, f fVar, int i10) {
        this.f33144c = str;
        this.f33145d = context;
        this.f33146e = fVar;
        this.f33147f = i10;
    }

    @Override // java.util.concurrent.Callable
    public k.a call() throws Exception {
        try {
            return k.a(this.f33144c, this.f33145d, this.f33146e, this.f33147f);
        } catch (Throwable unused) {
            return new k.a(-3);
        }
    }
}
