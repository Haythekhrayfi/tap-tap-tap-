package u8;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import fd.j0;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f36059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View.OnAttachStateChangeListener f36060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewTreeObserver.OnPreDrawListener f36061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0426a f36062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f36063e;

    /* JADX INFO: renamed from: u8.a$a, reason: collision with other inner class name */
    public static final class C0426a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f36064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f36065b;

        public C0426a(int i10, int i11) {
            this.f36064a = i10;
            this.f36065b = i11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0426a)) {
                return false;
            }
            C0426a c0426a = (C0426a) obj;
            return this.f36064a == c0426a.f36064a && this.f36065b == c0426a.f36065b;
        }

        public int hashCode() {
            return Integer.hashCode(this.f36065b) + (Integer.hashCode(this.f36064a) * 31);
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("Params(maxLines=");
            sbA.append(this.f36064a);
            sbA.append(", minHiddenLines=");
            return h0.f.a(sbA, this.f36065b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public static final class b implements ViewTreeObserver.OnPreDrawListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a aVar = a.this;
            C0426a c0426a = aVar.f36062d;
            if (c0426a == null || TextUtils.isEmpty(aVar.f36059a.getText())) {
                return true;
            }
            a aVar2 = a.this;
            if (aVar2.f36063e) {
                aVar2.b();
                a.this.f36063e = false;
                return true;
            }
            Integer num = Integer.MAX_VALUE;
            a aVar3 = a.this;
            num.intValue();
            int lineCount = aVar3.f36059a.getLineCount();
            int iIntValue = c0426a.f36064a;
            num = lineCount <= c0426a.f36065b + iIntValue ? Integer.MAX_VALUE : null;
            if (num != null) {
                iIntValue = num.intValue();
            }
            if (iIntValue == a.this.f36059a.getMaxLines()) {
                a.this.b();
                return true;
            }
            a.this.f36059a.setMaxLines(iIntValue);
            a.this.f36063e = true;
            return false;
        }
    }

    public a(TextView textView) {
        j0.i(textView, "textView");
        this.f36059a = textView;
    }

    public final void a() {
        if (this.f36061c != null) {
            return;
        }
        b bVar = new b();
        ViewTreeObserver viewTreeObserver = this.f36059a.getViewTreeObserver();
        j0.h(viewTreeObserver, "textView.viewTreeObserver");
        viewTreeObserver.addOnPreDrawListener(bVar);
        this.f36061c = bVar;
    }

    public final void b() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f36061c;
        if (onPreDrawListener != null) {
            ViewTreeObserver viewTreeObserver = this.f36059a.getViewTreeObserver();
            j0.h(viewTreeObserver, "textView.viewTreeObserver");
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        }
        this.f36061c = null;
    }
}
