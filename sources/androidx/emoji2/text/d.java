package androidx.emoji2.text;

import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public class d implements e.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<StringBuilder> f1772b = new ThreadLocal<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f1773a;

    public d() {
        TextPaint textPaint = new TextPaint();
        this.f1773a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
