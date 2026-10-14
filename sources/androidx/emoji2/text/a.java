package androidx.emoji2.text;

import com.applovin.exoplayer2.l.ai;
import com.yandex.mobile.ads.impl.da1;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f1770d;

    public /* synthetic */ a(String str, int i10) {
        this.f1769c = i10;
        if (i10 != 1) {
            this.f1770d = str;
        } else {
            this.f1770d = str;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f1769c) {
            case 0:
                Thread thread = new Thread(runnable, this.f1770d);
                thread.setPriority(10);
                return thread;
            case 1:
                return ai.a(this.f1770d, runnable);
            default:
                return da1.a(this.f1770d, runnable);
        }
    }
}
