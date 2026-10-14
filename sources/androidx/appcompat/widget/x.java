package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class x implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextView f1393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Typeface f1394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1395e;

    public x(w wVar, TextView textView, Typeface typeface, int i10) {
        this.f1393c = textView;
        this.f1394d = typeface;
        this.f1395e = i10;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1393c.setTypeface(this.f1394d, this.f1395e);
    }
}
