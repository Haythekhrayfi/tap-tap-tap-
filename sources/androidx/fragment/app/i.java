package androidx.fragment.app;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class i implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2060c;

    public i(b bVar, ArrayList arrayList) {
        this.f2060c = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        f0.c(this.f2060c, 4);
    }
}
