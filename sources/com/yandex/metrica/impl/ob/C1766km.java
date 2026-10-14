package com.yandex.metrica.impl.ob;

import android.text.Layout;
import android.text.TextUtils;
import android.widget.TextView;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.km, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1766km {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1592dm f16780a;

    public C1766km(C1592dm c1592dm) {
        this.f16780a = c1592dm;
    }

    public int a(TextView textView) {
        int i10 = 0;
        try {
            if (TextUtils.isEmpty(textView.getText()) || textView.getVisibility() != 0) {
                return 0;
            }
            String string = textView.getText().toString();
            Layout layout = textView.getLayout();
            int length = string.length();
            if (layout != null) {
                try {
                    int lineCount = textView.getLineCount() - 1;
                    TextUtils.TruncateAt ellipsize = textView.getEllipsize();
                    if (ellipsize != null && lineCount >= 0 && (lineCount == 0 || ellipsize == TextUtils.TruncateAt.END)) {
                        i10 = 1;
                    }
                    if (i10 != 0) {
                        return length - layout.getEllipsisCount(lineCount);
                    }
                } catch (Throwable th) {
                    th = th;
                    i10 = length;
                }
            }
            return length;
        } catch (Throwable th2) {
            th = th2;
        }
        this.f16780a.a("ui_parsing_visibility", th);
        return i10;
    }
}
