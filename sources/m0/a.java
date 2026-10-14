package m0;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public class a implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f33119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Typeface f33120d;

    public a(c cVar, n nVar, Typeface typeface) {
        this.f33119c = nVar;
        this.f33120d = typeface;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f33119c.b(this.f33120d);
    }
}
