package androidx.emoji2.text;

import android.graphics.Rect;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.KeyEvent;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e.i f1805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f1806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e.d f1807c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1808a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n.a f1809b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public n.a f1810c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public n.a f1811d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1812e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1813f;

        public a(n.a aVar, boolean z10, int[] iArr) {
            this.f1809b = aVar;
            this.f1810c = aVar;
        }

        /* JADX WARN: Code duplicated, block: B:32:0x0057  */
        public int a(int i10) {
            SparseArray<n.a> sparseArray = this.f1810c.f1835a;
            n.a aVar = sparseArray == null ? null : sparseArray.get(i10);
            int i11 = 3;
            if (this.f1808a == 2) {
                if (aVar != null) {
                    this.f1810c = aVar;
                    this.f1813f++;
                } else {
                    if (i10 == 65038) {
                        b();
                        i11 = 1;
                    } else {
                        if (!(i10 == 65039)) {
                            n.a aVar2 = this.f1810c;
                            if (aVar2.f1836b == null) {
                                b();
                                i11 = 1;
                            } else {
                                if (this.f1813f == 1) {
                                    if (c()) {
                                        aVar2 = this.f1810c;
                                    } else {
                                        b();
                                        i11 = 1;
                                    }
                                }
                                this.f1811d = aVar2;
                                b();
                            }
                        }
                    }
                }
                i11 = 2;
            } else if (aVar == null) {
                b();
                i11 = 1;
            } else {
                this.f1808a = 2;
                this.f1810c = aVar;
                this.f1813f = 1;
                i11 = 2;
            }
            this.f1812e = i10;
            return i11;
        }

        public final int b() {
            this.f1808a = 1;
            this.f1810c = this.f1809b;
            this.f1813f = 0;
            return 1;
        }

        public final boolean c() {
            y0.a aVarE = this.f1810c.f1836b.e();
            int iA = aVarE.a(6);
            if ((iA == 0 || aVarE.f37969b.get(iA + aVarE.f37968a) == 0) ? false : true) {
                return true;
            }
            return this.f1812e == 65039;
        }
    }

    public i(n nVar, e.i iVar, e.d dVar, boolean z10, int[] iArr) {
        this.f1805a = iVar;
        this.f1806b = nVar;
        this.f1807c = dVar;
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z10) {
        j[] jVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!(selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) && (jVarArr = (j[]) editable.getSpans(selectionStart, selectionEnd, j.class)) != null && jVarArr.length > 0) {
            for (j jVar : jVarArr) {
                int spanStart = editable.getSpanStart(jVar);
                int spanEnd = editable.getSpanEnd(jVar);
                if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(CharSequence charSequence, int i10, int i11, h hVar) {
        if (hVar.f1804c == 0) {
            e.d dVar = this.f1807c;
            y0.a aVarE = hVar.e();
            int iA = aVarE.a(8);
            if (iA != 0) {
                aVarE.f37969b.getShort(iA + aVarE.f37968a);
            }
            d dVar2 = (d) dVar;
            Objects.requireNonNull(dVar2);
            ThreadLocal<StringBuilder> threadLocal = d.f1772b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = threadLocal.get();
            sb2.setLength(0);
            while (i10 < i11) {
                sb2.append(charSequence.charAt(i10));
                i10++;
            }
            TextPaint textPaint = dVar2.f1773a;
            String string = sb2.toString();
            ThreadLocal<o0.d<Rect, Rect>> threadLocal2 = h0.h.f30463a;
            hVar.f1804c = h0.h.a.a(textPaint, string) ? 2 : 1;
        }
        return hVar.f1804c == 2;
    }
}
